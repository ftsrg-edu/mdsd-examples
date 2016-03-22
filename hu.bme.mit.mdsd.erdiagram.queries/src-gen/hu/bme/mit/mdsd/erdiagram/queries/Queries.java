package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.queries.AllSuperEntityMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.AttributeCountMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.AttributeWithInheirtanceMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.BadEntityMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.CircleInTypeHierarchyMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.DiamondInTypeHierarchyMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.EmptyNamedElementMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.EntityAttributeMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.EntityMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.EntityNameMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.EntityStartsWithSmallCaseMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.FirtEntityMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.HasBiggerNameMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.OtherEndingMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithInheirtanceMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithLeftEndingMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithRightEndingMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithoutEndingMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.SameNamedEntitiesMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.SuperEntityMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.WellFormedEntitesMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.WellFormedRelationMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.util.AllSuperEntityQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.AttributeCountQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.AttributeWithInheirtanceQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.BadEntityQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.CircleInTypeHierarchyQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.DiamondInTypeHierarchyQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.EmptyNamedElementQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityAttributeQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityNameQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityStartsWithSmallCaseQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.FirtEntityQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.HasBiggerNameQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.OtherEndingQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithInheirtanceQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithLeftEndingQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithRightEndingQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithoutEndingQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.SameNamedEntitiesQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.SuperEntityQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.WellFormedEntitesQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.WellFormedRelationQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in queries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file queries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.mdsd.erdiagram.queries, the group contains the definition of the following patterns: <ul>
 * <li>entity</li>
 * <li>entityName</li>
 * <li>emptyNamedElement</li>
 * <li>entityStartsWithSmallCase</li>
 * <li>sameNamedEntities</li>
 * <li>badEntity</li>
 * <li>wellFormedEntites</li>
 * <li>relationWithLeftEnding</li>
 * <li>relationWithRightEnding</li>
 * <li>relationWithoutEnding</li>
 * <li>wellFormedRelation</li>
 * <li>entityAttribute</li>
 * <li>attributeCount</li>
 * <li>hasBiggerName</li>
 * <li>firtEntity</li>
 * <li>superEntity</li>
 * <li>allSuperEntity</li>
 * <li>otherEnding</li>
 * <li>circleInTypeHierarchy</li>
 * <li>diamondInTypeHierarchy</li>
 * <li>attributeWithInheirtance</li>
 * <li>relationWithInheirtance</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() throws IncQueryException {
    querySpecifications.add(EntityQuerySpecification.instance());
    querySpecifications.add(EntityNameQuerySpecification.instance());
    querySpecifications.add(EmptyNamedElementQuerySpecification.instance());
    querySpecifications.add(EntityStartsWithSmallCaseQuerySpecification.instance());
    querySpecifications.add(SameNamedEntitiesQuerySpecification.instance());
    querySpecifications.add(BadEntityQuerySpecification.instance());
    querySpecifications.add(WellFormedEntitesQuerySpecification.instance());
    querySpecifications.add(RelationWithLeftEndingQuerySpecification.instance());
    querySpecifications.add(RelationWithRightEndingQuerySpecification.instance());
    querySpecifications.add(RelationWithoutEndingQuerySpecification.instance());
    querySpecifications.add(WellFormedRelationQuerySpecification.instance());
    querySpecifications.add(EntityAttributeQuerySpecification.instance());
    querySpecifications.add(AttributeCountQuerySpecification.instance());
    querySpecifications.add(HasBiggerNameQuerySpecification.instance());
    querySpecifications.add(FirtEntityQuerySpecification.instance());
    querySpecifications.add(SuperEntityQuerySpecification.instance());
    querySpecifications.add(AllSuperEntityQuerySpecification.instance());
    querySpecifications.add(OtherEndingQuerySpecification.instance());
    querySpecifications.add(CircleInTypeHierarchyQuerySpecification.instance());
    querySpecifications.add(DiamondInTypeHierarchyQuerySpecification.instance());
    querySpecifications.add(AttributeWithInheirtanceQuerySpecification.instance());
    querySpecifications.add(RelationWithInheirtanceQuerySpecification.instance());
  }
  
  public EntityQuerySpecification getEntity() throws IncQueryException {
    return EntityQuerySpecification.instance();
  }
  
  public EntityMatcher getEntity(final IncQueryEngine engine) throws IncQueryException {
    return EntityMatcher.on(engine);
  }
  
  public EntityNameQuerySpecification getEntityName() throws IncQueryException {
    return EntityNameQuerySpecification.instance();
  }
  
  public EntityNameMatcher getEntityName(final IncQueryEngine engine) throws IncQueryException {
    return EntityNameMatcher.on(engine);
  }
  
  public EmptyNamedElementQuerySpecification getEmptyNamedElement() throws IncQueryException {
    return EmptyNamedElementQuerySpecification.instance();
  }
  
  public EmptyNamedElementMatcher getEmptyNamedElement(final IncQueryEngine engine) throws IncQueryException {
    return EmptyNamedElementMatcher.on(engine);
  }
  
  public EntityStartsWithSmallCaseQuerySpecification getEntityStartsWithSmallCase() throws IncQueryException {
    return EntityStartsWithSmallCaseQuerySpecification.instance();
  }
  
  public EntityStartsWithSmallCaseMatcher getEntityStartsWithSmallCase(final IncQueryEngine engine) throws IncQueryException {
    return EntityStartsWithSmallCaseMatcher.on(engine);
  }
  
  public SameNamedEntitiesQuerySpecification getSameNamedEntities() throws IncQueryException {
    return SameNamedEntitiesQuerySpecification.instance();
  }
  
  public SameNamedEntitiesMatcher getSameNamedEntities(final IncQueryEngine engine) throws IncQueryException {
    return SameNamedEntitiesMatcher.on(engine);
  }
  
  public BadEntityQuerySpecification getBadEntity() throws IncQueryException {
    return BadEntityQuerySpecification.instance();
  }
  
  public BadEntityMatcher getBadEntity(final IncQueryEngine engine) throws IncQueryException {
    return BadEntityMatcher.on(engine);
  }
  
  public WellFormedEntitesQuerySpecification getWellFormedEntites() throws IncQueryException {
    return WellFormedEntitesQuerySpecification.instance();
  }
  
  public WellFormedEntitesMatcher getWellFormedEntites(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedEntitesMatcher.on(engine);
  }
  
  public RelationWithLeftEndingQuerySpecification getRelationWithLeftEnding() throws IncQueryException {
    return RelationWithLeftEndingQuerySpecification.instance();
  }
  
  public RelationWithLeftEndingMatcher getRelationWithLeftEnding(final IncQueryEngine engine) throws IncQueryException {
    return RelationWithLeftEndingMatcher.on(engine);
  }
  
  public RelationWithRightEndingQuerySpecification getRelationWithRightEnding() throws IncQueryException {
    return RelationWithRightEndingQuerySpecification.instance();
  }
  
  public RelationWithRightEndingMatcher getRelationWithRightEnding(final IncQueryEngine engine) throws IncQueryException {
    return RelationWithRightEndingMatcher.on(engine);
  }
  
  public RelationWithoutEndingQuerySpecification getRelationWithoutEnding() throws IncQueryException {
    return RelationWithoutEndingQuerySpecification.instance();
  }
  
  public RelationWithoutEndingMatcher getRelationWithoutEnding(final IncQueryEngine engine) throws IncQueryException {
    return RelationWithoutEndingMatcher.on(engine);
  }
  
  public WellFormedRelationQuerySpecification getWellFormedRelation() throws IncQueryException {
    return WellFormedRelationQuerySpecification.instance();
  }
  
  public WellFormedRelationMatcher getWellFormedRelation(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedRelationMatcher.on(engine);
  }
  
  public EntityAttributeQuerySpecification getEntityAttribute() throws IncQueryException {
    return EntityAttributeQuerySpecification.instance();
  }
  
  public EntityAttributeMatcher getEntityAttribute(final IncQueryEngine engine) throws IncQueryException {
    return EntityAttributeMatcher.on(engine);
  }
  
  public AttributeCountQuerySpecification getAttributeCount() throws IncQueryException {
    return AttributeCountQuerySpecification.instance();
  }
  
  public AttributeCountMatcher getAttributeCount(final IncQueryEngine engine) throws IncQueryException {
    return AttributeCountMatcher.on(engine);
  }
  
  public HasBiggerNameQuerySpecification getHasBiggerName() throws IncQueryException {
    return HasBiggerNameQuerySpecification.instance();
  }
  
  public HasBiggerNameMatcher getHasBiggerName(final IncQueryEngine engine) throws IncQueryException {
    return HasBiggerNameMatcher.on(engine);
  }
  
  public FirtEntityQuerySpecification getFirtEntity() throws IncQueryException {
    return FirtEntityQuerySpecification.instance();
  }
  
  public FirtEntityMatcher getFirtEntity(final IncQueryEngine engine) throws IncQueryException {
    return FirtEntityMatcher.on(engine);
  }
  
  public SuperEntityQuerySpecification getSuperEntity() throws IncQueryException {
    return SuperEntityQuerySpecification.instance();
  }
  
  public SuperEntityMatcher getSuperEntity(final IncQueryEngine engine) throws IncQueryException {
    return SuperEntityMatcher.on(engine);
  }
  
  public AllSuperEntityQuerySpecification getAllSuperEntity() throws IncQueryException {
    return AllSuperEntityQuerySpecification.instance();
  }
  
  public AllSuperEntityMatcher getAllSuperEntity(final IncQueryEngine engine) throws IncQueryException {
    return AllSuperEntityMatcher.on(engine);
  }
  
  public OtherEndingQuerySpecification getOtherEnding() throws IncQueryException {
    return OtherEndingQuerySpecification.instance();
  }
  
  public OtherEndingMatcher getOtherEnding(final IncQueryEngine engine) throws IncQueryException {
    return OtherEndingMatcher.on(engine);
  }
  
  public CircleInTypeHierarchyQuerySpecification getCircleInTypeHierarchy() throws IncQueryException {
    return CircleInTypeHierarchyQuerySpecification.instance();
  }
  
  public CircleInTypeHierarchyMatcher getCircleInTypeHierarchy(final IncQueryEngine engine) throws IncQueryException {
    return CircleInTypeHierarchyMatcher.on(engine);
  }
  
  public DiamondInTypeHierarchyQuerySpecification getDiamondInTypeHierarchy() throws IncQueryException {
    return DiamondInTypeHierarchyQuerySpecification.instance();
  }
  
  public DiamondInTypeHierarchyMatcher getDiamondInTypeHierarchy(final IncQueryEngine engine) throws IncQueryException {
    return DiamondInTypeHierarchyMatcher.on(engine);
  }
  
  public AttributeWithInheirtanceQuerySpecification getAttributeWithInheirtance() throws IncQueryException {
    return AttributeWithInheirtanceQuerySpecification.instance();
  }
  
  public AttributeWithInheirtanceMatcher getAttributeWithInheirtance(final IncQueryEngine engine) throws IncQueryException {
    return AttributeWithInheirtanceMatcher.on(engine);
  }
  
  public RelationWithInheirtanceQuerySpecification getRelationWithInheirtance() throws IncQueryException {
    return RelationWithInheirtanceQuerySpecification.instance();
  }
  
  public RelationWithInheirtanceMatcher getRelationWithInheirtance(final IncQueryEngine engine) throws IncQueryException {
    return RelationWithInheirtanceMatcher.on(engine);
  }
}
