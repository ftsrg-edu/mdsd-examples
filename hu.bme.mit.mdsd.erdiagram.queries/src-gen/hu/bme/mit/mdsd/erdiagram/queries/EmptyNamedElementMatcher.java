/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.NamedElement;
import hu.bme.mit.mdsd.erdiagram.queries.EmptyNamedElementMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.EmptyNamedElementQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.emptyNamedElement pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
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
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EmptyNamedElementMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    EmptyNamedElementMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (EmptyNamedElementMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static EmptyNamedElementMatcher create() throws ViatraQueryException {
    return new EmptyNamedElementMatcher();
  }
  
  private final static int POSITION_NAMEDELEMENT = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EmptyNamedElementMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private EmptyNamedElementMatcher() throws ViatraQueryException {
    super(querySpecification());
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
    	return EmptyNamedElementMatch.newMatch((NamedElement) t.get(POSITION_NAMEDELEMENT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EmptyNamedElementMatch arrayToMatch(final Object[] match) {
    try {
    	return EmptyNamedElementMatch.newMatch((NamedElement) match[POSITION_NAMEDELEMENT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EmptyNamedElementMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EmptyNamedElementMatch.newMutableMatch((NamedElement) match[POSITION_NAMEDELEMENT]);
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
  public static IQuerySpecification<EmptyNamedElementMatcher> querySpecification() throws ViatraQueryException {
    return EmptyNamedElementQuerySpecification.instance();
  }
}
