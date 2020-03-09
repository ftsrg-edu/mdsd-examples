/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/validation.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryReflexiveTransitiveClosure;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         private pattern entityAttributeName(
 *         	entity: Entity, attr : Attribute, name : java String
 *         ) = {
 *         	Entity.isA(entity, superEntity);
 *         	Entity.attributes(superEntity, attr);
 *         	Attribute.name(attr, name);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class EntityAttributeName extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private EntityAttributeName() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EntityAttributeName instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EntityAttributeName} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EntityAttributeName#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EntityAttributeName INSTANCE = new EntityAttributeName();
    
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
    private static final EntityAttributeName.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_entity = new PParameter("entity", "hu.bme.mit.mdsd.erdiagram.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Entity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_attr = new PParameter("attr", "hu.bme.mit.mdsd.erdiagram.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_name = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_entity, parameter_attr, parameter_name);
    
    private class Embedded_1_Entity_isA extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "hu.bme.mit.mdsd.erdiagram.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Entity")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "hu.bme.mit.mdsd.erdiagram.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Entity")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_Entity_isA() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_Entity_isA";
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
        // 	Entity.isA*(entity, superEntity)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Entity", "isA")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.entityAttributeName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("entity","attr","name");
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
          PVariable var_attr = body.getOrCreateVariableByName("attr");
          PVariable var_name = body.getOrCreateVariableByName("name");
          PVariable var_superEntity = body.getOrCreateVariableByName("superEntity");
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_attr), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_entity, parameter_entity),
             new ExportedParameter(body, var_attr, parameter_attr),
             new ExportedParameter(body, var_name, parameter_name)
          ));
          // 	Entity.isA*(entity, superEntity)
          new BinaryReflexiveTransitiveClosure(body, Tuples.flatTupleOf(var_entity, var_superEntity), new EntityAttributeName.GeneratedPQuery.Embedded_1_Entity_isA(), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
          // 	Entity.attributes(superEntity, attr)
          new TypeConstraint(body, Tuples.flatTupleOf(var_superEntity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_superEntity, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Entity", "attributes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute")));
          new Equality(body, var__virtual_0_, var_attr);
          // 	Attribute.name(attr, name)
          new TypeConstraint(body, Tuples.flatTupleOf(var_attr), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_attr, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_1_, var_name);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
