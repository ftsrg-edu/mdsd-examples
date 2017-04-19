/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.AttributeWithInheirtanceMatch;
import hu.bme.mit.mdsd.erdiagram.queries.AttributeWithInheirtanceMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.util.AllSuperEntityQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityAttributeQuerySpecification;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate AttributeWithInheirtanceMatcher in a type-safe way.
 * 
 * @see AttributeWithInheirtanceMatcher
 * @see AttributeWithInheirtanceMatch
 * 
 */
@SuppressWarnings("all")
public final class AttributeWithInheirtanceQuerySpecification extends BaseGeneratedEMFQuerySpecification<AttributeWithInheirtanceMatcher> {
  private AttributeWithInheirtanceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static AttributeWithInheirtanceQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AttributeWithInheirtanceMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AttributeWithInheirtanceMatcher.on(engine);
  }
  
  @Override
  public AttributeWithInheirtanceMatcher instantiate() throws ViatraQueryException {
    return AttributeWithInheirtanceMatcher.create();
  }
  
  @Override
  public AttributeWithInheirtanceMatch newEmptyMatch() {
    return AttributeWithInheirtanceMatch.newEmptyMatch();
  }
  
  @Override
  public AttributeWithInheirtanceMatch newMatch(final Object... parameters) {
    return AttributeWithInheirtanceMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0], (hu.bme.mit.mdsd.erdiagram.Attribute) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AttributeWithInheirtanceQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link AttributeWithInheirtanceQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AttributeWithInheirtanceQuerySpecification INSTANCE = new AttributeWithInheirtanceQuerySpecification();
    
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
    private final static AttributeWithInheirtanceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEntity = new PParameter("entity", "hu.bme.mit.mdsd.erdiagram.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Entity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "hu.bme.mit.mdsd.erdiagram.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Attribute")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEntity, parameter_pAttribute);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.attributeWithInheirtance";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("entity","attribute");
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
      		PVariable var_entity = body.getOrCreateVariableByName("entity");
      		PVariable var_attribute = body.getOrCreateVariableByName("attribute");
      		new TypeConstraint(body, new FlatTuple(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		new TypeConstraint(body, new FlatTuple(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_entity, parameter_pEntity),
      		   new ExportedParameter(body, var_attribute, parameter_pAttribute)
      		));
      		//     Entity.attributes(entity,attribute)
      		new TypeConstraint(body, new FlatTuple(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_entity, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Entity", "attributes")));
      		new Equality(body, var__virtual_0_, var_attribute);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_entity = body.getOrCreateVariableByName("entity");
      		PVariable var_attribute = body.getOrCreateVariableByName("attribute");
      		PVariable var_superEntity = body.getOrCreateVariableByName("superEntity");
      		new TypeConstraint(body, new FlatTuple(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		new TypeConstraint(body, new FlatTuple(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_entity, parameter_pEntity),
      		   new ExportedParameter(body, var_attribute, parameter_pAttribute)
      		));
      		//     find allSuperEntity(entity, superEntity)
      		new PositivePatternCall(body, new FlatTuple(var_entity, var_superEntity), AllSuperEntityQuerySpecification.instance().getInternalQueryRepresentation());
      		//     find entityAttribute(superEntity, attribute)
      		new PositivePatternCall(body, new FlatTuple(var_superEntity, var_attribute), EntityAttributeQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
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
