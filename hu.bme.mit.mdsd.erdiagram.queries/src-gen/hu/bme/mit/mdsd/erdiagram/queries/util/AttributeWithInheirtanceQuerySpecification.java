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
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

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
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AttributeWithInheirtanceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AttributeWithInheirtanceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AttributeWithInheirtanceMatcher.on(engine);
  }
  
  @Override
  public AttributeWithInheirtanceMatch newEmptyMatch() {
    return AttributeWithInheirtanceMatch.newEmptyMatch();
  }
  
  @Override
  public AttributeWithInheirtanceMatch newMatch(final Object... parameters) {
    return AttributeWithInheirtanceMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0], (hu.bme.mit.mdsd.erdiagram.Attribute) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static AttributeWithInheirtanceQuerySpecification INSTANCE = make();
    
    public static AttributeWithInheirtanceQuerySpecification make() {
      return new AttributeWithInheirtanceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AttributeWithInheirtanceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
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
      return Arrays.asList(new PParameter("entity", "hu.bme.mit.mdsd.erdiagram.Entity"),new PParameter("attribute", "hu.bme.mit.mdsd.erdiagram.Attribute"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_entity = body.getOrCreateVariableByName("entity");
      		PVariable var_attribute = body.getOrCreateVariableByName("attribute");
      		new TypeConstraint(body, new FlatTuple(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		new TypeConstraint(body, new FlatTuple(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Attribute")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_entity, "entity"),
      		   new ExportedParameter(body, var_attribute, "attribute")
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
      		   new ExportedParameter(body, var_entity, "entity"),
      		   new ExportedParameter(body, var_attribute, "attribute")
      		));
      		//     find allSuperEntity(entity, superEntity)
      		new PositivePatternCall(body, new FlatTuple(var_entity, var_superEntity), AllSuperEntityQuerySpecification.instance().getInternalQueryRepresentation());
      		//     find entityAttribute(superEntity, attribute)
      		new PositivePatternCall(body, new FlatTuple(var_superEntity, var_attribute), EntityAttributeQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
