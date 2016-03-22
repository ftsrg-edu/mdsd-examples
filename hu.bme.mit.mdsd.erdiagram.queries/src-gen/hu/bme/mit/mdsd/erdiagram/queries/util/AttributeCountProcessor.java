package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.AttributeCountMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.attributeCount pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AttributeCountProcessor implements IMatchProcessor<AttributeCountMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pE the value of pattern parameter e in the currently processed match
   * @param pN the value of pattern parameter N in the currently processed match
   * 
   */
  public abstract void process(final Entity pE, final Integer pN);
  
  @Override
  public void process(final AttributeCountMatch match) {
    process(match.getE(), match.getN());
  }
}
