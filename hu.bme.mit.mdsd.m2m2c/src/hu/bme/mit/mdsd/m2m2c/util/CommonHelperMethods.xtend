package hu.bme.mit.mdsd.m2m2c.util

import hu.bme.mit.mdsd.erdiagram.Attribute
import hu.bme.mit.mdsd.erdiagram.AttributeType
import hu.bme.mit.mdsd.rdb.Column
import hu.bme.mit.mdsd.rdb.ColumnType
import hu.bme.mit.mdsd.rdb.Key
import hu.bme.mit.mdsd.rdb.Table
import hu.bme.mit.mdsd.rdb.RdbPackage
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations

class CommonHelperMethods {
	
	private extension RdbPackage rdbPackage = RdbPackage.eINSTANCE
	private extension IModelManipulations manipulation

	new(IModelManipulations manipulation) {
		this.manipulation = manipulation;
	}

    // Helper method to transform an AttrbiuteType to a ColumnType
	public def getColumnType(AttributeType type) {
		ColumnType.get(type.getName)
	}
	
	// Helper method for creating a column from an attribute
	public def createColumnFromAttribute(Attribute attr, Table table) {
		val column = if (attr.isIsKey) {
				table.createChild(rdbPackage.table_Columns, rdbPackage.key) as Key
			} else {
				table.createChild(rdbPackage.table_Columns, rdbPackage.column) as Column
			}
		column.set(rdbPackage.namedElement_Name, attr.name)
		column.set(rdbPackage.column_Type, attr.type.columnType)
		column
	}
}
