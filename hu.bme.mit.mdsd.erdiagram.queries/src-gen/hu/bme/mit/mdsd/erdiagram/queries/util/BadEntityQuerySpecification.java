package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.BadEntityMatch;
import hu.bme.mit.mdsd.erdiagram.queries.BadEntityMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.util.EmptyNamedElementQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityStartsWithSmallCaseQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.SameNamedEntitiesQuerySpecification;
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
 * A pattern-specific query specification that can instantiate BadEntityMatcher in a type-safe way.
 * 
 * @see BadEntityMatcher
 * @see BadEntityMatch
 * 
 */
@SuppressWarnings("all")
public final class BadEntityQuerySpecification extends BaseGeneratedEMFQuerySpecification<BadEntityMatcher> {
  private BadEntityQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static BadEntityQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected BadEntityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return BadEntityMatcher.on(engine);
  }
  
  @Override
  public BadEntityMatch newEmptyMatch() {
    return BadEntityMatch.newEmptyMatch();
  }
  
  @Override
  public BadEntityMatch newMatch(final Object... parameters) {
    return BadEntityMatch.newMatch((hu.bme.mit.mdsd.erdiagram.NamedElement) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static BadEntityQuerySpecification INSTANCE = make();
    
    public static BadEntityQuerySpecification make() {
      return new BadEntityQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static BadEntityQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.badEntity";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("entity");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("entity", "hu.bme.mit.mdsd.erdiagram.NamedElement"));
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
      		// 	find emptyNamedElement(entity)
      		new PositivePatternCall(body, new FlatTuple(var_entity), EmptyNamedElementQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_entity = body.getOrCreateVariableByName("entity");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_entity, "entity")
      		));
      		// 	find entityStartsWithSmallCase(entity)
      		new PositivePatternCall(body, new FlatTuple(var_entity), EntityStartsWithSmallCaseQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_entity = body.getOrCreateVariableByName("entity");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_entity, "entity")
      		));
      		// 	find sameNamedEntities(entity, _, _)
      		new PositivePatternCall(body, new FlatTuple(var_entity, var___0_, var___1_), SameNamedEntitiesQuerySpecification.instance().getInternalQueryRepresentation());
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
