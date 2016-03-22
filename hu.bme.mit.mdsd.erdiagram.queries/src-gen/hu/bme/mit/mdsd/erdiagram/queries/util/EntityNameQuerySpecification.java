package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.EntityNameMatch;
import hu.bme.mit.mdsd.erdiagram.queries.EntityNameMatcher;
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
 * A pattern-specific query specification that can instantiate EntityNameMatcher in a type-safe way.
 * 
 * @see EntityNameMatcher
 * @see EntityNameMatch
 * 
 */
@SuppressWarnings("all")
public final class EntityNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<EntityNameMatcher> {
  private EntityNameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EntityNameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EntityNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EntityNameMatcher.on(engine);
  }
  
  @Override
  public EntityNameMatch newEmptyMatch() {
    return EntityNameMatch.newEmptyMatch();
  }
  
  @Override
  public EntityNameMatch newMatch(final Object... parameters) {
    return EntityNameMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static EntityNameQuerySpecification INSTANCE = make();
    
    public static EntityNameQuerySpecification make() {
      return new EntityNameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EntityNameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.entityName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("entity","name");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("entity", "hu.bme.mit.mdsd.erdiagram.Entity"),new PParameter("name", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_entity = body.getOrCreateVariableByName("entity");
      		PVariable var_name = body.getOrCreateVariableByName("name");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_entity, "entity"),
      		   new ExportedParameter(body, var_name, "name")
      		));
      		// 	Entity.name(entity, name)
      		new TypeConstraint(body, new FlatTuple(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_entity, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
      		new Equality(body, var__virtual_0_, var_name);
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
