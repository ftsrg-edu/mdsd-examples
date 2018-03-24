package hu.bme.mit.mdsd.erdiagram.text.erdreader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import hu.bme.mit.mdsd.erdiagram.text.ERDiagramDslStandaloneSetup;
import hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagram;

public class ERDReader {

	public static void main(String[] args) {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new ERDiagramDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(
		URI.createURI("model/example.er"), true);

		ERDiagram erDiagram = (ERDiagram) resource.getContents().get(0);
		System.out.println(erDiagram);
		erDiagram.getEntities().forEach(System.out::println);
	}

}
