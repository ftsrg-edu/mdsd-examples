package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.RelationEnding;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithLeftEndingMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.relationWithLeftEnding pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RelationWithLeftEndingProcessor implements IMatchProcessor<RelationWithLeftEndingMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pR the value of pattern parameter r in the currently processed match
   * @param pRle the value of pattern parameter rle in the currently processed match
   * 
   */
  public abstract void process(final Relation pR, final RelationEnding pRle);
  
  @Override
  public void process(final RelationWithLeftEndingMatch match) {
    process(match.getR(), match.getRle());
  }
}
