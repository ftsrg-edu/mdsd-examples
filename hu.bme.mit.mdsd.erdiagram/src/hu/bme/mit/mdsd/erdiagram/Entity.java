/**
 */
package hu.bme.mit.mdsd.erdiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.Entity#getIsA <em>Is A</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.Entity#getReferredBy <em>Referred By</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.erdiagram.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Is A</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.erdiagram.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is A</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is A</em>' reference list.
	 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getEntity_IsA()
	 * @model
	 * @generated
	 */
	EList<Entity> getIsA();

	/**
	 * Returns the value of the '<em><b>Referred By</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.erdiagram.RelationEnding}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By</em>' reference list.
	 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getEntity_ReferredBy()
	 * @see hu.bme.mit.mdsd.erdiagram.RelationEnding#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<RelationEnding> getReferredBy();

} // Entity
