/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/validation.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.internal.EntityAttributeName;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
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
 *         // Validation rule 4
 *         pattern duplicateAttributeName(attr: Attribute, name: java String, attr2 : Attribute) {
 *         	Attribute.name(attr, name);
 *         	Attribute.name(attr2, name);
 *         	Entity.attributes(entity, attr);
 *         	Entity.attributes(entity, attr2);
 *         	attr != attr2;
 *         }
 *         
 *         {@literal @}Constraint(
 *         	key = {attr},
 *         	severity = "error",
 *         	message = "Duplicate attribute name $name$ within entity $entity.name$",
 *         	targetEditorId = "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID"
 *         )
 *         pattern duplicateAttributeName(attr: Attribute, entity: Entity, name: java String) {
 *         	find entityAttributeName(entity, attr, name);
 *         	freq == count find entityAttributeName(entity, _, name);
 *         	check (freq {@literal >} 1);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class DuplicateAttributeName extends BaseGeneratedEMFQuerySpecification<DuplicateAttributeName.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.duplicateAttributeName pattern,
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
    private Attribute fAttr;
    
    private Entity fEntity;
    
    private String fName;
    
    private static List<String> parameterNames = makeImmutableList("attr", "entity", "name");
    
    private Match(final Attribute pAttr, final Entity pEntity, final String pName) {
      this.fAttr = pAttr;
      this.fEntity = pEntity;
      this.fName = pName;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "attr": return this.fAttr;
          case "entity": return this.fEntity;
          case "name": return this.fName;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fAttr;
          case 1: return this.fEntity;
          case 2: return this.fName;
          default: return null;
      }
    }
    
    public Attribute getAttr() {
      return this.fAttr;
    }
    
    public Entity getEntity() {
      return this.fEntity;
    }
    
    public String getName() {
      return this.fName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("attr".equals(parameterName) ) {
          this.fAttr = (Attribute) newValue;
          return true;
      }
      if ("entity".equals(parameterName) ) {
          this.fEntity = (Entity) newValue;
          return true;
      }
      if ("name".equals(parameterName) ) {
          this.fName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setAttr(final Attribute pAttr) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttr = pAttr;
    }
    
    public void setEntity(final Entity pEntity) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEntity = pEntity;
    }
    
    public void setName(final String pName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fName = pName;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.duplicateAttributeName";
    }
    
    @Override
    public List<String> parameterNames() {
      return DuplicateAttributeName.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAttr, fEntity, fName};
    }
    
    @Override
    public DuplicateAttributeName.Match toImmutable() {
      return isMutable() ? newMatch(fAttr, fEntity, fName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"attr\"=" + prettyPrintValue(fAttr) + ", ");
      result.append("\"entity\"=" + prettyPrintValue(fEntity) + ", ");
      result.append("\"name\"=" + prettyPrintValue(fName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fAttr, fEntity, fName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DuplicateAttributeName.Match)) {
          DuplicateAttributeName.Match other = (DuplicateAttributeName.Match) obj;
          return Objects.equals(fAttr, other.fAttr) && Objects.equals(fEntity, other.fEntity) && Objects.equals(fName, other.fName);
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
    public DuplicateAttributeName specification() {
      return DuplicateAttributeName.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DuplicateAttributeName.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DuplicateAttributeName.Match newMutableMatch(final Attribute pAttr, final Entity pEntity, final String pName) {
      return new Mutable(pAttr, pEntity, pName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DuplicateAttributeName.Match newMatch(final Attribute pAttr, final Entity pEntity, final String pName) {
      return new Immutable(pAttr, pEntity, pName);
    }
    
    private static final class Mutable extends DuplicateAttributeName.Match {
      Mutable(final Attribute pAttr, final Entity pEntity, final String pName) {
        super(pAttr, pEntity, pName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DuplicateAttributeName.Match {
      Immutable(final Attribute pAttr, final Entity pEntity, final String pName) {
        super(pAttr, pEntity, pName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.mdsd.erdiagram.queries.duplicateAttributeName pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // Validation rule 4
   * pattern duplicateAttributeName(attr: Attribute, name: java String, attr2 : Attribute) {
   * 	Attribute.name(attr, name);
   * 	Attribute.name(attr2, name);
   * 	Entity.attributes(entity, attr);
   * 	Entity.attributes(entity, attr2);
   * 	attr != attr2;
   * }
   * 
   * {@literal @}Constraint(
   * 	key = {attr},
   * 	severity = "error",
   * 	message = "Duplicate attribute name $name$ within entity $entity.name$",
   * 	targetEditorId = "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID"
   * )
   * pattern duplicateAttributeName(attr: Attribute, entity: Entity, name: java String) {
   * 	find entityAttributeName(entity, attr, name);
   * 	freq == count find entityAttributeName(entity, _, name);
   * 	check (freq {@literal >} 1);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see DuplicateAttributeName
   * 
   */
  public static class Matcher extends BaseMatcher<DuplicateAttributeName.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DuplicateAttributeName.Matcher on(final ViatraQueryEngine engine) {
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
    public static DuplicateAttributeName.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ATTR = 0;
    
    private static final int POSITION_ENTITY = 1;
    
    private static final int POSITION_NAME = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DuplicateAttributeName.Matcher.class);
    
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
     * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DuplicateAttributeName.Match> getAllMatches(final Attribute pAttr, final Entity pEntity, final String pName) {
      return rawStreamAllMatches(new Object[]{pAttr, pEntity, pName}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<DuplicateAttributeName.Match> streamAllMatches(final Attribute pAttr, final Entity pEntity, final String pName) {
      return rawStreamAllMatches(new Object[]{pAttr, pEntity, pName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<DuplicateAttributeName.Match> getOneArbitraryMatch(final Attribute pAttr, final Entity pEntity, final String pName) {
      return rawGetOneArbitraryMatch(new Object[]{pAttr, pEntity, pName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Attribute pAttr, final Entity pEntity, final String pName) {
      return rawHasMatch(new Object[]{pAttr, pEntity, pName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Attribute pAttr, final Entity pEntity, final String pName) {
      return rawCountMatches(new Object[]{pAttr, pEntity, pName});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Attribute pAttr, final Entity pEntity, final String pName, final Consumer<? super DuplicateAttributeName.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAttr, pEntity, pName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttr the fixed value of pattern parameter attr, or null if not bound.
     * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DuplicateAttributeName.Match newMatch(final Attribute pAttr, final Entity pEntity, final String pName) {
      return DuplicateAttributeName.Match.newMatch(pAttr, pEntity, pName);
    }
    
    /**
     * Retrieve the set of values that occur in matches for attr.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Attribute> rawStreamAllValuesOfattr(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ATTR, parameters).map(Attribute.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for attr.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfattr() {
      return rawStreamAllValuesOfattr(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attr.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfattr() {
      return rawStreamAllValuesOfattr(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attr.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfattr(final DuplicateAttributeName.Match partialMatch) {
      return rawStreamAllValuesOfattr(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attr.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Attribute> streamAllValuesOfattr(final Entity pEntity, final String pName) {
      return rawStreamAllValuesOfattr(new Object[]{null, pEntity, pName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for attr.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfattr(final DuplicateAttributeName.Match partialMatch) {
      return rawStreamAllValuesOfattr(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attr.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfattr(final Entity pEntity, final String pName) {
      return rawStreamAllValuesOfattr(new Object[]{null, pEntity, pName}).collect(Collectors.toSet());
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
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Entity> streamAllValuesOfentity(final DuplicateAttributeName.Match partialMatch) {
      return rawStreamAllValuesOfentity(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Entity> streamAllValuesOfentity(final Attribute pAttr, final String pName) {
      return rawStreamAllValuesOfentity(new Object[]{pAttr, null, pName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entity> getAllValuesOfentity(final DuplicateAttributeName.Match partialMatch) {
      return rawStreamAllValuesOfentity(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for entity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entity> getAllValuesOfentity(final Attribute pAttr, final String pName) {
      return rawStreamAllValuesOfentity(new Object[]{pAttr, null, pName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfname(final Object[] parameters) {
      return rawStreamAllValues(POSITION_NAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname() {
      return rawStreamAllValuesOfname(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfname() {
      return rawStreamAllValuesOfname(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfname(final DuplicateAttributeName.Match partialMatch) {
      return rawStreamAllValuesOfname(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfname(final Attribute pAttr, final Entity pEntity) {
      return rawStreamAllValuesOfname(new Object[]{pAttr, pEntity, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final DuplicateAttributeName.Match partialMatch) {
      return rawStreamAllValuesOfname(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final Attribute pAttr, final Entity pEntity) {
      return rawStreamAllValuesOfname(new Object[]{pAttr, pEntity, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected DuplicateAttributeName.Match tupleToMatch(final Tuple t) {
      try {
          return DuplicateAttributeName.Match.newMatch((Attribute) t.get(POSITION_ATTR), (Entity) t.get(POSITION_ENTITY), (String) t.get(POSITION_NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DuplicateAttributeName.Match arrayToMatch(final Object[] match) {
      try {
          return DuplicateAttributeName.Match.newMatch((Attribute) match[POSITION_ATTR], (Entity) match[POSITION_ENTITY], (String) match[POSITION_NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DuplicateAttributeName.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DuplicateAttributeName.Match.newMutableMatch((Attribute) match[POSITION_ATTR], (Entity) match[POSITION_ENTITY], (String) match[POSITION_NAME]);
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
    public static IQuerySpecification<DuplicateAttributeName.Matcher> querySpecification() {
      return DuplicateAttributeName.instance();
    }
  }
  
  private DuplicateAttributeName() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DuplicateAttributeName instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DuplicateAttributeName.Matcher instantiate(final ViatraQueryEngine engine) {
    return DuplicateAttributeName.Matcher.on(engine);
  }
  
  @Override
  public DuplicateAttributeName.Matcher instantiate() {
    return DuplicateAttributeName.Matcher.create();
  }
  
  @Override
  public DuplicateAttributeName.Match newEmptyMatch() {
    return DuplicateAttributeName.Match.newEmptyMatch();
  }
  
  @Override
  public DuplicateAttributeName.Match newMatch(final Object... parameters) {
    return DuplicateAttributeName.Match.newMatch((hu.bme.mit.mdsd.erdiagram.Attribute) parameters[0], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[1], (java.lang.String) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link DuplicateAttributeName} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link DuplicateAttributeName#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final DuplicateAttributeName INSTANCE = new DuplicateAttributeName();
    
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
    private static final DuplicateAttributeName.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_attr = new PParameter("attr", "hu.bme.mit.mdsd.erdiagram.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_entity = new PParameter("entity", "hu.bme.mit.mdsd.erdiagram.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Entity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_name = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_attr, parameter_entity, parameter_name);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.duplicateAttributeName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("attr","entity","name");
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
          PVariable var_attr = body.getOrCreateVariableByName("attr");
          PVariable var_entity = body.getOrCreateVariableByName("entity");
          PVariable var_name = body.getOrCreateVariableByName("name");
          PVariable var_freq = body.getOrCreateVariableByName("freq");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_attr), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_attr, parameter_attr),
             new ExportedParameter(body, var_entity, parameter_entity),
             new ExportedParameter(body, var_name, parameter_name)
          ));
          // 	find entityAttributeName(entity, attr, name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_entity, var_attr, var_name), EntityAttributeName.instance().getInternalQueryRepresentation());
          // 	freq == count find entityAttributeName(entity, _, name)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_entity, var___0_, var_name), EntityAttributeName.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_freq, var__virtual_0_);
          // 	check (freq > 1)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern duplicateAttributeName";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("freq");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer freq = (Integer) provider.getValue("freq");
                  return evaluateExpression_1_1(freq);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("attr")
                              }));
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "Duplicate attribute name $name$ within entity $entity.name$");
          annotation.addAttribute("targetEditorId", "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer freq) {
    return ((freq).intValue() > 1);
  }
}
