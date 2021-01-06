/**
 */
package se.lnu.joa.covid.model.analysis;

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
 *   <li>{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getRegression <em>Regression</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnalyticModel()
 * @model
 * @generated
 */
public interface AnalyticModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Regression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regression</em>' containment reference.
	 * @see #setRegression(Regression)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnalyticModel_Regression()
	 * @model containment="true"
	 * @generated
	 */
	Regression getRegression();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getRegression <em>Regression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regression</em>' containment reference.
	 * @see #getRegression()
	 * @generated
	 */
	void setRegression(Regression value);

	/**
	 * Returns the value of the '<em><b>Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization</em>' containment reference.
	 * @see #setVisualization(Visualization)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnalyticModel_Visualization()
	 * @model containment="true"
	 * @generated
	 */
	Visualization getVisualization();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getVisualization <em>Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualization</em>' containment reference.
	 * @see #getVisualization()
	 * @generated
	 */
	void setVisualization(Visualization value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(DataSource)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getAnalyticModel_DataSource()
	 * @model containment="true"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

} // AnalyticModel
