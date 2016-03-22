package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.entity pattern,
 * to be used in conjunction with {@link EntityMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EntityMatcher
 * @see EntityProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EntityMatch extends BasePatternMatch {
  private Entity fE;
  
  private static List<String> parameterNames = makeImmutableList("e");
  
  private EntityMatch(final Entity pE) {
    this.fE = pE;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("e".equals(parameterName)) return this.fE;
    return null;
  }
  
  public Entity getE() {
    return this.fE;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("e".equals(parameterName) ) {
    	this.fE = (hu.bme.mit.mdsd.erdiagram.Entity) newValue;
    	return true;
    }
    return false;
  }
  
  public void setE(final Entity pE) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fE = pE;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.entity";
  }
  
  @Override
  public List<String> parameterNames() {
    return EntityMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fE};
  }
  
  @Override
  public EntityMatch toImmutable() {
    return isMutable() ? newMatch(fE) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"e\"=" + prettyPrintValue(fE)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fE == null) ? 0 : fE.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EntityMatch)) { // this should be infrequent
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
    EntityMatch other = (EntityMatch) obj;
    if (fE == null) {if (other.fE != null) return false;}
    else if (!fE.equals(other.fE)) return false;
    return true;
  }
  
  @Override
  public EntityQuerySpecification specification() {
    try {
    	return EntityQuerySpecification.instance();
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
  public static EntityMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EntityMatch newMutableMatch(final Entity pE) {
    return new Mutable(pE);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EntityMatch newMatch(final Entity pE) {
    return new Immutable(pE);
  }
  
  private static final class Mutable extends EntityMatch {
    Mutable(final Entity pE) {
      super(pE);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EntityMatch {
    Immutable(final Entity pE) {
      super(pE);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
