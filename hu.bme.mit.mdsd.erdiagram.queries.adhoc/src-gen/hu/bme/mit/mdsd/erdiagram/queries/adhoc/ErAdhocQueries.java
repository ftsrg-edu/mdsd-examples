/**
 * Generated from platform:/resource/hu.bme.mit.mdsd.erdiagram.queries.adhoc/src/hu/bme/mit/mdsd/erdiagram/queries/adhoc/erAdhocQueries.vql
 */
package hu.bme.mit.mdsd.erdiagram.queries.adhoc;

import hu.bme.mit.mdsd.erdiagram.queries.adhoc.EndingForeignKey;
import hu.bme.mit.mdsd.erdiagram.queries.adhoc.SwitchTable;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in erAdhocQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file erAdhocQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.mdsd.erdiagram.queries.adhoc, the group contains the definition of the following patterns: <ul>
 * <li>switchTable</li>
 * <li>endingForeignKey</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class ErAdhocQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ErAdhocQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new ErAdhocQueries();
    }
    return INSTANCE;
  }
  
  private static ErAdhocQueries INSTANCE;
  
  private ErAdhocQueries() {
    querySpecifications.add(SwitchTable.instance());
    querySpecifications.add(EndingForeignKey.instance());
  }
  
  public SwitchTable getSwitchTable() {
    return SwitchTable.instance();
  }
  
  public SwitchTable.Matcher getSwitchTable(final ViatraQueryEngine engine) {
    return SwitchTable.Matcher.on(engine);
  }
  
  public EndingForeignKey getEndingForeignKey() {
    return EndingForeignKey.instance();
  }
  
  public EndingForeignKey.Matcher getEndingForeignKey(final ViatraQueryEngine engine) {
    return EndingForeignKey.Matcher.on(engine);
  }
}
