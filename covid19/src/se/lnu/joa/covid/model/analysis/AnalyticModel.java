/**
 */
package se.lnu.joa.covid.model.analysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analytic Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getDatasetName <em>Dataset Name</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getRegression <em>Regression</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getVisualization <em>Visualization</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnalyticModel()
 * @model
 * @generated
 */
public interface AnalyticModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see #setDataSource(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnalyticModel_DataSource()
	 * @model
	 * @generated
	 */
	String getDataSource();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(String value);

	/**
	 * Returns the value of the '<em><b>Dataset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Name</em>' attribute.
	 * @see #setDatasetName(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnalyticModel_DatasetName()
	 * @model
	 * @generated
	 */
	String getDatasetName();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getDatasetName <em>Dataset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset Name</em>' attribute.
	 * @see #getDatasetName()
	 * @generated
	 */
	void setDatasetName(String value);

	/**
	 * Returns the value of the '<em><b>Regression</b></em>' containment reference list.
	 * The list contents are of type {@link se.lnu.joa.covid.model.analysis.Regression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regression</em>' containment reference list.
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnalyticModel_Regression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Regression> getRegression();

	/**
	 * Returns the value of the '<em><b>Visualization</b></em>' containment reference list.
	 * The list contents are of type {@link se.lnu.joa.covid.model.analysis.Visualization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization</em>' containment reference list.
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnalyticModel_Visualization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Visualization> getVisualization();

} // AnalyticModel
