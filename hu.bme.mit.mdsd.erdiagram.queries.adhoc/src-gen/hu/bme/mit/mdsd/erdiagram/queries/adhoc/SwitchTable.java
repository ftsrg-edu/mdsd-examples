/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries.adhoc/src/hu/bme/mit/mdsd/erdiagram/queries/adhoc/erAdhocQueries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.adhoc;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.queries.adhoc.EndingForeignKey;
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
 *         pattern switchTable(relation: Relation, leftKey : Attribute, rightKey : Attribute) {
 *         	Relation.leftEnding(relation, left);
 *         	Relation.rightEnding(relation, right);
 *         	find endingForeignKey(left, _leftType, leftKey);
 *         	find endingForeignKey(right, _rightType, rightKey);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SwitchTable extends BaseGeneratedEMFQuerySpecification<SwitchTable.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.adhoc.switchTable pattern,
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
    private Relation fRelation;
    
    private Attribute fLeftKey;
    
    private Attribute fRightKey;
    
    private static List<String> parameterNames = makeImmutableList("relation", "leftKey", "rightKey");
    
    private Match(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey) {
      this.fRelation = pRelation;
      this.fLeftKey = pLeftKey;
      this.fRightKey = pRightKey;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "relation": return this.fRelation;
          case "leftKey": return this.fLeftKey;
          case "rightKey": return this.fRightKey;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fRelation;
          case 1: return this.fLeftKey;
          case 2: return this.fRightKey;
          default: return null;
      }
    }
    
    public Relation getRelation() {
      return this.fRelation;
    }
    
    public Attribute getLeftKey() {
      return this.fLeftKey;
    }
    
    public Attribute getRightKey() {
      return this.fRightKey;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("relation".equals(parameterName) ) {
          this.fRelation = (Relation) newValue;
          return true;
      }
      if ("leftKey".equals(parameterName) ) {
          this.fLeftKey = (Attribute) newValue;
          return true;
      }
      if ("rightKey".equals(parameterName) ) {
          this.fRightKey = (Attribute) newValue;
          return true;
      }
      return false;
    }
    
    public void setRelation(final Relation pRelation) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRelation = pRelation;
    }
    
    public void setLeftKey(final Attribute pLeftKey) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLeftKey = pLeftKey;
    }
    
    public void setRightKey(final Attribute pRightKey) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRightKey = pRightKey;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.adhoc.switchTable";
    }
    
    @Override
    public List<String> parameterNames() {
      return SwitchTable.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fRelation, fLeftKey, fRightKey};
    }
    
    @Override
    public SwitchTable.Match toImmutable() {
      return isMutable() ? newMatch(fRelation, fLeftKey, fRightKey) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"relation\"=" + prettyPrintValue(fRelation) + ", ");
      result.append("\"leftKey\"=" + prettyPrintValue(fLeftKey) + ", ");
      result.append("\"rightKey\"=" + prettyPrintValue(fRightKey));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fRelation, fLeftKey, fRightKey);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SwitchTable.Match)) {
          SwitchTable.Match other = (SwitchTable.Match) obj;
          return Objects.equals(fRelation, other.fRelation) && Objects.equals(fLeftKey, other.fLeftKey) && Objects.equals(fRightKey, other.fRightKey);
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
    public SwitchTable specification() {
      return SwitchTable.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SwitchTable.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pRelation the fixed value of pattern parameter relation, or null if not bound.
     * @param pLeftKey the fixed value of pattern parameter leftKey, or null if not bound.
     * @param pRightKey the fixed value of pattern parameter rightKey, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SwitchTable.Match newMutableMatch(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey) {
      return new Mutable(pRelation, pLeftKey, pRightKey);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRelation the fixed value of pattern parameter relation, or null if not bound.
     * @param pLeftKey the fixed value of pattern parameter leftKey, or null if not bound.
     * @param pRightKey the fixed value of pattern parameter rightKey, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SwitchTable.Match newMatch(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey) {
      return new Immutable(pRelation, pLeftKey, pRightKey);
    }
    
    private static final class Mutable extends SwitchTable.Match {
      Mutable(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey) {
        super(pRelation, pLeftKey, pRightKey);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SwitchTable.Match {
      Immutable(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey) {
        super(pRelation, pLeftKey, pRightKey);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.adhoc.switchTable pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern switchTable(relation: Relation, leftKey : Attribute, rightKey : Attribute) {
   * 	Relation.leftEnding(relation, left);
   * 	Relation.rightEnding(relation, right);
   * 	find endingForeignKey(left, _leftType, leftKey);
   * 	find endingForeignKey(right, _rightType, rightKey);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SwitchTable
   * 
   */
  public static class Matcher extends BaseMatcher<SwitchTable.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SwitchTable.Matcher on(final ViatraQueryEngine engine) {
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
    public static SwitchTable.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_RELATION = 0;
    
    private static final int POSITION_LEFTKEY = 1;
    
    private static final int POSITION_RIGHTKEY = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SwitchTable.Matcher.class);
    
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
     * @param pRelation the fixed value of pattern parameter relation, or null if not bound.
     * @param pLeftKey the fixed value of pattern parameter leftKey, or null if not bound.
     * @param pRightKey the fixed value of pattern parameter rightKey, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SwitchTable.Match> getAllMatches(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey) {
      return rawStreamAllMatches(new Object[]{pRelation, pLeftKey, pRightKey}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pRelation the fixed value of pattern parameter relation, or null if not bound.
     * @param pLeftKey the fixed value of pattern parameter leftKey, or null if not bound.
     * @param pRightKey the fixed value of pattern parameter rightKey, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SwitchTable.Match> streamAllMatches(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey) {
      return rawStreamAllMatches(new Object[]{pRelation, pLeftKey, pRightKey});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRelation the fixed value of pattern parameter relation, or null if not bound.
     * @param pLeftKey the fixed value of pattern parameter leftKey, or null if not bound.
     * @param pRightKey the fixed value of pattern parameter rightKey, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SwitchTable.Match> getOneArbitraryMatch(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey) {
      return rawGetOneArbitraryMatch(new Object[]{pRelation, pLeftKey, pRightKey});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pRelation the fixed value of pattern parameter relation, or null if not bound.
     * @param pLeftKey the fixed value of pattern parameter leftKey, or null if not bound.
     * @param pRightKey the fixed value of pattern parameter rightKey, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey) {
      return rawHasMatch(new Object[]{pRelation, pLeftKey, pRightKey});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pRelation the fixed value of pattern parameter relation, or null if not bound.
     * @param pLeftKey the fixed value of pattern parameter leftKey, or null if not bound.
     * @param pRightKey the fixed value of pattern parameter rightKey, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey) {
      return rawCountMatches(new Object[]{pRelation, pLeftKey, pRightKey});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRelation the fixed value of pattern parameter relation, or null if not bound.
     * @param pLeftKey the fixed value of pattern parameter leftKey, or null if not bound.
     * @param pRightKey the fixed value of pattern parameter rightKey, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey, final Consumer<? super SwitchTable.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pRelation, pLeftKey, pRightKey}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRelation the fixed value of pattern parameter relation, or null if not bound.
     * @param pLeftKey the fixed value of pattern parameter leftKey, or null if not bound.
     * @param pRightKey the fixed value of pattern parameter rightKey, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SwitchTable.Match newMatch(final Relation pRelation, final Attribute pLeftKey, final Attribute pRightKey) {
      return SwitchTable.Match.newMatch(pRelation, pLeftKey, pRightKey);
    }
    
    /**
     * Retrieve the set of values that occur in matches for relation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Relation> rawStreamAllValuesOfrelation(final Object[] parameters) {
      return rawStreamAllValues(POSITION_RELATION, parameters).map(Relation.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for relation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Relation> getAllValuesOfrelation() {
      return rawStreamAllValuesOfrelation(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for relation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Relation> streamAllValuesOfrelation() {
      return rawStreamAllValuesOfrelation(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for relation.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Relation> streamAllValuesOfrelation(final SwitchTable.Match partialMatch) {
      return rawStreamAllValuesOfrelation(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for relation.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Relation> streamAllValuesOfrelation(final Attribute pLeftKey, final Attribute pRightKey) {
      return rawStreamAllValuesOfrelation(new Object[]{null, pLeftKey, pRightKey});
    }
    
    /**
     * Retrieve the set of values that occur in matches for relation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Relation> getAllValuesOfrelation(final SwitchTable.Match partialMatch) {
      return rawStreamAllValuesOfrelation(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for relation.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Relation> getAllValuesOfrelation(final Attribute pLeftKey, final Attribute pRightKey) {
      return rawStreamAllValuesOfrelation(new Object[]{null, pLeftKey, pRightKey}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Attribute> rawStreamAllValuesOfleftKey(final Object[] parameters) {
      return rawStreamAllValues(POSITION_LEFTKEY, parameters).map(Attribute.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfleftKey() {
      return rawStreamAllValuesOfleftKey(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfleftKey() {
      return rawStreamAllValuesOfleftKey(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftKey.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfleftKey(final SwitchTable.Match partialMatch) {
      return rawStreamAllValuesOfleftKey(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftKey.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfleftKey(final Relation pRelation, final Attribute pRightKey) {
      return rawStreamAllValuesOfleftKey(new Object[]{pRelation, null, pRightKey});
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfleftKey(final SwitchTable.Match partialMatch) {
      return rawStreamAllValuesOfleftKey(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for leftKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfleftKey(final Relation pRelation, final Attribute pRightKey) {
      return rawStreamAllValuesOfleftKey(new Object[]{pRelation, null, pRightKey}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Attribute> rawStreamAllValuesOfrightKey(final Object[] parameters) {
      return rawStreamAllValues(POSITION_RIGHTKEY, parameters).map(Attribute.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfrightKey() {
      return rawStreamAllValuesOfrightKey(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfrightKey() {
      return rawStreamAllValuesOfrightKey(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightKey.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfrightKey(final SwitchTable.Match partialMatch) {
      return rawStreamAllValuesOfrightKey(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightKey.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfrightKey(final Relation pRelation, final Attribute pLeftKey) {
      return rawStreamAllValuesOfrightKey(new Object[]{pRelation, pLeftKey, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfrightKey(final SwitchTable.Match partialMatch) {
      return rawStreamAllValuesOfrightKey(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rightKey.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfrightKey(final Relation pRelation, final Attribute pLeftKey) {
      return rawStreamAllValuesOfrightKey(new Object[]{pRelation, pLeftKey, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected SwitchTable.Match tupleToMatch(final Tuple t) {
      try {
          return SwitchTable.Match.newMatch((Relation) t.get(POSITION_RELATION), (Attribute) t.get(POSITION_LEFTKEY), (Attribute) t.get(POSITION_RIGHTKEY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SwitchTable.Match arrayToMatch(final Object[] match) {
      try {
          return SwitchTable.Match.newMatch((Relation) match[POSITION_RELATION], (Attribute) match[POSITION_LEFTKEY], (Attribute) match[POSITION_RIGHTKEY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SwitchTable.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SwitchTable.Match.newMutableMatch((Relation) match[POSITION_RELATION], (Attribute) match[POSITION_LEFTKEY], (Attribute) match[POSITION_RIGHTKEY]);
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
    public static IQuerySpecification<SwitchTable.Matcher> querySpecification() {
      return SwitchTable.instance();
    }
  }
  
  private SwitchTable() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SwitchTable instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SwitchTable.Matcher instantiate(final ViatraQueryEngine engine) {
    return SwitchTable.Matcher.on(engine);
  }
  
  @Override
  public SwitchTable.Matcher instantiate() {
    return SwitchTable.Matcher.create();
  }
  
  @Override
  public SwitchTable.Match newEmptyMatch() {
    return SwitchTable.Match.newEmptyMatch();
  }
  
  @Override
  public SwitchTable.Match newMatch(final Object... parameters) {
    return SwitchTable.Match.newMatch((hu.bme.mit.mdsd.erdiagram.Relation) parameters[0], (hu.bme.mit.mdsd.erdiagram.Attribute) parameters[1], (hu.bme.mit.mdsd.erdiagram.Attribute) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link SwitchTable} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link SwitchTable#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SwitchTable INSTANCE = new SwitchTable();
    
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
    private static final SwitchTable.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_relation = new PParameter("relation", "hu.bme.mit.mdsd.erdiagram.Relation", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Relation")), PParameterDirection.INOUT);
    
    private final PParameter parameter_leftKey = new PParameter("leftKey", "hu.bme.mit.mdsd.erdiagram.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_rightKey = new PParameter("rightKey", "hu.bme.mit.mdsd.erdiagram.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Attribute")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_relation, parameter_leftKey, parameter_rightKey);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.adhoc.switchTable";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("relation","leftKey","rightKey");
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
          PVariable var_relation = body.getOrCreateVariableByName("relation");
          PVariable var_leftKey = body.getOrCreateVariableByName("leftKey");
          PVariable var_rightKey = body.getOrCreateVariableByName("rightKey");
          PVariable var_left = body.getOrCreateVariableByName("left");
          PVariable var_right = body.getOrCreateVariableByName("right");
          PVariable var__leftType = body.getOrCreateVariableByName("_leftType");
          PVariable var__rightType = body.getOrCreateVariableByName("_rightType");
          new TypeConstraint(body, Tuples.flatTupleOf(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_leftKey), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_rightKey), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_relation, parameter_relation),
             new ExportedParameter(body, var_leftKey, parameter_leftKey),
             new ExportedParameter(body, var_rightKey, parameter_rightKey)
          ));
          // 	Relation.leftEnding(relation, left)
          new TypeConstraint(body, Tuples.flatTupleOf(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_relation, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "leftEnding")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
          new Equality(body, var__virtual_0_, var_left);
          // 	Relation.rightEnding(relation, right)
          new TypeConstraint(body, Tuples.flatTupleOf(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_relation, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "rightEnding")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
          new Equality(body, var__virtual_1_, var_right);
          // 	find endingForeignKey(left, _leftType, leftKey)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_left, var__leftType, var_leftKey), EndingForeignKey.instance().getInternalQueryRepresentation());
          // 	find endingForeignKey(right, _rightType, rightKey)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_right, var__rightType, var_rightKey), EndingForeignKey.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
