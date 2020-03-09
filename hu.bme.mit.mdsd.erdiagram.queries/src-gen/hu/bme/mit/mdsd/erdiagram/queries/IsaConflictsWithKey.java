/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/validation.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
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
 *         	key = {entity},
 *         	severity = "error",
 *         	message = "Entity has both a locally defined key and an is-a relationship",
 *         	targetEditorId = "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID"
 *         )
 *         pattern isaConflictsWithKey(entity: Entity) = {
 *         	Entity.isA(entity, _);
 *         	Entity.attributes.isKey(entity, true);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class IsaConflictsWithKey extends BaseGeneratedEMFQuerySpecification<IsaConflictsWithKey.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.isaConflictsWithKey pattern,
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
    private Entity fEntity;
    
    private static List<String> parameterNames = makeImmutableList("entity");
    
    private Match(final Entity pEntity) {
      this.fEntity = pEntity;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "entity": return this.fEntity;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEntity;
          default: return null;
      }
    }
    
    public Entity getEntity() {
      return this.fEntity;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("entity".equals(parameterName) ) {
          this.fEntity = (Entity) newValue;
          return true;
      }
      return false;
    }
    
    public void setEntity(final Entity pEntity) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEntity = pEntity;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.isaConflictsWithKey";
    }
    
    @Override
    public List<String> parameterNames() {
      return IsaConflictsWithKey.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEntity};
    }
    
    @Override
    public IsaConflictsWithKey.Match toImmutable() {
      return isMutable() ? newMatch(fEntity) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"entity\"=" + prettyPrintValue(fEntity));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEntity);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof IsaConflictsWithKey.Match)) {
          IsaConflictsWithKey.Match other = (IsaConflictsWithKey.Match) obj;
          return Objects.equals(fEntity, other.fEntity);
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
    public IsaConflictsWithKey specification() {
      return IsaConflictsWithKey.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static IsaConflictsWithKey.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static IsaConflictsWithKey.Match newMutableMatch(final Entity pEntity) {
      return new Mutable(pEntity);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static IsaConflictsWithKey.Match newMatch(final Entity pEntity) {
      return new Immutable(pEntity);
    }
    
    private static final class Mutable extends IsaConflictsWithKey.Match {
      Mutable(final Entity pEntity) {
        super(pEntity);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends IsaConflictsWithKey.Match {
      Immutable(final Entity pEntity) {
        super(pEntity);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.isaConflictsWithKey pattern,
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
   * 	key = {entity},
   * 	severity = "error",
   * 	message = "Entity has both a locally defined key and an is-a relationship",
   * 	targetEditorId = "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID"
   * )
   * pattern isaConflictsWithKey(entity: Entity) = {
   * 	Entity.isA(entity, _);
   * 	Entity.attributes.isKey(entity, true);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see IsaConflictsWithKey
   * 
   */
  public static class Matcher extends BaseMatcher<IsaConflictsWithKey.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static IsaConflictsWithKey.Matcher on(final ViatraQueryEngine engine) {
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
    public static IsaConflictsWithKey.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ENTITY = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(IsaConflictsWithKey.Matcher.class);
    
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
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<IsaConflictsWithKey.Match> getAllMatches(final Entity pEntity) {
      return rawStreamAllMatches(new Object[]{pEntity}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<IsaConflictsWithKey.Match> streamAllMatches(final Entity pEntity) {
      return rawStreamAllMatches(new Object[]{pEntity});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<IsaConflictsWithKey.Match> getOneArbitraryMatch(final Entity pEntity) {
      return rawGetOneArbitraryMatch(new Object[]{pEntity});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Entity pEntity) {
      return rawHasMatch(new Object[]{pEntity});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Entity pEntity) {
      return rawCountMatches(new Object[]{pEntity});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Entity pEntity, final Consumer<? super IsaConflictsWithKey.Match> processor) {
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
    public IsaConflictsWithKey.Match newMatch(final Entity pEntity) {
      return IsaConflictsWithKey.Match.newMatch(pEntity);
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Entity> rawStreamAllValuesOfentity(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ENTITY, parameters).map(Entity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entity> getAllValuesOfentity() {
      return rawStreamAllValuesOfentity(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Entity> streamAllValuesOfentity() {
      return rawStreamAllValuesOfentity(emptyArray());
    }
    
    @Override
    protected IsaConflictsWithKey.Match tupleToMatch(final Tuple t) {
      try {
          return IsaConflictsWithKey.Match.newMatch((Entity) t.get(POSITION_ENTITY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected IsaConflictsWithKey.Match arrayToMatch(final Object[] match) {
      try {
          return IsaConflictsWithKey.Match.newMatch((Entity) match[POSITION_ENTITY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected IsaConflictsWithKey.Match arrayToMatchMutable(final Object[] match) {
      try {
          return IsaConflictsWithKey.Match.newMutableMatch((Entity) match[POSITION_ENTITY]);
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
    public static IQuerySpecification<IsaConflictsWithKey.Matcher> querySpecification() {
      return IsaConflictsWithKey.instance();
    }
  }
  
  private IsaConflictsWithKey() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static IsaConflictsWithKey instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected IsaConflictsWithKey.Matcher instantiate(final ViatraQueryEngine engine) {
    return IsaConflictsWithKey.Matcher.on(engine);
  }
  
  @Override
  public IsaConflictsWithKey.Matcher instantiate() {
    return IsaConflictsWithKey.Matcher.create();
  }
  
  @Override
  public IsaConflictsWithKey.Match newEmptyMatch() {
    return IsaConflictsWithKey.Match.newEmptyMatch();
  }
  
  @Override
  public IsaConflictsWithKey.Match newMatch(final Object... parameters) {
    return IsaConflictsWithKey.Match.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link IsaConflictsWithKey} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link IsaConflictsWithKey#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final IsaConflictsWithKey INSTANCE = new IsaConflictsWithKey();
    
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
    private static final IsaConflictsWithKey.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_entity = new PParameter("entity", "hu.bme.mit.mdsd.erdiagram.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Entity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_entity);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.isaConflictsWithKey";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("entity");
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
          PVariable var_entity = body.getOrCreateVariableByName("entity");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_entity, parameter_entity)
          ));
          // 	Entity.isA(entity, _)
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Entity", "isA")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
          new Equality(body, var__virtual_0_, var___0_);
          // 	Entity.attributes.isKey(entity, true)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, true);
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Entity", "attributes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute", "isKey")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBoolean")));
          new Equality(body, var__virtual_3_, var__virtual_1_);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("entity")
                              }));
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "Entity has both a locally defined key and an is-a relationship");
          annotation.addAttribute("targetEditorId", "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1() {
    return true;
  }
}
