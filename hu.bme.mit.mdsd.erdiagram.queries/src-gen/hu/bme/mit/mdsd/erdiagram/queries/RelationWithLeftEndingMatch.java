/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.RelationEnding;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithLeftEndingQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.relationWithLeftEnding pattern,
 * to be used in conjunction with {@link RelationWithLeftEndingMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RelationWithLeftEndingMatcher
 * @see RelationWithLeftEndingProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RelationWithLeftEndingMatch extends BasePatternMatch {
  private Relation fR;
  
  private RelationEnding fRle;
  
  private static List<String> parameterNames = makeImmutableList("r", "rle");
  
  private RelationWithLeftEndingMatch(final Relation pR, final RelationEnding pRle) {
    this.fR = pR;
    this.fRle = pRle;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("r".equals(parameterName)) return this.fR;
    if ("rle".equals(parameterName)) return this.fRle;
    return null;
  }
  
  public Relation getR() {
    return this.fR;
  }
  
  public RelationEnding getRle() {
    return this.fRle;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("r".equals(parameterName) ) {
    	this.fR = (Relation) newValue;
    	return true;
    }
    if ("rle".equals(parameterName) ) {
    	this.fRle = (RelationEnding) newValue;
    	return true;
    }
    return false;
  }
  
  public void setR(final Relation pR) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fR = pR;
  }
  
  public void setRle(final RelationEnding pRle) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRle = pRle;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.relationWithLeftEnding";
  }
  
  @Override
  public List<String> parameterNames() {
    return RelationWithLeftEndingMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fR, fRle};
  }
  
  @Override
  public RelationWithLeftEndingMatch toImmutable() {
    return isMutable() ? newMatch(fR, fRle) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"r\"=" + prettyPrintValue(fR) + ", ");
    
    result.append("\"rle\"=" + prettyPrintValue(fRle)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fR == null) ? 0 : fR.hashCode());
    result = prime * result + ((fRle == null) ? 0 : fRle.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RelationWithLeftEndingMatch)) { // this should be infrequent
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
    RelationWithLeftEndingMatch other = (RelationWithLeftEndingMatch) obj;
    if (fR == null) {if (other.fR != null) return false;}
    else if (!fR.equals(other.fR)) return false;
    if (fRle == null) {if (other.fRle != null) return false;}
    else if (!fRle.equals(other.fRle)) return false;
    return true;
  }
  
  @Override
  public RelationWithLeftEndingQuerySpecification specification() {
    try {
    	return RelationWithLeftEndingQuerySpecification.instance();
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
  public static RelationWithLeftEndingMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param pRle the fixed value of pattern parameter rle, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RelationWithLeftEndingMatch newMutableMatch(final Relation pR, final RelationEnding pRle) {
    return new Mutable(pR, pRle);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param pRle the fixed value of pattern parameter rle, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static RelationWithLeftEndingMatch newMatch(final Relation pR, final RelationEnding pRle) {
    return new Immutable(pR, pRle);
  }
  
  private static final class Mutable extends RelationWithLeftEndingMatch {
    Mutable(final Relation pR, final RelationEnding pRle) {
      super(pR, pRle);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RelationWithLeftEndingMatch {
    Immutable(final Relation pR, final RelationEnding pRle) {
      super(pR, pRle);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
