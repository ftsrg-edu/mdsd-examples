package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.util.AttributeWithInheirtanceQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.attributeWithInheirtance pattern,
 * to be used in conjunction with {@link AttributeWithInheirtanceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AttributeWithInheirtanceMatcher
 * @see AttributeWithInheirtanceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AttributeWithInheirtanceMatch extends BasePatternMatch {
  private Entity fEntity;
  
  private Attribute fAttribute;
  
  private static List<String> parameterNames = makeImmutableList("entity", "attribute");
  
  private AttributeWithInheirtanceMatch(final Entity pEntity, final Attribute pAttribute) {
    this.fEntity = pEntity;
    this.fAttribute = pAttribute;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("entity".equals(parameterName)) return this.fEntity;
    if ("attribute".equals(parameterName)) return this.fAttribute;
    return null;
  }
  
  public Entity getEntity() {
    return this.fEntity;
  }
  
  public Attribute getAttribute() {
    return this.fAttribute;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("entity".equals(parameterName) ) {
    	this.fEntity = (hu.bme.mit.mdsd.erdiagram.Entity) newValue;
    	return true;
    }
    if ("attribute".equals(parameterName) ) {
    	this.fAttribute = (hu.bme.mit.mdsd.erdiagram.Attribute) newValue;
    	return true;
    }
    return false;
  }
  
  public void setEntity(final Entity pEntity) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEntity = pEntity;
  }
  
  public void setAttribute(final Attribute pAttribute) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAttribute = pAttribute;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.attributeWithInheirtance";
  }
  
  @Override
  public List<String> parameterNames() {
    return AttributeWithInheirtanceMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEntity, fAttribute};
  }
  
  @Override
  public AttributeWithInheirtanceMatch toImmutable() {
    return isMutable() ? newMatch(fEntity, fAttribute) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"entity\"=" + prettyPrintValue(fEntity) + ", ");
    
    result.append("\"attribute\"=" + prettyPrintValue(fAttribute)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEntity == null) ? 0 : fEntity.hashCode());
    result = prime * result + ((fAttribute == null) ? 0 : fAttribute.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AttributeWithInheirtanceMatch)) { // this should be infrequent
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
    AttributeWithInheirtanceMatch other = (AttributeWithInheirtanceMatch) obj;
    if (fEntity == null) {if (other.fEntity != null) return false;}
    else if (!fEntity.equals(other.fEntity)) return false;
    if (fAttribute == null) {if (other.fAttribute != null) return false;}
    else if (!fAttribute.equals(other.fAttribute)) return false;
    return true;
  }
  
  @Override
  public AttributeWithInheirtanceQuerySpecification specification() {
    try {
    	return AttributeWithInheirtanceQuerySpecification.instance();
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
  public static AttributeWithInheirtanceMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AttributeWithInheirtanceMatch newMutableMatch(final Entity pEntity, final Attribute pAttribute) {
    return new Mutable(pEntity, pAttribute);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AttributeWithInheirtanceMatch newMatch(final Entity pEntity, final Attribute pAttribute) {
    return new Immutable(pEntity, pAttribute);
  }
  
  private static final class Mutable extends AttributeWithInheirtanceMatch {
    Mutable(final Entity pEntity, final Attribute pAttribute) {
      super(pEntity, pAttribute);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AttributeWithInheirtanceMatch {
    Immutable(final Entity pEntity, final Attribute pAttribute) {
      super(pEntity, pAttribute);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
