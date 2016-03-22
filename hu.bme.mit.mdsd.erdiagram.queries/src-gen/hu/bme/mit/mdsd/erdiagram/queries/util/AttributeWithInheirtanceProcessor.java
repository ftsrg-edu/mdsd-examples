package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.AttributeWithInheirtanceMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.attributeWithInheirtance pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AttributeWithInheirtanceProcessor implements IMatchProcessor<AttributeWithInheirtanceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEntity the value of pattern parameter entity in the currently processed match
   * @param pAttribute the value of pattern parameter attribute in the currently processed match
   * 
   */
  public abstract void process(final Entity pEntity, final Attribute pAttribute);
  
  @Override
  public void process(final AttributeWithInheirtanceMatch match) {
    process(match.getEntity(), match.getAttribute());
  }
}
