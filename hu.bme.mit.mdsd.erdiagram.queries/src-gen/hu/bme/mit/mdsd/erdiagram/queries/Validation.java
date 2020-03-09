/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/validation.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.queries.DuplicateAttributeName;
import hu.bme.mit.mdsd.erdiagram.queries.EntityWithoutKey;
import hu.bme.mit.mdsd.erdiagram.queries.IsaConflictsWithKey;
import hu.bme.mit.mdsd.erdiagram.queries.KeyAttributes;
import hu.bme.mit.mdsd.erdiagram.queries.Unnamed;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in validation.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file validation.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.mdsd.erdiagram.queries, the group contains the definition of the following patterns: <ul>
 * <li>entityWithoutKey</li>
 * <li>isaConflictsWithKey</li>
 * <li>unnamed</li>
 * <li>duplicateAttributeName</li>
 * <li>keyAttributes</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Validation extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Validation instance() {
    if (INSTANCE == null) {
        INSTANCE = new Validation();
    }
    return INSTANCE;
  }
  
  private static Validation INSTANCE;
  
  private Validation() {
    querySpecifications.add(EntityWithoutKey.instance());
    querySpecifications.add(IsaConflictsWithKey.instance());
    querySpecifications.add(Unnamed.instance());
    querySpecifications.add(DuplicateAttributeName.instance());
    querySpecifications.add(KeyAttributes.instance());
  }
  
  public EntityWithoutKey getEntityWithoutKey() {
    return EntityWithoutKey.instance();
  }
  
  public EntityWithoutKey.Matcher getEntityWithoutKey(final ViatraQueryEngine engine) {
    return EntityWithoutKey.Matcher.on(engine);
  }
  
  public IsaConflictsWithKey getIsaConflictsWithKey() {
    return IsaConflictsWithKey.instance();
  }
  
  public IsaConflictsWithKey.Matcher getIsaConflictsWithKey(final ViatraQueryEngine engine) {
    return IsaConflictsWithKey.Matcher.on(engine);
  }
  
  public Unnamed getUnnamed() {
    return Unnamed.instance();
  }
  
  public Unnamed.Matcher getUnnamed(final ViatraQueryEngine engine) {
    return Unnamed.Matcher.on(engine);
  }
  
  public DuplicateAttributeName getDuplicateAttributeName() {
    return DuplicateAttributeName.instance();
  }
  
  public DuplicateAttributeName.Matcher getDuplicateAttributeName(final ViatraQueryEngine engine) {
    return DuplicateAttributeName.Matcher.on(engine);
  }
  
  public KeyAttributes getKeyAttributes() {
    return KeyAttributes.instance();
  }
  
  public KeyAttributes.Matcher getKeyAttributes(final ViatraQueryEngine engine) {
    return KeyAttributes.Matcher.on(engine);
  }
}
