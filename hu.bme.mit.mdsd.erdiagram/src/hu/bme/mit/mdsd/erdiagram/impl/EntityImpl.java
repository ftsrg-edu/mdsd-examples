/**
 */
package hu.bme.mit.mdsd.erdiagram.impl;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.ErdiagramPackage;
import hu.bme.mit.mdsd.erdiagram.RelationEnding;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.EntityImpl#getIsA <em>Is A</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.EntityImpl#getReferredBy <em>Referred By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends NamedElementImpl implements Entity {
	/**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
	protected EList<Attribute> attributes;

	/**
     * The cached value of the '{@link #getIsA() <em>Is A</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIsA()
     * @generated
     * @ordered
     */
	protected EList<Entity> isA;

	/**
     * The cached value of the '{@link #getReferredBy() <em>Referred By</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReferredBy()
     * @generated
     * @ordered
     */
	protected EList<RelationEnding> referredBy;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EntityImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ErdiagramPackage.Literals.ENTITY;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ErdiagramPackage.ENTITY__ATTRIBUTES);
        }
        return attributes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Entity> getIsA() {
        if (isA == null) {
            isA = new EObjectResolvingEList<Entity>(Entity.class, this, ErdiagramPackage.ENTITY__IS_A);
        }
        return isA;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RelationEnding> getReferredBy() {
        if (referredBy == null) {
            referredBy = new EObjectWithInverseResolvingEList<RelationEnding>(RelationEnding.class, this, ErdiagramPackage.ENTITY__REFERRED_BY, ErdiagramPackage.RELATION_ENDING__TARGET);
        }
        return referredBy;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ErdiagramPackage.ENTITY__REFERRED_BY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredBy()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ErdiagramPackage.ENTITY__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case ErdiagramPackage.ENTITY__REFERRED_BY:
                return ((InternalEList<?>)getReferredBy()).basicRemove(otherEnd, msgs);
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
            case ErdiagramPackage.ENTITY__ATTRIBUTES:
                return getAttributes();
            case ErdiagramPackage.ENTITY__IS_A:
                return getIsA();
            case ErdiagramPackage.ENTITY__REFERRED_BY:
                return getReferredBy();
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
            case ErdiagramPackage.ENTITY__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
                return;
            case ErdiagramPackage.ENTITY__IS_A:
                getIsA().clear();
                getIsA().addAll((Collection<? extends Entity>)newValue);
                return;
            case ErdiagramPackage.ENTITY__REFERRED_BY:
                getReferredBy().clear();
                getReferredBy().addAll((Collection<? extends RelationEnding>)newValue);
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
            case ErdiagramPackage.ENTITY__ATTRIBUTES:
                getAttributes().clear();
                return;
            case ErdiagramPackage.ENTITY__IS_A:
                getIsA().clear();
                return;
            case ErdiagramPackage.ENTITY__REFERRED_BY:
                getReferredBy().clear();
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
            case ErdiagramPackage.ENTITY__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case ErdiagramPackage.ENTITY__IS_A:
                return isA != null && !isA.isEmpty();
            case ErdiagramPackage.ENTITY__REFERRED_BY:
                return referredBy != null && !referredBy.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EntityImpl
