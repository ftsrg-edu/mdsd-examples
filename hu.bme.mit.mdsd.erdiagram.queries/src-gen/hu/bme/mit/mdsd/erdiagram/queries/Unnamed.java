/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/validation.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.NamedElement;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         {@literal @}Constraint(
 *         	key = {unnamed},
 *         	severity = "error",
 *         	message = "Entity has no name",
 *         	targetEditorId = "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID"
 *         )
 *         pattern unnamed(unnamed: NamedElement) {
 *         	neg NamedElement.name(unnamed, _);
 *         } or { 
 *         	NamedElement.name(unnamed, name);
 *         	name == "";
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Unnamed extends BaseGeneratedEMFQuerySpecification<Unnamed.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.unnamed pattern,
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
    private NamedElement fUnnamed;
    
    private static List<String> parameterNames = makeImmutableList("unnamed");
    
    private Match(final NamedElement pUnnamed) {
      this.fUnnamed = pUnnamed;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "unnamed": return this.fUnnamed;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fUnnamed;
          default: return null;
      }
    }
    
    public NamedElement getUnnamed() {
      return this.fUnnamed;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("unnamed".equals(parameterName) ) {
          this.fUnnamed = (NamedElement) newValue;
          return true;
      }
      return false;
    }
    
    public void setUnnamed(final NamedElement pUnnamed) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUnnamed = pUnnamed;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.unnamed";
    }
    
    @Override
    public List<String> parameterNames() {
      return Unnamed.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fUnnamed};
    }
    
    @Override
    public Unnamed.Match toImmutable() {
      return isMutable() ? newMatch(fUnnamed) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"unnamed\"=" + prettyPrintValue(fUnnamed));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fUnnamed);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Unnamed.Match)) {
          Unnamed.Match other = (Unnamed.Match) obj;
          return Objects.equals(fUnnamed, other.fUnnamed);
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
    public Unnamed specification() {
      return Unnamed.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Unnamed.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pUnnamed the fixed value of pattern parameter unnamed, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Unnamed.Match newMutableMatch(final NamedElement pUnnamed) {
      return new Mutable(pUnnamed);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUnnamed the fixed value of pattern parameter unnamed, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Unnamed.Match newMatch(final NamedElement pUnnamed) {
      return new Immutable(pUnnamed);
    }
    
    private static final class Mutable extends Unnamed.Match {
      Mutable(final NamedElement pUnnamed) {
        super(pUnnamed);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Unnamed.Match {
      Immutable(final NamedElement pUnnamed) {
        super(pUnnamed);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.unnamed pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(
   * 	key = {unnamed},
   * 	severity = "error",
   * 	message = "Entity has no name",
   * 	targetEditorId = "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID"
   * )
   * pattern unnamed(unnamed: NamedElement) {
   * 	neg NamedElement.name(unnamed, _);
   * } or { 
   * 	NamedElement.name(unnamed, name);
   * 	name == "";
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Unnamed
   * 
   */
  public static class Matcher extends BaseMatcher<Unnamed.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Unnamed.Matcher on(final ViatraQueryEngine engine) {
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
    public static Unnamed.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_UNNAMED = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Unnamed.Matcher.class);
    
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
     * @param pUnnamed the fixed value of pattern parameter unnamed, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Unnamed.Match> getAllMatches(final NamedElement pUnnamed) {
      return rawStreamAllMatches(new Object[]{pUnnamed}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pUnnamed the fixed value of pattern parameter unnamed, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Unnamed.Match> streamAllMatches(final NamedElement pUnnamed) {
      return rawStreamAllMatches(new Object[]{pUnnamed});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUnnamed the fixed value of pattern parameter unnamed, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Unnamed.Match> getOneArbitraryMatch(final NamedElement pUnnamed) {
      return rawGetOneArbitraryMatch(new Object[]{pUnnamed});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pUnnamed the fixed value of pattern parameter unnamed, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final NamedElement pUnnamed) {
      return rawHasMatch(new Object[]{pUnnamed});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pUnnamed the fixed value of pattern parameter unnamed, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final NamedElement pUnnamed) {
      return rawCountMatches(new Object[]{pUnnamed});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUnnamed the fixed value of pattern parameter unnamed, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final NamedElement pUnnamed, final Consumer<? super Unnamed.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pUnnamed}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUnnamed the fixed value of pattern parameter unnamed, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Unnamed.Match newMatch(final NamedElement pUnnamed) {
      return Unnamed.Match.newMatch(pUnnamed);
    }
    
    /**
     * Retrieve the set of values that occur in matches for unnamed.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<NamedElement> rawStreamAllValuesOfunnamed(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UNNAMED, parameters).map(NamedElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for unnamed.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfunnamed() {
      return rawStreamAllValuesOfunnamed(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for unnamed.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfunnamed() {
      return rawStreamAllValuesOfunnamed(emptyArray());
    }
    
    @Override
    protected Unnamed.Match tupleToMatch(final Tuple t) {
      try {
          return Unnamed.Match.newMatch((NamedElement) t.get(POSITION_UNNAMED));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Unnamed.Match arrayToMatch(final Object[] match) {
      try {
          return Unnamed.Match.newMatch((NamedElement) match[POSITION_UNNAMED]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Unnamed.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Unnamed.Match.newMutableMatch((NamedElement) match[POSITION_UNNAMED]);
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
    public static IQuerySpecification<Unnamed.Matcher> querySpecification() {
      return Unnamed.instance();
    }
  }
  
  private Unnamed() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Unnamed instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Unnamed.Matcher instantiate(final ViatraQueryEngine engine) {
    return Unnamed.Matcher.on(engine);
  }
  
  @Override
  public Unnamed.Matcher instantiate() {
    return Unnamed.Matcher.create();
  }
  
  @Override
  public Unnamed.Match newEmptyMatch() {
    return Unnamed.Match.newEmptyMatch();
  }
  
  @Override
  public Unnamed.Match newMatch(final Object... parameters) {
    return Unnamed.Match.newMatch((hu.bme.mit.mdsd.erdiagram.NamedElement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Unnamed} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Unnamed#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Unnamed INSTANCE = new Unnamed();
    
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
    private static final Unnamed.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_unnamed = new PParameter("unnamed", "hu.bme.mit.mdsd.erdiagram.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "NamedElement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_unnamed);
    
    private class Embedded_1_NamedElement_name extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "hu.bme.mit.mdsd.erdiagram.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "NamedElement")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "java.lang.String", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EString")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_NamedElement_name() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_NamedElement_name";
      }
      
      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }
      
      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        PVariable var_p1 = body.getOrCreateVariableByName("p1");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0),
           new ExportedParameter(body, var_p1, parameter_p1)
        ));
        //  NamedElement.name(unnamed, _)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.unnamed";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("unnamed");
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
          PVariable var_unnamed = body.getOrCreateVariableByName("unnamed");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_unnamed), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_unnamed, parameter_unnamed)
          ));
          // 	neg NamedElement.name(unnamed, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_unnamed, var___0_), new Unnamed.GeneratedPQuery.Embedded_1_NamedElement_name());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_unnamed = body.getOrCreateVariableByName("unnamed");
          PVariable var_name = body.getOrCreateVariableByName("name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_unnamed), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_unnamed, parameter_unnamed)
          ));
          //  	NamedElement.name(unnamed, name)
          new TypeConstraint(body, Tuples.flatTupleOf(var_unnamed), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_unnamed, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_0_, var_name);
          // 	name == ""
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, "");
          new Equality(body, var_name, var__virtual_1_);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("unnamed")
                              }));
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "Entity has no name");
          annotation.addAttribute("targetEditorId", "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
