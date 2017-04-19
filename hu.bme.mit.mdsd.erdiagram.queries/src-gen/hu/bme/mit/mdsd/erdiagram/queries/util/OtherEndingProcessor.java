/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.RelationEnding;
import hu.bme.mit.mdsd.erdiagram.queries.OtherEndingMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.otherEnding pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class OtherEndingProcessor implements IMatchProcessor<OtherEndingMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEnding the value of pattern parameter ending in the currently processed match
   * @param pOther the value of pattern parameter other in the currently processed match
   * 
   */
  public abstract void process(final RelationEnding pEnding, final RelationEnding pOther);
  
  @Override
  public void process(final OtherEndingMatch match) {
    process(match.getEnding(), match.getOther());
  }
}
