package hu.bme.mit.mdsd.m2m2c.util;

import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;

import hu.bme.mit.mdsd.erdiagram.NamedElement;
import trace.Trace;
import trace.TracePackage;
import trace.TraceRoot;

public class TracingHelperUtility {

	static TracePackage tracePackage = TracePackage.eINSTANCE;
	
	private IModelManipulations manipulation;
	private TraceRoot rootTrace;
	
	public TracingHelperUtility(IModelManipulations manipulation, TraceRoot rootTrace) {
		this.manipulation = manipulation;
		this.rootTrace = rootTrace;
	}

	private void logTraceOp(Trace trace, boolean insert) {
		System.out.println(
				String.format(
					"\tTRACE %s: %s <--- %s ---> %s", 
					insert? "INS" : "DEL",
					trace.getErdiagramElement(),
					trace,
					trace.getRdbElement()
				)
		); 
	}
	
	public void createTrace(NamedElement erdElement,
			hu.bme.mit.mdsd.rdb.NamedElement rdbElement)
			throws ModelManipulationException {
		
		Trace trace = (Trace) manipulation.createChild(rootTrace, tracePackage.getTraceRoot_Traces(), tracePackage.getTrace());
		manipulation.set(trace, tracePackage.getTrace_ErdiagramElement(), erdElement);
		manipulation.set(trace, tracePackage.getTrace_RdbElement(), rdbElement);
		logTraceOp(trace, true);
	}

	public void deleteTraceAndTarget(Trace trace) throws ModelManipulationException {
		if (trace != null) {
			logTraceOp(trace, false);
			hu.bme.mit.mdsd.rdb.NamedElement rdbElement = trace.getRdbElement();
			if (rdbElement != null && rdbElement.eResource() != null) {
				manipulation.remove(rdbElement);
			}
			manipulation.remove(rootTrace, tracePackage.getTraceRoot_Traces(), trace);
		}
	}

}
