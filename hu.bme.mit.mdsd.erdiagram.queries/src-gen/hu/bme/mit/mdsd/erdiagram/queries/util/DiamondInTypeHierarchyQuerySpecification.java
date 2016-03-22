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
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

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
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DiamondInTypeHierarchyQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DiamondInTypeHierarchyMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DiamondInTypeHierarchyMatcher.on(engine);
  }
  
  @Override
  public DiamondInTypeHierarchyMatch newEmptyMatch() {
    return DiamondInTypeHierarchyMatch.newEmptyMatch();
  }
  
  @Override
  public DiamondInTypeHierarchyMatch newMatch(final Object... parameters) {
    return DiamondInTypeHierarchyMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[1], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[2], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[3]);
  }
  
  private static class LazyHolder {
    private final static DiamondInTypeHierarchyQuerySpecification INSTANCE = make();
    
    public static DiamondInTypeHierarchyQuerySpecification make() {
      return new DiamondInTypeHierarchyQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DiamondInTypeHierarchyQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
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
      return Arrays.asList(new PParameter("entity1", "hu.bme.mit.mdsd.erdiagram.Entity"),new PParameter("entity2", "hu.bme.mit.mdsd.erdiagram.Entity"),new PParameter("entity3", "hu.bme.mit.mdsd.erdiagram.Entity"),new PParameter("entity4", "hu.bme.mit.mdsd.erdiagram.Entity"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
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
      		   new ExportedParameter(body, var_entity1, "entity1"),
      		   new ExportedParameter(body, var_entity2, "entity2"),
      		   new ExportedParameter(body, var_entity3, "entity3"),
      		   new ExportedParameter(body, var_entity4, "entity4")
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
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
