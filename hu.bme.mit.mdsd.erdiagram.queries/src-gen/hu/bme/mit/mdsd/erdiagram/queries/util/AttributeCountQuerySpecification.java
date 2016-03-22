package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.AttributeCountMatch;
import hu.bme.mit.mdsd.erdiagram.queries.AttributeCountMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityAttributeQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate AttributeCountMatcher in a type-safe way.
 * 
 * @see AttributeCountMatcher
 * @see AttributeCountMatch
 * 
 */
@SuppressWarnings("all")
public final class AttributeCountQuerySpecification extends BaseGeneratedEMFQuerySpecification<AttributeCountMatcher> {
  private AttributeCountQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AttributeCountQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AttributeCountMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AttributeCountMatcher.on(engine);
  }
  
  @Override
  public AttributeCountMatch newEmptyMatch() {
    return AttributeCountMatch.newEmptyMatch();
  }
  
  @Override
  public AttributeCountMatch newMatch(final Object... parameters) {
    return AttributeCountMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0], (java.lang.Integer) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static AttributeCountQuerySpecification INSTANCE = make();
    
    public static AttributeCountQuerySpecification make() {
      return new AttributeCountQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AttributeCountQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.attributeCount";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("e","N");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("e", "hu.bme.mit.mdsd.erdiagram.Entity"),new PParameter("N", "java.lang.Integer"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_e = body.getOrCreateVariableByName("e");
      		PVariable var_N = body.getOrCreateVariableByName("N");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_e, "e"),
      		   new ExportedParameter(body, var_N, "N")
      		));
      		// 	Entity(e)
      		new TypeConstraint(body, new FlatTuple(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		// 	N == count find entityAttribute(e, _)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new PatternMatchCounter(body, new FlatTuple(var_e, var___0_), EntityAttributeQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_0_);
      		new Equality(body, var_N, var__virtual_0_);
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
