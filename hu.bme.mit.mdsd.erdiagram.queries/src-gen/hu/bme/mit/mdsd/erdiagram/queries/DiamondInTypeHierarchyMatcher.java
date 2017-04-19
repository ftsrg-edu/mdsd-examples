/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.DiamondInTypeHierarchyMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.DiamondInTypeHierarchyQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.diamondInTypeHierarchy pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DiamondInTypeHierarchyMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern diamondInTypeHierarchy(entity1 : Entity, entity2 : Entity, entity3 : Entity, entity4 : Entity) {
 *     find allSuperEntity(entity1,entity2);
 *     find allSuperEntity(entity1,entity3);
 *     find hasBiggerName(entity2, entity3); //entity2 != entity3;
 *     find allSuperEntity(entity2,entity4);
 *     find allSuperEntity(entity3,entity4);
 * }
 * </pre></code>
 * 
 * @see DiamondInTypeHierarchyMatch
 * @see DiamondInTypeHierarchyProcessor
 * @see DiamondInTypeHierarchyQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DiamondInTypeHierarchyMatcher extends BaseMatcher<DiamondInTypeHierarchyMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DiamondInTypeHierarchyMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    DiamondInTypeHierarchyMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (DiamondInTypeHierarchyMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static DiamondInTypeHierarchyMatcher create() throws ViatraQueryException {
    return new DiamondInTypeHierarchyMatcher();
  }
  
  private final static int POSITION_ENTITY1 = 0;
  
  private final static int POSITION_ENTITY2 = 1;
  
  private final static int POSITION_ENTITY3 = 2;
  
  private final static int POSITION_ENTITY4 = 3;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DiamondInTypeHierarchyMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private DiamondInTypeHierarchyMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pEntity3 the fixed value of pattern parameter entity3, or null if not bound.
   * @param pEntity4 the fixed value of pattern parameter entity4, or null if not bound.
   * @return matches represented as a DiamondInTypeHierarchyMatch object.
   * 
   */
  public Collection<DiamondInTypeHierarchyMatch> getAllMatches(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4) {
    return rawGetAllMatches(new Object[]{pEntity1, pEntity2, pEntity3, pEntity4});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pEntity3 the fixed value of pattern parameter entity3, or null if not bound.
   * @param pEntity4 the fixed value of pattern parameter entity4, or null if not bound.
   * @return a match represented as a DiamondInTypeHierarchyMatch object, or null if no match is found.
   * 
   */
  public DiamondInTypeHierarchyMatch getOneArbitraryMatch(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4) {
    return rawGetOneArbitraryMatch(new Object[]{pEntity1, pEntity2, pEntity3, pEntity4});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pEntity3 the fixed value of pattern parameter entity3, or null if not bound.
   * @param pEntity4 the fixed value of pattern parameter entity4, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4) {
    return rawHasMatch(new Object[]{pEntity1, pEntity2, pEntity3, pEntity4});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pEntity3 the fixed value of pattern parameter entity3, or null if not bound.
   * @param pEntity4 the fixed value of pattern parameter entity4, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4) {
    return rawCountMatches(new Object[]{pEntity1, pEntity2, pEntity3, pEntity4});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pEntity3 the fixed value of pattern parameter entity3, or null if not bound.
   * @param pEntity4 the fixed value of pattern parameter entity4, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4, final IMatchProcessor<? super DiamondInTypeHierarchyMatch> processor) {
    rawForEachMatch(new Object[]{pEntity1, pEntity2, pEntity3, pEntity4}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pEntity3 the fixed value of pattern parameter entity3, or null if not bound.
   * @param pEntity4 the fixed value of pattern parameter entity4, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4, final IMatchProcessor<? super DiamondInTypeHierarchyMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEntity1, pEntity2, pEntity3, pEntity4}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pEntity3 the fixed value of pattern parameter entity3, or null if not bound.
   * @param pEntity4 the fixed value of pattern parameter entity4, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public DiamondInTypeHierarchyMatch newMatch(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4) {
    return DiamondInTypeHierarchyMatch.newMatch(pEntity1, pEntity2, pEntity3, pEntity4);
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Entity> rawAccumulateAllValuesOfentity1(final Object[] parameters) {
    Set<Entity> results = new HashSet<Entity>();
    rawAccumulateAllValues(POSITION_ENTITY1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity1() {
    return rawAccumulateAllValuesOfentity1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity1(final DiamondInTypeHierarchyMatch partialMatch) {
    return rawAccumulateAllValuesOfentity1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity1(final Entity pEntity2, final Entity pEntity3, final Entity pEntity4) {
    return rawAccumulateAllValuesOfentity1(new Object[]{
    null, 
    pEntity2, 
    pEntity3, 
    pEntity4
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Entity> rawAccumulateAllValuesOfentity2(final Object[] parameters) {
    Set<Entity> results = new HashSet<Entity>();
    rawAccumulateAllValues(POSITION_ENTITY2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity2() {
    return rawAccumulateAllValuesOfentity2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity2(final DiamondInTypeHierarchyMatch partialMatch) {
    return rawAccumulateAllValuesOfentity2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity2(final Entity pEntity1, final Entity pEntity3, final Entity pEntity4) {
    return rawAccumulateAllValuesOfentity2(new Object[]{
    pEntity1, 
    null, 
    pEntity3, 
    pEntity4
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity3.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Entity> rawAccumulateAllValuesOfentity3(final Object[] parameters) {
    Set<Entity> results = new HashSet<Entity>();
    rawAccumulateAllValues(POSITION_ENTITY3, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity3.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity3() {
    return rawAccumulateAllValuesOfentity3(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity3.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity3(final DiamondInTypeHierarchyMatch partialMatch) {
    return rawAccumulateAllValuesOfentity3(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity3.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity3(final Entity pEntity1, final Entity pEntity2, final Entity pEntity4) {
    return rawAccumulateAllValuesOfentity3(new Object[]{
    pEntity1, 
    pEntity2, 
    null, 
    pEntity4
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity4.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Entity> rawAccumulateAllValuesOfentity4(final Object[] parameters) {
    Set<Entity> results = new HashSet<Entity>();
    rawAccumulateAllValues(POSITION_ENTITY4, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity4.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity4() {
    return rawAccumulateAllValuesOfentity4(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity4.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity4(final DiamondInTypeHierarchyMatch partialMatch) {
    return rawAccumulateAllValuesOfentity4(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity4.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity4(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3) {
    return rawAccumulateAllValuesOfentity4(new Object[]{
    pEntity1, 
    pEntity2, 
    pEntity3, 
    null
    });
  }
  
  @Override
  protected DiamondInTypeHierarchyMatch tupleToMatch(final Tuple t) {
    try {
    	return DiamondInTypeHierarchyMatch.newMatch((Entity) t.get(POSITION_ENTITY1), (Entity) t.get(POSITION_ENTITY2), (Entity) t.get(POSITION_ENTITY3), (Entity) t.get(POSITION_ENTITY4));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DiamondInTypeHierarchyMatch arrayToMatch(final Object[] match) {
    try {
    	return DiamondInTypeHierarchyMatch.newMatch((Entity) match[POSITION_ENTITY1], (Entity) match[POSITION_ENTITY2], (Entity) match[POSITION_ENTITY3], (Entity) match[POSITION_ENTITY4]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DiamondInTypeHierarchyMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return DiamondInTypeHierarchyMatch.newMutableMatch((Entity) match[POSITION_ENTITY1], (Entity) match[POSITION_ENTITY2], (Entity) match[POSITION_ENTITY3], (Entity) match[POSITION_ENTITY4]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<DiamondInTypeHierarchyMatcher> querySpecification() throws ViatraQueryException {
    return DiamondInTypeHierarchyQuerySpecification.instance();
  }
}
