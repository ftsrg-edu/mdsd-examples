package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.SuperEntityMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.superEntity pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SuperEntityProcessor implements IMatchProcessor<SuperEntityMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pE the value of pattern parameter e in the currently processed match
   * @param pSuperEntity the value of pattern parameter superEntity in the currently processed match
   * 
   */
  public abstract void process(final Entity pE, final Entity pSuperEntity);
  
  @Override
  public void process(final SuperEntityMatch match) {
    process(match.getE(), match.getSuperEntity());
  }
}
