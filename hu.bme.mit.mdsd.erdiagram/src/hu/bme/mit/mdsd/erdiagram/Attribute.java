/**
 */
package hu.bme.mit.mdsd.erdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.Attribute#isIsKey <em>Is Key</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Key</em>' attribute.
	 * @see #setIsKey(boolean)
	 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getAttribute_IsKey()
	 * @model
	 * @generated
	 */
	boolean isIsKey();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.erdiagram.Attribute#isIsKey <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Key</em>' attribute.
	 * @see #isIsKey()
	 * @generated
	 */
	void setIsKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"INT"</code>.
	 * The literals are from the enumeration {@link hu.bme.mit.mdsd.erdiagram.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hu.bme.mit.mdsd.erdiagram.AttributeType
	 * @see #setType(AttributeType)
	 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getAttribute_Type()
	 * @model default="INT"
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.erdiagram.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hu.bme.mit.mdsd.erdiagram.AttributeType
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);

} // Attribute
