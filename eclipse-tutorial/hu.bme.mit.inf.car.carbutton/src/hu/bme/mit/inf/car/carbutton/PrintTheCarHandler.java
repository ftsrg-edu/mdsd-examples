package hu.bme.mit.inf.car.carbutton;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.jface.dialogs.MessageDialog;

public class PrintTheCarHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//showMessage(CarFleetPrinter.getCarManifest());
		return null;
	}
	
	/**
	 * Static method that shows a message to the user.
	 * @param errorMessage
	 */
	public static void showMessage(String message) {
		MessageDialog messageDialog = new MessageDialog(
			null,
			"Car info",
			null,
			message,
			MessageDialog.INFORMATION,
			new String[]{"Ok"}, 0);
		messageDialog.open();
	}
}
