/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
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
import hu.bme.mit.mdsd.erdiagram.queries.RelationMatcher;
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
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithInheirtanceQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithLeftEndingQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithRightEndingQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithoutEndingQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.SameNamedEntitiesQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.SuperEntityQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.WellFormedEntitesQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.WellFormedRelationQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in queries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file queries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.mdsd.erdiagram.queries, the group contains the definition of the following patterns: <ul>
 * <li>entity</li>
 * <li>relation</li>
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
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() throws ViatraQueryException {
    querySpecifications.add(EntityQuerySpecification.instance());
    querySpecifications.add(RelationQuerySpecification.instance());
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
  
  public EntityQuerySpecification getEntity() throws ViatraQueryException {
    return EntityQuerySpecification.instance();
  }
  
  public EntityMatcher getEntity(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EntityMatcher.on(engine);
  }
  
  public RelationQuerySpecification getRelation() throws ViatraQueryException {
    return RelationQuerySpecification.instance();
  }
  
  public RelationMatcher getRelation(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RelationMatcher.on(engine);
  }
  
  public EntityNameQuerySpecification getEntityName() throws ViatraQueryException {
    return EntityNameQuerySpecification.instance();
  }
  
  public EntityNameMatcher getEntityName(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EntityNameMatcher.on(engine);
  }
  
  public EmptyNamedElementQuerySpecification getEmptyNamedElement() throws ViatraQueryException {
    return EmptyNamedElementQuerySpecification.instance();
  }
  
  public EmptyNamedElementMatcher getEmptyNamedElement(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EmptyNamedElementMatcher.on(engine);
  }
  
  public EntityStartsWithSmallCaseQuerySpecification getEntityStartsWithSmallCase() throws ViatraQueryException {
    return EntityStartsWithSmallCaseQuerySpecification.instance();
  }
  
  public EntityStartsWithSmallCaseMatcher getEntityStartsWithSmallCase(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EntityStartsWithSmallCaseMatcher.on(engine);
  }
  
  public SameNamedEntitiesQuerySpecification getSameNamedEntities() throws ViatraQueryException {
    return SameNamedEntitiesQuerySpecification.instance();
  }
  
  public SameNamedEntitiesMatcher getSameNamedEntities(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SameNamedEntitiesMatcher.on(engine);
  }
  
  public BadEntityQuerySpecification getBadEntity() throws ViatraQueryException {
    return BadEntityQuerySpecification.instance();
  }
  
  public BadEntityMatcher getBadEntity(final ViatraQueryEngine engine) throws ViatraQueryException {
    return BadEntityMatcher.on(engine);
  }
  
  public WellFormedEntitesQuerySpecification getWellFormedEntites() throws ViatraQueryException {
    return WellFormedEntitesQuerySpecification.instance();
  }
  
  public WellFormedEntitesMatcher getWellFormedEntites(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WellFormedEntitesMatcher.on(engine);
  }
  
  public RelationWithLeftEndingQuerySpecification getRelationWithLeftEnding() throws ViatraQueryException {
    return RelationWithLeftEndingQuerySpecification.instance();
  }
  
  public RelationWithLeftEndingMatcher getRelationWithLeftEnding(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RelationWithLeftEndingMatcher.on(engine);
  }
  
  public RelationWithRightEndingQuerySpecification getRelationWithRightEnding() throws ViatraQueryException {
    return RelationWithRightEndingQuerySpecification.instance();
  }
  
  public RelationWithRightEndingMatcher getRelationWithRightEnding(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RelationWithRightEndingMatcher.on(engine);
  }
  
  public RelationWithoutEndingQuerySpecification getRelationWithoutEnding() throws ViatraQueryException {
    return RelationWithoutEndingQuerySpecification.instance();
  }
  
  public RelationWithoutEndingMatcher getRelationWithoutEnding(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RelationWithoutEndingMatcher.on(engine);
  }
  
  public WellFormedRelationQuerySpecification getWellFormedRelation() throws ViatraQueryException {
    return WellFormedRelationQuerySpecification.instance();
  }
  
  public WellFormedRelationMatcher getWellFormedRelation(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WellFormedRelationMatcher.on(engine);
  }
  
  public EntityAttributeQuerySpecification getEntityAttribute() throws ViatraQueryException {
    return EntityAttributeQuerySpecification.instance();
  }
  
  public EntityAttributeMatcher getEntityAttribute(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EntityAttributeMatcher.on(engine);
  }
  
  public AttributeCountQuerySpecification getAttributeCount() throws ViatraQueryException {
    return AttributeCountQuerySpecification.instance();
  }
  
  public AttributeCountMatcher getAttributeCount(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AttributeCountMatcher.on(engine);
  }
  
  public HasBiggerNameQuerySpecification getHasBiggerName() throws ViatraQueryException {
    return HasBiggerNameQuerySpecification.instance();
  }
  
  public HasBiggerNameMatcher getHasBiggerName(final ViatraQueryEngine engine) throws ViatraQueryException {
    return HasBiggerNameMatcher.on(engine);
  }
  
  public FirtEntityQuerySpecification getFirtEntity() throws ViatraQueryException {
    return FirtEntityQuerySpecification.instance();
  }
  
  public FirtEntityMatcher getFirtEntity(final ViatraQueryEngine engine) throws ViatraQueryException {
    return FirtEntityMatcher.on(engine);
  }
  
  public SuperEntityQuerySpecification getSuperEntity() throws ViatraQueryException {
    return SuperEntityQuerySpecification.instance();
  }
  
  public SuperEntityMatcher getSuperEntity(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SuperEntityMatcher.on(engine);
  }
  
  public AllSuperEntityQuerySpecification getAllSuperEntity() throws ViatraQueryException {
    return AllSuperEntityQuerySpecification.instance();
  }
  
  public AllSuperEntityMatcher getAllSuperEntity(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllSuperEntityMatcher.on(engine);
  }
  
  public OtherEndingQuerySpecification getOtherEnding() throws ViatraQueryException {
    return OtherEndingQuerySpecification.instance();
  }
  
  public OtherEndingMatcher getOtherEnding(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OtherEndingMatcher.on(engine);
  }
  
  public CircleInTypeHierarchyQuerySpecification getCircleInTypeHierarchy() throws ViatraQueryException {
    return CircleInTypeHierarchyQuerySpecification.instance();
  }
  
  public CircleInTypeHierarchyMatcher getCircleInTypeHierarchy(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CircleInTypeHierarchyMatcher.on(engine);
  }
  
  public DiamondInTypeHierarchyQuerySpecification getDiamondInTypeHierarchy() throws ViatraQueryException {
    return DiamondInTypeHierarchyQuerySpecification.instance();
  }
  
  public DiamondInTypeHierarchyMatcher getDiamondInTypeHierarchy(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DiamondInTypeHierarchyMatcher.on(engine);
  }
  
  public AttributeWithInheirtanceQuerySpecification getAttributeWithInheirtance() throws ViatraQueryException {
    return AttributeWithInheirtanceQuerySpecification.instance();
  }
  
  public AttributeWithInheirtanceMatcher getAttributeWithInheirtance(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AttributeWithInheirtanceMatcher.on(engine);
  }
  
  public RelationWithInheirtanceQuerySpecification getRelationWithInheirtance() throws ViatraQueryException {
    return RelationWithInheirtanceQuerySpecification.instance();
  }
  
  public RelationWithInheirtanceMatcher getRelationWithInheirtance(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RelationWithInheirtanceMatcher.on(engine);
  }
}
