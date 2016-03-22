package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.util.SameNamedEntitiesQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.sameNamedEntities pattern,
 * to be used in conjunction with {@link SameNamedEntitiesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SameNamedEntitiesMatcher
 * @see SameNamedEntitiesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SameNamedEntitiesMatch extends BasePatternMatch {
  private Entity fEntity1;
  
  private Entity fEntity2;
  
  private String fCommonName;
  
  private static List<String> parameterNames = makeImmutableList("entity1", "entity2", "commonName");
  
  private SameNamedEntitiesMatch(final Entity pEntity1, final Entity pEntity2, final String pCommonName) {
    this.fEntity1 = pEntity1;
    this.fEntity2 = pEntity2;
    this.fCommonName = pCommonName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("entity1".equals(parameterName)) return this.fEntity1;
    if ("entity2".equals(parameterName)) return this.fEntity2;
    if ("commonName".equals(parameterName)) return this.fCommonName;
    return null;
  }
  
  public Entity getEntity1() {
    return this.fEntity1;
  }
  
  public Entity getEntity2() {
    return this.fEntity2;
  }
  
  public String getCommonName() {
    return this.fCommonName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("entity1".equals(parameterName) ) {
    	this.fEntity1 = (hu.bme.mit.mdsd.erdiagram.Entity) newValue;
    	return true;
    }
    if ("entity2".equals(parameterName) ) {
    	this.fEntity2 = (hu.bme.mit.mdsd.erdiagram.Entity) newValue;
    	return true;
    }
    if ("commonName".equals(parameterName) ) {
    	this.fCommonName = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setEntity1(final Entity pEntity1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEntity1 = pEntity1;
  }
  
  public void setEntity2(final Entity pEntity2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEntity2 = pEntity2;
  }
  
  public void setCommonName(final String pCommonName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCommonName = pCommonName;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.sameNamedEntities";
  }
  
  @Override
  public List<String> parameterNames() {
    return SameNamedEntitiesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEntity1, fEntity2, fCommonName};
  }
  
  @Override
  public SameNamedEntitiesMatch toImmutable() {
    return isMutable() ? newMatch(fEntity1, fEntity2, fCommonName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"entity1\"=" + prettyPrintValue(fEntity1) + ", ");
    
    result.append("\"entity2\"=" + prettyPrintValue(fEntity2) + ", ");
    
    result.append("\"commonName\"=" + prettyPrintValue(fCommonName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEntity1 == null) ? 0 : fEntity1.hashCode());
    result = prime * result + ((fEntity2 == null) ? 0 : fEntity2.hashCode());
    result = prime * result + ((fCommonName == null) ? 0 : fCommonName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SameNamedEntitiesMatch)) { // this should be infrequent
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
    SameNamedEntitiesMatch other = (SameNamedEntitiesMatch) obj;
    if (fEntity1 == null) {if (other.fEntity1 != null) return false;}
    else if (!fEntity1.equals(other.fEntity1)) return false;
    if (fEntity2 == null) {if (other.fEntity2 != null) return false;}
    else if (!fEntity2.equals(other.fEntity2)) return false;
    if (fCommonName == null) {if (other.fCommonName != null) return false;}
    else if (!fCommonName.equals(other.fCommonName)) return false;
    return true;
  }
  
  @Override
  public SameNamedEntitiesQuerySpecification specification() {
    try {
    	return SameNamedEntitiesQuerySpecification.instance();
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
  public static SameNamedEntitiesMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pCommonName the fixed value of pattern parameter commonName, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SameNamedEntitiesMatch newMutableMatch(final Entity pEntity1, final Entity pEntity2, final String pCommonName) {
    return new Mutable(pEntity1, pEntity2, pCommonName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pCommonName the fixed value of pattern parameter commonName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SameNamedEntitiesMatch newMatch(final Entity pEntity1, final Entity pEntity2, final String pCommonName) {
    return new Immutable(pEntity1, pEntity2, pCommonName);
  }
  
  private static final class Mutable extends SameNamedEntitiesMatch {
    Mutable(final Entity pEntity1, final Entity pEntity2, final String pCommonName) {
      super(pEntity1, pEntity2, pCommonName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SameNamedEntitiesMatch {
    Immutable(final Entity pEntity1, final Entity pEntity2, final String pCommonName) {
      super(pEntity1, pEntity2, pCommonName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
