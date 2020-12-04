/**
 */
package se.lnu.joa.covid.model.covid19;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.covid19.DataRecord#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getDataRecord()
 * @model
 * @generated
 */
public interface DataRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getDataRecord_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.DataRecord#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // DataRecord
