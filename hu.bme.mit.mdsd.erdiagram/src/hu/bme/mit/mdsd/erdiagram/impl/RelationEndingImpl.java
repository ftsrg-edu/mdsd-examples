/**
 */
package hu.bme.mit.mdsd.erdiagram.impl;

import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.ErdiagramPackage;
import hu.bme.mit.mdsd.erdiagram.MultiplicityType;
import hu.bme.mit.mdsd.erdiagram.RelationEnding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Ending</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.RelationEndingImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.RelationEndingImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.RelationEndingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.impl.RelationEndingImpl#getEndingLabel <em>Ending Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationEndingImpl extends NamedElementImpl implements RelationEnding {
	/**
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final MultiplicityType MULTIPLICITY_EDEFAULT = MultiplicityType.ONE;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityType multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Entity target;

	/**
	 * The cached setting delegate for the '{@link #getEndingLabel() <em>Ending Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingLabel()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ENDING_LABEL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ErdiagramPackage.Literals.RELATION_ENDING__ENDING_LABEL).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationEndingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErdiagramPackage.Literals.RELATION_ENDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramPackage.RELATION_ENDING__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityType getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicity(MultiplicityType newMultiplicity) {
		MultiplicityType oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramPackage.RELATION_ENDING__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Entity)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErdiagramPackage.RELATION_ENDING__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Entity newTarget, NotificationChain msgs) {
		Entity oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErdiagramPackage.RELATION_ENDING__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Entity newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, ErdiagramPackage.ENTITY__REFERRED_BY, Entity.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, ErdiagramPackage.ENTITY__REFERRED_BY, Entity.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramPackage.RELATION_ENDING__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndingLabel() {
		return (String)ENDING_LABEL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErdiagramPackage.RELATION_ENDING__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ErdiagramPackage.ENTITY__REFERRED_BY, Entity.class, msgs);
				return basicSetTarget((Entity)otherEnd, msgs);
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
			case ErdiagramPackage.RELATION_ENDING__TARGET:
				return basicSetTarget(null, msgs);
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
			case ErdiagramPackage.RELATION_ENDING__NULLABLE:
				return isNullable();
			case ErdiagramPackage.RELATION_ENDING__MULTIPLICITY:
				return getMultiplicity();
			case ErdiagramPackage.RELATION_ENDING__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ErdiagramPackage.RELATION_ENDING__ENDING_LABEL:
				return getEndingLabel();
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
			case ErdiagramPackage.RELATION_ENDING__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case ErdiagramPackage.RELATION_ENDING__MULTIPLICITY:
				setMultiplicity((MultiplicityType)newValue);
				return;
			case ErdiagramPackage.RELATION_ENDING__TARGET:
				setTarget((Entity)newValue);
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
			case ErdiagramPackage.RELATION_ENDING__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case ErdiagramPackage.RELATION_ENDING__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case ErdiagramPackage.RELATION_ENDING__TARGET:
				setTarget((Entity)null);
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
			case ErdiagramPackage.RELATION_ENDING__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
			case ErdiagramPackage.RELATION_ENDING__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
			case ErdiagramPackage.RELATION_ENDING__TARGET:
				return target != null;
			case ErdiagramPackage.RELATION_ENDING__ENDING_LABEL:
				return ENDING_LABEL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nullable: ");
		result.append(nullable);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

} //RelationEndingImpl
