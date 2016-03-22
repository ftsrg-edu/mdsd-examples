package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.EntityMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.entity pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EntityProcessor implements IMatchProcessor<EntityMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pE the value of pattern parameter e in the currently processed match
   * 
   */
  public abstract void process(final Entity pE);
  
  @Override
  public void process(final EntityMatch match) {
    process(match.getE());
  }
}
