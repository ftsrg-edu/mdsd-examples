package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.WellFormedEntitesMatch;
import hu.bme.mit.mdsd.erdiagram.queries.WellFormedEntitesMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.util.BadEntityQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate WellFormedEntitesMatcher in a type-safe way.
 * 
 * @see WellFormedEntitesMatcher
 * @see WellFormedEntitesMatch
 * 
 */
@SuppressWarnings("all")
public final class WellFormedEntitesQuerySpecification extends BaseGeneratedEMFQuerySpecification<WellFormedEntitesMatcher> {
  private WellFormedEntitesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WellFormedEntitesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WellFormedEntitesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedEntitesMatcher.on(engine);
  }
  
  @Override
  public WellFormedEntitesMatch newEmptyMatch() {
    return WellFormedEntitesMatch.newEmptyMatch();
  }
  
  @Override
  public WellFormedEntitesMatch newMatch(final Object... parameters) {
    return WellFormedEntitesMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static WellFormedEntitesQuerySpecification INSTANCE = make();
    
    public static WellFormedEntitesQuerySpecification make() {
      return new WellFormedEntitesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WellFormedEntitesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.wellFormedEntites";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList();
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList();
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		));
      		// 	neg find badEntity(_)
      		new NegativePatternCall(body, new FlatTuple(var___0_), BadEntityQuerySpecification.instance().getInternalQueryRepresentation());
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
