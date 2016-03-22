package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.HasBiggerNameMatch;
import hu.bme.mit.mdsd.erdiagram.queries.HasBiggerNameMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate HasBiggerNameMatcher in a type-safe way.
 * 
 * @see HasBiggerNameMatcher
 * @see HasBiggerNameMatch
 * 
 */
@SuppressWarnings("all")
public final class HasBiggerNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<HasBiggerNameMatcher> {
  private HasBiggerNameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static HasBiggerNameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected HasBiggerNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return HasBiggerNameMatcher.on(engine);
  }
  
  @Override
  public HasBiggerNameMatch newEmptyMatch() {
    return HasBiggerNameMatch.newEmptyMatch();
  }
  
  @Override
  public HasBiggerNameMatch newMatch(final Object... parameters) {
    return HasBiggerNameMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static HasBiggerNameQuerySpecification INSTANCE = make();
    
    public static HasBiggerNameQuerySpecification make() {
      return new HasBiggerNameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static HasBiggerNameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.hasBiggerName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("e1","e2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("e1", "hu.bme.mit.mdsd.erdiagram.Entity"),new PParameter("e2", "hu.bme.mit.mdsd.erdiagram.Entity"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_e1 = body.getOrCreateVariableByName("e1");
      		PVariable var_e2 = body.getOrCreateVariableByName("e2");
      		PVariable var_name1 = body.getOrCreateVariableByName("name1");
      		PVariable var_name2 = body.getOrCreateVariableByName("name2");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_e1, "e1"),
      		   new ExportedParameter(body, var_e2, "e2")
      		));
      		// 	Entity.name(e1, name1)
      		new TypeConstraint(body, new FlatTuple(var_e1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_e1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
      		new Equality(body, var__virtual_0_, var_name1);
      		// 	Entity.name(e2, name2)
      		new TypeConstraint(body, new FlatTuple(var_e2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_e2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
      		new Equality(body, var__virtual_1_, var_name2);
      		// 	check(name1 > name2)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern hasBiggerName";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("name1", "name2");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.String name1 = (java.lang.String) provider.getValue("name1");
      		                                    java.lang.String name2 = (java.lang.String) provider.getValue("name2");
      		                                    return evaluateExpression_1_1(name1, name2);
      		                                }
      		
      		                        },  null); 
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
  
  private static boolean evaluateExpression_1_1(final String name1, final String name2) {
    boolean _greaterThan = (name1.compareTo(name2) > 0);
    return _greaterThan;
  }
}
