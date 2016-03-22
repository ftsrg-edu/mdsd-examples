package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.EntityAttributeMatch;
import hu.bme.mit.mdsd.erdiagram.queries.EntityAttributeMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate EntityAttributeMatcher in a type-safe way.
 * 
 * @see EntityAttributeMatcher
 * @see EntityAttributeMatch
 * 
 */
@SuppressWarnings("all")
public final class EntityAttributeQuerySpecification extends BaseGeneratedEMFQuerySpecification<EntityAttributeMatcher> {
  private EntityAttributeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EntityAttributeQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EntityAttributeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EntityAttributeMatcher.on(engine);
  }
  
  @Override
  public EntityAttributeMatch newEmptyMatch() {
    return EntityAttributeMatch.newEmptyMatch();
  }
  
  @Override
  public EntityAttributeMatch newMatch(final Object... parameters) {
    return EntityAttributeMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0], (hu.bme.mit.mdsd.erdiagram.Attribute) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static EntityAttributeQuerySpecification INSTANCE = make();
    
    public static EntityAttributeQuerySpecification make() {
      return new EntityAttributeQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EntityAttributeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.entityAttribute";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("e","attr");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("e", "hu.bme.mit.mdsd.erdiagram.Entity"),new PParameter("attr", "hu.bme.mit.mdsd.erdiagram.Attribute"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_e = body.getOrCreateVariableByName("e");
      		PVariable var_attr = body.getOrCreateVariableByName("attr");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_e, "e"),
      		   new ExportedParameter(body, var_attr, "attr")
      		));
      		// 	Entity.attributes(e, attr)
      		new TypeConstraint(body, new FlatTuple(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_e, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Entity", "attributes")));
      		new Equality(body, var__virtual_0_, var_attr);
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
