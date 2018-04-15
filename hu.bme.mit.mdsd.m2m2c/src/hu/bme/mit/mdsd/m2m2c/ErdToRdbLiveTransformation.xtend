package hu.bme.mit.mdsd.m2m2c

import hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram
import hu.bme.mit.mdsd.m2m2c.queries.Queries
import hu.bme.mit.mdsd.m2m2c.rules.AttributeRule_C_FirstCase
import hu.bme.mit.mdsd.m2m2c.rules.AttributeRule_C_SecondCase
import hu.bme.mit.mdsd.m2m2c.rules.AttributeRule_UD
import hu.bme.mit.mdsd.m2m2c.rules.EntityRule_C_FirstCase_WithParent
import hu.bme.mit.mdsd.m2m2c.rules.EntityRule_C_FirstCase_WithoutParent
import hu.bme.mit.mdsd.m2m2c.rules.EntityRule_C_SecondCase
import hu.bme.mit.mdsd.m2m2c.rules.EntityRule_UD
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain
import org.eclipse.emf.edit.domain.EditingDomain
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.transformation.evm.specific.Schedulers
import org.eclipse.viatra.transformation.evm.specific.resolver.InvertedDisappearancePriorityConflictResolver
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationWithEditingDomain
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.EventDrivenTransformation
import trace.TraceRoot
import hu.bme.mit.mdsd.m2m2c.rules.RelationRule_UD
import hu.bme.mit.mdsd.m2m2c.rules.RelationRule_C

class ErdToRdbLiveTransformation {

	/* Transformation-related extensions */
	private extension EventDrivenTransformation transformation

	/* Transformation rule-related extensions */
	private extension val Queries queries = Queries.instance

	extension IModelManipulations manipulation
	private EditingDomain editingDomain
	private ViatraQueryEngine engine
	private ResourceSet resSet

	private EntityRule_UD entityRule_UD
	private EntityRule_C_FirstCase_WithoutParent entityRule_C_V1_1
	private EntityRule_C_FirstCase_WithParent entityRule_C_V1_2
	private EntityRule_C_SecondCase entityRule_C_V2
	
	private AttributeRule_UD attributeRule_UD
	private AttributeRule_C_FirstCase attributeRule_C_V1
	private AttributeRule_C_SecondCase attributeRule_C_V2
	
	private RelationRule_UD relationRule_UD
	private RelationRule_C relationRule_C
	
	private TraceRoot traceRoot	
	private EntityRelationDiagram erdiagram	

	new(EntityRelationDiagram erdiagram) {
		this.erdiagram = erdiagram		
		resSet = erdiagram.eResource.resourceSet
		this.engine = ViatraQueryEngine.on(new EMFScope(resSet));
//		queries.prepare(engine)
		this.editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(erdiagram);
		this.manipulation = 
			if (editingDomain === null)
				new SimpleModelManipulations(engine)  	
			else 
				new ModelManipulationWithEditingDomain(engine, editingDomain)
		
		val traceResource = getOrCreateResource("trace")
		
		traceRoot = traceResource.contents.head as TraceRoot

		entityRule_UD = new EntityRule_UD(engine, manipulation, traceRoot)
		entityRule_C_V1_1 = new EntityRule_C_FirstCase_WithoutParent(engine, manipulation, traceRoot)
		entityRule_C_V1_2 = new EntityRule_C_FirstCase_WithParent(engine, manipulation, traceRoot)
		entityRule_C_V2 = new EntityRule_C_SecondCase(engine, manipulation, traceRoot)
		
		attributeRule_UD = new AttributeRule_UD(engine, manipulation, traceRoot)
		attributeRule_C_V1 = new AttributeRule_C_FirstCase(engine, manipulation, traceRoot)
		attributeRule_C_V2 = new AttributeRule_C_SecondCase(engine, manipulation, traceRoot)
		
		relationRule_UD = new RelationRule_UD(engine, manipulation, traceRoot)
		relationRule_C = new RelationRule_C(engine, manipulation, traceRoot)

		createTransformation
	}

	public def execute() {
		transformation.executionSchema.startUnscheduledExecution
	}

	private def createTransformation() {

		// Initialize event-driven transformation
		val fixedPriorityResolver = new InvertedDisappearancePriorityConflictResolver
		fixedPriorityResolver.setPriority(entityRule_UD.rule.ruleSpecification, 2)
		fixedPriorityResolver.setPriority(entityRule_C_V1_1.rule.ruleSpecification, 1)
		fixedPriorityResolver.setPriority(entityRule_C_V1_2.rule.ruleSpecification, 1)
		fixedPriorityResolver.setPriority(entityRule_C_V2.rule.ruleSpecification, 1)
		fixedPriorityResolver.setPriority(attributeRule_UD.rule.ruleSpecification, 4)
		fixedPriorityResolver.setPriority(attributeRule_C_V1.rule.ruleSpecification, 3)	
		fixedPriorityResolver.setPriority(attributeRule_C_V2.rule.ruleSpecification, 3)
		fixedPriorityResolver.setPriority(relationRule_UD.rule.ruleSpecification, 6)
		fixedPriorityResolver.setPriority(relationRule_C.rule.ruleSpecification, 5)
		
		transformation = EventDrivenTransformation.forEngine(engine)
	        .setConflictResolver(fixedPriorityResolver)
	        .addRule(entityRule_UD.rule)
	        .addRule(entityRule_C_V1_1.rule)
	        .addRule(entityRule_C_V1_2.rule)
//	        .addRule(entityRule_C_V2.rule)
	        .addRule(attributeRule_UD.rule)
	        .addRule(attributeRule_C_V1.rule)
//	        .addRule(attributeRule_C_V2.rule)
//	        .addRule(relationRule_UD.rule)	        
	        .addRule(relationRule_C.rule)
	        .setSchedulerFactory(
//	        	if (editingDomain === null)
	        		Schedulers.getQueryEngineSchedulerFactory(engine)
//	        	else 
//	        		TransactionalSchedulers.getTransactionSchedulerFactory(editingDomain)
	        ).build

	}

	def dispose() {
		if (transformation !== null) {
			transformation.dispose
		}
		transformation = null
		return
	}

	private def Resource getOrCreateResource(String fileExtension) {
		val resourceURI = erdiagram.eResource.getURI().trimFileExtension().appendFileExtension(fileExtension);
		val resource = try {
				// try to create a resource 
				resSet.getResource(resourceURI, true);
			} catch (RuntimeException e) {
				// load resource, because it already exists
				resSet.getResource(resourceURI, false);
			}
		return resource;
	}
}
