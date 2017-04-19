/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.util.AttributeCountQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.attributeCount pattern,
 * to be used in conjunction with {@link AttributeCountMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AttributeCountMatcher
 * @see AttributeCountProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AttributeCountMatch extends BasePatternMatch {
  private Entity fE;
  
  private Integer fN;
  
  private static List<String> parameterNames = makeImmutableList("e", "N");
  
  private AttributeCountMatch(final Entity pE, final Integer pN) {
    this.fE = pE;
    this.fN = pN;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("e".equals(parameterName)) return this.fE;
    if ("N".equals(parameterName)) return this.fN;
    return null;
  }
  
  public Entity getE() {
    return this.fE;
  }
  
  public Integer getN() {
    return this.fN;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("e".equals(parameterName) ) {
    	this.fE = (Entity) newValue;
    	return true;
    }
    if ("N".equals(parameterName) ) {
    	this.fN = (Integer) newValue;
    	return true;
    }
    return false;
  }
  
  public void setE(final Entity pE) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fE = pE;
  }
  
  public void setN(final Integer pN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fN = pN;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.attributeCount";
  }
  
  @Override
  public List<String> parameterNames() {
    return AttributeCountMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fE, fN};
  }
  
  @Override
  public AttributeCountMatch toImmutable() {
    return isMutable() ? newMatch(fE, fN) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"e\"=" + prettyPrintValue(fE) + ", ");
    
    result.append("\"N\"=" + prettyPrintValue(fN)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fE == null) ? 0 : fE.hashCode());
    result = prime * result + ((fN == null) ? 0 : fN.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AttributeCountMatch)) { // this should be infrequent
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
    AttributeCountMatch other = (AttributeCountMatch) obj;
    if (fE == null) {if (other.fE != null) return false;}
    else if (!fE.equals(other.fE)) return false;
    if (fN == null) {if (other.fN != null) return false;}
    else if (!fN.equals(other.fN)) return false;
    return true;
  }
  
  @Override
  public AttributeCountQuerySpecification specification() {
    try {
    	return AttributeCountQuerySpecification.instance();
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
  public static AttributeCountMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AttributeCountMatch newMutableMatch(final Entity pE, final Integer pN) {
    return new Mutable(pE, pN);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pN the fixed value of pattern parameter N, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AttributeCountMatch newMatch(final Entity pE, final Integer pN) {
    return new Immutable(pE, pN);
  }
  
  private static final class Mutable extends AttributeCountMatch {
    Mutable(final Entity pE, final Integer pN) {
      super(pE, pN);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AttributeCountMatch {
    Immutable(final Entity pE, final Integer pN) {
      super(pE, pN);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
