package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.NamedElement;
import hu.bme.mit.mdsd.erdiagram.queries.util.BadEntityQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.badEntity pattern,
 * to be used in conjunction with {@link BadEntityMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see BadEntityMatcher
 * @see BadEntityProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class BadEntityMatch extends BasePatternMatch {
  private NamedElement fEntity;
  
  private static List<String> parameterNames = makeImmutableList("entity");
  
  private BadEntityMatch(final NamedElement pEntity) {
    this.fEntity = pEntity;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("entity".equals(parameterName)) return this.fEntity;
    return null;
  }
  
  public NamedElement getEntity() {
    return this.fEntity;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("entity".equals(parameterName) ) {
    	this.fEntity = (hu.bme.mit.mdsd.erdiagram.NamedElement) newValue;
    	return true;
    }
    return false;
  }
  
  public void setEntity(final NamedElement pEntity) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEntity = pEntity;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.badEntity";
  }
  
  @Override
  public List<String> parameterNames() {
    return BadEntityMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEntity};
  }
  
  @Override
  public BadEntityMatch toImmutable() {
    return isMutable() ? newMatch(fEntity) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"entity\"=" + prettyPrintValue(fEntity)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEntity == null) ? 0 : fEntity.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof BadEntityMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    BadEntityMatch other = (BadEntityMatch) obj;
    if (fEntity == null) {if (other.fEntity != null) return false;}
    else if (!fEntity.equals(other.fEntity)) return false;
    return true;
  }
  
  @Override
  public BadEntityQuerySpecification specification() {
    try {
    	return BadEntityQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static BadEntityMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static BadEntityMatch newMutableMatch(final NamedElement pEntity) {
    return new Mutable(pEntity);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static BadEntityMatch newMatch(final NamedElement pEntity) {
    return new Immutable(pEntity);
  }
  
  private static final class Mutable extends BadEntityMatch {
    Mutable(final NamedElement pEntity) {
      super(pEntity);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends BadEntityMatch {
    Immutable(final NamedElement pEntity) {
      super(pEntity);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
