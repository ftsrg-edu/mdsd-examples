/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.SameNamedEntitiesMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.SameNamedEntitiesQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.sameNamedEntities pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SameNamedEntitiesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"entity1", "entity2"},
 * 	severity = "error",
 * 	message = "Two entities has the same name $commonName$",
 * 	targetEditorId = "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID",
 * 	symmetric = {"entity1", "entity2"}
 * )
 * pattern sameNamedEntities(entity1, entity2, commonName) {
 * 	Entity.name(entity1, commonName);
 * 	Entity.name(entity2, commonName);
 * 	entity1 != entity2;
 * }
 * </pre></code>
 * 
 * @see SameNamedEntitiesMatch
 * @see SameNamedEntitiesProcessor
 * @see SameNamedEntitiesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SameNamedEntitiesMatcher extends BaseMatcher<SameNamedEntitiesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SameNamedEntitiesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    SameNamedEntitiesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (SameNamedEntitiesMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static SameNamedEntitiesMatcher create() throws ViatraQueryException {
    return new SameNamedEntitiesMatcher();
  }
  
  private final static int POSITION_ENTITY1 = 0;
  
  private final static int POSITION_ENTITY2 = 1;
  
  private final static int POSITION_COMMONNAME = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SameNamedEntitiesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private SameNamedEntitiesMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pCommonName the fixed value of pattern parameter commonName, or null if not bound.
   * @return matches represented as a SameNamedEntitiesMatch object.
   * 
   */
  public Collection<SameNamedEntitiesMatch> getAllMatches(final Entity pEntity1, final Entity pEntity2, final String pCommonName) {
    return rawGetAllMatches(new Object[]{pEntity1, pEntity2, pCommonName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pCommonName the fixed value of pattern parameter commonName, or null if not bound.
   * @return a match represented as a SameNamedEntitiesMatch object, or null if no match is found.
   * 
   */
  public SameNamedEntitiesMatch getOneArbitraryMatch(final Entity pEntity1, final Entity pEntity2, final String pCommonName) {
    return rawGetOneArbitraryMatch(new Object[]{pEntity1, pEntity2, pCommonName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pCommonName the fixed value of pattern parameter commonName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Entity pEntity1, final Entity pEntity2, final String pCommonName) {
    return rawHasMatch(new Object[]{pEntity1, pEntity2, pCommonName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pCommonName the fixed value of pattern parameter commonName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Entity pEntity1, final Entity pEntity2, final String pCommonName) {
    return rawCountMatches(new Object[]{pEntity1, pEntity2, pCommonName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pCommonName the fixed value of pattern parameter commonName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Entity pEntity1, final Entity pEntity2, final String pCommonName, final IMatchProcessor<? super SameNamedEntitiesMatch> processor) {
    rawForEachMatch(new Object[]{pEntity1, pEntity2, pCommonName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pCommonName the fixed value of pattern parameter commonName, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Entity pEntity1, final Entity pEntity2, final String pCommonName, final IMatchProcessor<? super SameNamedEntitiesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEntity1, pEntity2, pCommonName}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pCommonName the fixed value of pattern parameter commonName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SameNamedEntitiesMatch newMatch(final Entity pEntity1, final Entity pEntity2, final String pCommonName) {
    return SameNamedEntitiesMatch.newMatch(pEntity1, pEntity2, pCommonName);
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
  public Set<Entity> getAllValuesOfentity1(final SameNamedEntitiesMatch partialMatch) {
    return rawAccumulateAllValuesOfentity1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity1(final Entity pEntity2, final String pCommonName) {
    return rawAccumulateAllValuesOfentity1(new Object[]{
    null, 
    pEntity2, 
    pCommonName
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
  public Set<Entity> getAllValuesOfentity2(final SameNamedEntitiesMatch partialMatch) {
    return rawAccumulateAllValuesOfentity2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity2(final Entity pEntity1, final String pCommonName) {
    return rawAccumulateAllValuesOfentity2(new Object[]{
    pEntity1, 
    null, 
    pCommonName
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for commonName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfcommonName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_COMMONNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for commonName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfcommonName() {
    return rawAccumulateAllValuesOfcommonName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for commonName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfcommonName(final SameNamedEntitiesMatch partialMatch) {
    return rawAccumulateAllValuesOfcommonName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for commonName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfcommonName(final Entity pEntity1, final Entity pEntity2) {
    return rawAccumulateAllValuesOfcommonName(new Object[]{
    pEntity1, 
    pEntity2, 
    null
    });
  }
  
  @Override
  protected SameNamedEntitiesMatch tupleToMatch(final Tuple t) {
    try {
    	return SameNamedEntitiesMatch.newMatch((Entity) t.get(POSITION_ENTITY1), (Entity) t.get(POSITION_ENTITY2), (String) t.get(POSITION_COMMONNAME));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameNamedEntitiesMatch arrayToMatch(final Object[] match) {
    try {
    	return SameNamedEntitiesMatch.newMatch((Entity) match[POSITION_ENTITY1], (Entity) match[POSITION_ENTITY2], (String) match[POSITION_COMMONNAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameNamedEntitiesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SameNamedEntitiesMatch.newMutableMatch((Entity) match[POSITION_ENTITY1], (Entity) match[POSITION_ENTITY2], (String) match[POSITION_COMMONNAME]);
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
  public static IQuerySpecification<SameNamedEntitiesMatcher> querySpecification() throws ViatraQueryException {
    return SameNamedEntitiesQuerySpecification.instance();
  }
}
