package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.FirtEntityMatch;
import hu.bme.mit.mdsd.erdiagram.queries.FirtEntityMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.util.HasBiggerNameQuerySpecification;
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
 * A pattern-specific query specification that can instantiate FirtEntityMatcher in a type-safe way.
 * 
 * @see FirtEntityMatcher
 * @see FirtEntityMatch
 * 
 */
@SuppressWarnings("all")
public final class FirtEntityQuerySpecification extends BaseGeneratedEMFQuerySpecification<FirtEntityMatcher> {
  private FirtEntityQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FirtEntityQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected FirtEntityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FirtEntityMatcher.on(engine);
  }
  
  @Override
  public FirtEntityMatch newEmptyMatch() {
    return FirtEntityMatch.newEmptyMatch();
  }
  
  @Override
  public FirtEntityMatch newMatch(final Object... parameters) {
    return FirtEntityMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static FirtEntityQuerySpecification INSTANCE = make();
    
    public static FirtEntityQuerySpecification make() {
      return new FirtEntityQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static FirtEntityQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.firtEntity";
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
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_e, "e")
      		));
      		// 	neg find hasBiggerName(e, _)
      		new NegativePatternCall(body, new FlatTuple(var_e, var___0_), HasBiggerNameQuerySpecification.instance().getInternalQueryRepresentation());
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
