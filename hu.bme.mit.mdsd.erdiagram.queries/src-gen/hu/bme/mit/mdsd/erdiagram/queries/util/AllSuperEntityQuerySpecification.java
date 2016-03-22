package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.AllSuperEntityMatch;
import hu.bme.mit.mdsd.erdiagram.queries.AllSuperEntityMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.util.SuperEntityQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate AllSuperEntityMatcher in a type-safe way.
 * 
 * @see AllSuperEntityMatcher
 * @see AllSuperEntityMatch
 * 
 */
@SuppressWarnings("all")
public final class AllSuperEntityQuerySpecification extends BaseGeneratedEMFQuerySpecification<AllSuperEntityMatcher> {
  private AllSuperEntityQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllSuperEntityQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllSuperEntityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AllSuperEntityMatcher.on(engine);
  }
  
  @Override
  public AllSuperEntityMatch newEmptyMatch() {
    return AllSuperEntityMatch.newEmptyMatch();
  }
  
  @Override
  public AllSuperEntityMatch newMatch(final Object... parameters) {
    return AllSuperEntityMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static AllSuperEntityQuerySpecification INSTANCE = make();
    
    public static AllSuperEntityQuerySpecification make() {
      return new AllSuperEntityQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AllSuperEntityQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.allSuperEntity";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("e","superEntity");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("e", "hu.bme.mit.mdsd.erdiagram.Entity"),new PParameter("superEntity", "hu.bme.mit.mdsd.erdiagram.Entity"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_e = body.getOrCreateVariableByName("e");
      		PVariable var_superEntity = body.getOrCreateVariableByName("superEntity");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_e, "e"),
      		   new ExportedParameter(body, var_superEntity, "superEntity")
      		));
      		// 	find superEntity +(e, superEntity)
      		new BinaryTransitiveClosure(body, new FlatTuple(var_e, var_superEntity), SuperEntityQuerySpecification.instance().getInternalQueryRepresentation());
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
