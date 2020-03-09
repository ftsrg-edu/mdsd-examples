/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries/src/hu/bme/mit/mdsd/erdiagram/queries/qbf.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries;

import hu.bme.mit.mdsd.erdiagram.queries.EndingLabel;
import hu.bme.mit.mdsd.erdiagram.queries.NameLabel;
import hu.bme.mit.mdsd.erdiagram.queries.TypeLabel;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in qbf.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file qbf.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.mdsd.erdiagram.queries, the group contains the definition of the following patterns: <ul>
 * <li>endingLabel</li>
 * <li>nameLabel</li>
 * <li>typeLabel</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Qbf extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Qbf instance() {
    if (INSTANCE == null) {
        INSTANCE = new Qbf();
    }
    return INSTANCE;
  }
  
  private static Qbf INSTANCE;
  
  private Qbf() {
    querySpecifications.add(EndingLabel.instance());
    querySpecifications.add(NameLabel.instance());
    querySpecifications.add(TypeLabel.instance());
  }
  
  public EndingLabel getEndingLabel() {
    return EndingLabel.instance();
  }
  
  public EndingLabel.Matcher getEndingLabel(final ViatraQueryEngine engine) {
    return EndingLabel.Matcher.on(engine);
  }
  
  public NameLabel getNameLabel() {
    return NameLabel.instance();
  }
  
  public NameLabel.Matcher getNameLabel(final ViatraQueryEngine engine) {
    return NameLabel.Matcher.on(engine);
  }
  
  public TypeLabel getTypeLabel() {
    return TypeLabel.instance();
  }
  
  public TypeLabel.Matcher getTypeLabel(final ViatraQueryEngine engine) {
    return TypeLabel.Matcher.on(engine);
  }
}
