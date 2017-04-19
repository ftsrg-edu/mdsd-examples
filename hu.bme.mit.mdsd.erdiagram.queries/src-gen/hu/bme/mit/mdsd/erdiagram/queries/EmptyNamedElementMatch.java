/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.NamedElement;
import hu.bme.mit.mdsd.erdiagram.queries.util.EmptyNamedElementQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.emptyNamedElement pattern,
 * to be used in conjunction with {@link EmptyNamedElementMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EmptyNamedElementMatcher
 * @see EmptyNamedElementProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EmptyNamedElementMatch extends BasePatternMatch {
  private NamedElement fNamedElement;
  
  private static List<String> parameterNames = makeImmutableList("namedElement");
  
  private EmptyNamedElementMatch(final NamedElement pNamedElement) {
    this.fNamedElement = pNamedElement;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("namedElement".equals(parameterName)) return this.fNamedElement;
    return null;
  }
  
  public NamedElement getNamedElement() {
    return this.fNamedElement;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("namedElement".equals(parameterName) ) {
    	this.fNamedElement = (NamedElement) newValue;
    	return true;
    }
    return false;
  }
  
  public void setNamedElement(final NamedElement pNamedElement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fNamedElement = pNamedElement;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.emptyNamedElement";
  }
  
  @Override
  public List<String> parameterNames() {
    return EmptyNamedElementMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fNamedElement};
  }
  
  @Override
  public EmptyNamedElementMatch toImmutable() {
    return isMutable() ? newMatch(fNamedElement) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"namedElement\"=" + prettyPrintValue(fNamedElement)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fNamedElement == null) ? 0 : fNamedElement.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EmptyNamedElementMatch)) { // this should be infrequent
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
    EmptyNamedElementMatch other = (EmptyNamedElementMatch) obj;
    if (fNamedElement == null) {if (other.fNamedElement != null) return false;}
    else if (!fNamedElement.equals(other.fNamedElement)) return false;
    return true;
  }
  
  @Override
  public EmptyNamedElementQuerySpecification specification() {
    try {
    	return EmptyNamedElementQuerySpecification.instance();
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
  public static EmptyNamedElementMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EmptyNamedElementMatch newMutableMatch(final NamedElement pNamedElement) {
    return new Mutable(pNamedElement);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EmptyNamedElementMatch newMatch(final NamedElement pNamedElement) {
    return new Immutable(pNamedElement);
  }
  
  private static final class Mutable extends EmptyNamedElementMatch {
    Mutable(final NamedElement pNamedElement) {
      super(pNamedElement);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EmptyNamedElementMatch {
    Immutable(final NamedElement pNamedElement) {
      super(pNamedElement);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
