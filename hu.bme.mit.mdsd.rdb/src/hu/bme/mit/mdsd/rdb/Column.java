/**
 */
package hu.bme.mit.mdsd.rdb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.rdb.Column#getTable <em>Table</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.rdb.Column#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.rdb.RdbPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.mdsd.rdb.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see hu.bme.mit.mdsd.rdb.RdbPackage#getColumn_Table()
	 * @see hu.bme.mit.mdsd.rdb.Table#getColumns
	 * @model opposite="columns" required="true" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.rdb.Column#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.mdsd.rdb.ColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hu.bme.mit.mdsd.rdb.ColumnType
	 * @see #setType(ColumnType)
	 * @see hu.bme.mit.mdsd.rdb.RdbPackage#getColumn_Type()
	 * @model
	 * @generated
	 */
	ColumnType getType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.rdb.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hu.bme.mit.mdsd.rdb.ColumnType
	 * @see #getType()
	 * @generated
	 */
	void setType(ColumnType value);

} // Column
