package hu.bme.mit.mdsd.m2m2c.ui;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram;
import hu.bme.mit.mdsd.m2m2c.util.EditingDomainHelperUtility;
import hu.bme.mit.mdsd.rdb.RdbFactory;
import hu.bme.mit.mdsd.rdb.RelationalDataBase;
import trace.TraceFactory;
import trace.TraceRoot;

public class TransformHandlerPrepare extends AbstractHandler implements IHandler {
	
	private RdbFactory rdbPackage = RdbFactory.eINSTANCE;
	private TraceFactory tracePackage = TraceFactory.eINSTANCE;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);

        Object object = (EntityRelationDiagram) selection.getFirstElement();

        if(object instanceof EntityRelationDiagram) {
        	System.out.println("That was an ERD");
        	EntityRelationDiagram erd = (EntityRelationDiagram) object;        	
        	
        	Resource rdbResource = getOrCreateResource("rdb", erd);
        	Resource traceResource = getOrCreateResource("trace", erd);

        	TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(erd);
        	
        	EditingDomainHelperUtility.runWithTransaction(editingDomain, 
        			() -> prepareResources(rdbResource, traceResource, erd));
        } else {
        	System.out.println("That was NOT an ERD");
        }

        return null;
    }
    
    public void prepareResources(Resource rdbResource, Resource traceResource, EntityRelationDiagram erd) {  
    	rdbResource.getContents().clear();
    	traceResource.getContents().clear();
    	
    	RelationalDataBase rdb = rdbPackage.createRelationalDataBase();        	
    	rdbResource.getContents().add(rdb);
    	
    	TraceRoot traceRoot = tracePackage.createTraceRoot();
    	traceRoot.setErdiagramRoot(erd);
    	traceRoot.setRdbRoot(rdb);
    	traceResource.getContents().add(traceRoot);
    	
    	try {
			rdbResource.save(null);
			traceResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
    
    private Resource getOrCreateResource(String fileExtension, EntityRelationDiagram erd) {
		URI resourceURI = erd.eResource().getURI().trimFileExtension().appendFileExtension(fileExtension);
		ResourceSet resSet = erd.eResource().getResourceSet();
		Resource resource = null;
		try {
			// try to load existing resource 
			resource = resSet.getResource(resourceURI, true);
		} catch (RuntimeException e) {
			// loading failed, i.e. file does not exists... 
			// no problem, use the Resource, file will be created on save
			resource = resSet.getResource(resourceURI, false);
		}
		return resource;
	}
}
