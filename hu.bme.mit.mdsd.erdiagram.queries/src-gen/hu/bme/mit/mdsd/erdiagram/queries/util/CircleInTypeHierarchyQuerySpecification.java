package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.CircleInTypeHierarchyMatch;
import hu.bme.mit.mdsd.erdiagram.queries.CircleInTypeHierarchyMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.util.AllSuperEntityQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CircleInTypeHierarchyMatcher in a type-safe way.
 * 
 * @see CircleInTypeHierarchyMatcher
 * @see CircleInTypeHierarchyMatch
 * 
 */
@SuppressWarnings("all")
public final class CircleInTypeHierarchyQuerySpecification extends BaseGeneratedEMFQuerySpecification<CircleInTypeHierarchyMatcher> {
  private CircleInTypeHierarchyQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CircleInTypeHierarchyQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CircleInTypeHierarchyMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CircleInTypeHierarchyMatcher.on(engine);
  }
  
  @Override
  public CircleInTypeHierarchyMatch newEmptyMatch() {
    return CircleInTypeHierarchyMatch.newEmptyMatch();
  }
  
  @Override
  public CircleInTypeHierarchyMatch newMatch(final Object... parameters) {
    return CircleInTypeHierarchyMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static CircleInTypeHierarchyQuerySpecification INSTANCE = make();
    
    public static CircleInTypeHierarchyQuerySpecification make() {
      return new CircleInTypeHierarchyQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CircleInTypeHierarchyQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.circleInTypeHierarchy";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("entity");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("entity", "hu.bme.mit.mdsd.erdiagram.Entity"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_entity = body.getOrCreateVariableByName("entity");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_entity, "entity")
      		));
      		// 		find allSuperEntity(entity, entity)
      		new PositivePatternCall(body, new FlatTuple(var_entity, var_entity), AllSuperEntityQuerySpecification.instance().getInternalQueryRepresentation());
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
