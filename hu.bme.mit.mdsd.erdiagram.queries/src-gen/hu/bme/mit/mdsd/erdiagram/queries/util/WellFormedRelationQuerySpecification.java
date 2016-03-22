package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.WellFormedRelationMatch;
import hu.bme.mit.mdsd.erdiagram.queries.WellFormedRelationMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithoutEndingQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate WellFormedRelationMatcher in a type-safe way.
 * 
 * @see WellFormedRelationMatcher
 * @see WellFormedRelationMatch
 * 
 */
@SuppressWarnings("all")
public final class WellFormedRelationQuerySpecification extends BaseGeneratedEMFQuerySpecification<WellFormedRelationMatcher> {
  private WellFormedRelationQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static WellFormedRelationQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected WellFormedRelationMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return WellFormedRelationMatcher.on(engine);
  }
  
  @Override
  public WellFormedRelationMatch newEmptyMatch() {
    return WellFormedRelationMatch.newEmptyMatch();
  }
  
  @Override
  public WellFormedRelationMatch newMatch(final Object... parameters) {
    return WellFormedRelationMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static WellFormedRelationQuerySpecification INSTANCE = make();
    
    public static WellFormedRelationQuerySpecification make() {
      return new WellFormedRelationQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static WellFormedRelationQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.wellFormedRelation";
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
      		PVariable var_N = body.getOrCreateVariableByName("N");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		));
      		// 	N == count find relationWithoutEnding(_)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new PatternMatchCounter(body, new FlatTuple(var___0_), RelationWithoutEndingQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_0_);
      		new Equality(body, var_N, var__virtual_0_);
      		// 	N == 0
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, 0);
      		new Equality(body, var_N, var__virtual_1_);
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
