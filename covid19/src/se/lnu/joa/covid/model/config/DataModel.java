/**
 */
package se.lnu.joa.covid.model.config;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.DataModel#getDatasetName <em>Dataset Name</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.DataModel#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.DataModel#getColumns <em>Columns</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.DataModel#getFilters <em>Filters</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.DataModel#getDateFormat <em>Date Format</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.config.ConfigPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Dataset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Name</em>' attribute.
	 * @see #setDatasetName(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getDataModel_DatasetName()
	 * @model
	 * @generated
	 */
	String getDatasetName();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.DataModel#getDatasetName <em>Dataset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset Name</em>' attribute.
	 * @see #getDatasetName()
	 * @generated
	 */
	void setDatasetName(String value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see #setDataSource(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getDataModel_DataSource()
	 * @model
	 * @generated
	 */
	String getDataSource();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.DataModel#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute list.
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getDataModel_Columns()
	 * @model
	 * @generated
	 */
	EList<String> getColumns();

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link se.lnu.joa.covid.model.config.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getDataModel_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see #setDateFormat(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getDataModel_DateFormat()
	 * @model
	 * @generated
	 */
	String getDateFormat();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.DataModel#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(String value);

} // DataModel
