package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.EntityMatch;
import hu.bme.mit.mdsd.erdiagram.queries.EntityMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate EntityMatcher in a type-safe way.
 * 
 * @see EntityMatcher
 * @see EntityMatch
 * 
 */
@SuppressWarnings("all")
public final class EntityQuerySpecification extends BaseGeneratedEMFQuerySpecification<EntityMatcher> {
  private EntityQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EntityQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EntityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EntityMatcher.on(engine);
  }
  
  @Override
  public EntityMatch newEmptyMatch() {
    return EntityMatch.newEmptyMatch();
  }
  
  @Override
  public EntityMatch newMatch(final Object... parameters) {
    return EntityMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static EntityQuerySpecification INSTANCE = make();
    
    public static EntityQuerySpecification make() {
      return new EntityQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EntityQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.entity";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("e");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("e", "hu.bme.mit.mdsd.erdiagram.Entity"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_e = body.getOrCreateVariableByName("e");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_e, "e")
      		));
      		// 	Entity(e)
      		new TypeConstraint(body, new FlatTuple(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
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
