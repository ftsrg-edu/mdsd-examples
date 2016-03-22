package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.NamedElement;
import hu.bme.mit.mdsd.erdiagram.queries.BadEntityMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.BadEntityQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.badEntity pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
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
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static BadEntityMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    BadEntityMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new BadEntityMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ENTITY = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(BadEntityMatcher.class);
  
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
  public BadEntityMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public BadEntityMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return matches represented as a BadEntityMatch object.
   * 
   */
  public Collection<BadEntityMatch> getAllMatches(final NamedElement pEntity) {
    return rawGetAllMatches(new Object[]{pEntity});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return a match represented as a BadEntityMatch object, or null if no match is found.
   * 
   */
  public BadEntityMatch getOneArbitraryMatch(final NamedElement pEntity) {
    return rawGetOneArbitraryMatch(new Object[]{pEntity});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final NamedElement pEntity) {
    return rawHasMatch(new Object[]{pEntity});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final NamedElement pEntity) {
    return rawCountMatches(new Object[]{pEntity});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final NamedElement pEntity, final IMatchProcessor<? super BadEntityMatch> processor) {
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
  public boolean forOneArbitraryMatch(final NamedElement pEntity, final IMatchProcessor<? super BadEntityMatch> processor) {
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
  public BadEntityMatch newMatch(final NamedElement pEntity) {
    return BadEntityMatch.newMatch(pEntity);
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<NamedElement> rawAccumulateAllValuesOfentity(final Object[] parameters) {
    Set<NamedElement> results = new HashSet<NamedElement>();
    rawAccumulateAllValues(POSITION_ENTITY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<NamedElement> getAllValuesOfentity() {
    return rawAccumulateAllValuesOfentity(emptyArray());
  }
  
  @Override
  protected BadEntityMatch tupleToMatch(final Tuple t) {
    try {
    	return BadEntityMatch.newMatch((hu.bme.mit.mdsd.erdiagram.NamedElement) t.get(POSITION_ENTITY));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected BadEntityMatch arrayToMatch(final Object[] match) {
    try {
    	return BadEntityMatch.newMatch((hu.bme.mit.mdsd.erdiagram.NamedElement) match[POSITION_ENTITY]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected BadEntityMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return BadEntityMatch.newMutableMatch((hu.bme.mit.mdsd.erdiagram.NamedElement) match[POSITION_ENTITY]);
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
  public static IQuerySpecification<BadEntityMatcher> querySpecification() throws IncQueryException {
    return BadEntityQuerySpecification.instance();
  }
}
