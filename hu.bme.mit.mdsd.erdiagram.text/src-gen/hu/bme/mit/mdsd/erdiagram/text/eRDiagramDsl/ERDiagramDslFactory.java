/**
 * generated by Xtext 2.9.1
 */
package hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.ERDiagramDslPackage
 * @generated
 */
public interface ERDiagramDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ERDiagramDslFactory eINSTANCE = hu.bme.mit.mdsd.erdiagram.text.eRDiagramDsl.impl.ERDiagramDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>ER Diagram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ER Diagram</em>'.
   * @generated
   */
  ERDiagram createERDiagram();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation</em>'.
   * @generated
   */
  Relation createRelation();

  /**
   * Returns a new object of class '<em>Relation Ending</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Ending</em>'.
   * @generated
   */
  RelationEnding createRelationEnding();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ERDiagramDslPackage getERDiagramDslPackage();

} //ERDiagramDslFactory
