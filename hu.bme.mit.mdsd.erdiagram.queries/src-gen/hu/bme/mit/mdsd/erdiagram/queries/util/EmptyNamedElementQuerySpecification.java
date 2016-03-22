package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.EmptyNamedElementMatch;
import hu.bme.mit.mdsd.erdiagram.queries.EmptyNamedElementMatcher;
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
 * A pattern-specific query specification that can instantiate EmptyNamedElementMatcher in a type-safe way.
 * 
 * @see EmptyNamedElementMatcher
 * @see EmptyNamedElementMatch
 * 
 */
@SuppressWarnings("all")
public final class EmptyNamedElementQuerySpecification extends BaseGeneratedEMFQuerySpecification<EmptyNamedElementMatcher> {
  private EmptyNamedElementQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EmptyNamedElementQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EmptyNamedElementMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EmptyNamedElementMatcher.on(engine);
  }
  
  @Override
  public EmptyNamedElementMatch newEmptyMatch() {
    return EmptyNamedElementMatch.newEmptyMatch();
  }
  
  @Override
  public EmptyNamedElementMatch newMatch(final Object... parameters) {
    return EmptyNamedElementMatch.newMatch((hu.bme.mit.mdsd.erdiagram.NamedElement) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static EmptyNamedElementQuerySpecification INSTANCE = make();
    
    public static EmptyNamedElementQuerySpecification make() {
      return new EmptyNamedElementQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EmptyNamedElementQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.emptyNamedElement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("namedElement");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("namedElement", "hu.bme.mit.mdsd.erdiagram.NamedElement"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_namedElement = body.getOrCreateVariableByName("namedElement");
      		PVariable var_name = body.getOrCreateVariableByName("name");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_namedElement, "namedElement")
      		));
      		// 	NamedElement.name(namedElement, name)
      		new TypeConstraint(body, new FlatTuple(var_namedElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_namedElement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
      		new Equality(body, var__virtual_0_, var_name);
      		// 	check(name.isEmpty())
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern emptyNamedElement";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("name");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.String name = (java.lang.String) provider.getValue("name");
      		                                    return evaluateExpression_1_1(name);
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
  
  private static boolean evaluateExpression_1_1(final String name) {
    boolean _isEmpty = name.isEmpty();
    return _isEmpty;
  }
}
