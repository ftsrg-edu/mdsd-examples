package hu.bme.mit.mdsd.erdiagram.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram;
import hu.bme.mit.mdsd.erdiagram.ErdiagramFactory;
import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.RelationEnding;

public class CreateRelationOperation implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		Entity source = (Entity) parameters.get("source");
		Entity target = (Entity) parameters.get("target");

		ErdiagramFactory factory = ErdiagramFactory.eINSTANCE;

		Relation relation = factory.createRelation();
		RelationEnding sourceEnding = factory.createRelationEnding();
		RelationEnding targetEnding = factory.createRelationEnding();
		relation.setName("newRelation");
		relation.setLeftEnding(sourceEnding);
		relation.setRightEnding(targetEnding);
		sourceEnding.setTarget(source);
		targetEnding.setTarget(target);

		EntityRelationDiagram root = (EntityRelationDiagram) source.eContainer();
		root.getRelations().add(relation);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		for (EObject eObject : selections) {
			if(!(eObject instanceof Entity)) {				
				return false;
			}
		}
		return true;
	}
}
