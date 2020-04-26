package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.rdb.ColumnType
import hu.bme.mit.mdsd.rdb.Key
import hu.bme.mit.mdsd.rdb.Table
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import trace.TraceRoot
import static extension hu.bme.mit.mdsd.m2m2c.util.CommonHelperMethods.*;

class ErdToRdbRuleSet extends RuleSetBase {
	
	new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
		super(engine, manipulation, traceRoot)
	}
	
	public val nameToPropagateRule = 
		addRule(nameToPropagate)[			
			targetElement.set(rdbPackage.namedElement_Name, sourceElement.name)			
		]
	public val entityCreatedRule = 
		addRule(entityCreated)[
			// create table
			val table = traceRoot.rdbRoot.createChild(relationalDataBase_Tables, table) as Table			
			createTrace(entity, table)
		]
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
	public val tableToRemoveRule =
		addRule(tableToRemove)[
			//traceRoot.rdbRoot.remove(relationalDataBase_Tables, table)
			deleteTraceAndTarget(trace)
		]
		
	
}