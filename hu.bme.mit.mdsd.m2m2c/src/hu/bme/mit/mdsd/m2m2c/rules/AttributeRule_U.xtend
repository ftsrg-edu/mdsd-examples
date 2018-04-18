package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.m2m2c.queries.Attribute_UMatcher
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import trace.TraceRoot

class AttributeRule_U extends AbstractRule{

	new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
		super(engine, manipulation, traceRoot)

		rule = createRule.name("AttributeRule")
			// left hand side - queries a single entity
			.precondition(Attribute_UMatcher.querySpecification)
			.action(CRUDActivationStateEnum.CREATED) [				
			println('''AttributeRule CREATED [empty RHS] («attribute.name»)''')
			
		].action(CRUDActivationStateEnum.UPDATED) [			
			println('''AttributeRule UPDATED («attribute.name»)''')
			
			if(!attribute.name.equals(column.name)){		
				column.set(rdbPackage.namedElement_Name, attribute.name)
			}
			if(!attribute.type.columnType.equals(column.type)){
				column.set(rdbPackage.column_Type, attribute.type.columnType)
			}
		].build

	}

}
