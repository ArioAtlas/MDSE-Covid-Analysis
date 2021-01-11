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
 *   <li>{@link se.lnu.joa.covid.model.analysis.DataColumn#getType <em>Type</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.DataColumn#getFormat <em>Format</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.DataColumn#getFilter <em>Filter</em>}</li>
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
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getDataColumn_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.DataColumn#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getDataColumn_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.DataColumn#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getDataColumn_Filter()
	 * @model
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.DataColumn#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

} // DataColumn
