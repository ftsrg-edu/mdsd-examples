package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.EntityStartsWithSmallCaseMatch;
import hu.bme.mit.mdsd.erdiagram.queries.EntityStartsWithSmallCaseMatcher;
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
 * A pattern-specific query specification that can instantiate EntityStartsWithSmallCaseMatcher in a type-safe way.
 * 
 * @see EntityStartsWithSmallCaseMatcher
 * @see EntityStartsWithSmallCaseMatch
 * 
 */
@SuppressWarnings("all")
public final class EntityStartsWithSmallCaseQuerySpecification extends BaseGeneratedEMFQuerySpecification<EntityStartsWithSmallCaseMatcher> {
  private EntityStartsWithSmallCaseQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EntityStartsWithSmallCaseQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EntityStartsWithSmallCaseMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EntityStartsWithSmallCaseMatcher.on(engine);
  }
  
  @Override
  public EntityStartsWithSmallCaseMatch newEmptyMatch() {
    return EntityStartsWithSmallCaseMatch.newEmptyMatch();
  }
  
  @Override
  public EntityStartsWithSmallCaseMatch newMatch(final Object... parameters) {
    return EntityStartsWithSmallCaseMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static EntityStartsWithSmallCaseQuerySpecification INSTANCE = make();
    
    public static EntityStartsWithSmallCaseQuerySpecification make() {
      return new EntityStartsWithSmallCaseQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EntityStartsWithSmallCaseQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.entityStartsWithSmallCase";
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
      		PVariable var_name = body.getOrCreateVariableByName("name");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_entity, "entity")
      		));
      		// 	Entity.name(entity, name)
      		new TypeConstraint(body, new FlatTuple(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_entity, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
      		new Equality(body, var__virtual_0_, var_name);
      		// 	check(! name.matches("^[A-Z].+"))
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern entityStartsWithSmallCase";
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
    boolean _matches = name.matches("^[A-Z].+");
    boolean _not = (!_matches);
    return _not;
  }
}
