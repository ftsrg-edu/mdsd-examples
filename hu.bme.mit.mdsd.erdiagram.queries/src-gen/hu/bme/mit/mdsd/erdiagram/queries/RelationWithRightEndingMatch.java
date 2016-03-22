package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.RelationEnding;
import hu.bme.mit.mdsd.erdiagram.queries.util.RelationWithRightEndingQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.relationWithRightEnding pattern,
 * to be used in conjunction with {@link RelationWithRightEndingMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RelationWithRightEndingMatcher
 * @see RelationWithRightEndingProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RelationWithRightEndingMatch extends BasePatternMatch {
  private Relation fR;
  
  private RelationEnding fRre;
  
  private static List<String> parameterNames = makeImmutableList("r", "rre");
  
  private RelationWithRightEndingMatch(final Relation pR, final RelationEnding pRre) {
    this.fR = pR;
    this.fRre = pRre;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("r".equals(parameterName)) return this.fR;
    if ("rre".equals(parameterName)) return this.fRre;
    return null;
  }
  
  public Relation getR() {
    return this.fR;
  }
  
  public RelationEnding getRre() {
    return this.fRre;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("r".equals(parameterName) ) {
    	this.fR = (hu.bme.mit.mdsd.erdiagram.Relation) newValue;
    	return true;
    }
    if ("rre".equals(parameterName) ) {
    	this.fRre = (hu.bme.mit.mdsd.erdiagram.RelationEnding) newValue;
    	return true;
    }
    return false;
  }
  
  public void setR(final Relation pR) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fR = pR;
  }
  
  public void setRre(final RelationEnding pRre) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRre = pRre;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.relationWithRightEnding";
  }
  
  @Override
  public List<String> parameterNames() {
    return RelationWithRightEndingMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fR, fRre};
  }
  
  @Override
  public RelationWithRightEndingMatch toImmutable() {
    return isMutable() ? newMatch(fR, fRre) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"r\"=" + prettyPrintValue(fR) + ", ");
    
    result.append("\"rre\"=" + prettyPrintValue(fRre)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fR == null) ? 0 : fR.hashCode());
    result = prime * result + ((fRre == null) ? 0 : fRre.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RelationWithRightEndingMatch)) { // this should be infrequent
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
    RelationWithRightEndingMatch other = (RelationWithRightEndingMatch) obj;
    if (fR == null) {if (other.fR != null) return false;}
    else if (!fR.equals(other.fR)) return false;
    if (fRre == null) {if (other.fRre != null) return false;}
    else if (!fRre.equals(other.fRre)) return false;
    return true;
  }
  
  @Override
  public RelationWithRightEndingQuerySpecification specification() {
    try {
    	return RelationWithRightEndingQuerySpecification.instance();
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
  public static RelationWithRightEndingMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param pRre the fixed value of pattern parameter rre, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RelationWithRightEndingMatch newMutableMatch(final Relation pR, final RelationEnding pRre) {
    return new Mutable(pR, pRre);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pR the fixed value of pattern parameter r, or null if not bound.
   * @param pRre the fixed value of pattern parameter rre, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static RelationWithRightEndingMatch newMatch(final Relation pR, final RelationEnding pRre) {
    return new Immutable(pR, pRre);
  }
  
  private static final class Mutable extends RelationWithRightEndingMatch {
    Mutable(final Relation pR, final RelationEnding pRre) {
      super(pR, pRre);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RelationWithRightEndingMatch {
    Immutable(final Relation pR, final RelationEnding pRre) {
      super(pR, pRre);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
