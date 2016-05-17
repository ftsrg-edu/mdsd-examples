package hu.bme.mit.mdsd.m2m2c;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.AttributeType;
import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram;
import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.RelationEnding;
import hu.bme.mit.mdsd.erdiagram.queries.AllSuperEntityMatch;
import hu.bme.mit.mdsd.erdiagram.queries.AllSuperEntityMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.EntityMatch;
import hu.bme.mit.mdsd.erdiagram.queries.EntityMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.RelationMatch;
import hu.bme.mit.mdsd.erdiagram.queries.RelationMatcher;
import hu.bme.mit.mdsd.rdb.Column;
import hu.bme.mit.mdsd.rdb.ColumnType;
import hu.bme.mit.mdsd.rdb.ForeignKey;
import hu.bme.mit.mdsd.rdb.Key;
import hu.bme.mit.mdsd.rdb.RdbFactory;
import hu.bme.mit.mdsd.rdb.RelationalDataBase;
import hu.bme.mit.mdsd.rdb.Table;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.viatra.emf.runtime.rules.batch.BatchTransformationRule;
import org.eclipse.viatra.emf.runtime.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.viatra.emf.runtime.rules.batch.BatchTransformationStatements;
import org.eclipse.viatra.emf.runtime.transformation.batch.BatchTransformation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ErdToRdbBatchTransformation {
  @Extension
  private BatchTransformationRuleFactory ruleFactory = new BatchTransformationRuleFactory();
  
  private BatchTransformationStatements statements;
  
  private BatchTransformationRule<? extends IPatternMatch, ? extends IncQueryMatcher<?>> entityRule;
  
  private BatchTransformationRule<? extends IPatternMatch, ? extends IncQueryMatcher<?>> relationRule;
  
  private RelationalDataBase rdb;
  
  @Extension
  private RdbFactory rdbFactory = RdbFactory.eINSTANCE;
  
  private AllSuperEntityMatcher allSuperEntitiesMatcher;
  
  private Map<Entity, Key> entityToKeyMap = new HashMap<Entity, Key>();
  
  private ErdToRdbBatchTransformation() {
  }
  
  public ErdToRdbBatchTransformation(final EntityRelationDiagram erd) {
    try {
      RelationalDataBase _createRelationalDataBase = this.rdbFactory.createRelationalDataBase();
      this.rdb = _createRelationalDataBase;
      EMFScope _eMFScope = new EMFScope(erd);
      final IncQueryEngine iqEngine = IncQueryEngine.on(_eMFScope);
      AllSuperEntityMatcher _on = AllSuperEntityMatcher.on(iqEngine);
      this.allSuperEntitiesMatcher = _on;
      this.createEntityRule();
      this.createRelationRule();
      final BatchTransformation transformation = BatchTransformation.forEngine(iqEngine);
      BatchTransformationRule<? extends IPatternMatch, ? extends IncQueryMatcher<?>> _createEntityRule = this.createEntityRule();
      transformation.addRule(_createEntityRule);
      BatchTransformationRule<? extends IPatternMatch, ? extends IncQueryMatcher<?>> _createRelationRule = this.createRelationRule();
      transformation.addRule(_createRelationRule);
      BatchTransformationStatements _batchTransformationStatements = new BatchTransformationStatements(transformation);
      this.statements = _batchTransformationStatements;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Column createColumnFromAttribute(final Attribute attr) {
    Column _xblockexpression = null;
    {
      Column column = null;
      boolean _isIsKey = attr.isIsKey();
      if (_isIsKey) {
        Key _createKey = this.rdbFactory.createKey();
        column = _createKey;
      } else {
        Column _createColumn = this.rdbFactory.createColumn();
        column = _createColumn;
      }
      String _name = attr.getName();
      column.setName(_name);
      AttributeType _type = attr.getType();
      ColumnType _columnType = ErdToRdbBatchTransformation.getColumnType(_type);
      column.setType(_columnType);
      _xblockexpression = column;
    }
    return _xblockexpression;
  }
  
  private static ColumnType getColumnType(final AttributeType type) {
    String _name = type.getName();
    return ColumnType.get(_name);
  }
  
  private BatchTransformationRule<? extends IPatternMatch, ? extends IncQueryMatcher<?>> createEntityRule() {
    try {
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<EntityMatch, EntityMatcher> _createRule = this.ruleFactory.<EntityMatch, EntityMatcher>createRule();
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<EntityMatch, EntityMatcher> _name = _createRule.name("EntityRule");
      IQuerySpecification<EntityMatcher> _querySpecification = EntityMatcher.querySpecification();
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<EntityMatch, EntityMatcher> _precondition = _name.precondition(_querySpecification);
      final IMatchProcessor<EntityMatch> _function = (EntityMatch it) -> {
        final Table table = this.rdbFactory.createTable();
        Entity _e = it.getE();
        String _name_1 = _e.getName();
        table.setName(_name_1);
        EList<Table> _tables = this.rdb.getTables();
        _tables.add(table);
        Entity _e_1 = it.getE();
        EList<Attribute> _attributes = _e_1.getAttributes();
        for (final Attribute attr : _attributes) {
          {
            Column column = this.createColumnFromAttribute(attr);
            EList<Column> _columns = table.getColumns();
            _columns.add(column);
          }
        }
        Entity _e_2 = it.getE();
        final IMatchProcessor<AllSuperEntityMatch> _function_1 = (AllSuperEntityMatch it_1) -> {
          Entity _superEntity = it_1.getSuperEntity();
          EList<Attribute> _attributes_1 = _superEntity.getAttributes();
          for (final Attribute attr_1 : _attributes_1) {
            {
              Column column = this.createColumnFromAttribute(attr_1);
              EList<Column> _columns = table.getColumns();
              _columns.add(column);
            }
          }
        };
        this.allSuperEntitiesMatcher.forEachMatch(_e_2, null, _function_1);
        EList<Column> _columns = table.getColumns();
        for (final Column column : _columns) {
          if ((column instanceof Key)) {
            Entity _e_3 = it.getE();
            this.entityToKeyMap.put(_e_3, ((Key)column));
          }
        }
      };
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<EntityMatch, EntityMatcher> _action = _precondition.action(_function);
      BatchTransformationRule<EntityMatch, EntityMatcher> _build = _action.build();
      return this.entityRule = _build;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private BatchTransformationRule<? extends IPatternMatch, ? extends IncQueryMatcher<?>> createRelationRule() {
    try {
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<RelationMatch, RelationMatcher> _createRule = this.ruleFactory.<RelationMatch, RelationMatcher>createRule();
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<RelationMatch, RelationMatcher> _name = _createRule.name("RelationRule");
      IQuerySpecification<RelationMatcher> _querySpecification = RelationMatcher.querySpecification();
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<RelationMatch, RelationMatcher> _precondition = _name.precondition(_querySpecification);
      final IMatchProcessor<RelationMatch> _function = (RelationMatch it) -> {
        Relation _r = it.getR();
        final RelationEnding leftEndind = _r.getLeftEnding();
        Relation _r_1 = it.getR();
        final RelationEnding rightEndind = _r_1.getRightEnding();
        final Entity leftEntity = leftEndind.getTarget();
        final Entity rightEntity = rightEndind.getTarget();
        final Table joinTable = this.rdbFactory.createTable();
        Relation _r_2 = it.getR();
        String _name_1 = _r_2.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
        String _plus = (_firstUpper + "Relation");
        joinTable.setName(_plus);
        final Key columnKey = this.rdbFactory.createKey();
        columnKey.setName("id");
        columnKey.setType(ColumnType.INT);
        final ForeignKey columnLeft = this.rdbFactory.createForeignKey();
        Key _get = this.entityToKeyMap.get(leftEntity);
        columnLeft.setReferencedKey(_get);
        Key _referencedKey = columnLeft.getReferencedKey();
        String _name_2 = _referencedKey.getName();
        columnLeft.setName(_name_2);
        Key _referencedKey_1 = columnLeft.getReferencedKey();
        ColumnType _type = _referencedKey_1.getType();
        columnLeft.setType(_type);
        final ForeignKey columnRight = this.rdbFactory.createForeignKey();
        Key _get_1 = this.entityToKeyMap.get(rightEntity);
        columnRight.setReferencedKey(_get_1);
        Key _referencedKey_2 = columnRight.getReferencedKey();
        String _name_3 = _referencedKey_2.getName();
        columnRight.setName(_name_3);
        Key _referencedKey_3 = columnRight.getReferencedKey();
        ColumnType _type_1 = _referencedKey_3.getType();
        columnRight.setType(_type_1);
        EList<Column> _columns = joinTable.getColumns();
        _columns.add(columnKey);
        EList<Column> _columns_1 = joinTable.getColumns();
        _columns_1.add(columnLeft);
        EList<Column> _columns_2 = joinTable.getColumns();
        _columns_2.add(columnRight);
        EList<Table> _tables = this.rdb.getTables();
        _tables.add(joinTable);
      };
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<RelationMatch, RelationMatcher> _action = _precondition.action(_function);
      BatchTransformationRule<RelationMatch, RelationMatcher> _build = _action.build();
      return this.relationRule = _build;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void doTransformation() {
    this.statements.fireAllCurrent(this.entityRule);
    this.statements.fireAllCurrent(this.relationRule);
  }
  
  public RelationalDataBase getRdb() {
    return this.rdb;
  }
}
