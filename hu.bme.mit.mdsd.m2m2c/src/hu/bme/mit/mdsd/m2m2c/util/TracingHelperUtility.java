package hu.bme.mit.mdsd.m2m2c.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;

import hu.bme.mit.mdsd.erdiagram.NamedElement;
import trace.Trace;
import trace.TracePackage;
import trace.TraceRoot;

public class TracingHelperUtility {

	static TracePackage tracePackage = TracePackage.eINSTANCE;

	public static void createTrace(TraceRoot rootTrace, NamedElement erdElement,
			hu.bme.mit.mdsd.rdb.NamedElement rdbElement, IModelManipulations manipulation)
			throws ModelManipulationException {
		
		EObject trace = manipulation.createChild(rootTrace, tracePackage.getTraceRoot_Traces(), tracePackage.getTrace());
		manipulation.set(trace, tracePackage.getTrace_ErdiagramElement(), erdElement);
		manipulation.set(trace, tracePackage.getTrace_RdbElement(), rdbElement);
	}

	public static void deleteTrace(Trace trace, IModelManipulations manipulation) throws ModelManipulationException {
		if (trace != null) {
			hu.bme.mit.mdsd.rdb.NamedElement rdbElement = trace.getRdbElement();
			if (rdbElement != null) {
				manipulation.remove(rdbElement);
			}
			manipulation.remove(trace);
		}
	}
}
