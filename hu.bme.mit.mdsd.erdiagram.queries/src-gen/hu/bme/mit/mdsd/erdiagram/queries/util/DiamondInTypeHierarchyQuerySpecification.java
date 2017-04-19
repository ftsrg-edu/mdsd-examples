/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.DiamondInTypeHierarchyMatch;
import hu.bme.mit.mdsd.erdiagram.queries.DiamondInTypeHierarchyMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.util.AllSuperEntityQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.HasBiggerNameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate DiamondInTypeHierarchyMatcher in a type-safe way.
 * 
 * @see DiamondInTypeHierarchyMatcher
 * @see DiamondInTypeHierarchyMatch
 * 
 */
@SuppressWarnings("all")
public final class DiamondInTypeHierarchyQuerySpecification extends BaseGeneratedEMFQuerySpecification<DiamondInTypeHierarchyMatcher> {
  private DiamondInTypeHierarchyQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static DiamondInTypeHierarchyQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DiamondInTypeHierarchyMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DiamondInTypeHierarchyMatcher.on(engine);
  }
  
  @Override
  public DiamondInTypeHierarchyMatcher instantiate() throws ViatraQueryException {
    return DiamondInTypeHierarchyMatcher.create();
  }
  
  @Override
  public DiamondInTypeHierarchyMatch newEmptyMatch() {
    return DiamondInTypeHierarchyMatch.newEmptyMatch();
  }
  
  @Override
  public DiamondInTypeHierarchyMatch newMatch(final Object... parameters) {
    return DiamondInTypeHierarchyMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[1], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[2], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link DiamondInTypeHierarchyQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link DiamondInTypeHierarchyQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static DiamondInTypeHierarchyQuerySpecification INSTANCE = new DiamondInTypeHierarchyQuerySpecification();
    
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
    private final static DiamondInTypeHierarchyQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEntity1 = new PParameter("entity1", "hu.bme.mit.mdsd.erdiagram.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Entity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEntity2 = new PParameter("entity2", "hu.bme.mit.mdsd.erdiagram.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Entity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEntity3 = new PParameter("entity3", "hu.bme.mit.mdsd.erdiagram.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Entity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEntity4 = new PParameter("entity4", "hu.bme.mit.mdsd.erdiagram.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("hu.bme.mit.mdsd.erdiagram", "Entity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEntity1, parameter_pEntity2, parameter_pEntity3, parameter_pEntity4);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.diamondInTypeHierarchy";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("entity1","entity2","entity3","entity4");
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
      		PVariable var_entity1 = body.getOrCreateVariableByName("entity1");
      		PVariable var_entity2 = body.getOrCreateVariableByName("entity2");
      		PVariable var_entity3 = body.getOrCreateVariableByName("entity3");
      		PVariable var_entity4 = body.getOrCreateVariableByName("entity4");
      		new TypeConstraint(body, new FlatTuple(var_entity1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		new TypeConstraint(body, new FlatTuple(var_entity2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		new TypeConstraint(body, new FlatTuple(var_entity3), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		new TypeConstraint(body, new FlatTuple(var_entity4), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_entity1, parameter_pEntity1),
      		   new ExportedParameter(body, var_entity2, parameter_pEntity2),
      		   new ExportedParameter(body, var_entity3, parameter_pEntity3),
      		   new ExportedParameter(body, var_entity4, parameter_pEntity4)
      		));
      		//     find allSuperEntity(entity1,entity2)
      		new PositivePatternCall(body, new FlatTuple(var_entity1, var_entity2), AllSuperEntityQuerySpecification.instance().getInternalQueryRepresentation());
      		//     find allSuperEntity(entity1,entity3)
      		new PositivePatternCall(body, new FlatTuple(var_entity1, var_entity3), AllSuperEntityQuerySpecification.instance().getInternalQueryRepresentation());
      		//     find hasBiggerName(entity2, entity3)
      		new PositivePatternCall(body, new FlatTuple(var_entity2, var_entity3), HasBiggerNameQuerySpecification.instance().getInternalQueryRepresentation());
      		//  //entity2 != entity3;    find allSuperEntity(entity2,entity4)
      		new PositivePatternCall(body, new FlatTuple(var_entity2, var_entity4), AllSuperEntityQuerySpecification.instance().getInternalQueryRepresentation());
      		//     find allSuperEntity(entity3,entity4)
      		new PositivePatternCall(body, new FlatTuple(var_entity3, var_entity4), AllSuperEntityQuerySpecification.instance().getInternalQueryRepresentation());
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
