/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityNameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.entityName pattern,
 * to be used in conjunction with {@link EntityNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EntityNameMatcher
 * @see EntityNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EntityNameMatch extends BasePatternMatch {
  private Entity fEntity;
  
  private String fName;
  
  private static List<String> parameterNames = makeImmutableList("entity", "name");
  
  private EntityNameMatch(final Entity pEntity, final String pName) {
    this.fEntity = pEntity;
    this.fName = pName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("entity".equals(parameterName)) return this.fEntity;
    if ("name".equals(parameterName)) return this.fName;
    return null;
  }
  
  public Entity getEntity() {
    return this.fEntity;
  }
  
  public String getName() {
    return this.fName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("entity".equals(parameterName) ) {
    	this.fEntity = (Entity) newValue;
    	return true;
    }
    if ("name".equals(parameterName) ) {
    	this.fName = (String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setEntity(final Entity pEntity) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEntity = pEntity;
  }
  
  public void setName(final String pName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fName = pName;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.entityName";
  }
  
  @Override
  public List<String> parameterNames() {
    return EntityNameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEntity, fName};
  }
  
  @Override
  public EntityNameMatch toImmutable() {
    return isMutable() ? newMatch(fEntity, fName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"entity\"=" + prettyPrintValue(fEntity) + ", ");
    
    result.append("\"name\"=" + prettyPrintValue(fName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEntity == null) ? 0 : fEntity.hashCode());
    result = prime * result + ((fName == null) ? 0 : fName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EntityNameMatch)) { // this should be infrequent
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
    EntityNameMatch other = (EntityNameMatch) obj;
    if (fEntity == null) {if (other.fEntity != null) return false;}
    else if (!fEntity.equals(other.fEntity)) return false;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    return true;
  }
  
  @Override
  public EntityNameQuerySpecification specification() {
    try {
    	return EntityNameQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
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
  public static EntityNameMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EntityNameMatch newMutableMatch(final Entity pEntity, final String pName) {
    return new Mutable(pEntity, pName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EntityNameMatch newMatch(final Entity pEntity, final String pName) {
    return new Immutable(pEntity, pName);
  }
  
  private static final class Mutable extends EntityNameMatch {
    Mutable(final Entity pEntity, final String pName) {
      super(pEntity, pName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EntityNameMatch {
    Immutable(final Entity pEntity, final String pName) {
      super(pEntity, pName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
