/**
 */
package se.lnu.joa.covid.model.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.data.DataPool#getName <em>Name</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.DataPool#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.data.DataPackage#getDataPool()
 * @model
 * @generated
 */
public interface DataPool extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getDataPool_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.DataPool#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link se.lnu.joa.covid.model.data.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see se.lnu.joa.covid.model.data.DataPackage#getDataPool_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSource> getSources();

} // DataPool
