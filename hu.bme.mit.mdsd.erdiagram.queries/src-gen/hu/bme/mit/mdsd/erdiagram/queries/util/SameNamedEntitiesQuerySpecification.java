package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.SameNamedEntitiesMatch;
import hu.bme.mit.mdsd.erdiagram.queries.SameNamedEntitiesMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate SameNamedEntitiesMatcher in a type-safe way.
 * 
 * @see SameNamedEntitiesMatcher
 * @see SameNamedEntitiesMatch
 * 
 */
@SuppressWarnings("all")
public final class SameNamedEntitiesQuerySpecification extends BaseGeneratedEMFQuerySpecification<SameNamedEntitiesMatcher> {
  private SameNamedEntitiesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SameNamedEntitiesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SameNamedEntitiesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SameNamedEntitiesMatcher.on(engine);
  }
  
  @Override
  public SameNamedEntitiesMatch newEmptyMatch() {
    return SameNamedEntitiesMatch.newEmptyMatch();
  }
  
  @Override
  public SameNamedEntitiesMatch newMatch(final Object... parameters) {
    return SameNamedEntitiesMatch.newMatch((hu.bme.mit.mdsd.erdiagram.Entity) parameters[0], (hu.bme.mit.mdsd.erdiagram.Entity) parameters[1], (java.lang.String) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static SameNamedEntitiesQuerySpecification INSTANCE = make();
    
    public static SameNamedEntitiesQuerySpecification make() {
      return new SameNamedEntitiesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SameNamedEntitiesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.sameNamedEntities";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("entity1","entity2","commonName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("entity1", "hu.bme.mit.mdsd.erdiagram.Entity"),new PParameter("entity2", "hu.bme.mit.mdsd.erdiagram.Entity"),new PParameter("commonName", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_entity1 = body.getOrCreateVariableByName("entity1");
      		PVariable var_entity2 = body.getOrCreateVariableByName("entity2");
      		PVariable var_commonName = body.getOrCreateVariableByName("commonName");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_entity1, "entity1"),
      		   new ExportedParameter(body, var_entity2, "entity2"),
      		   new ExportedParameter(body, var_commonName, "commonName")
      		));
      		// 	Entity.name(entity1, commonName)
      		new TypeConstraint(body, new FlatTuple(var_entity1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_entity1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
      		new Equality(body, var__virtual_0_, var_commonName);
      		// 	Entity.name(entity2, commonName)
      		new TypeConstraint(body, new FlatTuple(var_entity2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Entity")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_entity2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "NamedElement", "name")));
      		new Equality(body, var__virtual_1_, var_commonName);
      		// 	entity1 != entity2
      		new Inequality(body, var_entity1, var_entity2);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Two entities has the same name $commonName$");
      		annotation.addAttribute("targetEditorId", "hu.bme.mit.mdsd.erdiagram.presentation.ErdiagramEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "entity1", 
      		                "entity2"
      		                }));
      		annotation.addAttribute("symmetric", Arrays.asList(new Object[] {
      		                "entity1", 
      		                "entity2"
      		                }));
      		addAnnotation(annotation);
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
