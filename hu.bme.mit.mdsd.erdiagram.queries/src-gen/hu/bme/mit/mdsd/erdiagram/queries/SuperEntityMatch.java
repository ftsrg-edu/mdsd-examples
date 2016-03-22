package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.util.SuperEntityQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.erdiagram.queries.superEntity pattern,
 * to be used in conjunction with {@link SuperEntityMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SuperEntityMatcher
 * @see SuperEntityProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SuperEntityMatch extends BasePatternMatch {
  private Entity fE;
  
  private Entity fSuperEntity;
  
  private static List<String> parameterNames = makeImmutableList("e", "superEntity");
  
  private SuperEntityMatch(final Entity pE, final Entity pSuperEntity) {
    this.fE = pE;
    this.fSuperEntity = pSuperEntity;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("e".equals(parameterName)) return this.fE;
    if ("superEntity".equals(parameterName)) return this.fSuperEntity;
    return null;
  }
  
  public Entity getE() {
    return this.fE;
  }
  
  public Entity getSuperEntity() {
    return this.fSuperEntity;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("e".equals(parameterName) ) {
    	this.fE = (hu.bme.mit.mdsd.erdiagram.Entity) newValue;
    	return true;
    }
    if ("superEntity".equals(parameterName) ) {
    	this.fSuperEntity = (hu.bme.mit.mdsd.erdiagram.Entity) newValue;
    	return true;
    }
    return false;
  }
  
  public void setE(final Entity pE) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fE = pE;
  }
  
  public void setSuperEntity(final Entity pSuperEntity) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSuperEntity = pSuperEntity;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.erdiagram.queries.superEntity";
  }
  
  @Override
  public List<String> parameterNames() {
    return SuperEntityMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fE, fSuperEntity};
  }
  
  @Override
  public SuperEntityMatch toImmutable() {
    return isMutable() ? newMatch(fE, fSuperEntity) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"e\"=" + prettyPrintValue(fE) + ", ");
    
    result.append("\"superEntity\"=" + prettyPrintValue(fSuperEntity)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fE == null) ? 0 : fE.hashCode());
    result = prime * result + ((fSuperEntity == null) ? 0 : fSuperEntity.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SuperEntityMatch)) { // this should be infrequent
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
    SuperEntityMatch other = (SuperEntityMatch) obj;
    if (fE == null) {if (other.fE != null) return false;}
    else if (!fE.equals(other.fE)) return false;
    if (fSuperEntity == null) {if (other.fSuperEntity != null) return false;}
    else if (!fSuperEntity.equals(other.fSuperEntity)) return false;
    return true;
  }
  
  @Override
  public SuperEntityQuerySpecification specification() {
    try {
    	return SuperEntityQuerySpecification.instance();
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
  public static SuperEntityMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pSuperEntity the fixed value of pattern parameter superEntity, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SuperEntityMatch newMutableMatch(final Entity pE, final Entity pSuperEntity) {
    return new Mutable(pE, pSuperEntity);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pE the fixed value of pattern parameter e, or null if not bound.
   * @param pSuperEntity the fixed value of pattern parameter superEntity, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SuperEntityMatch newMatch(final Entity pE, final Entity pSuperEntity) {
    return new Immutable(pE, pSuperEntity);
  }
  
  private static final class Mutable extends SuperEntityMatch {
    Mutable(final Entity pE, final Entity pSuperEntity) {
      super(pE, pSuperEntity);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SuperEntityMatch {
    Immutable(final Entity pE, final Entity pSuperEntity) {
      super(pE, pSuperEntity);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
