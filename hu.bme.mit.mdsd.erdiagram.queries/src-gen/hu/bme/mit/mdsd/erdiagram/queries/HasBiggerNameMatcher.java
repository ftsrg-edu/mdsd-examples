package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.HasBiggerNameMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.HasBiggerNameQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.hasBiggerName pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link HasBiggerNameMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern hasBiggerName(e1, e2) {
 * 	Entity.name(e1, name1);
 * 	Entity.name(e2, name2);
 * 	check(name1 {@literal >} name2);
 * }
 * </pre></code>
 * 
 * @see HasBiggerNameMatch
 * @see HasBiggerNameProcessor
 * @see HasBiggerNameQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class HasBiggerNameMatcher extends BaseMatcher<HasBiggerNameMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static HasBiggerNameMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    HasBiggerNameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new HasBiggerNameMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_E1 = 0;
  
  private final static int POSITION_E2 = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(HasBiggerNameMatcher.class);
  
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
  public HasBiggerNameMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public HasBiggerNameMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
   * @param pE2 the fixed value of pattern parameter e2, or null if not bound.
   * @return matches represented as a HasBiggerNameMatch object.
   * 
   */
  public Collection<HasBiggerNameMatch> getAllMatches(final Entity pE1, final Entity pE2) {
    return rawGetAllMatches(new Object[]{pE1, pE2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
   * @param pE2 the fixed value of pattern parameter e2, or null if not bound.
   * @return a match represented as a HasBiggerNameMatch object, or null if no match is found.
   * 
   */
  public HasBiggerNameMatch getOneArbitraryMatch(final Entity pE1, final Entity pE2) {
    return rawGetOneArbitraryMatch(new Object[]{pE1, pE2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
   * @param pE2 the fixed value of pattern parameter e2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Entity pE1, final Entity pE2) {
    return rawHasMatch(new Object[]{pE1, pE2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
   * @param pE2 the fixed value of pattern parameter e2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Entity pE1, final Entity pE2) {
    return rawCountMatches(new Object[]{pE1, pE2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
   * @param pE2 the fixed value of pattern parameter e2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Entity pE1, final Entity pE2, final IMatchProcessor<? super HasBiggerNameMatch> processor) {
    rawForEachMatch(new Object[]{pE1, pE2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
   * @param pE2 the fixed value of pattern parameter e2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Entity pE1, final Entity pE2, final IMatchProcessor<? super HasBiggerNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pE1, pE2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
   * @param pE2 the fixed value of pattern parameter e2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public HasBiggerNameMatch newMatch(final Entity pE1, final Entity pE2) {
    return HasBiggerNameMatch.newMatch(pE1, pE2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for e1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Entity> rawAccumulateAllValuesOfe1(final Object[] parameters) {
    Set<Entity> results = new HashSet<Entity>();
    rawAccumulateAllValues(POSITION_E1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for e1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfe1() {
    return rawAccumulateAllValuesOfe1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for e1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfe1(final HasBiggerNameMatch partialMatch) {
    return rawAccumulateAllValuesOfe1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for e1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfe1(final Entity pE2) {
    return rawAccumulateAllValuesOfe1(new Object[]{
    null, 
    pE2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for e2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Entity> rawAccumulateAllValuesOfe2(final Object[] parameters) {
    Set<Entity> results = new HashSet<Entity>();
    rawAccumulateAllValues(POSITION_E2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for e2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfe2() {
    return rawAccumulateAllValuesOfe2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for e2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfe2(final HasBiggerNameMatch partialMatch) {
    return rawAccumulateAllValuesOfe2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for e2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfe2(final Entity pE1) {
    return rawAccumulateAllValuesOfe2(new Object[]{
    pE1, 
    null
    });
  }
  
  @Override
  protected HasBiggerNameMatch tupleToMatch(final Tuple t) {
    try {
    	return HasBiggerNameMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) t.get(POSITION_E1), (hu.bme.mit.mdsd.erdiagram.Entity) t.get(POSITION_E2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected HasBiggerNameMatch arrayToMatch(final Object[] match) {
    try {
    	return HasBiggerNameMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) match[POSITION_E1], (hu.bme.mit.mdsd.erdiagram.Entity) match[POSITION_E2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected HasBiggerNameMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return HasBiggerNameMatch.newMutableMatch((hu.bme.mit.mdsd.erdiagram.Entity) match[POSITION_E1], (hu.bme.mit.mdsd.erdiagram.Entity) match[POSITION_E2]);
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
  public static IQuerySpecification<HasBiggerNameMatcher> querySpecification() throws IncQueryException {
    return HasBiggerNameQuerySpecification.instance();
  }
}
