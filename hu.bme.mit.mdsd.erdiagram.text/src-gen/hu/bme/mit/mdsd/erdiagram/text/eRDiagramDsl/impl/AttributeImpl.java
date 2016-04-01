/**
 * generated by Xtext 2.9.1
 */
package hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl;

import hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.Attribute;
import hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.AttributeType;
import hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagramDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.AttributeImpl#isIsKey <em>Is Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final AttributeType TYPE_EDEFAULT = AttributeType.INT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AttributeType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsKey()
   * @generated
   * @ordered
   */
  protected static final boolean IS_KEY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsKey()
   * @generated
   * @ordered
   */
  protected boolean isKey = IS_KEY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ERDiagramDslPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ERDiagramDslPackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AttributeType newType)
  {
    AttributeType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ERDiagramDslPackage.ATTRIBUTE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsKey()
  {
    return isKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsKey(boolean newIsKey)
  {
    boolean oldIsKey = isKey;
    isKey = newIsKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ERDiagramDslPackage.ATTRIBUTE__IS_KEY, oldIsKey, isKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ERDiagramDslPackage.ATTRIBUTE__NAME:
        return getName();
      case ERDiagramDslPackage.ATTRIBUTE__TYPE:
        return getType();
      case ERDiagramDslPackage.ATTRIBUTE__IS_KEY:
        return isIsKey();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ERDiagramDslPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case ERDiagramDslPackage.ATTRIBUTE__TYPE:
        setType((AttributeType)newValue);
        return;
      case ERDiagramDslPackage.ATTRIBUTE__IS_KEY:
        setIsKey((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ERDiagramDslPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ERDiagramDslPackage.ATTRIBUTE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ERDiagramDslPackage.ATTRIBUTE__IS_KEY:
        setIsKey(IS_KEY_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ERDiagramDslPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ERDiagramDslPackage.ATTRIBUTE__TYPE:
        return type != TYPE_EDEFAULT;
      case ERDiagramDslPackage.ATTRIBUTE__IS_KEY:
        return isKey != IS_KEY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", isKey: ");
    result.append(isKey);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
