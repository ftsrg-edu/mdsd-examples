/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.RelationEnding;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithRightEndingMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.relationWithRightEnding pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RelationWithRightEndingProcessor implements IMatchProcessor<RelationWithRightEndingMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pR the value of pattern parameter r in the currently processed match
   * @param pRre the value of pattern parameter rre in the currently processed match
   * 
   */
  public abstract void process(final Relation pR, final RelationEnding pRre);
  
  @Override
  public void process(final RelationWithRightEndingMatch match) {
    process(match.getR(), match.getRre());
  }
}
