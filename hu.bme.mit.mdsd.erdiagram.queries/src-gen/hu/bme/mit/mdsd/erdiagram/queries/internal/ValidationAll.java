/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/validation.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.internal;

import hu.bme.mit.mdsd.erdiagram.queries.DuplicateAttributeName;
import hu.bme.mit.mdsd.erdiagram.queries.EntityWithoutKey;
import hu.bme.mit.mdsd.erdiagram.queries.IsaConflictsWithKey;
import hu.bme.mit.mdsd.erdiagram.queries.KeyAttributes;
import hu.bme.mit.mdsd.erdiagram.queries.Unnamed;
import hu.bme.mit.mdsd.erdiagram.queries.internal.EntityAttributeName;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in validation.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package hu.bme.mit.mdsd.erdiagram.queries, the group contains the definition of the following patterns: <ul>
 * <li>entityWithoutKey</li>
 * <li>isaConflictsWithKey</li>
 * <li>unnamed</li>
 * <li>duplicateAttributeName</li>
 * <li>entityAttributeName</li>
 * <li>keyAttributes</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class ValidationAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ValidationAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new ValidationAll();
    }
    return INSTANCE;
  }
  
  private static ValidationAll INSTANCE;
  
  private ValidationAll() {
    querySpecifications.add(EntityWithoutKey.instance());
    querySpecifications.add(IsaConflictsWithKey.instance());
    querySpecifications.add(Unnamed.instance());
    querySpecifications.add(DuplicateAttributeName.instance());
    querySpecifications.add(EntityAttributeName.instance());
    querySpecifications.add(KeyAttributes.instance());
  }
}
