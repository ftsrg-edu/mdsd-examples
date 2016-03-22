package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.RelationEnding;
import hu.bme.mit.mdsd.erdiagram.queries.util.OtherEndingQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.otherEnding pattern,
 * to be used in conjunction with {@link OtherEndingMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see OtherEndingMatcher
 * @see OtherEndingProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class OtherEndingMatch extends BasePatternMatch {
  private RelationEnding fEnding;
  
  private RelationEnding fOther;
  
  private static List<String> parameterNames = makeImmutableList("ending", "other");
  
  private OtherEndingMatch(final RelationEnding pEnding, final RelationEnding pOther) {
    this.fEnding = pEnding;
    this.fOther = pOther;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ending".equals(parameterName)) return this.fEnding;
    if ("other".equals(parameterName)) return this.fOther;
    return null;
  }
  
  public RelationEnding getEnding() {
    return this.fEnding;
  }
  
  public RelationEnding getOther() {
    return this.fOther;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("ending".equals(parameterName) ) {
    	this.fEnding = (hu.bme.mit.mdsd.erdiagram.RelationEnding) newValue;
    	return true;
    }
    if ("other".equals(parameterName) ) {
    	this.fOther = (hu.bme.mit.mdsd.erdiagram.RelationEnding) newValue;
    	return true;
    }
    return false;
  }
  
  public void setEnding(final RelationEnding pEnding) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEnding = pEnding;
  }
  
  public void setOther(final RelationEnding pOther) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOther = pOther;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.otherEnding";
  }
  
  @Override
  public List<String> parameterNames() {
    return OtherEndingMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEnding, fOther};
  }
  
  @Override
  public OtherEndingMatch toImmutable() {
    return isMutable() ? newMatch(fEnding, fOther) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ending\"=" + prettyPrintValue(fEnding) + ", ");
    
    result.append("\"other\"=" + prettyPrintValue(fOther)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEnding == null) ? 0 : fEnding.hashCode());
    result = prime * result + ((fOther == null) ? 0 : fOther.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof OtherEndingMatch)) { // this should be infrequent
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
    OtherEndingMatch other = (OtherEndingMatch) obj;
    if (fEnding == null) {if (other.fEnding != null) return false;}
    else if (!fEnding.equals(other.fEnding)) return false;
    if (fOther == null) {if (other.fOther != null) return false;}
    else if (!fOther.equals(other.fOther)) return false;
    return true;
  }
  
  @Override
  public OtherEndingQuerySpecification specification() {
    try {
    	return OtherEndingQuerySpecification.instance();
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
  public static OtherEndingMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
   * @param pOther the fixed value of pattern parameter other, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static OtherEndingMatch newMutableMatch(final RelationEnding pEnding, final RelationEnding pOther) {
    return new Mutable(pEnding, pOther);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEnding the fixed value of pattern parameter ending, or null if not bound.
   * @param pOther the fixed value of pattern parameter other, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static OtherEndingMatch newMatch(final RelationEnding pEnding, final RelationEnding pOther) {
    return new Immutable(pEnding, pOther);
  }
  
  private static final class Mutable extends OtherEndingMatch {
    Mutable(final RelationEnding pEnding, final RelationEnding pOther) {
      super(pEnding, pOther);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends OtherEndingMatch {
    Immutable(final RelationEnding pEnding, final RelationEnding pOther) {
      super(pEnding, pOther);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
