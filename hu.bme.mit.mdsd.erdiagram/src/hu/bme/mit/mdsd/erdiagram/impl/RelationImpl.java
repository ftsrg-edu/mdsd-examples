/**
 */
package hu.bme.mit.mdsd.erdiagram.impl;

import hu.bme.mit.mdsd.erdiagram.ErdiagramPackage;
import hu.bme.mit.mdsd.erdiagram.Relation;
import hu.bme.mit.mdsd.erdiagram.RelationEnding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.RelationImpl#getLeftEnding <em>Left Ending</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.RelationImpl#getRightEnding <em>Right Ending</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends NamedElementImpl implements Relation {
	/**
     * The cached value of the '{@link #getLeftEnding() <em>Left Ending</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLeftEnding()
     * @generated
     * @ordered
     */
	protected RelationEnding leftEnding;

	/**
     * The cached value of the '{@link #getRightEnding() <em>Right Ending</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRightEnding()
     * @generated
     * @ordered
     */
	protected RelationEnding rightEnding;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RelationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ErdiagramPackage.Literals.RELATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RelationEnding getLeftEnding() {
        return leftEnding;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetLeftEnding(RelationEnding newLeftEnding, NotificationChain msgs) {
        RelationEnding oldLeftEnding = leftEnding;
        leftEnding = newLeftEnding;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErdiagramPackage.RELATION__LEFT_ENDING, oldLeftEnding, newLeftEnding);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLeftEnding(RelationEnding newLeftEnding) {
        if (newLeftEnding != leftEnding) {
            NotificationChain msgs = null;
            if (leftEnding != null)
                msgs = ((InternalEObject)leftEnding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErdiagramPackage.RELATION__LEFT_ENDING, null, msgs);
            if (newLeftEnding != null)
                msgs = ((InternalEObject)newLeftEnding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErdiagramPackage.RELATION__LEFT_ENDING, null, msgs);
            msgs = basicSetLeftEnding(newLeftEnding, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramPackage.RELATION__LEFT_ENDING, newLeftEnding, newLeftEnding));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RelationEnding getRightEnding() {
        return rightEnding;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetRightEnding(RelationEnding newRightEnding, NotificationChain msgs) {
        RelationEnding oldRightEnding = rightEnding;
        rightEnding = newRightEnding;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErdiagramPackage.RELATION__RIGHT_ENDING, oldRightEnding, newRightEnding);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRightEnding(RelationEnding newRightEnding) {
        if (newRightEnding != rightEnding) {
            NotificationChain msgs = null;
            if (rightEnding != null)
                msgs = ((InternalEObject)rightEnding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErdiagramPackage.RELATION__RIGHT_ENDING, null, msgs);
            if (newRightEnding != null)
                msgs = ((InternalEObject)newRightEnding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErdiagramPackage.RELATION__RIGHT_ENDING, null, msgs);
            msgs = basicSetRightEnding(newRightEnding, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramPackage.RELATION__RIGHT_ENDING, newRightEnding, newRightEnding));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ErdiagramPackage.RELATION__LEFT_ENDING:
                return basicSetLeftEnding(null, msgs);
            case ErdiagramPackage.RELATION__RIGHT_ENDING:
                return basicSetRightEnding(null, msgs);
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
            case ErdiagramPackage.RELATION__LEFT_ENDING:
                return getLeftEnding();
            case ErdiagramPackage.RELATION__RIGHT_ENDING:
                return getRightEnding();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ErdiagramPackage.RELATION__LEFT_ENDING:
                setLeftEnding((RelationEnding)newValue);
                return;
            case ErdiagramPackage.RELATION__RIGHT_ENDING:
                setRightEnding((RelationEnding)newValue);
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
            case ErdiagramPackage.RELATION__LEFT_ENDING:
                setLeftEnding((RelationEnding)null);
                return;
            case ErdiagramPackage.RELATION__RIGHT_ENDING:
                setRightEnding((RelationEnding)null);
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
            case ErdiagramPackage.RELATION__LEFT_ENDING:
                return leftEnding != null;
            case ErdiagramPackage.RELATION__RIGHT_ENDING:
                return rightEnding != null;
        }
        return super.eIsSet(featureID);
    }

} //RelationImpl
