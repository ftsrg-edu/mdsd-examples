package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.m2m2c.queries.Attribute_DMatcher
import hu.bme.mit.mdsd.m2m2c.util.TracingHelperUtility
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import trace.TraceRoot

class AttributeRule_D extends AbstractRule{

	new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
		super(engine, manipulation, traceRoot)

		rule = createRule.name("AttributeRule")
			// left hand side - queries a single entity
			.precondition(Attribute_DMatcher.querySpecification)
			.action(CRUDActivationStateEnum.CREATED) [				
			println('''AttributeRule CREATED [empty RHS] («attribute.name»)''')
			
		].action(CRUDActivationStateEnum.DELETED) [			
			println('''AttributeRule DELETED («attribute.name»)''')
			
			TracingHelperUtility.deleteTrace(trace, manipulation)
		].build

	}

}
