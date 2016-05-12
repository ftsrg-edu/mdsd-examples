package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.queries.RelationMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.relation pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RelationProcessor implements IMatchProcessor<RelationMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pR the value of pattern parameter r in the currently processed match
   * 
   */
  public abstract void process(final Relation pR);
  
  @Override
  public void process(final RelationMatch match) {
    process(match.getR());
  }
}
