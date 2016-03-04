/**
 */
package hu.bme.mit.mdsd.erdiagram.impl;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram;
import hu.bme.mit.mdsd.erdiagram.ErdiagramPackage;
import hu.bme.mit.mdsd.erdiagram.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Relation Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.EntityRelationDiagramImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.EntityRelationDiagramImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.EntityRelationDiagramImpl#getTemporalAttributes <em>Temporal Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityRelationDiagramImpl extends NamedElementImpl implements EntityRelationDiagram {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getTemporalAttributes() <em>Temporal Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> temporalAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityRelationDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErdiagramPackage.Literals.ENTITY_RELATION_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, ErdiagramPackage.ENTITY_RELATION_DIAGRAM__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, ErdiagramPackage.ENTITY_RELATION_DIAGRAM__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getTemporalAttributes() {
		if (temporalAttributes == null) {
			temporalAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ErdiagramPackage.ENTITY_RELATION_DIAGRAM__TEMPORAL_ATTRIBUTES);
		}
		return temporalAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__TEMPORAL_ATTRIBUTES:
				return ((InternalEList<?>)getTemporalAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__ENTITIES:
				return getEntities();
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__RELATIONS:
				return getRelations();
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__TEMPORAL_ATTRIBUTES:
				return getTemporalAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__TEMPORAL_ATTRIBUTES:
				getTemporalAttributes().clear();
				getTemporalAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__ENTITIES:
				getEntities().clear();
				return;
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__RELATIONS:
				getRelations().clear();
				return;
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__TEMPORAL_ATTRIBUTES:
				getTemporalAttributes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__ENTITIES:
				return entities != null && !entities.isEmpty();
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__RELATIONS:
				return relations != null && !relations.isEmpty();
			case ErdiagramPackage.ENTITY_RELATION_DIAGRAM__TEMPORAL_ATTRIBUTES:
				return temporalAttributes != null && !temporalAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityRelationDiagramImpl
