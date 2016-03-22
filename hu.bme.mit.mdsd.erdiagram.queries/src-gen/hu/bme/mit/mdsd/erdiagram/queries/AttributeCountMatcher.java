package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.AttributeCountMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.AttributeCountQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.attributeCount pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AttributeCountMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern attributeCount(e, N) {
 * 	Entity(e);
 * 	N == count find entityAttribute(e, _);
 * }
 * </pre></code>
 * 
 * @see AttributeCountMatch
 * @see AttributeCountProcessor
 * @see AttributeCountQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AttributeCountMatcher extends BaseMatcher<AttributeCountMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AttributeCountMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    AttributeCountMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new AttributeCountMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_E = 0;
  
  private final static int POSITION_N = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(AttributeCountMatcher.class);
  
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
  public AttributeCountMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public AttributeCountMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return matches represented as a AttributeCountMatch object.
   * 
   */
  public Collection<AttributeCountMatch> getAllMatches(final Entity pE, final Integer pN) {
    return rawGetAllMatches(new Object[]{pE, pN});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return a match represented as a AttributeCountMatch object, or null if no match is found.
   * 
   */
  public AttributeCountMatch getOneArbitraryMatch(final Entity pE, final Integer pN) {
    return rawGetOneArbitraryMatch(new Object[]{pE, pN});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Entity pE, final Integer pN) {
    return rawHasMatch(new Object[]{pE, pN});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Entity pE, final Integer pN) {
    return rawCountMatches(new Object[]{pE, pN});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Entity pE, final Integer pN, final IMatchProcessor<? super AttributeCountMatch> processor) {
    rawForEachMatch(new Object[]{pE, pN}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Entity pE, final Integer pN, final IMatchProcessor<? super AttributeCountMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pE, pN}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AttributeCountMatch newMatch(final Entity pE, final Integer pN) {
    return AttributeCountMatch.newMatch(pE, pN);
  }
  
  /**
   * Retrieve the set of values that occur in matches for e.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Entity> rawAccumulateAllValuesOfe(final Object[] parameters) {
    Set<Entity> results = new HashSet<Entity>();
    rawAccumulateAllValues(POSITION_E, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for e.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfe() {
    return rawAccumulateAllValuesOfe(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for e.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfe(final AttributeCountMatch partialMatch) {
    return rawAccumulateAllValuesOfe(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for e.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfe(final Integer pN) {
    return rawAccumulateAllValuesOfe(new Object[]{
    null, 
    pN
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for N.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOfN(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_N, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for N.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfN() {
    return rawAccumulateAllValuesOfN(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for N.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfN(final AttributeCountMatch partialMatch) {
    return rawAccumulateAllValuesOfN(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for N.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfN(final Entity pE) {
    return rawAccumulateAllValuesOfN(new Object[]{
    pE, 
    null
    });
  }
  
  @Override
  protected AttributeCountMatch tupleToMatch(final Tuple t) {
    try {
    	return AttributeCountMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) t.get(POSITION_E), (java.lang.Integer) t.get(POSITION_N));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AttributeCountMatch arrayToMatch(final Object[] match) {
    try {
    	return AttributeCountMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) match[POSITION_E], (java.lang.Integer) match[POSITION_N]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AttributeCountMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return AttributeCountMatch.newMutableMatch((hu.bme.mit.mdsd.erdiagram.Entity) match[POSITION_E], (java.lang.Integer) match[POSITION_N]);
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
  public static IQuerySpecification<AttributeCountMatcher> querySpecification() throws IncQueryException {
    return AttributeCountQuerySpecification.instance();
  }
}
