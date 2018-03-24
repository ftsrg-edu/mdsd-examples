/*
 * generated by Xtext 2.9.1
 */
package hu.bme.mit.mdsd.erdiagram.text.validation

import org.eclipse.xtext.validation.Check
import hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Entity
import hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagramDslPackage
import java.util.HashMap
import java.util.Set
import java.util.HashSet

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ERDiagramDslValidator extends AbstractERDiagramDslValidator {

	Set<Entity> entitiesAlreadyChecked = new HashSet

	@Check
	def checkCyclicInheritance(Entity entity) {
		checkCyclicInheritance2(entity)
		entitiesAlreadyChecked.clear
		
	}
	
	def checkCyclicInheritance2(Entity entity) {
		entitiesAlreadyChecked += entity
		for (parent : entity.isA) {
			if (entitiesAlreadyChecked.contains(parent)) {
				error("Cyclic inheritance is not allowed.", ERDiagramDslPackage.Literals.ENTITY__IS_A)
				return;
			}
			checkCyclicInheritance2(parent)
		}
	}
	
}