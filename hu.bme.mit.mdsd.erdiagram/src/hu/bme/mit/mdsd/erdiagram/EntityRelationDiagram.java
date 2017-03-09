/**
 */
package hu.bme.mit.mdsd.erdiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Relation Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram#getEntities <em>Entities</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram#getRelations <em>Relations</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram#getTemporalAttributes <em>Temporal Attributes</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getEntityRelationDiagram()
 * @model
 * @generated
 */
public interface EntityRelationDiagram extends NamedElement {
	/**
     * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
     * The list contents are of type {@link hu.bme.mit.mdsd.erdiagram.Entity}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Entities</em>' containment reference list.
     * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getEntityRelationDiagram_Entities()
     * @model containment="true"
     * @generated
     */
	EList<Entity> getEntities();

	/**
     * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
     * The list contents are of type {@link hu.bme.mit.mdsd.erdiagram.Relation}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Relations</em>' containment reference list.
     * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getEntityRelationDiagram_Relations()
     * @model containment="true"
     * @generated
     */
	EList<Relation> getRelations();

	/**
     * Returns the value of the '<em><b>Temporal Attributes</b></em>' containment reference list.
     * The list contents are of type {@link hu.bme.mit.mdsd.erdiagram.Attribute}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Temporal Attributes</em>' containment reference list.
     * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getEntityRelationDiagram_TemporalAttributes()
     * @model containment="true"
     * @generated
     */
	EList<Attribute> getTemporalAttributes();

} // EntityRelationDiagram
