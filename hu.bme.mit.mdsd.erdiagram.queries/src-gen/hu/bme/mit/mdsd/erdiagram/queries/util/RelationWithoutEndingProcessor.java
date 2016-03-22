package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithoutEndingMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.relationWithoutEnding pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RelationWithoutEndingProcessor implements IMatchProcessor<RelationWithoutEndingMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pR the value of pattern parameter r in the currently processed match
   * 
   */
  public abstract void process(final Relation pR);
  
  @Override
  public void process(final RelationWithoutEndingMatch match) {
    process(match.getR());
  }
}
