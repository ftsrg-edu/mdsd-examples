package hu.bme.mit.mdsd.erdiagram.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.erdiagram.queries.OtherEndingMatch;
import hu.bme.mit.mdsd.erdiagram.queries.OtherEndingMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate OtherEndingMatcher in a type-safe way.
 * 
 * @see OtherEndingMatcher
 * @see OtherEndingMatch
 * 
 */
@SuppressWarnings("all")
public final class OtherEndingQuerySpecification extends BaseGeneratedEMFQuerySpecification<OtherEndingMatcher> {
  private OtherEndingQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static OtherEndingQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected OtherEndingMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return OtherEndingMatcher.on(engine);
  }
  
  @Override
  public OtherEndingMatch newEmptyMatch() {
    return OtherEndingMatch.newEmptyMatch();
  }
  
  @Override
  public OtherEndingMatch newMatch(final Object... parameters) {
    return OtherEndingMatch.newMatch((hu.bme.mit.mdsd.erdiagram.RelationEnding) parameters[0], (hu.bme.mit.mdsd.erdiagram.RelationEnding) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static OtherEndingQuerySpecification INSTANCE = make();
    
    public static OtherEndingQuerySpecification make() {
      return new OtherEndingQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static OtherEndingQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.erdiagram.queries.otherEnding";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ending","other");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("ending", "hu.bme.mit.mdsd.erdiagram.RelationEnding"),new PParameter("other", "hu.bme.mit.mdsd.erdiagram.RelationEnding"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_ending = body.getOrCreateVariableByName("ending");
      		PVariable var_other = body.getOrCreateVariableByName("other");
      		PVariable var_relation = body.getOrCreateVariableByName("relation");
      		new TypeConstraint(body, new FlatTuple(var_ending), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
      		new TypeConstraint(body, new FlatTuple(var_other), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_ending, "ending"),
      		   new ExportedParameter(body, var_other, "other")
      		));
      		// 	Relation.leftEnding(relation, ending)
      		new TypeConstraint(body, new FlatTuple(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_relation, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "leftEnding")));
      		new Equality(body, var__virtual_0_, var_ending);
      		// 	Relation.rightEnding(relation, other)
      		new TypeConstraint(body, new FlatTuple(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_relation, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "rightEnding")));
      		new Equality(body, var__virtual_1_, var_other);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_ending = body.getOrCreateVariableByName("ending");
      		PVariable var_other = body.getOrCreateVariableByName("other");
      		PVariable var_relation = body.getOrCreateVariableByName("relation");
      		new TypeConstraint(body, new FlatTuple(var_ending), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
      		new TypeConstraint(body, new FlatTuple(var_other), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "RelationEnding")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_ending, "ending"),
      		   new ExportedParameter(body, var_other, "other")
      		));
      		// 	Relation.rightEnding(relation, ending)
      		new TypeConstraint(body, new FlatTuple(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_relation, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "rightEnding")));
      		new Equality(body, var__virtual_0_, var_ending);
      		// 	Relation.leftEnding(relation, other)
      		new TypeConstraint(body, new FlatTuple(var_relation), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.erdiagram", "Relation")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_relation, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.erdiagram", "Relation", "leftEnding")));
      		new Equality(body, var__virtual_1_, var_other);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("QueryBasedFeature");
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
