/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/qbf.vql
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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
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
 *         pattern nameLabel(elem: NamedElement, label: java String) {
 *         	NamedElement.name(elem, label);
 *         	label != "";
 *         } or {
 *         	NamedElement.name(elem, "");
 *         	label == "{@literal <}unnamed{@literal >}";
 *         } or {
 *         	neg NamedElement.name(elem, _);
 *         	label == "{@literal <}unnamed{@literal >}";
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NameLabel extends BaseGeneratedEMFQuerySpecification<NameLabel.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.nameLabel pattern,
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
    private NamedElement fElem;
    
    private String fLabel;
    
    private static List<String> parameterNames = makeImmutableList("elem", "label");
    
    private Match(final NamedElement pElem, final String pLabel) {
      this.fElem = pElem;
      this.fLabel = pLabel;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "elem": return this.fElem;
          case "label": return this.fLabel;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fElem;
          case 1: return this.fLabel;
          default: return null;
      }
    }
    
    public NamedElement getElem() {
      return this.fElem;
    }
    
    public String getLabel() {
      return this.fLabel;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("elem".equals(parameterName) ) {
          this.fElem = (NamedElement) newValue;
          return true;
      }
      if ("label".equals(parameterName) ) {
          this.fLabel = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setElem(final NamedElement pElem) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElem = pElem;
    }
    
    public void setLabel(final String pLabel) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLabel = pLabel;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.nameLabel";
    }
    
    @Override
    public List<String> parameterNames() {
      return NameLabel.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElem, fLabel};
    }
    
    @Override
    public NameLabel.Match toImmutable() {
      return isMutable() ? newMatch(fElem, fLabel) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"elem\"=" + prettyPrintValue(fElem) + ", ");
      result.append("\"label\"=" + prettyPrintValue(fLabel));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElem, fLabel);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NameLabel.Match)) {
          NameLabel.Match other = (NameLabel.Match) obj;
          return Objects.equals(fElem, other.fElem) && Objects.equals(fLabel, other.fLabel);
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
    public NameLabel specification() {
      return NameLabel.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NameLabel.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElem the fixed value of pattern parameter elem, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NameLabel.Match newMutableMatch(final NamedElement pElem, final String pLabel) {
      return new Mutable(pElem, pLabel);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElem the fixed value of pattern parameter elem, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NameLabel.Match newMatch(final NamedElement pElem, final String pLabel) {
      return new Immutable(pElem, pLabel);
    }
    
    private static final class Mutable extends NameLabel.Match {
      Mutable(final NamedElement pElem, final String pLabel) {
        super(pElem, pLabel);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends NameLabel.Match {
      Immutable(final NamedElement pElem, final String pLabel) {
        super(pElem, pLabel);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.nameLabel pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern nameLabel(elem: NamedElement, label: java String) {
   * 	NamedElement.name(elem, label);
   * 	label != "";
   * } or {
   * 	NamedElement.name(elem, "");
   * 	label == "{@literal <}unnamed{@literal >}";
   * } or {
   * 	neg NamedElement.name(elem, _);
   * 	label == "{@literal <}unnamed{@literal >}";
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NameLabel
   * 
   */
  public static class Matcher extends BaseMatcher<NameLabel.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NameLabel.Matcher on(final ViatraQueryEngine engine) {
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
    public static NameLabel.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEM = 0;
    
    private static final int POSITION_LABEL = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NameLabel.Matcher.class);
    
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
     * @param pElem the fixed value of pattern parameter elem, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NameLabel.Match> getAllMatches(final NamedElement pElem, final String pLabel) {
      return rawStreamAllMatches(new Object[]{pElem, pLabel}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElem the fixed value of pattern parameter elem, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NameLabel.Match> streamAllMatches(final NamedElement pElem, final String pLabel) {
      return rawStreamAllMatches(new Object[]{pElem, pLabel});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElem the fixed value of pattern parameter elem, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NameLabel.Match> getOneArbitraryMatch(final NamedElement pElem, final String pLabel) {
      return rawGetOneArbitraryMatch(new Object[]{pElem, pLabel});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElem the fixed value of pattern parameter elem, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final NamedElement pElem, final String pLabel) {
      return rawHasMatch(new Object[]{pElem, pLabel});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElem the fixed value of pattern parameter elem, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final NamedElement pElem, final String pLabel) {
      return rawCountMatches(new Object[]{pElem, pLabel});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElem the fixed value of pattern parameter elem, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final NamedElement pElem, final String pLabel, final Consumer<? super NameLabel.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElem, pLabel}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElem the fixed value of pattern parameter elem, or null if not bound.
     * @param pLabel the fixed value of pattern parameter label, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NameLabel.Match newMatch(final NamedElement pElem, final String pLabel) {
      return NameLabel.Match.newMatch(pElem, pLabel);
    }
    
    /**
     * Retrieve the set of values that occur in matches for elem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<NamedElement> rawStreamAllValuesOfelem(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEM, parameters).map(NamedElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for elem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfelem() {
      return rawStreamAllValuesOfelem(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for elem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfelem() {
      return rawStreamAllValuesOfelem(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for elem.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfelem(final NameLabel.Match partialMatch) {
      return rawStreamAllValuesOfelem(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for elem.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfelem(final String pLabel) {
      return rawStreamAllValuesOfelem(new Object[]{null, pLabel});
    }
    
    /**
     * Retrieve the set of values that occur in matches for elem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfelem(final NameLabel.Match partialMatch) {
      return rawStreamAllValuesOfelem(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for elem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfelem(final String pLabel) {
      return rawStreamAllValuesOfelem(new Object[]{null, pLabel}).collect(Collectors.toSet());
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
    public Stream<String> streamAllValuesOflabel(final NameLabel.Match partialMatch) {
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
    public Stream<String> streamAllValuesOflabel(final NamedElement pElem) {
      return rawStreamAllValuesOflabel(new Object[]{pElem, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for label.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOflabel(final NameLabel.Match partialMatch) {
      return rawStreamAllValuesOflabel(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for label.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOflabel(final NamedElement pElem) {
      return rawStreamAllValuesOflabel(new Object[]{pElem, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected NameLabel.Match tupleToMatch(final Tuple t) {
      try {
          return NameLabel.Match.newMatch((NamedElement) t.get(POSITION_ELEM), (String) t.get(POSITION_LABEL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NameLabel.Match arrayToMatch(final Object[] match) {
      try {
          return NameLabel.Match.newMatch((NamedElement) match[POSITION_ELEM], (String) match[POSITION_LABEL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NameLabel.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NameLabel.Match.newMutableMatch((NamedElement) match[POSITION_ELEM], (String) match[POSITION_LABEL]);
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
    public static IQuerySpecification<NameLabel.Matcher> querySpecification() {
      return NameLabel.instance();
    }
  }
  
  private NameLabel() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NameLabel instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected NameLabel.Matcher instantiate(final ViatraQueryEngine engine) {
    return NameLabel.Matcher.on(engine);
  }
  
  @Override
  public NameLabel.Matcher instantiate() {
    return NameLabel.Matcher.create();
  }
  
  @Override
  public NameLabel.Match newEmptyMatch() {
    return NameLabel.Match.newEmptyMatch();
  }
  
  @Override
  public NameLabel.Match newMatch(final Object... parameters) {
    return NameLabel.Match.newMatch((hu.bme.mit.mdsd.erdiagram.NamedElement) parameters[0], (java.lang.String) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NameLabel} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link NameLabel#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NameLabel INSTANCE = new NameLabel();
    
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
    private static final NameLabel.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_elem = new PParameter("elem", "hu.bme.mit.mdsd.erdiagram.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "NamedElement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_label = new PParameter("label", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_elem, parameter_label);
    
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
        //  NamedElement.name(elem, _)
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
      return "hu.bme.mit.mdsd.erdiagram.queries.nameLabel";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("elem","label");
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
          PVariable var_elem = body.getOrCreateVariableByName("elem");
          PVariable var_label = body.getOrCreateVariableByName("label");
          new TypeConstraint(body, Tuples.flatTupleOf(var_elem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_label), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_elem, parameter_elem),
             new ExportedParameter(body, var_label, parameter_label)
          ));
          // 	NamedElement.name(elem, label)
          new TypeConstraint(body, Tuples.flatTupleOf(var_elem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_elem, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_0_, var_label);
          // 	label != ""
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, "");
          new Inequality(body, var_label, var__virtual_1_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_elem = body.getOrCreateVariableByName("elem");
          PVariable var_label = body.getOrCreateVariableByName("label");
          new TypeConstraint(body, Tuples.flatTupleOf(var_elem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_label), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_elem, parameter_elem),
             new ExportedParameter(body, var_label, parameter_label)
          ));
          // 	NamedElement.name(elem, "")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "");
          new TypeConstraint(body, Tuples.flatTupleOf(var_elem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_elem, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 	label == "<unnamed>"
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ConstantValue(body, var__virtual_2_, "<unnamed>");
          new Equality(body, var_label, var__virtual_2_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_elem = body.getOrCreateVariableByName("elem");
          PVariable var_label = body.getOrCreateVariableByName("label");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_elem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_label), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_elem, parameter_elem),
             new ExportedParameter(body, var_label, parameter_label)
          ));
          // 	neg NamedElement.name(elem, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_elem, var___0_), new NameLabel.GeneratedPQuery.Embedded_1_NamedElement_name());
          // 	label == "<unnamed>"
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "<unnamed>");
          new Equality(body, var_label, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
