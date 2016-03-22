package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.NamedElement;
import hu.bme.mit.mdsd.erdiagram.queries.EmptyNamedElementMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.EmptyNamedElementQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.emptyNamedElement pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EmptyNamedElementMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern emptyNamedElement(namedElement) {
 * 	NamedElement.name(namedElement, name);
 * 	check(name.isEmpty());
 * }
 * </pre></code>
 * 
 * @see EmptyNamedElementMatch
 * @see EmptyNamedElementProcessor
 * @see EmptyNamedElementQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EmptyNamedElementMatcher extends BaseMatcher<EmptyNamedElementMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EmptyNamedElementMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    EmptyNamedElementMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EmptyNamedElementMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_NAMEDELEMENT = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(EmptyNamedElementMatcher.class);
  
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
  public EmptyNamedElementMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EmptyNamedElementMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
   * @return matches represented as a EmptyNamedElementMatch object.
   * 
   */
  public Collection<EmptyNamedElementMatch> getAllMatches(final NamedElement pNamedElement) {
    return rawGetAllMatches(new Object[]{pNamedElement});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
   * @return a match represented as a EmptyNamedElementMatch object, or null if no match is found.
   * 
   */
  public EmptyNamedElementMatch getOneArbitraryMatch(final NamedElement pNamedElement) {
    return rawGetOneArbitraryMatch(new Object[]{pNamedElement});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final NamedElement pNamedElement) {
    return rawHasMatch(new Object[]{pNamedElement});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final NamedElement pNamedElement) {
    return rawCountMatches(new Object[]{pNamedElement});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final NamedElement pNamedElement, final IMatchProcessor<? super EmptyNamedElementMatch> processor) {
    rawForEachMatch(new Object[]{pNamedElement}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final NamedElement pNamedElement, final IMatchProcessor<? super EmptyNamedElementMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pNamedElement}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EmptyNamedElementMatch newMatch(final NamedElement pNamedElement) {
    return EmptyNamedElementMatch.newMatch(pNamedElement);
  }
  
  /**
   * Retrieve the set of values that occur in matches for namedElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<NamedElement> rawAccumulateAllValuesOfnamedElement(final Object[] parameters) {
    Set<NamedElement> results = new HashSet<NamedElement>();
    rawAccumulateAllValues(POSITION_NAMEDELEMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for namedElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<NamedElement> getAllValuesOfnamedElement() {
    return rawAccumulateAllValuesOfnamedElement(emptyArray());
  }
  
  @Override
  protected EmptyNamedElementMatch tupleToMatch(final Tuple t) {
    try {
    	return EmptyNamedElementMatch.newMatch((hu.bme.mit.mdsd.erdiagram.NamedElement) t.get(POSITION_NAMEDELEMENT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EmptyNamedElementMatch arrayToMatch(final Object[] match) {
    try {
    	return EmptyNamedElementMatch.newMatch((hu.bme.mit.mdsd.erdiagram.NamedElement) match[POSITION_NAMEDELEMENT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EmptyNamedElementMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EmptyNamedElementMatch.newMutableMatch((hu.bme.mit.mdsd.erdiagram.NamedElement) match[POSITION_NAMEDELEMENT]);
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
  public static IQuerySpecification<EmptyNamedElementMatcher> querySpecification() throws IncQueryException {
    return EmptyNamedElementQuerySpecification.instance();
  }
}
