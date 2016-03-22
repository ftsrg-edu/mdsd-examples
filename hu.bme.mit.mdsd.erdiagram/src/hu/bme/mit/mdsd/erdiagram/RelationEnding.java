/**
 */
package hu.bme.mit.mdsd.erdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Ending</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#isNullable <em>Nullable</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#getOtherEnding <em>Other Ending</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getRelationEnding()
 * @model
 * @generated
 */
public interface RelationEnding extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getRelationEnding_Nullable()
	 * @model default="false"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.mdsd.erdiagram.MultiplicityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see hu.bme.mit.mdsd.erdiagram.MultiplicityType
	 * @see #setMultiplicity(MultiplicityType)
	 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getRelationEnding_Multiplicity()
	 * @model
	 * @generated
	 */
	MultiplicityType getMultiplicity();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see hu.bme.mit.mdsd.erdiagram.MultiplicityType
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(MultiplicityType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.mdsd.erdiagram.Entity#getReferredBy <em>Referred By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getRelationEnding_Target()
	 * @see hu.bme.mit.mdsd.erdiagram.Entity#getReferredBy
	 * @model opposite="referredBy" required="true"
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

	/**
	 * Returns the value of the '<em><b>Other Ending</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Ending</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Ending</em>' reference.
	 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getRelationEnding_OtherEnding()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	RelationEnding getOtherEnding();

} // RelationEnding
