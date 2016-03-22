package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.EntityStartsWithSmallCaseMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.entityStartsWithSmallCase pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EntityStartsWithSmallCaseProcessor implements IMatchProcessor<EntityStartsWithSmallCaseMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEntity the value of pattern parameter entity in the currently processed match
   * 
   */
  public abstract void process(final Entity pEntity);
  
  @Override
  public void process(final EntityStartsWithSmallCaseMatch match) {
    process(match.getEntity());
  }
}
