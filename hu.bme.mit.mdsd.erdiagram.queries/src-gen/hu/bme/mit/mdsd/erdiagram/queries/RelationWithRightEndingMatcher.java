package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.RelationEnding;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithRightEndingMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithRightEndingQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.relationWithRightEnding pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RelationWithRightEndingMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern relationWithRightEnding(r, rre) {
 * 	Relation.rightEnding(r, rre);
 * }
 * </pre></code>
 * 
 * @see RelationWithRightEndingMatch
 * @see RelationWithRightEndingProcessor
 * @see RelationWithRightEndingQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RelationWithRightEndingMatcher extends BaseMatcher<RelationWithRightEndingMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RelationWithRightEndingMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    RelationWithRightEndingMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new RelationWithRightEndingMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_R = 0;
  
  private final static int POSITION_RRE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(RelationWithRightEndingMatcher.class);
  
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
  public RelationWithRightEndingMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public RelationWithRightEndingMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param pRre the fixed value of pattern parameter rre, or null if not bound.
   * @return matches represented as a RelationWithRightEndingMatch object.
   * 
   */
  public Collection<RelationWithRightEndingMatch> getAllMatches(final Relation pR, final RelationEnding pRre) {
    return rawGetAllMatches(new Object[]{pR, pRre});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param pRre the fixed value of pattern parameter rre, or null if not bound.
   * @return a match represented as a RelationWithRightEndingMatch object, or null if no match is found.
   * 
   */
  public RelationWithRightEndingMatch getOneArbitraryMatch(final Relation pR, final RelationEnding pRre) {
    return rawGetOneArbitraryMatch(new Object[]{pR, pRre});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param pRre the fixed value of pattern parameter rre, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Relation pR, final RelationEnding pRre) {
    return rawHasMatch(new Object[]{pR, pRre});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param pRre the fixed value of pattern parameter rre, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Relation pR, final RelationEnding pRre) {
    return rawCountMatches(new Object[]{pR, pRre});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param pRre the fixed value of pattern parameter rre, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Relation pR, final RelationEnding pRre, final IMatchProcessor<? super RelationWithRightEndingMatch> processor) {
    rawForEachMatch(new Object[]{pR, pRre}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param pRre the fixed value of pattern parameter rre, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Relation pR, final RelationEnding pRre, final IMatchProcessor<? super RelationWithRightEndingMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pR, pRre}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param pRre the fixed value of pattern parameter rre, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RelationWithRightEndingMatch newMatch(final Relation pR, final RelationEnding pRre) {
    return RelationWithRightEndingMatch.newMatch(pR, pRre);
  }
  
  /**
   * Retrieve the set of values that occur in matches for r.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Relation> rawAccumulateAllValuesOfr(final Object[] parameters) {
    Set<Relation> results = new HashSet<Relation>();
    rawAccumulateAllValues(POSITION_R, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for r.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Relation> getAllValuesOfr() {
    return rawAccumulateAllValuesOfr(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for r.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Relation> getAllValuesOfr(final RelationWithRightEndingMatch partialMatch) {
    return rawAccumulateAllValuesOfr(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for r.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Relation> getAllValuesOfr(final RelationEnding pRre) {
    return rawAccumulateAllValuesOfr(new Object[]{
    null, 
    pRre
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for rre.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<RelationEnding> rawAccumulateAllValuesOfrre(final Object[] parameters) {
    Set<RelationEnding> results = new HashSet<RelationEnding>();
    rawAccumulateAllValues(POSITION_RRE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for rre.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RelationEnding> getAllValuesOfrre() {
    return rawAccumulateAllValuesOfrre(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rre.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RelationEnding> getAllValuesOfrre(final RelationWithRightEndingMatch partialMatch) {
    return rawAccumulateAllValuesOfrre(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for rre.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RelationEnding> getAllValuesOfrre(final Relation pR) {
    return rawAccumulateAllValuesOfrre(new Object[]{
    pR, 
    null
    });
  }
  
  @Override
  protected RelationWithRightEndingMatch tupleToMatch(final Tuple t) {
    try {
    	return RelationWithRightEndingMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Relation) t.get(POSITION_R), (hu.bme.mit.mdsd.erdiagram.RelationEnding) t.get(POSITION_RRE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RelationWithRightEndingMatch arrayToMatch(final Object[] match) {
    try {
    	return RelationWithRightEndingMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Relation) match[POSITION_R], (hu.bme.mit.mdsd.erdiagram.RelationEnding) match[POSITION_RRE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RelationWithRightEndingMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return RelationWithRightEndingMatch.newMutableMatch((hu.bme.mit.mdsd.erdiagram.Relation) match[POSITION_R], (hu.bme.mit.mdsd.erdiagram.RelationEnding) match[POSITION_RRE]);
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
  public static IQuerySpecification<RelationWithRightEndingMatcher> querySpecification() throws IncQueryException {
    return RelationWithRightEndingQuerySpecification.instance();
  }
}