/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/queries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.queries.SameNamedEntitiesMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.sameNamedEntities pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SameNamedEntitiesProcessor implements IMatchProcessor<SameNamedEntitiesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEntity1 the value of pattern parameter entity1 in the currently processed match
   * @param pEntity2 the value of pattern parameter entity2 in the currently processed match
   * @param pCommonName the value of pattern parameter commonName in the currently processed match
   * 
   */
  public abstract void process(final Entity pEntity1, final Entity pEntity2, final String pCommonName);
  
  @Override
  public void process(final SameNamedEntitiesMatch match) {
    process(match.getEntity1(), match.getEntity2(), match.getCommonName());
  }
}
