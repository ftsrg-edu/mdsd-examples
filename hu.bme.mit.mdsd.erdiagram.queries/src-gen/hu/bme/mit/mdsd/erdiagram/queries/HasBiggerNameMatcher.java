/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.HasBiggerNameMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.HasBiggerNameQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.hasBiggerName pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
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
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static HasBiggerNameMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    HasBiggerNameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (HasBiggerNameMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static HasBiggerNameMatcher create() throws ViatraQueryException {
    return new HasBiggerNameMatcher();
  }
  
  private final static int POSITION_E1 = 0;
  
  private final static int POSITION_E2 = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(HasBiggerNameMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private HasBiggerNameMatcher() throws ViatraQueryException {
    super(querySpecification());
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
    	return HasBiggerNameMatch.newMatch((Entity) t.get(POSITION_E1), (Entity) t.get(POSITION_E2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected HasBiggerNameMatch arrayToMatch(final Object[] match) {
    try {
    	return HasBiggerNameMatch.newMatch((Entity) match[POSITION_E1], (Entity) match[POSITION_E2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected HasBiggerNameMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return HasBiggerNameMatch.newMutableMatch((Entity) match[POSITION_E1], (Entity) match[POSITION_E2]);
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
  public static IQuerySpecification<HasBiggerNameMatcher> querySpecification() throws ViatraQueryException {
    return HasBiggerNameQuerySpecification.instance();
  }
}
