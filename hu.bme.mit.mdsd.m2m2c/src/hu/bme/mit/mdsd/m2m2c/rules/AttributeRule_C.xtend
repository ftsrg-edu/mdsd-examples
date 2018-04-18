package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.m2m2c.queries.Attribute_CMatcher
import hu.bme.mit.mdsd.m2m2c.util.TracingHelperUtility
import hu.bme.mit.mdsd.rdb.Column
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import trace.TraceRoot

class AttributeRule_C extends AbstractRule{

	new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
		super(engine, manipulation, traceRoot)
		rule = createRule.name("AttributeRule")
			// left hand side - queries a single entity
			.precondition(Attribute_CMatcher.querySpecification)
			.action(CRUDActivationStateEnum.CREATED) [
			println('''AttributeRule CREATED («attribute.name»)''')
			
			var column = attribute.createColumnFromAttribute(table) as Column
			column.set(rdbPackage.namedElement_Name, attribute.name)
			
			createTrace(traceRoot, attribute, column)
		].build
	}
}
