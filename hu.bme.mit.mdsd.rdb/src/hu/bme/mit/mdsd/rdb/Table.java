/**
 */
package hu.bme.mit.mdsd.rdb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.rdb.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.rdb.Table#getRdb <em>Rdb</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.rdb.RdbPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.rdb.Column}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.mdsd.rdb.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.rdb.RdbPackage#getTable_Columns()
	 * @see hu.bme.mit.mdsd.rdb.Column#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Rdb</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.mdsd.rdb.RelationalDataBase#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdb</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdb</em>' container reference.
	 * @see #setRdb(RelationalDataBase)
	 * @see hu.bme.mit.mdsd.rdb.RdbPackage#getTable_Rdb()
	 * @see hu.bme.mit.mdsd.rdb.RelationalDataBase#getTables
	 * @model opposite="tables" required="true" transient="false"
	 * @generated
	 */
	RelationalDataBase getRdb();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.rdb.Table#getRdb <em>Rdb</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdb</em>' container reference.
	 * @see #getRdb()
	 * @generated
	 */
	void setRdb(RelationalDataBase value);

} // Table
