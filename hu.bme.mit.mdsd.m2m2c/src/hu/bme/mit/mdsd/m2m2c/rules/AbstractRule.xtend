package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.m2m2c.util.CommonHelperMethods
import hu.bme.mit.mdsd.rdb.RdbPackage
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import trace.TraceRoot

class AbstractRule {
	
	protected ViatraQueryEngine engine
	protected extension IModelManipulations manipulation	
	protected TraceRoot traceRoot
	
	protected EventDrivenTransformationRule<?, ?> rule
	
	protected extension EventDrivenTransformationRuleFactory ruleFactory = new EventDrivenTransformationRuleFactory	
	protected extension CommonHelperMethods commonHelperMethods = new CommonHelperMethods
	
	protected RdbPackage rdbPackage = RdbPackage.eINSTANCE

	def EventDrivenTransformationRule<?, ?> getRule() {
		return rule
	}

	new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
		this.engine = engine;
		this.manipulation = manipulation
		this.traceRoot = traceRoot
	}
}
