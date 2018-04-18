package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.m2m2c.queries.Relation_CMatcher
import hu.bme.mit.mdsd.rdb.ColumnType
import hu.bme.mit.mdsd.rdb.ForeignKey
import hu.bme.mit.mdsd.rdb.Key
import hu.bme.mit.mdsd.rdb.Table
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import trace.TraceRoot
import hu.bme.mit.mdsd.m2m2c.util.TracingHelperUtility

class RelationRule_C extends AbstractRule{

    new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
        super(engine, manipulation, traceRoot)
        
		rule = createRule.name("RelationRule")
			// left hand side - queries a single relation
			.precondition(Relation_CMatcher.querySpecification)
			.action(CRUDActivationStateEnum.CREATED) [
				println('''RelationRule CREATED («relation.name»)''')
								
				val joinTable = traceRoot.rdbRoot.createChild(rdbPackage.relationalDataBase_Tables, rdbPackage.table) as Table
				joinTable.set(rdbPackage.namedElement_Name, relation.name.toFirstUpper + "_Relation")
				val columnKey = joinTable.createChild(rdbPackage.table_Columns, rdbPackage.key) as Key
				columnKey.set(rdbPackage.namedElement_Name, "id")
				columnKey.set(rdbPackage.column_Type, ColumnType::INT)
				
				val columnLeft = joinTable.createChild(rdbPackage.table_Columns, rdbPackage.foreignKey) as ForeignKey
				columnLeft.set(rdbPackage.foreignKey_ReferencedKey, tableLeft.columns.filter(Key).head)
				columnLeft.set(rdbPackage.namedElement_Name, columnLeft.referencedKey?.name)
				columnLeft.set(rdbPackage.column_Type, columnLeft.referencedKey?.type)

				val columnRight = joinTable.createChild(rdbPackage.table_Columns, rdbPackage.foreignKey) as ForeignKey
				columnRight.set(rdbPackage.foreignKey_ReferencedKey, tableRight.columns.filter(Key).head)
				columnRight.set(rdbPackage.namedElement_Name, columnRight.referencedKey?.name)
				columnRight.set(rdbPackage.column_Type, columnRight.referencedKey?.type)
				
				createTrace(traceRoot, relation, joinTable)
			]
			.build
	}
    
}
