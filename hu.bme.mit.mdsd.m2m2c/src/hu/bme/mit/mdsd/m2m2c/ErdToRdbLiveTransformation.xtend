package hu.bme.mit.mdsd.m2m2c

import hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram
import hu.bme.mit.mdsd.m2m2c.queries.Queries
import hu.bme.mit.mdsd.m2m2c.rules.EntityRule_C
import hu.bme.mit.mdsd.rdb.RdbPackage
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
import trace.TracePackage
import trace.TraceRoot
import hu.bme.mit.mdsd.rdb.RelationalDataBase

class ErdToRdbLiveTransformation {

	/* Transformation-related extensions */
	private extension EventDrivenTransformation transformation

	/* Transformation rule-related extensions */
	private extension val Queries queries = Queries.instance

	extension IModelManipulations manipulation
	private EditingDomain editingDomain
	private ViatraQueryEngine engine
	private ResourceSet resSet

	private EntityRule_C entityRule_C

	private TraceRoot traceRoot
	private EntityRelationDiagram erdiagram
	
	private TracePackage tracePackage = TracePackage.eINSTANCE
	private extension RdbPackage rdbPackage = RdbPackage.eINSTANCE
	
	private static ErdToRdbLiveTransformation liveTransformation = new ErdToRdbLiveTransformation;
	
	private new(){
		
	}
	
	def public static getInstance() {
		liveTransformation;
	}

	def prepare(EntityRelationDiagram erdiagram) {
		this.erdiagram = erdiagram
		resSet = erdiagram.eResource.resourceSet
		this.engine = ViatraQueryEngine.on(new EMFScope(resSet));
		queries.prepare(engine)
		this.editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(erdiagram);
		this.manipulation = if (editingDomain === null)
			new SimpleModelManipulations(engine)
		else
			new ModelManipulationWithEditingDomain(engine, editingDomain)

		val traceResource = getOrCreateResource("trace")
		val rdbResource = getOrCreateResource("rdb")

		val rdb = if (rdbResource.contents.head === null)
				create(rdbResource, rdbPackage.relationalDataBase) as RelationalDataBase
			else
				rdbResource.contents.head as RelationalDataBase

		traceRoot = if (traceResource.contents.head === null) {
			traceRoot = create(traceResource, tracePackage.traceRoot) as TraceRoot
			traceRoot.set(tracePackage.traceRoot_ErdiagramRoot, erdiagram)
			traceRoot.set(tracePackage.traceRoot_RdbRoot, rdb)
			traceRoot
		} else {
			traceResource.contents.head as TraceRoot
		}
		entityRule_C = new EntityRule_C(engine, manipulation, traceRoot)

		createTransformation
	}

	public def execute() {
		println("Start EDT")
		transformation.executionSchema.startUnscheduledExecution
	}

	private def createTransformation() {

		// Initialize event-driven transformation
		val fixedPriorityResolver = new InvertedDisappearancePriorityConflictResolver
		fixedPriorityResolver.setPriority(entityRule_C.rule.ruleSpecification, 1)

		transformation = EventDrivenTransformation.forEngine(engine).setConflictResolver(fixedPriorityResolver)
		.addRule(entityRule_C.rule)
		.setSchedulerFactory(Schedulers.getQueryEngineSchedulerFactory(engine)
		).build

	}

	def dispose() {		
		println("Dispose EDT")
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
