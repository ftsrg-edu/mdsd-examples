package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.rdb.Column
import hu.bme.mit.mdsd.rdb.ColumnType
import hu.bme.mit.mdsd.rdb.Key
import hu.bme.mit.mdsd.rdb.Table
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import trace.TraceRoot

import static extension hu.bme.mit.mdsd.m2m2c.util.CommonHelperMethods.*
import hu.bme.mit.mdsd.rdb.ForeignKey

class ErdToRdbRuleSet extends RuleSetBase {
	
	new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
		super(engine, manipulation, traceRoot)
	}
	
	// basics
	public val entityCreatedRule = 
		addRule(entityCreated)[
			// create table
			val table = traceRoot.rdbRoot.createChild(relationalDataBase_Tables, table) as Table			
			createTrace(entity, table)
		]
	public val tableToRemoveRule =
		addRule(tableToRemove)[
			//traceRoot.rdbRoot.remove(relationalDataBase_Tables, table)
			deleteTraceAndTarget(trace)
		]
	public val nameToPropagateRule = 
		addRule(nameToPropagate)[			
			targetElement.set(namedElement_Name, sourceElement.name)			
		]

	// default PK 
	public val defaultPrimaryKeyRequiredRule =
		addRule(defaultPrimaryKeyRequired)[
			val keyColumn = table.createChild(table_Columns, key) as Key
			keyColumn.set(column_Type, ColumnType::INT)
			keyColumn.set(namedElement_Name, entity.toKeyColumnName)			
		]
	public val defaultPrimaryKeyToRemoveRule =
		addRule(defaultPrimaryKeyToRemove)[
			table.remove(table_Columns, key)
		]

	// attributes
	public val attributeCreatedRule = 
		addRule(attributeCreated)[
			val column = contextTable.createChild(table_Columns, attribute.toColumnEClass) as Column			
			createTrace(attribute, column)
		]
	public val attributeDeletedRule =
		addRule(attributeDeleted)[
			deleteTraceAndTarget(trace)
		]
	public val typeToPropagateRule = 
		addRule(typeToPropagate)[			
			column.set(column_Type, attribute.type.toColumnType)			
		]
		
	// is-a	
	public val isaCreatedRule =
		addRule(isaCreated)[
			val foreignKeyColumn = subT.createChild(table_Columns, foreignKey) as ForeignKey
			foreignKeyColumn.set(column_Type, superKey.type)
			foreignKeyColumn.set(namedElement_Name, superKey.name)
			foreignKeyColumn.set(foreignKey_ReferencedKey, superKey)
		]
	public val isaDeletedRule =
		addRule(isaDeleted)[
			subT.remove(table_Columns, foreignKey)
		]
	
}