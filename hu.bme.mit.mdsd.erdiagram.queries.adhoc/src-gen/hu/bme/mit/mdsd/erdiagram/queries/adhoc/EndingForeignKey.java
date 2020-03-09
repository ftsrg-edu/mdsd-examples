/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries.adhoc/src/hu/bme/mit/mdsd/erdiagram/queries/adhoc/erAdhocQueries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.adhoc;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.RelationEnding;
import hu.bme.mit.mdsd.erdiagram.queries.KeyAttributes;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern endingForeignKey(
 *         	ending : RelationEnding, 
 *         	endingType : Entity, 
 *         	endingKey : Attribute
 *         ) {
 *         	RelationEnding.target(ending, endingType);
 *         	// call from plugin hu.bme.mit.mdsd.erdiagram.queries
 *         	find hu.bme.mit.mdsd.erdiagram.queries.keyAttributes(endingType, endingKey);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EndingForeignKey extends BaseGeneratedEMFQuerySpecification<EndingForeignKey.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.adhoc.endingForeignKey pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private RelationEnding fEnding;
    
    private Entity fEndingType;
    
    private Attribute fEndingKey;
    
    private static List<String> parameterNames = makeImmutableList("ending", "endingType", "endingKey");
    
    private Match(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey) {
      this.fEnding = pEnding;
      this.fEndingType = pEndingType;
      this.fEndingKey = pEndingKey;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "ending": return this.fEnding;
          case "endingType": return this.fEndingType;
          case "endingKey": return this.fEndingKey;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEnding;
          case 1: return this.fEndingType;
          case 2: return this.fEndingKey;
          default: return null;
      }
    }
    
    public RelationEnding getEnding() {
      return this.fEnding;
    }
    
    public Entity getEndingType() {
      return this.fEndingType;
    }
    
    public Attribute getEndingKey() {
      return this.fEndingKey;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("ending".equals(parameterName) ) {
          this.fEnding = (RelationEnding) newValue;
          return true;
      }
      if ("endingType".equals(parameterName) ) {
          this.fEndingType = (Entity) newValue;
          return true;
      }
      if ("endingKey".equals(parameterName) ) {
          this.fEndingKey = (Attribute) newValue;
          return true;
      }
      return false;
    }
    
    public void setEnding(final RelationEnding pEnding) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnding = pEnding;
    }
    
    public void setEndingType(final Entity pEndingType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEndingType = pEndingType;
    }
    
    public void setEndingKey(final Attribute pEndingKey) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEndingKey = pEndingKey;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.adhoc.endingForeignKey";
    }
    
    @Override
    public List<String> parameterNames() {
      return EndingForeignKey.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEnding, fEndingType, fEndingKey};
    }
    
    @Override
    public EndingForeignKey.Match toImmutable() {
      return isMutable() ? newMatch(fEnding, fEndingType, fEndingKey) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ending\"=" + prettyPrintValue(fEnding) + ", ");
      result.append("\"endingType\"=" + prettyPrintValue(fEndingType) + ", ");
      result.append("\"endingKey\"=" + prettyPrintValue(fEndingKey));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEnding, fEndingType, fEndingKey);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EndingForeignKey.Match)) {
          EndingForeignKey.Match other = (EndingForeignKey.Match) obj;
          return Objects.equals(fEnding, other.fEnding) && Objects.equals(fEndingType, other.fEndingType) && Objects.equals(fEndingKey, other.fEndingKey);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public EndingForeignKey specification() {
      return EndingForeignKey.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EndingForeignKey.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pEndingType the fixed value of pattern parameter endingType, or null if not bound.
     * @param pEndingKey the fixed value of pattern parameter endingKey, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EndingForeignKey.Match newMutableMatch(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey) {
      return new Mutable(pEnding, pEndingType, pEndingKey);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pEndingType the fixed value of pattern parameter endingType, or null if not bound.
     * @param pEndingKey the fixed value of pattern parameter endingKey, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EndingForeignKey.Match newMatch(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey) {
      return new Immutable(pEnding, pEndingType, pEndingKey);
    }
    
    private static final class Mutable extends EndingForeignKey.Match {
      Mutable(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey) {
        super(pEnding, pEndingType, pEndingKey);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EndingForeignKey.Match {
      Immutable(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey) {
        super(pEnding, pEndingType, pEndingKey);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.adhoc.endingForeignKey pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern endingForeignKey(
   * 	ending : RelationEnding, 
   * 	endingType : Entity, 
   * 	endingKey : Attribute
   * ) {
   * 	RelationEnding.target(ending, endingType);
   * 	// call from plugin hu.bme.mit.mdsd.erdiagram.queries
   * 	find hu.bme.mit.mdsd.erdiagram.queries.keyAttributes(endingType, endingKey);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EndingForeignKey
   * 
   */
  public static class Matcher extends BaseMatcher<EndingForeignKey.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EndingForeignKey.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static EndingForeignKey.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ENDING = 0;
    
    private static final int POSITION_ENDINGTYPE = 1;
    
    private static final int POSITION_ENDINGKEY = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EndingForeignKey.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pEndingType the fixed value of pattern parameter endingType, or null if not bound.
     * @param pEndingKey the fixed value of pattern parameter endingKey, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EndingForeignKey.Match> getAllMatches(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey) {
      return rawStreamAllMatches(new Object[]{pEnding, pEndingType, pEndingKey}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pEndingType the fixed value of pattern parameter endingType, or null if not bound.
     * @param pEndingKey the fixed value of pattern parameter endingKey, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EndingForeignKey.Match> streamAllMatches(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey) {
      return rawStreamAllMatches(new Object[]{pEnding, pEndingType, pEndingKey});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pEndingType the fixed value of pattern parameter endingType, or null if not bound.
     * @param pEndingKey the fixed value of pattern parameter endingKey, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EndingForeignKey.Match> getOneArbitraryMatch(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey) {
      return rawGetOneArbitraryMatch(new Object[]{pEnding, pEndingType, pEndingKey});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pEndingType the fixed value of pattern parameter endingType, or null if not bound.
     * @param pEndingKey the fixed value of pattern parameter endingKey, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey) {
      return rawHasMatch(new Object[]{pEnding, pEndingType, pEndingKey});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pEndingType the fixed value of pattern parameter endingType, or null if not bound.
     * @param pEndingKey the fixed value of pattern parameter endingKey, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey) {
      return rawCountMatches(new Object[]{pEnding, pEndingType, pEndingKey});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pEndingType the fixed value of pattern parameter endingType, or null if not bound.
     * @param pEndingKey the fixed value of pattern parameter endingKey, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey, final Consumer<? super EndingForeignKey.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEnding, pEndingType, pEndingKey}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pEndingType the fixed value of pattern parameter endingType, or null if not bound.
     * @param pEndingKey the fixed value of pattern parameter endingKey, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EndingForeignKey.Match newMatch(final RelationEnding pEnding, final Entity pEndingType, final Attribute pEndingKey) {
      return EndingForeignKey.Match.newMatch(pEnding, pEndingType, pEndingKey);
    }
    
    /**
     * Retrieve the set of values that occur in matches for ending.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<RelationEnding> rawStreamAllValuesOfending(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ENDING, parameters).map(RelationEnding.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for ending.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<RelationEnding> getAllValuesOfending() {
      return rawStreamAllValuesOfending(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ending.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<RelationEnding> streamAllValuesOfending() {
      return rawStreamAllValuesOfending(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ending.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<RelationEnding> streamAllValuesOfending(final EndingForeignKey.Match partialMatch) {
      return rawStreamAllValuesOfending(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ending.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<RelationEnding> streamAllValuesOfending(final Entity pEndingType, final Attribute pEndingKey) {
      return rawStreamAllValuesOfending(new Object[]{null, pEndingType, pEndingKey});
    }
    
    /**
     * Retrieve the set of values that occur in matches for ending.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<RelationEnding> getAllValuesOfending(final EndingForeignKey.Match partialMatch) {
      return rawStreamAllValuesOfending(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ending.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<RelationEnding> getAllValuesOfending(final Entity pEndingType, final Attribute pEndingKey) {
      return rawStreamAllValuesOfending(new Object[]{null, pEndingType, pEndingKey}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Entity> rawStreamAllValuesOfendingType(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ENDINGTYPE, parameters).map(Entity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entity> getAllValuesOfendingType() {
      return rawStreamAllValuesOfendingType(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Entity> streamAllValuesOfendingType() {
      return rawStreamAllValuesOfendingType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Entity> streamAllValuesOfendingType(final EndingForeignKey.Match partialMatch) {
      return rawStreamAllValuesOfendingType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Entity> streamAllValuesOfendingType(final RelationEnding pEnding, final Attribute pEndingKey) {
      return rawStreamAllValuesOfendingType(new Object[]{pEnding, null, pEndingKey});
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entity> getAllValuesOfendingType(final EndingForeignKey.Match partialMatch) {
      return rawStreamAllValuesOfendingType(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entity> getAllValuesOfendingType(final RelationEnding pEnding, final Attribute pEndingKey) {
      return rawStreamAllValuesOfendingType(new Object[]{pEnding, null, pEndingKey}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Attribute> rawStreamAllValuesOfendingKey(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ENDINGKEY, parameters).map(Attribute.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfendingKey() {
      return rawStreamAllValuesOfendingKey(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfendingKey() {
      return rawStreamAllValuesOfendingKey(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingKey.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfendingKey(final EndingForeignKey.Match partialMatch) {
      return rawStreamAllValuesOfendingKey(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingKey.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfendingKey(final RelationEnding pEnding, final Entity pEndingType) {
      return rawStreamAllValuesOfendingKey(new Object[]{pEnding, pEndingType, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfendingKey(final EndingForeignKey.Match partialMatch) {
      return rawStreamAllValuesOfendingKey(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endingKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfendingKey(final RelationEnding pEnding, final Entity pEndingType) {
      return rawStreamAllValuesOfendingKey(new Object[]{pEnding, pEndingType, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected EndingForeignKey.Match tupleToMatch(final Tuple t) {
      try {
          return EndingForeignKey.Match.newMatch((RelationEnding) t.get(POSITION_ENDING), (Entity) t.get(POSITION_ENDINGTYPE), (Attribute) t.get(POSITION_ENDINGKEY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndingForeignKey.Match arrayToMatch(final Object[] match) {
      try {
          return EndingForeignKey.Match.newMatch((RelationEnding) match[POSITION_ENDING], (Entity) match[POSITION_ENDINGTYPE], (Attribute) match[POSITION_ENDINGKEY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndingForeignKey.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EndingForeignKey.Match.newMutableMatch((RelationEnding) match[POSITION_ENDING], (Entity) match[POSITION_ENDINGTYPE], (Attribute) match[POSITION_ENDINGKEY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<EndingForeignKey.Matcher> querySpecification() {
      return EndingForeignKey.instance();
    }
  }
  
  private EndingForeignKey() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EndingForeignKey instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EndingForeignKey.Matcher instantiate(final ViatraQueryEngine engine) {
    return EndingForeignKey.Matcher.on(engine);
  }
  
  @Override
  public EndingForeignKey.Matcher instantiate() {
    return EndingForeignKey.Matcher.create();
  }
  
  @Override
  public EndingForeignKey.Match newEmptyMatch() {
    return EndingForeignKey.Match.newEmptyMatch();
  }
  
  @Override
  public EndingForeignKey.Match newMatch(final Object... parameters) {
    return EndingForeignKey.Match.newMatch((hu.bme.mit.mdsd.erdiagram.RelationEnding) parameters[0], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[1], (hu.bme.mit.mdsd.erdiagram.Attribute) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EndingForeignKey} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EndingForeignKey#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EndingForeignKey INSTANCE = new EndingForeignKey();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final EndingForeignKey.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_ending = new PParameter("ending", "hu.bme.mit.mdsd.erdiagram.RelationEnding", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "RelationEnding")), PParameterDirection.INOUT);
    
    private final PParameter parameter_endingType = new PParameter("endingType", "hu.bme.mit.mdsd.erdiagram.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Entity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_endingKey = new PParameter("endingKey", "hu.bme.mit.mdsd.erdiagram.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Attribute")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_ending, parameter_endingType, parameter_endingKey);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.adhoc.endingForeignKey";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ending","endingType","endingKey");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_ending = body.getOrCreateVariableByName("ending");
          PVariable var_endingType = body.getOrCreateVariableByName("endingType");
          PVariable var_endingKey = body.getOrCreateVariableByName("endingKey");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ending), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_endingType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_endingKey), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ending, parameter_ending),
             new ExportedParameter(body, var_endingType, parameter_endingType),
             new ExportedParameter(body, var_endingKey, parameter_endingKey)
          ));
          // 	RelationEnding.target(ending, endingType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ending), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ending, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
          new Equality(body, var__virtual_0_, var_endingType);
          // 	// call from plugin hu.bme.mit.mdsd.erdiagram.queries	find hu.bme.mit.mdsd.erdiagram.queries.keyAttributes(endingType, endingKey)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_endingType, var_endingKey), KeyAttributes.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
