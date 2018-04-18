package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.m2m2c.queries.Entity_CMatcher
import hu.bme.mit.mdsd.rdb.Key
import hu.bme.mit.mdsd.rdb.Table
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import trace.TraceRoot

class EntityRule_C extends AbstractRule{

	new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
		super(engine, manipulation, traceRoot)

		rule = createRule.name("EntityRule")
			// left hand side - queries a single entity
			.precondition(Entity_CMatcher.querySpecification)
			.action(CRUDActivationStateEnum.CREATED) [
			println('''EntityRule CREATED («entity.name»)''')
			
			// create table
			val table = traceRoot.rdbRoot.createChild(rdbPackage.relationalDataBase_Tables, rdbPackage.table) as Table
			table.set(rdbPackage.namedElement_Name, entity.name)
			val key = table.createChild(rdbPackage.table_Columns, rdbPackage.key) as Key
			key.set(rdbPackage.namedElement_Name, entity.name + "_ID")
			
			createTrace(traceRoot, entity, table)
			
		].build
	}
}
