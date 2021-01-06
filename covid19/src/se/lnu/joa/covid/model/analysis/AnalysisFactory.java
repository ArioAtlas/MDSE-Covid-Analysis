/**
 */
package se.lnu.joa.covid.model.analysis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage
 * @generated
 */
public interface AnalysisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisFactory eINSTANCE = se.lnu.joa.covid.model.analysis.impl.AnalysisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Analytic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analytic Model</em>'.
	 * @generated
	 */
	AnalyticModel createAnalyticModel();

	/**
	 * Returns a new object of class '<em>Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization</em>'.
	 * @generated
	 */
	Visualization createVisualization();

	/**
	 * Returns a new object of class '<em>Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regression</em>'.
	 * @generated
	 */
	Regression createRegression();

	/**
	 * Returns a new object of class '<em>Linnear Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linnear Regression</em>'.
	 * @generated
	 */
	LinnearRegression createLinnearRegression();

	/**
	 * Returns a new object of class '<em>Logarithmic Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logarithmic Regression</em>'.
	 * @generated
	 */
	LogarithmicRegression createLogarithmicRegression();

	/**
	 * Returns a new object of class '<em>Linear Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Plot</em>'.
	 * @generated
	 */
	LinearPlot createLinearPlot();

	/**
	 * Returns a new object of class '<em>Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scatter Plot</em>'.
	 * @generated
	 */
	ScatterPlot createScatterPlot();

	/**
	 * Returns a new object of class '<em>Animation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animation</em>'.
	 * @generated
	 */
	Animation createAnimation();

	/**
	 * Returns a new object of class '<em>Log10 Scale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log10 Scale</em>'.
	 * @generated
	 */
	Log10Scale createLog10Scale();

	/**
	 * Returns a new object of class '<em>Sqrt Scale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqrt Scale</em>'.
	 * @generated
	 */
	SqrtScale createSqrtScale();

	/**
	 * Returns a new object of class '<em>Date Scale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Scale</em>'.
	 * @generated
	 */
	DateScale createDateScale();

	/**
	 * Returns a new object of class '<em>Scale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scale</em>'.
	 * @generated
	 */
	Scale createScale();

	/**
	 * Returns a new object of class '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source</em>'.
	 * @generated
	 */
	DataSource createDataSource();

	/**
	 * Returns a new object of class '<em>Data Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Row</em>'.
	 * @generated
	 */
	DataRow createDataRow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnalysisPackage getAnalysisPackage();

} //AnalysisFactory
