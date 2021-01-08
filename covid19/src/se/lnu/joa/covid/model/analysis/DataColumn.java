/**
 */
package se.lnu.joa.covid.model.analysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.DataColumn#getHeader <em>Header</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.DataColumn#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getDataColumn()
 * @model
 * @generated
 */
public interface DataColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getDataColumn_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.DataColumn#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getDataColumn_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

} // DataColumn
