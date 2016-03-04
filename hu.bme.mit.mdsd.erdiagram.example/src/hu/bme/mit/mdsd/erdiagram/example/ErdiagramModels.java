package hu.bme.mit.mdsd.erdiagram.example;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.AttributeType;
import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram;
import hu.bme.mit.mdsd.erdiagram.ErdiagramFactory;
import hu.bme.mit.mdsd.erdiagram.ErdiagramPackage;

public class ErdiagramModels {

	public EntityRelationDiagram createModel() {

		ErdiagramFactory factory = ErdiagramFactory.eINSTANCE;
		EntityRelationDiagram diagram = factory.createEntityRelationDiagram();

		Entity person = factory.createEntity();
		person.setName("Person");

		Attribute name = factory.createAttribute();
		name.setName("Nickname");
		name.setType(AttributeType.STRING);

		person.getAttributes().add(name);
		diagram.getEntities().add(person);

		return diagram;
	}

	public void printErdiagram(EntityRelationDiagram erdiagram) {
		for (Entity entity : erdiagram.getEntities()) {
			System.out.println(entity.getName());
		}
	}

	public void init() {
		// For the initialisation of the model.
		// Without this the following error happens:
		// "Package with uri 'hu.bme.mit.mdsd.erdiagram' not found."
		ErdiagramPackage.eINSTANCE.eClass();

		// Defining that the files with the .erdiagram extension should be
		// parsed as an xmi.
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("erdiagram", new XMIResourceFactoryImpl());
	}

	public Resource createResource(URI uri) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(uri);
		return resource;
	}

	public Resource loadResource(URI uri) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri, true);
		return resource;
	}

	public void saveResource(Resource resource) {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			System.out.println("The following error occurred during saving the resource: " + e.getMessage());
		}
	}

	public EntityRelationDiagram getModelFromResource(Resource resource) {
		// check the content in production code!
		EntityRelationDiagram root = (EntityRelationDiagram) resource.getContents().get(0);
		return root;
	}

	public static void main(String[] args) {
		// init
		ErdiagramModels erdiagramModels = new ErdiagramModels();
		erdiagramModels.init();
		// create
		EntityRelationDiagram model = erdiagramModels.createModel();
		// save
		URI uri = URI.createFileURI("C:/Users/meres/Desktop/samplemodel.erdiagram");
		Resource resource = erdiagramModels.createResource(uri);
		resource.getContents().add(model);
		erdiagramModels.saveResource(resource);
		// load to a different resource
		Resource resource2 = erdiagramModels.loadResource(uri);
		EntityRelationDiagram model2 = erdiagramModels.getModelFromResource(resource2);
		// print
		erdiagramModels.printErdiagram(model2);
	}

}
