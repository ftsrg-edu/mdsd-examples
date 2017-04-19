/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithoutEndingMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithoutEndingQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.relationWithoutEnding pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RelationWithoutEndingMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern relationWithoutEnding(r : Relation) {
 * 	neg find relationWithLeftEnding(r, _);
 * } or {
 * 	neg find relationWithRightEnding(r, _);
 * }
 * </pre></code>
 * 
 * @see RelationWithoutEndingMatch
 * @see RelationWithoutEndingProcessor
 * @see RelationWithoutEndingQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RelationWithoutEndingMatcher extends BaseMatcher<RelationWithoutEndingMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RelationWithoutEndingMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    RelationWithoutEndingMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (RelationWithoutEndingMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static RelationWithoutEndingMatcher create() throws ViatraQueryException {
    return new RelationWithoutEndingMatcher();
  }
  
  private final static int POSITION_R = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RelationWithoutEndingMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private RelationWithoutEndingMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @return matches represented as a RelationWithoutEndingMatch object.
   * 
   */
  public Collection<RelationWithoutEndingMatch> getAllMatches(final Relation pR) {
    return rawGetAllMatches(new Object[]{pR});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @return a match represented as a RelationWithoutEndingMatch object, or null if no match is found.
   * 
   */
  public RelationWithoutEndingMatch getOneArbitraryMatch(final Relation pR) {
    return rawGetOneArbitraryMatch(new Object[]{pR});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Relation pR) {
    return rawHasMatch(new Object[]{pR});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Relation pR) {
    return rawCountMatches(new Object[]{pR});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Relation pR, final IMatchProcessor<? super RelationWithoutEndingMatch> processor) {
    rawForEachMatch(new Object[]{pR}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Relation pR, final IMatchProcessor<? super RelationWithoutEndingMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pR}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RelationWithoutEndingMatch newMatch(final Relation pR) {
    return RelationWithoutEndingMatch.newMatch(pR);
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
  
  @Override
  protected RelationWithoutEndingMatch tupleToMatch(final Tuple t) {
    try {
    	return RelationWithoutEndingMatch.newMatch((Relation) t.get(POSITION_R));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RelationWithoutEndingMatch arrayToMatch(final Object[] match) {
    try {
    	return RelationWithoutEndingMatch.newMatch((Relation) match[POSITION_R]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RelationWithoutEndingMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return RelationWithoutEndingMatch.newMutableMatch((Relation) match[POSITION_R]);
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
  public static IQuerySpecification<RelationWithoutEndingMatcher> querySpecification() throws ViatraQueryException {
    return RelationWithoutEndingQuerySpecification.instance();
  }
}
