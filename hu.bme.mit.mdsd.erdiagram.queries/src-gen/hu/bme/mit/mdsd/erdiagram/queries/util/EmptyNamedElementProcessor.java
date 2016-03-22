package hu.bme.mit.mdsd.erdiagram.queries.util;

import hu.bme.mit.mdsd.erdiagram.NamedElement;
import hu.bme.mit.mdsd.erdiagram.queries.EmptyNamedElementMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.erdiagram.queries.emptyNamedElement pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EmptyNamedElementProcessor implements IMatchProcessor<EmptyNamedElementMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pNamedElement the value of pattern parameter namedElement in the currently processed match
   * 
   */
  public abstract void process(final NamedElement pNamedElement);
  
  @Override
  public void process(final EmptyNamedElementMatch match) {
    process(match.getNamedElement());
  }
}
