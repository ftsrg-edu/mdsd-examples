package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.m2m2c.queries.Relation_DMatcher
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import trace.TraceRoot

class RelationRule_D extends AbstractRule{

    new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
        super(engine, manipulation, traceRoot)
        
		rule = createRule.name("RelationRule")
			// left hand side - queries a single relation
			.precondition(Relation_DMatcher.querySpecification)
			.action(CRUDActivationStateEnum.CREATED) [
			println('''RelationRule CREATED [empty RHS] («relation.name»)''')
			
		].action(CRUDActivationStateEnum.DELETED)[
			println('''RelationRule DELETED («relation.name»)''')
			
			deleteTrace(trace)
		].build
	} 
}
