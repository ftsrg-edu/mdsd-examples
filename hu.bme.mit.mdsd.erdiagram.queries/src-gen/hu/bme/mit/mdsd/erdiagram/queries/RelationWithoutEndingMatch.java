/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithoutEndingQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.relationWithoutEnding pattern,
 * to be used in conjunction with {@link RelationWithoutEndingMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RelationWithoutEndingMatcher
 * @see RelationWithoutEndingProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RelationWithoutEndingMatch extends BasePatternMatch {
  private Relation fR;
  
  private static List<String> parameterNames = makeImmutableList("r");
  
  private RelationWithoutEndingMatch(final Relation pR) {
    this.fR = pR;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("r".equals(parameterName)) return this.fR;
    return null;
  }
  
  public Relation getR() {
    return this.fR;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("r".equals(parameterName) ) {
    	this.fR = (Relation) newValue;
    	return true;
    }
    return false;
  }
  
  public void setR(final Relation pR) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fR = pR;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.relationWithoutEnding";
  }
  
  @Override
  public List<String> parameterNames() {
    return RelationWithoutEndingMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fR};
  }
  
  @Override
  public RelationWithoutEndingMatch toImmutable() {
    return isMutable() ? newMatch(fR) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"r\"=" + prettyPrintValue(fR)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fR == null) ? 0 : fR.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RelationWithoutEndingMatch)) { // this should be infrequent
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
    RelationWithoutEndingMatch other = (RelationWithoutEndingMatch) obj;
    if (fR == null) {if (other.fR != null) return false;}
    else if (!fR.equals(other.fR)) return false;
    return true;
  }
  
  @Override
  public RelationWithoutEndingQuerySpecification specification() {
    try {
    	return RelationWithoutEndingQuerySpecification.instance();
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
  public static RelationWithoutEndingMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RelationWithoutEndingMatch newMutableMatch(final Relation pR) {
    return new Mutable(pR);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static RelationWithoutEndingMatch newMatch(final Relation pR) {
    return new Immutable(pR);
  }
  
  private static final class Mutable extends RelationWithoutEndingMatch {
    Mutable(final Relation pR) {
      super(pR);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RelationWithoutEndingMatch {
    Immutable(final Relation pR) {
      super(pR);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
