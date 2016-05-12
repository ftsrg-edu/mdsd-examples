/**
 */
package hu.bme.mit.mdsd.rdb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.rdb.RelationalDataBase#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.rdb.RdbPackage#getRelationalDataBase()
 * @model
 * @generated
 */
public interface RelationalDataBase extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.rdb.Table}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.mdsd.rdb.Table#getRdb <em>Rdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.rdb.RdbPackage#getRelationalDataBase_Tables()
	 * @see hu.bme.mit.mdsd.rdb.Table#getRdb
	 * @model opposite="rdb" containment="true"
	 * @generated
	 */
	EList<Table> getTables();

} // RelationalDataBase
