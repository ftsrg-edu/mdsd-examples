/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.util.HasBiggerNameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.hasBiggerName pattern,
 * to be used in conjunction with {@link HasBiggerNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see HasBiggerNameMatcher
 * @see HasBiggerNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class HasBiggerNameMatch extends BasePatternMatch {
  private Entity fE1;
  
  private Entity fE2;
  
  private static List<String> parameterNames = makeImmutableList("e1", "e2");
  
  private HasBiggerNameMatch(final Entity pE1, final Entity pE2) {
    this.fE1 = pE1;
    this.fE2 = pE2;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("e1".equals(parameterName)) return this.fE1;
    if ("e2".equals(parameterName)) return this.fE2;
    return null;
  }
  
  public Entity getE1() {
    return this.fE1;
  }
  
  public Entity getE2() {
    return this.fE2;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("e1".equals(parameterName) ) {
    	this.fE1 = (Entity) newValue;
    	return true;
    }
    if ("e2".equals(parameterName) ) {
    	this.fE2 = (Entity) newValue;
    	return true;
    }
    return false;
  }
  
  public void setE1(final Entity pE1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fE1 = pE1;
  }
  
  public void setE2(final Entity pE2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fE2 = pE2;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.hasBiggerName";
  }
  
  @Override
  public List<String> parameterNames() {
    return HasBiggerNameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fE1, fE2};
  }
  
  @Override
  public HasBiggerNameMatch toImmutable() {
    return isMutable() ? newMatch(fE1, fE2) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"e1\"=" + prettyPrintValue(fE1) + ", ");
    
    result.append("\"e2\"=" + prettyPrintValue(fE2)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fE1 == null) ? 0 : fE1.hashCode());
    result = prime * result + ((fE2 == null) ? 0 : fE2.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof HasBiggerNameMatch)) { // this should be infrequent
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
    HasBiggerNameMatch other = (HasBiggerNameMatch) obj;
    if (fE1 == null) {if (other.fE1 != null) return false;}
    else if (!fE1.equals(other.fE1)) return false;
    if (fE2 == null) {if (other.fE2 != null) return false;}
    else if (!fE2.equals(other.fE2)) return false;
    return true;
  }
  
  @Override
  public HasBiggerNameQuerySpecification specification() {
    try {
    	return HasBiggerNameQuerySpecification.instance();
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
  public static HasBiggerNameMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
   * @param pE2 the fixed value of pattern parameter e2, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static HasBiggerNameMatch newMutableMatch(final Entity pE1, final Entity pE2) {
    return new Mutable(pE1, pE2);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
   * @param pE2 the fixed value of pattern parameter e2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static HasBiggerNameMatch newMatch(final Entity pE1, final Entity pE2) {
    return new Immutable(pE1, pE2);
  }
  
  private static final class Mutable extends HasBiggerNameMatch {
    Mutable(final Entity pE1, final Entity pE2) {
      super(pE1, pE2);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends HasBiggerNameMatch {
    Immutable(final Entity pE1, final Entity pE2) {
      super(pE1, pE2);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
