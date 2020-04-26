package hu.bme.mit.mdsd.m2m2c.rules

import hu.bme.mit.mdsd.m2m2c.queries.PreconditionQueries
import hu.bme.mit.mdsd.m2m2c.util.TracingHelperUtility
import hu.bme.mit.mdsd.rdb.RdbPackage
import java.util.List
import java.util.function.Consumer
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.EventDrivenTransformationRuleGroup
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import trace.TraceRoot

class RuleSetBase {
	protected val ViatraQueryEngine engine
	protected val EventDrivenTransformationRuleFactory ruleFactory = new EventDrivenTransformationRuleFactory	
	protected val TraceRoot traceRoot
	
	protected val List<EventDrivenTransformationRule<?,?>> rulesInternal = newArrayList
	
	protected extension val IModelManipulations manipulation		
	protected extension val TracingHelperUtility tracingHelper
	
	protected extension val RdbPackage rdbPackage = RdbPackage.eINSTANCE
	
	protected extension val PreconditionQueries preconditionQueries = PreconditionQueries.instance

	new(ViatraQueryEngine engine, IModelManipulations manipulation, TraceRoot traceRoot) {
		this.engine = engine;
		this.manipulation = manipulation
		this.traceRoot = traceRoot
		
		this.tracingHelper = new TracingHelperUtility(manipulation, traceRoot)
	}
	
	def allRules() {
		new EventDrivenTransformationRuleGroup(rulesInternal)
	}
	
	private def logExecution(IPatternMatch match, String ruleName) {
		println('''«ruleName» («match.prettyPrint»)''')
	}
	protected def <Match extends IPatternMatch, Matcher extends ViatraQueryMatcher<Match>> addRule(
		IQuerySpecification<Matcher> query, Consumer<Match> job
	) {
		val ruleName = query.simpleName + "Rule"
		val rule = ruleFactory.createRule(query)
			.name(ruleName)
			.action(CRUDActivationStateEnum.CREATED) [
				logExecution(ruleName)
				job.accept(it)
			].build 
		rulesInternal += rule
		rule
	}
	
		
}