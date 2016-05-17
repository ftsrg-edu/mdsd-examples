package hu.bme.mit.mdsd.m2m2c

import hu.bme.mit.mdsd.erdiagram.Attribute
import hu.bme.mit.mdsd.erdiagram.AttributeType
import hu.bme.mit.mdsd.erdiagram.Entity
import hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram
import hu.bme.mit.mdsd.erdiagram.queries.AllSuperEntityMatcher
import hu.bme.mit.mdsd.erdiagram.queries.EntityMatcher
import hu.bme.mit.mdsd.erdiagram.queries.RelationMatcher
import hu.bme.mit.mdsd.rdb.Column
import hu.bme.mit.mdsd.rdb.ColumnType
import hu.bme.mit.mdsd.rdb.Key
import hu.bme.mit.mdsd.rdb.RdbFactory
import hu.bme.mit.mdsd.rdb.RelationalDataBase
import java.util.HashMap
import java.util.Map
import org.eclipse.incquery.runtime.api.IPatternMatch
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.api.IncQueryMatcher
import org.eclipse.incquery.runtime.emf.EMFScope
import org.eclipse.viatra.emf.runtime.rules.batch.BatchTransformationRule
import org.eclipse.viatra.emf.runtime.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.emf.runtime.rules.batch.BatchTransformationStatements
import org.eclipse.viatra.emf.runtime.transformation.batch.BatchTransformation

class ErdToRdbBatchTransformation {
	
	private extension BatchTransformationRuleFactory ruleFactory = new BatchTransformationRuleFactory
	private BatchTransformationStatements statements
	
	private BatchTransformationRule<? extends IPatternMatch, ? extends IncQueryMatcher<?>> entityRule
	private BatchTransformationRule<? extends IPatternMatch, ? extends IncQueryMatcher<?>> relationRule
	
	private RelationalDataBase rdb
	private extension RdbFactory rdbFactory = RdbFactory.eINSTANCE
	
	private AllSuperEntityMatcher allSuperEntitiesMatcher
	
	private Map<Entity, Key> entityToKeyMap = new HashMap
	
	private new() {}
	
	public new(EntityRelationDiagram erd) {
		
		rdb = createRelationalDataBase
		
		val iqEngine = IncQueryEngine.on(new EMFScope(erd))
		allSuperEntitiesMatcher = AllSuperEntityMatcher.on(iqEngine)
		
		createEntityRule
		createRelationRule
		
		val transformation = BatchTransformation.forEngine(iqEngine)
		transformation.addRule(createEntityRule)
		transformation.addRule(createRelationRule)
		statements = new BatchTransformationStatements(transformation)
		
	}
	
	// Helper method for creating a column from an attribute
	private def createColumnFromAttribute(Attribute attr) {
		var Column column = null;
		if (attr.isIsKey) {
			column = createKey
		} else {
			column = createColumn
		}
		column.name = attr.name
		column.type = attr.type.columnType
		column
	}

	private static def getColumnType(AttributeType type) {
		ColumnType.get(type.getName)
	}

	private def createEntityRule() {
		entityRule = createRule
			.name("EntityRule")
			// left hand side - queries a single entity
			.precondition(EntityMatcher.querySpecification)
			// right hand side
			.action() [
				// create table
				val table = createTable
				table.name = it.e.name
				rdb.tables.add(table)
				// create columns
				for (attr : it.e.attributes) {
					var column = attr.createColumnFromAttribute
					table.columns += column
				}
				// create columns from super entities' attributes
				allSuperEntitiesMatcher.forEachMatch(it.e,null)[
					for (attr : it.superEntity.attributes) {
						var column = attr.createColumnFromAttribute
						table.columns += column
					}
				]
				// store the generated key for the entities, which we use for the join tables
				for (column : table.columns) {
					if (column instanceof Key) {
						entityToKeyMap.put(it.e, column)
					}
				}
				
			]
			.build
	}

	private def createRelationRule() {
		relationRule = createRule
			.name("RelationRule")
			// left hand side - queries a single relation
			.precondition(RelationMatcher.querySpecification)
			// right hand side
			.action() [
				val leftEndind = it.r.leftEnding
				val rightEndind = it.r.rightEnding
				val leftEntity = leftEndind.target
				val rightEntity = rightEndind.target
				
				val joinTable = createTable
				joinTable.name = it.r.name.toFirstUpper + "Relation"
				val columnKey = createKey
				columnKey.name = "id"
				columnKey.type = ColumnType::INT
				
				val columnLeft = createForeignKey
				columnLeft.referencedKey = entityToKeyMap.get(leftEntity)
				columnLeft.name = columnLeft.referencedKey.name
				columnLeft.type = columnLeft.referencedKey.type

				val columnRight = createForeignKey
				columnRight.referencedKey = entityToKeyMap.get(rightEntity)
				columnRight.name = columnRight.referencedKey.name
				columnRight.type = columnRight.referencedKey.type
				
				joinTable.columns += columnKey
				joinTable.columns += columnLeft
				joinTable.columns += columnRight
				
				rdb.tables += joinTable
				
			]
			.build
	}
	
	public def doTransformation() {
		statements.fireAllCurrent(entityRule)
		statements.fireAllCurrent(relationRule)
	}

	public def getRdb() {
		rdb
	}
}