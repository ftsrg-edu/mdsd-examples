/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.BadEntityMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.badEntity pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class BadEntityProcessor implements IMatchProcessor<BadEntityMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEntity the value of pattern parameter entity in the currently processed match
   * 
   */
  public abstract void process(final Entity pEntity);
  
  @Override
  public void process(final BadEntityMatch match) {
    process(match.getEntity());
  }
}
