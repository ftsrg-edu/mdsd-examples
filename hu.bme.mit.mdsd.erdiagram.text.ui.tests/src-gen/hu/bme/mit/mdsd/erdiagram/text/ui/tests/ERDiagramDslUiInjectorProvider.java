/*
 * generated by Xtext 2.9.1
 */
package hu.bme.mit.mdsd.erdiagram.text.ui.tests;

import com.google.inject.Injector;
import hu.bme.mit.mdsd.erdiagram.text.ui.internal.TextActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class ERDiagramDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TextActivator.getInstance().getInjector("hu.bme.mit.mdsd.erdiagram.text.ERDiagramDsl");
	}

}
