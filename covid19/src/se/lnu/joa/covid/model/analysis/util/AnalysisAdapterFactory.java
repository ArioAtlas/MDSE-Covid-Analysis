/**
 */
package se.lnu.joa.covid.model.analysis.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.lnu.joa.covid.model.analysis.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage
 * @generated
 */
public class AnalysisAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnalysisPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnalysisPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisSwitch<Adapter> modelSwitch =
		new AnalysisSwitch<Adapter>() {
			@Override
			public Adapter caseAnalyticModel(AnalyticModel object) {
				return createAnalyticModelAdapter();
			}
			@Override
			public Adapter caseVisualization(Visualization object) {
				return createVisualizationAdapter();
			}
			@Override
			public Adapter caseRegression(Regression object) {
				return createRegressionAdapter();
			}
			@Override
			public Adapter caseLinnearRegression(LinnearRegression object) {
				return createLinnearRegressionAdapter();
			}
			@Override
			public Adapter caseLogarithmicRegression(LogarithmicRegression object) {
				return createLogarithmicRegressionAdapter();
			}
			@Override
			public Adapter caseLinearPlot(LinearPlot object) {
				return createLinearPlotAdapter();
			}
			@Override
			public Adapter caseScatterPlot(ScatterPlot object) {
				return createScatterPlotAdapter();
			}
			@Override
			public Adapter caseAnimation(Animation object) {
				return createAnimationAdapter();
			}
			@Override
			public Adapter caseLog10Scale(Log10Scale object) {
				return createLog10ScaleAdapter();
			}
			@Override
			public Adapter caseSqrtScale(SqrtScale object) {
				return createSqrtScaleAdapter();
			}
			@Override
			public Adapter caseDateScale(DateScale object) {
				return createDateScaleAdapter();
			}
			@Override
			public Adapter caseScale(Scale object) {
				return createScaleAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseDataRow(DataRow object) {
				return createDataRowAdapter();
			}
			@Override
			public Adapter caseDataHeader(DataHeader object) {
				return createDataHeaderAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.AnalyticModel <em>Analytic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.AnalyticModel
	 * @generated
	 */
	public Adapter createAnalyticModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.Visualization
	 * @generated
	 */
	public Adapter createVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.Regression <em>Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.Regression
	 * @generated
	 */
	public Adapter createRegressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.LinnearRegression <em>Linnear Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.LinnearRegression
	 * @generated
	 */
	public Adapter createLinnearRegressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.LogarithmicRegression <em>Logarithmic Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.LogarithmicRegression
	 * @generated
	 */
	public Adapter createLogarithmicRegressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.LinearPlot <em>Linear Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.LinearPlot
	 * @generated
	 */
	public Adapter createLinearPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.ScatterPlot <em>Scatter Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.ScatterPlot
	 * @generated
	 */
	public Adapter createScatterPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.Animation
	 * @generated
	 */
	public Adapter createAnimationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.Log10Scale <em>Log10 Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.Log10Scale
	 * @generated
	 */
	public Adapter createLog10ScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.SqrtScale <em>Sqrt Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.SqrtScale
	 * @generated
	 */
	public Adapter createSqrtScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.DateScale <em>Date Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.DateScale
	 * @generated
	 */
	public Adapter createDateScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.Scale
	 * @generated
	 */
	public Adapter createScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.DataRow <em>Data Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.DataRow
	 * @generated
	 */
	public Adapter createDataRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.lnu.joa.covid.model.analysis.DataHeader <em>Data Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.lnu.joa.covid.model.analysis.DataHeader
	 * @generated
	 */
	public Adapter createDataHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AnalysisAdapterFactory
