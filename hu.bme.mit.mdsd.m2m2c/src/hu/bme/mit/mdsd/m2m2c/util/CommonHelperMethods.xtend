package hu.bme.mit.mdsd.m2m2c.util

import hu.bme.mit.mdsd.erdiagram.Attribute
import hu.bme.mit.mdsd.erdiagram.AttributeType
import hu.bme.mit.mdsd.erdiagram.Entity
import hu.bme.mit.mdsd.rdb.ColumnType
import hu.bme.mit.mdsd.rdb.RdbPackage

class CommonHelperMethods {
	
	static extension val RdbPackage rdbPackage = RdbPackage.eINSTANCE

	
	// ~~~~~~ STATIC HELPERS
	
	// select EClass for creating a column based on whether the attribute is key 
	static def toColumnEClass(Attribute attr) {
		if (attr.isIsKey) key else column
	}
	
    // Helper method to transform an AttrbuteType to a ColumnType
	static def toColumnType(AttributeType type) {
		ColumnType.getByName(type.getName)
	}
	
    // Helper methods to generate names for (foreign)key columns 
    // not corresponding to attributes
	static def toKeyColumnName(Entity entity) {
		entity.name.toKeyColumnName
	}
	
	static def String toKeyColumnName(String entityName) 
		'''«entityName»_ID'''
}
