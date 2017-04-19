/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.RelationEnding;
import hu.bme.mit.mdsd.erdiagram.queries.OtherEndingMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.OtherEndingQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.otherEnding pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link OtherEndingMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern otherEnding(ending : RelationEnding, other : RelationEnding) {
 * 	Relation.leftEnding(relation, ending);
 * 	Relation.rightEnding(relation, other);
 * } or {
 * 	Relation.rightEnding(relation, ending);
 * 	Relation.leftEnding(relation, other);
 * }
 * </pre></code>
 * 
 * @see OtherEndingMatch
 * @see OtherEndingProcessor
 * @see OtherEndingQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class OtherEndingMatcher extends BaseMatcher<OtherEndingMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static OtherEndingMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    OtherEndingMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (OtherEndingMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static OtherEndingMatcher create() throws ViatraQueryException {
    return new OtherEndingMatcher();
  }
  
  private final static int POSITION_ENDING = 0;
  
  private final static int POSITION_OTHER = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(OtherEndingMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private OtherEndingMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
   * @param pOther the fixed value of pattern parameter other, or null if not bound.
   * @return matches represented as a OtherEndingMatch object.
   * 
   */
  public Collection<OtherEndingMatch> getAllMatches(final RelationEnding pEnding, final RelationEnding pOther) {
    return rawGetAllMatches(new Object[]{pEnding, pOther});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
   * @param pOther the fixed value of pattern parameter other, or null if not bound.
   * @return a match represented as a OtherEndingMatch object, or null if no match is found.
   * 
   */
  public OtherEndingMatch getOneArbitraryMatch(final RelationEnding pEnding, final RelationEnding pOther) {
    return rawGetOneArbitraryMatch(new Object[]{pEnding, pOther});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
   * @param pOther the fixed value of pattern parameter other, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final RelationEnding pEnding, final RelationEnding pOther) {
    return rawHasMatch(new Object[]{pEnding, pOther});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
   * @param pOther the fixed value of pattern parameter other, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final RelationEnding pEnding, final RelationEnding pOther) {
    return rawCountMatches(new Object[]{pEnding, pOther});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
   * @param pOther the fixed value of pattern parameter other, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final RelationEnding pEnding, final RelationEnding pOther, final IMatchProcessor<? super OtherEndingMatch> processor) {
    rawForEachMatch(new Object[]{pEnding, pOther}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
   * @param pOther the fixed value of pattern parameter other, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final RelationEnding pEnding, final RelationEnding pOther, final IMatchProcessor<? super OtherEndingMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEnding, pOther}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
   * @param pOther the fixed value of pattern parameter other, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public OtherEndingMatch newMatch(final RelationEnding pEnding, final RelationEnding pOther) {
    return OtherEndingMatch.newMatch(pEnding, pOther);
  }
  
  /**
   * Retrieve the set of values that occur in matches for ending.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<RelationEnding> rawAccumulateAllValuesOfending(final Object[] parameters) {
    Set<RelationEnding> results = new HashSet<RelationEnding>();
    rawAccumulateAllValues(POSITION_ENDING, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ending.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RelationEnding> getAllValuesOfending() {
    return rawAccumulateAllValuesOfending(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ending.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RelationEnding> getAllValuesOfending(final OtherEndingMatch partialMatch) {
    return rawAccumulateAllValuesOfending(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ending.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RelationEnding> getAllValuesOfending(final RelationEnding pOther) {
    return rawAccumulateAllValuesOfending(new Object[]{
    null, 
    pOther
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for other.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<RelationEnding> rawAccumulateAllValuesOfother(final Object[] parameters) {
    Set<RelationEnding> results = new HashSet<RelationEnding>();
    rawAccumulateAllValues(POSITION_OTHER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for other.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RelationEnding> getAllValuesOfother() {
    return rawAccumulateAllValuesOfother(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for other.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RelationEnding> getAllValuesOfother(final OtherEndingMatch partialMatch) {
    return rawAccumulateAllValuesOfother(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for other.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RelationEnding> getAllValuesOfother(final RelationEnding pEnding) {
    return rawAccumulateAllValuesOfother(new Object[]{
    pEnding, 
    null
    });
  }
  
  @Override
  protected OtherEndingMatch tupleToMatch(final Tuple t) {
    try {
    	return OtherEndingMatch.newMatch((RelationEnding) t.get(POSITION_ENDING), (RelationEnding) t.get(POSITION_OTHER));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected OtherEndingMatch arrayToMatch(final Object[] match) {
    try {
    	return OtherEndingMatch.newMatch((RelationEnding) match[POSITION_ENDING], (RelationEnding) match[POSITION_OTHER]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected OtherEndingMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return OtherEndingMatch.newMutableMatch((RelationEnding) match[POSITION_ENDING], (RelationEnding) match[POSITION_OTHER]);
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
  public static IQuerySpecification<OtherEndingMatcher> querySpecification() throws ViatraQueryException {
    return OtherEndingQuerySpecification.instance();
  }
}
