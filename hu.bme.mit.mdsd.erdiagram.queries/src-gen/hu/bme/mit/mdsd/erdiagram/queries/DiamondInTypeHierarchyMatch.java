package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.util.DiamondInTypeHierarchyQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.diamondInTypeHierarchy pattern,
 * to be used in conjunction with {@link DiamondInTypeHierarchyMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DiamondInTypeHierarchyMatcher
 * @see DiamondInTypeHierarchyProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DiamondInTypeHierarchyMatch extends BasePatternMatch {
  private Entity fEntity1;
  
  private Entity fEntity2;
  
  private Entity fEntity3;
  
  private Entity fEntity4;
  
  private static List<String> parameterNames = makeImmutableList("entity1", "entity2", "entity3", "entity4");
  
  private DiamondInTypeHierarchyMatch(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4) {
    this.fEntity1 = pEntity1;
    this.fEntity2 = pEntity2;
    this.fEntity3 = pEntity3;
    this.fEntity4 = pEntity4;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("entity1".equals(parameterName)) return this.fEntity1;
    if ("entity2".equals(parameterName)) return this.fEntity2;
    if ("entity3".equals(parameterName)) return this.fEntity3;
    if ("entity4".equals(parameterName)) return this.fEntity4;
    return null;
  }
  
  public Entity getEntity1() {
    return this.fEntity1;
  }
  
  public Entity getEntity2() {
    return this.fEntity2;
  }
  
  public Entity getEntity3() {
    return this.fEntity3;
  }
  
  public Entity getEntity4() {
    return this.fEntity4;
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
    if ("entity3".equals(parameterName) ) {
    	this.fEntity3 = (hu.bme.mit.mdsd.erdiagram.Entity) newValue;
    	return true;
    }
    if ("entity4".equals(parameterName) ) {
    	this.fEntity4 = (hu.bme.mit.mdsd.erdiagram.Entity) newValue;
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
  
  public void setEntity3(final Entity pEntity3) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEntity3 = pEntity3;
  }
  
  public void setEntity4(final Entity pEntity4) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEntity4 = pEntity4;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.diamondInTypeHierarchy";
  }
  
  @Override
  public List<String> parameterNames() {
    return DiamondInTypeHierarchyMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEntity1, fEntity2, fEntity3, fEntity4};
  }
  
  @Override
  public DiamondInTypeHierarchyMatch toImmutable() {
    return isMutable() ? newMatch(fEntity1, fEntity2, fEntity3, fEntity4) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"entity1\"=" + prettyPrintValue(fEntity1) + ", ");
    
    result.append("\"entity2\"=" + prettyPrintValue(fEntity2) + ", ");
    
    result.append("\"entity3\"=" + prettyPrintValue(fEntity3) + ", ");
    
    result.append("\"entity4\"=" + prettyPrintValue(fEntity4)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEntity1 == null) ? 0 : fEntity1.hashCode());
    result = prime * result + ((fEntity2 == null) ? 0 : fEntity2.hashCode());
    result = prime * result + ((fEntity3 == null) ? 0 : fEntity3.hashCode());
    result = prime * result + ((fEntity4 == null) ? 0 : fEntity4.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DiamondInTypeHierarchyMatch)) { // this should be infrequent
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
    DiamondInTypeHierarchyMatch other = (DiamondInTypeHierarchyMatch) obj;
    if (fEntity1 == null) {if (other.fEntity1 != null) return false;}
    else if (!fEntity1.equals(other.fEntity1)) return false;
    if (fEntity2 == null) {if (other.fEntity2 != null) return false;}
    else if (!fEntity2.equals(other.fEntity2)) return false;
    if (fEntity3 == null) {if (other.fEntity3 != null) return false;}
    else if (!fEntity3.equals(other.fEntity3)) return false;
    if (fEntity4 == null) {if (other.fEntity4 != null) return false;}
    else if (!fEntity4.equals(other.fEntity4)) return false;
    return true;
  }
  
  @Override
  public DiamondInTypeHierarchyQuerySpecification specification() {
    try {
    	return DiamondInTypeHierarchyQuerySpecification.instance();
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
  public static DiamondInTypeHierarchyMatch newEmptyMatch() {
    return new Mutable(null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pEntity3 the fixed value of pattern parameter entity3, or null if not bound.
   * @param pEntity4 the fixed value of pattern parameter entity4, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DiamondInTypeHierarchyMatch newMutableMatch(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4) {
    return new Mutable(pEntity1, pEntity2, pEntity3, pEntity4);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEntity1 the fixed value of pattern parameter entity1, or null if not bound.
   * @param pEntity2 the fixed value of pattern parameter entity2, or null if not bound.
   * @param pEntity3 the fixed value of pattern parameter entity3, or null if not bound.
   * @param pEntity4 the fixed value of pattern parameter entity4, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DiamondInTypeHierarchyMatch newMatch(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4) {
    return new Immutable(pEntity1, pEntity2, pEntity3, pEntity4);
  }
  
  private static final class Mutable extends DiamondInTypeHierarchyMatch {
    Mutable(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4) {
      super(pEntity1, pEntity2, pEntity3, pEntity4);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DiamondInTypeHierarchyMatch {
    Immutable(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4) {
      super(pEntity1, pEntity2, pEntity3, pEntity4);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
