/**
 */
package hu.bme.mit.mdsd.rdb.impl;

import hu.bme.mit.mdsd.rdb.ForeignKey;
import hu.bme.mit.mdsd.rdb.Key;
import hu.bme.mit.mdsd.rdb.RdbPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.rdb.impl.ForeignKeyImpl#getReferencedKey <em>Referenced Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends ColumnImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getReferencedKey() <em>Referenced Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedKey()
	 * @generated
	 * @ordered
	 */
	protected Key referencedKey;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key getReferencedKey() {
		if (referencedKey != null && referencedKey.eIsProxy()) {
			InternalEObject oldReferencedKey = (InternalEObject)referencedKey;
			referencedKey = (Key)eResolveProxy(oldReferencedKey);
			if (referencedKey != oldReferencedKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbPackage.FOREIGN_KEY__REFERENCED_KEY, oldReferencedKey, referencedKey));
			}
		}
		return referencedKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key basicGetReferencedKey() {
		return referencedKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedKey(Key newReferencedKey) {
		Key oldReferencedKey = referencedKey;
		referencedKey = newReferencedKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.FOREIGN_KEY__REFERENCED_KEY, oldReferencedKey, referencedKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbPackage.FOREIGN_KEY__REFERENCED_KEY:
				if (resolve) return getReferencedKey();
				return basicGetReferencedKey();
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
			case RdbPackage.FOREIGN_KEY__REFERENCED_KEY:
				setReferencedKey((Key)newValue);
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
			case RdbPackage.FOREIGN_KEY__REFERENCED_KEY:
				setReferencedKey((Key)null);
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
			case RdbPackage.FOREIGN_KEY__REFERENCED_KEY:
				return referencedKey != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl
