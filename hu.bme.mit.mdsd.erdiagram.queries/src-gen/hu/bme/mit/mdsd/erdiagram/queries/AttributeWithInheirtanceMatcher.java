/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.AttributeWithInheirtanceMatch;
import hu.bme.mit.mdsd.erdiagram.queries.util.AttributeWithInheirtanceQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.attributeWithInheirtance pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AttributeWithInheirtanceMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern attributeWithInheirtance(entity : Entity, attribute : Attribute) {
 *     Entity.attributes(entity,attribute);
 * } or {
 *     find allSuperEntity(entity, superEntity);
 *     find entityAttribute(superEntity, attribute);
 * }
 * </pre></code>
 * 
 * @see AttributeWithInheirtanceMatch
 * @see AttributeWithInheirtanceProcessor
 * @see AttributeWithInheirtanceQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AttributeWithInheirtanceMatcher extends BaseMatcher<AttributeWithInheirtanceMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AttributeWithInheirtanceMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    AttributeWithInheirtanceMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (AttributeWithInheirtanceMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static AttributeWithInheirtanceMatcher create() throws ViatraQueryException {
    return new AttributeWithInheirtanceMatcher();
  }
  
  private final static int POSITION_ENTITY = 0;
  
  private final static int POSITION_ATTRIBUTE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AttributeWithInheirtanceMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private AttributeWithInheirtanceMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return matches represented as a AttributeWithInheirtanceMatch object.
   * 
   */
  public Collection<AttributeWithInheirtanceMatch> getAllMatches(final Entity pEntity, final Attribute pAttribute) {
    return rawGetAllMatches(new Object[]{pEntity, pAttribute});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return a match represented as a AttributeWithInheirtanceMatch object, or null if no match is found.
   * 
   */
  public AttributeWithInheirtanceMatch getOneArbitraryMatch(final Entity pEntity, final Attribute pAttribute) {
    return rawGetOneArbitraryMatch(new Object[]{pEntity, pAttribute});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Entity pEntity, final Attribute pAttribute) {
    return rawHasMatch(new Object[]{pEntity, pAttribute});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Entity pEntity, final Attribute pAttribute) {
    return rawCountMatches(new Object[]{pEntity, pAttribute});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Entity pEntity, final Attribute pAttribute, final IMatchProcessor<? super AttributeWithInheirtanceMatch> processor) {
    rawForEachMatch(new Object[]{pEntity, pAttribute}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Entity pEntity, final Attribute pAttribute, final IMatchProcessor<? super AttributeWithInheirtanceMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEntity, pAttribute}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AttributeWithInheirtanceMatch newMatch(final Entity pEntity, final Attribute pAttribute) {
    return AttributeWithInheirtanceMatch.newMatch(pEntity, pAttribute);
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
  
  /**
   * Retrieve the set of values that occur in matches for entity.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity(final AttributeWithInheirtanceMatch partialMatch) {
    return rawAccumulateAllValuesOfentity(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for entity.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Entity> getAllValuesOfentity(final Attribute pAttribute) {
    return rawAccumulateAllValuesOfentity(new Object[]{
    null, 
    pAttribute
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for attribute.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Attribute> rawAccumulateAllValuesOfattribute(final Object[] parameters) {
    Set<Attribute> results = new HashSet<Attribute>();
    rawAccumulateAllValues(POSITION_ATTRIBUTE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for attribute.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Attribute> getAllValuesOfattribute() {
    return rawAccumulateAllValuesOfattribute(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for attribute.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Attribute> getAllValuesOfattribute(final AttributeWithInheirtanceMatch partialMatch) {
    return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for attribute.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Attribute> getAllValuesOfattribute(final Entity pEntity) {
    return rawAccumulateAllValuesOfattribute(new Object[]{
    pEntity, 
    null
    });
  }
  
  @Override
  protected AttributeWithInheirtanceMatch tupleToMatch(final Tuple t) {
    try {
    	return AttributeWithInheirtanceMatch.newMatch((Entity) t.get(POSITION_ENTITY), (Attribute) t.get(POSITION_ATTRIBUTE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AttributeWithInheirtanceMatch arrayToMatch(final Object[] match) {
    try {
    	return AttributeWithInheirtanceMatch.newMatch((Entity) match[POSITION_ENTITY], (Attribute) match[POSITION_ATTRIBUTE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AttributeWithInheirtanceMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return AttributeWithInheirtanceMatch.newMutableMatch((Entity) match[POSITION_ENTITY], (Attribute) match[POSITION_ATTRIBUTE]);
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
  public static IQuerySpecification<AttributeWithInheirtanceMatcher> querySpecification() throws ViatraQueryException {
    return AttributeWithInheirtanceQuerySpecification.instance();
  }
}
