/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.EntityAttributeMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityAttributeQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.entityAttribute pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EntityAttributeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern entityAttribute(e, attr) {
 * 	Entity.attributes(e, attr);
 * }
 * </pre></code>
 * 
 * @see EntityAttributeMatch
 * @see EntityAttributeProcessor
 * @see EntityAttributeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EntityAttributeMatcher extends BaseMatcher<EntityAttributeMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EntityAttributeMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    EntityAttributeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (EntityAttributeMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static EntityAttributeMatcher create() throws ViatraQueryException {
    return new EntityAttributeMatcher();
  }
  
  private final static int POSITION_E = 0;
  
  private final static int POSITION_ATTR = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EntityAttributeMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private EntityAttributeMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
   * @return matches represented as a EntityAttributeMatch object.
   * 
   */
  public Collection<EntityAttributeMatch> getAllMatches(final Entity pE, final Attribute pAttr) {
    return rawGetAllMatches(new Object[]{pE, pAttr});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
   * @return a match represented as a EntityAttributeMatch object, or null if no match is found.
   * 
   */
  public EntityAttributeMatch getOneArbitraryMatch(final Entity pE, final Attribute pAttr) {
    return rawGetOneArbitraryMatch(new Object[]{pE, pAttr});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Entity pE, final Attribute pAttr) {
    return rawHasMatch(new Object[]{pE, pAttr});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Entity pE, final Attribute pAttr) {
    return rawCountMatches(new Object[]{pE, pAttr});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Entity pE, final Attribute pAttr, final IMatchProcessor<? super EntityAttributeMatch> processor) {
    rawForEachMatch(new Object[]{pE, pAttr}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Entity pE, final Attribute pAttr, final IMatchProcessor<? super EntityAttributeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pE, pAttr}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EntityAttributeMatch newMatch(final Entity pE, final Attribute pAttr) {
    return EntityAttributeMatch.newMatch(pE, pAttr);
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
  public Set<Entity> getAllValuesOfe(final EntityAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfe(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for e.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfe(final Attribute pAttr) {
    return rawAccumulateAllValuesOfe(new Object[]{
    null, 
    pAttr
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Attribute> rawAccumulateAllValuesOfattr(final Object[] parameters) {
    Set<Attribute> results = new HashSet<Attribute>();
    rawAccumulateAllValues(POSITION_ATTR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Attribute> getAllValuesOfattr() {
    return rawAccumulateAllValuesOfattr(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Attribute> getAllValuesOfattr(final EntityAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfattr(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Attribute> getAllValuesOfattr(final Entity pE) {
    return rawAccumulateAllValuesOfattr(new Object[]{
    pE, 
    null
    });
  }
  
  @Override
  protected EntityAttributeMatch tupleToMatch(final Tuple t) {
    try {
    	return EntityAttributeMatch.newMatch((Entity) t.get(POSITION_E), (Attribute) t.get(POSITION_ATTR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EntityAttributeMatch arrayToMatch(final Object[] match) {
    try {
    	return EntityAttributeMatch.newMatch((Entity) match[POSITION_E], (Attribute) match[POSITION_ATTR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EntityAttributeMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EntityAttributeMatch.newMutableMatch((Entity) match[POSITION_E], (Attribute) match[POSITION_ATTR]);
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
  public static IQuerySpecification<EntityAttributeMatcher> querySpecification() throws ViatraQueryException {
    return EntityAttributeQuerySpecification.instance();
  }
}
