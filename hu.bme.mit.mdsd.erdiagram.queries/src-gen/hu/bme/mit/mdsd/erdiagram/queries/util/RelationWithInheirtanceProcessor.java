package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.RelationWithInheirtanceMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.relationWithInheirtance pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RelationWithInheirtanceProcessor implements IMatchProcessor<RelationWithInheirtanceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEntity1 the value of pattern parameter entity1 in the currently processed match
   * @param pEntity2 the value of pattern parameter entity2 in the currently processed match
   * 
   */
  public abstract void process(final Entity pEntity1, final Entity pEntity2);
  
  @Override
  public void process(final RelationWithInheirtanceMatch match) {
    process(match.getEntity1(), match.getEntity2());
  }
}
