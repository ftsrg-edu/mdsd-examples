package hu.bme.mit.mdsd.erdiagram.queries;

import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import org.eclipse.incquery.validation.core.api.Severity;
import org.eclipse.incquery.validation.core.api.IConstraintSpecification;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import hu.bme.mit.mdsd.erdiagram.queries.util.SameNamedEntitiesQuerySpecification;

public class SameNamedEntitiesConstraint0 implements IConstraintSpecification {

    private SameNamedEntitiesQuerySpecification querySpecification;

    public SameNamedEntitiesConstraint0() throws IncQueryException {
        querySpecification = SameNamedEntitiesQuerySpecification.instance();
    }

    @Override
    public String getMessageFormat() {
        return "Two entities has the same name $commonName$";
    }


    @Override
    public Map<String,Object> getKeyObjects(IPatternMatch signature) {
        Map<String,Object> map = ImmutableMap.of(
            "entity1",signature.get("entity1"),
            "entity2",signature.get("entity2")
        );
        return map;
    }

    @Override
    public List<String> getKeyNames() {
        List<String> keyNames = ImmutableList.of(
            "entity1",
            "entity2"
        );
        return keyNames;
    }

    @Override
    public List<String> getPropertyNames() {
        List<String> propertyNames = ImmutableList.of(
            "commonName"
        );
        return propertyNames;
    }

    @Override
    public Set<List<String>> getSymmetricPropertyNames() {
        Set<List<String>> symmetricPropertyNamesSet = ImmutableSet.<List<String>>of(
        );
        return symmetricPropertyNamesSet;
    }

    @Override
    public Set<List<String>> getSymmetricKeyNames() {
        Set<List<String>> symmetricKeyNamesSet = ImmutableSet.<List<String>>of(
            ImmutableList.of(
            "entity1",
            "entity2"
            )
        );
        return symmetricKeyNamesSet;
    }

    @Override
    public Severity getSeverity() {
        return Severity.ERROR;
    }

    @Override
    public IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> getQuerySpecification() {
        return querySpecification;
    }

}
