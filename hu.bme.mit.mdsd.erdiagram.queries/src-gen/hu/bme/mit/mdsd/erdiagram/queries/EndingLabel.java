/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/qbf.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.RelationEnding;
import hu.bme.mit.mdsd.erdiagram.queries.NameLabel;
import hu.bme.mit.mdsd.erdiagram.queries.TypeLabel;
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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
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
 *         {@literal @}QueryBasedFeature(keepCache = false)
 *         pattern endingLabel(ending: RelationEnding, label: java String) {
 *         	find nameLabel(ending, nameLabel);
 *         	find typeLabel(ending, typeLabel);
 *         	label == eval (String.format("%s : %s", nameLabel, typeLabel));
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EndingLabel extends BaseGeneratedEMFQuerySpecification<EndingLabel.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.endingLabel pattern,
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
    
    private String fLabel;
    
    private static List<String> parameterNames = makeImmutableList("ending", "label");
    
    private Match(final RelationEnding pEnding, final String pLabel) {
      this.fEnding = pEnding;
      this.fLabel = pLabel;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "ending": return this.fEnding;
          case "label": return this.fLabel;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEnding;
          case 1: return this.fLabel;
          default: return null;
      }
    }
    
    public RelationEnding getEnding() {
      return this.fEnding;
    }
    
    public String getLabel() {
      return this.fLabel;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("ending".equals(parameterName) ) {
          this.fEnding = (RelationEnding) newValue;
          return true;
      }
      if ("label".equals(parameterName) ) {
          this.fLabel = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setEnding(final RelationEnding pEnding) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnding = pEnding;
    }
    
    public void setLabel(final String pLabel) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLabel = pLabel;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.endingLabel";
    }
    
    @Override
    public List<String> parameterNames() {
      return EndingLabel.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEnding, fLabel};
    }
    
    @Override
    public EndingLabel.Match toImmutable() {
      return isMutable() ? newMatch(fEnding, fLabel) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ending\"=" + prettyPrintValue(fEnding) + ", ");
      result.append("\"label\"=" + prettyPrintValue(fLabel));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEnding, fLabel);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EndingLabel.Match)) {
          EndingLabel.Match other = (EndingLabel.Match) obj;
          return Objects.equals(fEnding, other.fEnding) && Objects.equals(fLabel, other.fLabel);
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
    public EndingLabel specification() {
      return EndingLabel.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EndingLabel.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EndingLabel.Match newMutableMatch(final RelationEnding pEnding, final String pLabel) {
      return new Mutable(pEnding, pLabel);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EndingLabel.Match newMatch(final RelationEnding pEnding, final String pLabel) {
      return new Immutable(pEnding, pLabel);
    }
    
    private static final class Mutable extends EndingLabel.Match {
      Mutable(final RelationEnding pEnding, final String pLabel) {
        super(pEnding, pLabel);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EndingLabel.Match {
      Immutable(final RelationEnding pEnding, final String pLabel) {
        super(pEnding, pLabel);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.endingLabel pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}QueryBasedFeature(keepCache = false)
   * pattern endingLabel(ending: RelationEnding, label: java String) {
   * 	find nameLabel(ending, nameLabel);
   * 	find typeLabel(ending, typeLabel);
   * 	label == eval (String.format("%s : %s", nameLabel, typeLabel));
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EndingLabel
   * 
   */
  public static class Matcher extends BaseMatcher<EndingLabel.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EndingLabel.Matcher on(final ViatraQueryEngine engine) {
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
    public static EndingLabel.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ENDING = 0;
    
    private static final int POSITION_LABEL = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EndingLabel.Matcher.class);
    
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
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EndingLabel.Match> getAllMatches(final RelationEnding pEnding, final String pLabel) {
      return rawStreamAllMatches(new Object[]{pEnding, pLabel}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EndingLabel.Match> streamAllMatches(final RelationEnding pEnding, final String pLabel) {
      return rawStreamAllMatches(new Object[]{pEnding, pLabel});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EndingLabel.Match> getOneArbitraryMatch(final RelationEnding pEnding, final String pLabel) {
      return rawGetOneArbitraryMatch(new Object[]{pEnding, pLabel});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final RelationEnding pEnding, final String pLabel) {
      return rawHasMatch(new Object[]{pEnding, pLabel});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final RelationEnding pEnding, final String pLabel) {
      return rawCountMatches(new Object[]{pEnding, pLabel});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final RelationEnding pEnding, final String pLabel, final Consumer<? super EndingLabel.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEnding, pLabel}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EndingLabel.Match newMatch(final RelationEnding pEnding, final String pLabel) {
      return EndingLabel.Match.newMatch(pEnding, pLabel);
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
    public Stream<RelationEnding> streamAllValuesOfending(final EndingLabel.Match partialMatch) {
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
    public Stream<RelationEnding> streamAllValuesOfending(final String pLabel) {
      return rawStreamAllValuesOfending(new Object[]{null, pLabel});
    }
    
    /**
     * Retrieve the set of values that occur in matches for ending.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<RelationEnding> getAllValuesOfending(final EndingLabel.Match partialMatch) {
      return rawStreamAllValuesOfending(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ending.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<RelationEnding> getAllValuesOfending(final String pLabel) {
      return rawStreamAllValuesOfending(new Object[]{null, pLabel}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for label.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOflabel(final Object[] parameters) {
      return rawStreamAllValues(POSITION_LABEL, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for label.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOflabel() {
      return rawStreamAllValuesOflabel(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for label.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOflabel() {
      return rawStreamAllValuesOflabel(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for label.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOflabel(final EndingLabel.Match partialMatch) {
      return rawStreamAllValuesOflabel(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for label.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOflabel(final RelationEnding pEnding) {
      return rawStreamAllValuesOflabel(new Object[]{pEnding, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for label.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOflabel(final EndingLabel.Match partialMatch) {
      return rawStreamAllValuesOflabel(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for label.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOflabel(final RelationEnding pEnding) {
      return rawStreamAllValuesOflabel(new Object[]{pEnding, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected EndingLabel.Match tupleToMatch(final Tuple t) {
      try {
          return EndingLabel.Match.newMatch((RelationEnding) t.get(POSITION_ENDING), (String) t.get(POSITION_LABEL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndingLabel.Match arrayToMatch(final Object[] match) {
      try {
          return EndingLabel.Match.newMatch((RelationEnding) match[POSITION_ENDING], (String) match[POSITION_LABEL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndingLabel.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EndingLabel.Match.newMutableMatch((RelationEnding) match[POSITION_ENDING], (String) match[POSITION_LABEL]);
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
    public static IQuerySpecification<EndingLabel.Matcher> querySpecification() {
      return EndingLabel.instance();
    }
  }
  
  private EndingLabel() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EndingLabel instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EndingLabel.Matcher instantiate(final ViatraQueryEngine engine) {
    return EndingLabel.Matcher.on(engine);
  }
  
  @Override
  public EndingLabel.Matcher instantiate() {
    return EndingLabel.Matcher.create();
  }
  
  @Override
  public EndingLabel.Match newEmptyMatch() {
    return EndingLabel.Match.newEmptyMatch();
  }
  
  @Override
  public EndingLabel.Match newMatch(final Object... parameters) {
    return EndingLabel.Match.newMatch((hu.bme.mit.mdsd.erdiagram.RelationEnding) parameters[0], (java.lang.String) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EndingLabel} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EndingLabel#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EndingLabel INSTANCE = new EndingLabel();
    
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
    private static final EndingLabel.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_ending = new PParameter("ending", "hu.bme.mit.mdsd.erdiagram.RelationEnding", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "RelationEnding")), PParameterDirection.INOUT);
    
    private final PParameter parameter_label = new PParameter("label", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_ending, parameter_label);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.endingLabel";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ending","label");
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
          PVariable var_label = body.getOrCreateVariableByName("label");
          PVariable var_nameLabel = body.getOrCreateVariableByName("nameLabel");
          PVariable var_typeLabel = body.getOrCreateVariableByName("typeLabel");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ending), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_label), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ending, parameter_ending),
             new ExportedParameter(body, var_label, parameter_label)
          ));
          // 	find nameLabel(ending, nameLabel)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_ending, var_nameLabel), NameLabel.instance().getInternalQueryRepresentation());
          // 	find typeLabel(ending, typeLabel)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_ending, var_typeLabel), TypeLabel.instance().getInternalQueryRepresentation());
          // 	label == eval (String.format("%s : %s", nameLabel, typeLabel))
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern endingLabel";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("nameLabel", "typeLabel");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String nameLabel = (String) provider.getValue("nameLabel");
                  String typeLabel = (String) provider.getValue("typeLabel");
                  return evaluateExpression_1_1(nameLabel, typeLabel);
              }
          },  var__virtual_0_ ); 
          new Equality(body, var_label, var__virtual_0_);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("QueryBasedFeature");
          annotation.addAttribute("keepCache", false);
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
  
  private static String evaluateExpression_1_1(final String nameLabel, final String typeLabel) {
    String _format = String.format("%s : %s", nameLabel, typeLabel);
    return _format;
  }
}
