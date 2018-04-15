package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.m2m2c.queries.Entity_C_FirstCase_WithParentMatcher
import hu.bme.mit.mdsd.m2m2c.util.TracingHelperUtility
import hu.bme.mit.mdsd.rdb.ForeignKey
import hu.bme.mit.mdsd.rdb.Table
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import trace.TraceRoot

class EntityRule_C_FirstCase_WithParent extends AbstractRule{

	new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
		super(engine, manipulation, traceRoot)

		rule = createRule.name("EntityRule")
			// left hand side - queries a single entity
			.precondition(Entity_C_FirstCase_WithParentMatcher.querySpecification)
			.action(CRUDActivationStateEnum.CREATED) [
			println('''EntityRule CREATED V1.2 («entity1.name»)''')
			
			// create table
			val table = traceRoot.rdbRoot.createChild(rdbPackage.relationalDataBase_Tables, rdbPackage.table) as Table
			table.set(rdbPackage.namedElement_Name, entity1.name)
			
			TracingHelperUtility.createTrace(traceRoot, entity1, table, manipulation)
			
			// create foreign key			
			val foreignKey = table.createChild(rdbPackage.table_Columns, rdbPackage.foreignKey) as ForeignKey
			foreignKey.set(rdbPackage.foreignKey_ReferencedKey, key)
			
		].build
	}	
}
