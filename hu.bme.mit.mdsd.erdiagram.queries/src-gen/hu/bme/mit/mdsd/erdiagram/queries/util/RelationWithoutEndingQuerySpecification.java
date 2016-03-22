package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithoutEndingMatch;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithoutEndingMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithLeftEndingQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithRightEndingQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RelationWithoutEndingMatcher in a type-safe way.
 * 
 * @see RelationWithoutEndingMatcher
 * @see RelationWithoutEndingMatch
 * 
 */
@SuppressWarnings("all")
public final class RelationWithoutEndingQuerySpecification extends BaseGeneratedEMFQuerySpecification<RelationWithoutEndingMatcher> {
  private RelationWithoutEndingQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RelationWithoutEndingQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RelationWithoutEndingMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RelationWithoutEndingMatcher.on(engine);
  }
  
  @Override
  public RelationWithoutEndingMatch newEmptyMatch() {
    return RelationWithoutEndingMatch.newEmptyMatch();
  }
  
  @Override
  public RelationWithoutEndingMatch newMatch(final Object... parameters) {
    return RelationWithoutEndingMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Relation) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static RelationWithoutEndingQuerySpecification INSTANCE = make();
    
    public static RelationWithoutEndingQuerySpecification make() {
      return new RelationWithoutEndingQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RelationWithoutEndingQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.relationWithoutEnding";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("r");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("r", "hu.bme.mit.mdsd.erdiagram.Relation"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_r = body.getOrCreateVariableByName("r");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_r), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_r, "r")
      		));
      		// 	neg find relationWithLeftEnding(r, _)
      		new NegativePatternCall(body, new FlatTuple(var_r, var___0_), RelationWithLeftEndingQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_r = body.getOrCreateVariableByName("r");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_r), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_r, "r")
      		));
      		// 	neg find relationWithRightEnding(r, _)
      		new NegativePatternCall(body, new FlatTuple(var_r, var___0_), RelationWithRightEndingQuerySpecification.instance().getInternalQueryRepresentation());
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
