package hu.bme.mit.mdsd.m2m2c;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

import hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram;

public class M2M2CExecutor {

	@Test
	public void execute() throws IOException {
		ResourceSetImpl resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI("My.erdiagram"), true);
		EntityRelationDiagram erd =	(EntityRelationDiagram) resource.getContents().get(0);
		ErdToRdbBatchTransformation m2m = new ErdToRdbBatchTransformation(erd);
		
		m2m.doTransformation();

		resSet = new ResourceSetImpl();
		Resource rdbResource = resSet.createResource(URI.createURI("drivenVehiclesRegistry.generated.rdb"));
		rdbResource.getContents().add(m2m.getRdb());
		rdbResource.save(null);
		
		RdbToSqlGenerator m2c = new RdbToSqlGenerator(m2m.getRdb());
		m2c.generateSql();
	}
}
