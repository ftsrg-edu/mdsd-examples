/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.BadEntityMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.BadEntityQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.badEntity pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link BadEntityMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern badEntity(entity) {
 * 	find emptyNamedElement(entity);
 * } or {
 * 	find entityStartsWithSmallCase(entity);
 * } or {
 * 	find sameNamedEntities(entity, _, _);
 * }
 * </pre></code>
 * 
 * @see BadEntityMatch
 * @see BadEntityProcessor
 * @see BadEntityQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class BadEntityMatcher extends BaseMatcher<BadEntityMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static BadEntityMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    BadEntityMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (BadEntityMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static BadEntityMatcher create() throws ViatraQueryException {
    return new BadEntityMatcher();
  }
  
  private final static int POSITION_ENTITY = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BadEntityMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private BadEntityMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return matches represented as a BadEntityMatch object.
   * 
   */
  public Collection<BadEntityMatch> getAllMatches(final Entity pEntity) {
    return rawGetAllMatches(new Object[]{pEntity});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return a match represented as a BadEntityMatch object, or null if no match is found.
   * 
   */
  public BadEntityMatch getOneArbitraryMatch(final Entity pEntity) {
    return rawGetOneArbitraryMatch(new Object[]{pEntity});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Entity pEntity) {
    return rawHasMatch(new Object[]{pEntity});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Entity pEntity) {
    return rawCountMatches(new Object[]{pEntity});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Entity pEntity, final IMatchProcessor<? super BadEntityMatch> processor) {
    rawForEachMatch(new Object[]{pEntity}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Entity pEntity, final IMatchProcessor<? super BadEntityMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEntity}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public BadEntityMatch newMatch(final Entity pEntity) {
    return BadEntityMatch.newMatch(pEntity);
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Entity> rawAccumulateAllValuesOfentity(final Object[] parameters) {
    Set<Entity> results = new HashSet<Entity>();
    rawAccumulateAllValues(POSITION_ENTITY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity() {
    return rawAccumulateAllValuesOfentity(emptyArray());
  }
  
  @Override
  protected BadEntityMatch tupleToMatch(final Tuple t) {
    try {
    	return BadEntityMatch.newMatch((Entity) t.get(POSITION_ENTITY));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected BadEntityMatch arrayToMatch(final Object[] match) {
    try {
    	return BadEntityMatch.newMatch((Entity) match[POSITION_ENTITY]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected BadEntityMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return BadEntityMatch.newMutableMatch((Entity) match[POSITION_ENTITY]);
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
  public static IQuerySpecification<BadEntityMatcher> querySpecification() throws ViatraQueryException {
    return BadEntityQuerySpecification.instance();
  }
}
