/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithLeftEndingMatch;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithLeftEndingMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RelationWithLeftEndingMatcher in a type-safe way.
 * 
 * @see RelationWithLeftEndingMatcher
 * @see RelationWithLeftEndingMatch
 * 
 */
@SuppressWarnings("all")
public final class RelationWithLeftEndingQuerySpecification extends BaseGeneratedEMFQuerySpecification<RelationWithLeftEndingMatcher> {
  private RelationWithLeftEndingQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static RelationWithLeftEndingQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RelationWithLeftEndingMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RelationWithLeftEndingMatcher.on(engine);
  }
  
  @Override
  public RelationWithLeftEndingMatcher instantiate() throws ViatraQueryException {
    return RelationWithLeftEndingMatcher.create();
  }
  
  @Override
  public RelationWithLeftEndingMatch newEmptyMatch() {
    return RelationWithLeftEndingMatch.newEmptyMatch();
  }
  
  @Override
  public RelationWithLeftEndingMatch newMatch(final Object... parameters) {
    return RelationWithLeftEndingMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Relation) parameters[0], (hu.bme.mit.mdsd.erdiagram.RelationEnding) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RelationWithLeftEndingQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link RelationWithLeftEndingQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static RelationWithLeftEndingQuerySpecification INSTANCE = new RelationWithLeftEndingQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RelationWithLeftEndingQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pR = new PParameter("r", "hu.bme.mit.mdsd.erdiagram.Relation", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pRle = new PParameter("rle", "hu.bme.mit.mdsd.erdiagram.RelationEnding", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pR, parameter_pRle);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.relationWithLeftEnding";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("r","rle");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_r = body.getOrCreateVariableByName("r");
      		PVariable var_rle = body.getOrCreateVariableByName("rle");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_r, parameter_pR),
      		   new ExportedParameter(body, var_rle, parameter_pRle)
      		));
      		// 	Relation.leftEnding(r, rle)
      		new TypeConstraint(body, new FlatTuple(var_r), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_r, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "leftEnding")));
      		new Equality(body, var__virtual_0_, var_rle);
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
