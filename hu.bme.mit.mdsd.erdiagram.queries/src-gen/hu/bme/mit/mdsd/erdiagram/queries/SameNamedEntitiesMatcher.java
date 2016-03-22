package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.SameNamedEntitiesMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.SameNamedEntitiesQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.sameNamedEntities pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
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
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SameNamedEntitiesMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SameNamedEntitiesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SameNamedEntitiesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ENTITY1 = 0;
  
  private final static int POSITION_ENTITY2 = 1;
  
  private final static int POSITION_COMMONNAME = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SameNamedEntitiesMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public SameNamedEntitiesMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public SameNamedEntitiesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
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
    	return SameNamedEntitiesMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) t.get(POSITION_ENTITY1), (hu.bme.mit.mdsd.erdiagram.Entity) t.get(POSITION_ENTITY2), (java.lang.String) t.get(POSITION_COMMONNAME));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameNamedEntitiesMatch arrayToMatch(final Object[] match) {
    try {
    	return SameNamedEntitiesMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) match[POSITION_ENTITY1], (hu.bme.mit.mdsd.erdiagram.Entity) match[POSITION_ENTITY2], (java.lang.String) match[POSITION_COMMONNAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameNamedEntitiesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SameNamedEntitiesMatch.newMutableMatch((hu.bme.mit.mdsd.erdiagram.Entity) match[POSITION_ENTITY1], (hu.bme.mit.mdsd.erdiagram.Entity) match[POSITION_ENTITY2], (java.lang.String) match[POSITION_COMMONNAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SameNamedEntitiesMatcher> querySpecification() throws IncQueryException {
    return SameNamedEntitiesQuerySpecification.instance();
  }
}
