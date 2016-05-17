package hu.bme.mit.mdsd.m2m2c

import hu.bme.mit.mdsd.rdb.RelationalDataBase
import hu.bme.mit.mdsd.rdb.Table
import hu.bme.mit.mdsd.rdb.Key
import hu.bme.mit.mdsd.rdb.ForeignKey
import com.google.common.io.Files
import com.google.common.base.Charsets
import java.io.File
import hu.bme.mit.mdsd.rdb.ColumnType

class RdbToSqlGenerator {
	
	private RelationalDataBase rdb
	
	new(RelationalDataBase rdb) {
		this.rdb = rdb
	}
	
	def generateSql() {
		Files.write(generateAll,new File("createRdb.sql"),Charsets.UTF_8)	
	}
	
	def generateAll()'''
		«FOR table : rdb.tables»
			«table.generateCreateTable»
			
		«ENDFOR»
	'''
	
	def generateCreateTable(Table table)'''
		create table «table.name» (
			«FOR column : table.columns»
				«column.name» «column.type.columnTypeToDataType» «IF column instanceof Key»primary key«ENDIF»«IF column instanceof ForeignKey»foreign key («column.referencedKey.name»)«ENDIF»
			«ENDFOR»
		)
	'''
	
	// helper method for creating database type
	def columnTypeToDataType(ColumnType type) {
		switch (type) {
			case BOOLEAN: {
				"boolean"
			}
			case DATETIME: {
				"timestamp"
			}
			case DOUBLE: {
				"float"
			}
			case INT: {
				"integer"
			}
			case STRING: {
				"varchar(50)"
			}
			default: {
				
			}
		}
	}
	
}