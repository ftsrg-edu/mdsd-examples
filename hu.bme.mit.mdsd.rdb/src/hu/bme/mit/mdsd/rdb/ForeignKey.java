/**
 */
package hu.bme.mit.mdsd.rdb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.rdb.ForeignKey#getReferencedKey <em>Referenced Key</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.rdb.RdbPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends Column {
	/**
	 * Returns the value of the '<em><b>Referenced Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Key</em>' reference.
	 * @see #setReferencedKey(Key)
	 * @see hu.bme.mit.mdsd.rdb.RdbPackage#getForeignKey_ReferencedKey()
	 * @model required="true"
	 * @generated
	 */
	Key getReferencedKey();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.rdb.ForeignKey#getReferencedKey <em>Referenced Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Key</em>' reference.
	 * @see #getReferencedKey()
	 * @generated
	 */
	void setReferencedKey(Key value);

} // ForeignKey
