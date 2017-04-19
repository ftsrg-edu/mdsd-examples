/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.DiamondInTypeHierarchyMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.diamondInTypeHierarchy pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DiamondInTypeHierarchyProcessor implements IMatchProcessor<DiamondInTypeHierarchyMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEntity1 the value of pattern parameter entity1 in the currently processed match
   * @param pEntity2 the value of pattern parameter entity2 in the currently processed match
   * @param pEntity3 the value of pattern parameter entity3 in the currently processed match
   * @param pEntity4 the value of pattern parameter entity4 in the currently processed match
   * 
   */
  public abstract void process(final Entity pEntity1, final Entity pEntity2, final Entity pEntity3, final Entity pEntity4);
  
  @Override
  public void process(final DiamondInTypeHierarchyMatch match) {
    process(match.getEntity1(), match.getEntity2(), match.getEntity3(), match.getEntity4());
  }
}
