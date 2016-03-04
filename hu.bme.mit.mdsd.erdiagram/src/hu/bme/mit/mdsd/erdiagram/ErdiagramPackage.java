/**
 */
package hu.bme.mit.mdsd.erdiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.incquery.querybasedfeature'"
 * @generated
 */
public interface ErdiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "erdiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.mdsd.erdiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "erdiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErdiagramPackage eINSTANCE = hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.erdiagram.impl.NamedElementImpl
	 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.impl.EntityRelationDiagramImpl <em>Entity Relation Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.erdiagram.impl.EntityRelationDiagramImpl
	 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getEntityRelationDiagram()
	 * @generated
	 */
	int ENTITY_RELATION_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_DIAGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_DIAGRAM__ENTITIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_DIAGRAM__RELATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_DIAGRAM__TEMPORAL_ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Relation Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_DIAGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity Relation Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATION_DIAGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.erdiagram.impl.EntityImpl
	 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_A = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referred By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REFERRED_BY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.erdiagram.impl.AttributeImpl
	 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_KEY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.erdiagram.impl.RelationImpl
	 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Left Ending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LEFT_ENDING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Ending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RIGHT_ENDING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.impl.RelationEndingImpl <em>Relation Ending</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.erdiagram.impl.RelationEndingImpl
	 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getRelationEnding()
	 * @generated
	 */
	int RELATION_ENDING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ENDING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ENDING__NULLABLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ENDING__MULTIPLICITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ENDING__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Other</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ENDING__OTHER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relation Ending</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ENDING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relation Ending</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ENDING_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.MultiplicityType <em>Multiplicity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.erdiagram.MultiplicityType
	 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getMultiplicityType()
	 * @generated
	 */
	int MULTIPLICITY_TYPE = 6;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.erdiagram.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.erdiagram.AttributeType
	 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram <em>Entity Relation Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Relation Diagram</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram
	 * @generated
	 */
	EClass getEntityRelationDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram#getEntities()
	 * @see #getEntityRelationDiagram()
	 * @generated
	 */
	EReference getEntityRelationDiagram_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram#getRelations()
	 * @see #getEntityRelationDiagram()
	 * @generated
	 */
	EReference getEntityRelationDiagram_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram#getTemporalAttributes <em>Temporal Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temporal Attributes</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram#getTemporalAttributes()
	 * @see #getEntityRelationDiagram()
	 * @generated
	 */
	EReference getEntityRelationDiagram_TemporalAttributes();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.erdiagram.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.erdiagram.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.mdsd.erdiagram.Entity#getIsA <em>Is A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is A</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.Entity#getIsA()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_IsA();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.mdsd.erdiagram.Entity#getReferredBy <em>Referred By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referred By</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.Entity#getReferredBy()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ReferredBy();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.erdiagram.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.erdiagram.Attribute#isIsKey <em>Is Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Key</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.Attribute#isIsKey()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsKey();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.erdiagram.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.erdiagram.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.mdsd.erdiagram.Relation#getLeftEnding <em>Left Ending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Ending</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.Relation#getLeftEnding()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_LeftEnding();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.mdsd.erdiagram.Relation#getRightEnding <em>Right Ending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Ending</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.Relation#getRightEnding()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_RightEnding();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.erdiagram.RelationEnding <em>Relation Ending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Ending</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.RelationEnding
	 * @generated
	 */
	EClass getRelationEnding();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.RelationEnding#isNullable()
	 * @see #getRelationEnding()
	 * @generated
	 */
	EAttribute getRelationEnding_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.RelationEnding#getMultiplicity()
	 * @see #getRelationEnding()
	 * @generated
	 */
	EAttribute getRelationEnding_Multiplicity();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.RelationEnding#getTarget()
	 * @see #getRelationEnding()
	 * @generated
	 */
	EReference getRelationEnding_Target();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.mdsd.erdiagram.RelationEnding#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Other</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.RelationEnding#getOther()
	 * @see #getRelationEnding()
	 * @generated
	 */
	EReference getRelationEnding_Other();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.erdiagram.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.erdiagram.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.mdsd.erdiagram.MultiplicityType <em>Multiplicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity Type</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.MultiplicityType
	 * @generated
	 */
	EEnum getMultiplicityType();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.mdsd.erdiagram.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see hu.bme.mit.mdsd.erdiagram.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErdiagramFactory getErdiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.impl.EntityRelationDiagramImpl <em>Entity Relation Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.erdiagram.impl.EntityRelationDiagramImpl
		 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getEntityRelationDiagram()
		 * @generated
		 */
		EClass ENTITY_RELATION_DIAGRAM = eINSTANCE.getEntityRelationDiagram();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATION_DIAGRAM__ENTITIES = eINSTANCE.getEntityRelationDiagram_Entities();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATION_DIAGRAM__RELATIONS = eINSTANCE.getEntityRelationDiagram_Relations();

		/**
		 * The meta object literal for the '<em><b>Temporal Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATION_DIAGRAM__TEMPORAL_ATTRIBUTES = eINSTANCE.getEntityRelationDiagram_TemporalAttributes();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.erdiagram.impl.EntityImpl
		 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Is A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__IS_A = eINSTANCE.getEntity_IsA();

		/**
		 * The meta object literal for the '<em><b>Referred By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REFERRED_BY = eINSTANCE.getEntity_ReferredBy();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.erdiagram.impl.AttributeImpl
		 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_KEY = eINSTANCE.getAttribute_IsKey();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.erdiagram.impl.RelationImpl
		 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Left Ending</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__LEFT_ENDING = eINSTANCE.getRelation_LeftEnding();

		/**
		 * The meta object literal for the '<em><b>Right Ending</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__RIGHT_ENDING = eINSTANCE.getRelation_RightEnding();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.impl.RelationEndingImpl <em>Relation Ending</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.erdiagram.impl.RelationEndingImpl
		 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getRelationEnding()
		 * @generated
		 */
		EClass RELATION_ENDING = eINSTANCE.getRelationEnding();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_ENDING__NULLABLE = eINSTANCE.getRelationEnding_Nullable();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_ENDING__MULTIPLICITY = eINSTANCE.getRelationEnding_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ENDING__TARGET = eINSTANCE.getRelationEnding_Target();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ENDING__OTHER = eINSTANCE.getRelationEnding_Other();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.erdiagram.impl.NamedElementImpl
		 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.MultiplicityType <em>Multiplicity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.erdiagram.MultiplicityType
		 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getMultiplicityType()
		 * @generated
		 */
		EEnum MULTIPLICITY_TYPE = eINSTANCE.getMultiplicityType();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.erdiagram.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.erdiagram.AttributeType
		 * @see hu.bme.mit.mdsd.erdiagram.impl.ErdiagramPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

	}

} //ErdiagramPackage
