/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.SameNamedEntitiesMatch;
import hu.bme.mit.mdsd.erdiagram.queries.SameNamedEntitiesMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate SameNamedEntitiesMatcher in a type-safe way.
 * 
 * @see SameNamedEntitiesMatcher
 * @see SameNamedEntitiesMatch
 * 
 */
@SuppressWarnings("all")
public final class SameNamedEntitiesQuerySpecification extends BaseGeneratedEMFQuerySpecification<SameNamedEntitiesMatcher> {
  private SameNamedEntitiesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static SameNamedEntitiesQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SameNamedEntitiesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SameNamedEntitiesMatcher.on(engine);
  }
  
  @Override
  public SameNamedEntitiesMatcher instantiate() throws ViatraQueryException {
    return SameNamedEntitiesMatcher.create();
  }
  
  @Override
  public SameNamedEntitiesMatch newEmptyMatch() {
    return SameNamedEntitiesMatch.newEmptyMatch();
  }
  
  @Override
  public SameNamedEntitiesMatch newMatch(final Object... parameters) {
    return SameNamedEntitiesMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[1], (java.lang.String) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link SameNamedEntitiesQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link SameNamedEntitiesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static SameNamedEntitiesQuerySpecification INSTANCE = new SameNamedEntitiesQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SameNamedEntitiesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEntity1 = new PParameter("entity1", "hu.bme.mit.mdsd.erdiagram.Entity", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pEntity2 = new PParameter("entity2", "hu.bme.mit.mdsd.erdiagram.Entity", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pCommonName = new PParameter("commonName", "java.lang.String", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEntity1, parameter_pEntity2, parameter_pCommonName);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.sameNamedEntities";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("entity1","entity2","commonName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_entity1 = body.getOrCreateVariableByName("entity1");
      		PVariable var_entity2 = body.getOrCreateVariableByName("entity2");
      		PVariable var_commonName = body.getOrCreateVariableByName("commonName");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_entity1, parameter_pEntity1),
      		   new ExportedParameter(body, var_entity2, parameter_pEntity2),
      		   new ExportedParameter(body, var_commonName, parameter_pCommonName)
      		));
      		// 	Entity.name(entity1, commonName)
      		new TypeConstraint(body, new FlatTuple(var_entity1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_entity1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
      		new Equality(body, var__virtual_0_, var_commonName);
      		// 	Entity.name(entity2, commonName)
      		new TypeConstraint(body, new FlatTuple(var_entity2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_entity2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
      		new Equality(body, var__virtual_1_, var_commonName);
      		// 	entity1 != entity2
      		new Inequality(body, var_entity1, var_entity2);
      		bodies.add(body);
      	}
      	{
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "entity1", 
      		                "entity2"
      		                }));
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Two entities has the same name $commonName$");
      		annotation.addAttribute("targetEditorId", "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID");
      		annotation.addAttribute("symmetric", Arrays.asList(new Object[] {
      		                "entity1", 
      		                "entity2"
      		                }));
      		addAnnotation(annotation);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
