package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.HasBiggerNameMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.hasBiggerName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class HasBiggerNameProcessor implements IMatchProcessor<HasBiggerNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pE1 the value of pattern parameter e1 in the currently processed match
   * @param pE2 the value of pattern parameter e2 in the currently processed match
   * 
   */
  public abstract void process(final Entity pE1, final Entity pE2);
  
  @Override
  public void process(final HasBiggerNameMatch match) {
    process(match.getE1(), match.getE2());
  }
}
