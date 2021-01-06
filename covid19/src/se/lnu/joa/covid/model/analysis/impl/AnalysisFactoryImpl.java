/**
 */
package se.lnu.joa.covid.model.analysis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.lnu.joa.covid.model.analysis.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisFactoryImpl extends EFactoryImpl implements AnalysisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnalysisFactory init() {
		try {
			AnalysisFactory theAnalysisFactory = (AnalysisFactory)EPackage.Registry.INSTANCE.getEFactory(AnalysisPackage.eNS_URI);
			if (theAnalysisFactory != null) {
				return theAnalysisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnalysisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnalysisPackage.ANALYTIC_MODEL: return createAnalyticModel();
			case AnalysisPackage.VISUALIZATION: return createVisualization();
			case AnalysisPackage.REGRESSION: return createRegression();
			case AnalysisPackage.LINNEAR_REGRESSION: return createLinnearRegression();
			case AnalysisPackage.LOGARITHMIC_REGRESSION: return createLogarithmicRegression();
			case AnalysisPackage.LINEAR_PLOT: return createLinearPlot();
			case AnalysisPackage.SCATTER_PLOT: return createScatterPlot();
			case AnalysisPackage.ANIMATION: return createAnimation();
			case AnalysisPackage.LOG10_SCALE: return createLog10Scale();
			case AnalysisPackage.SQRT_SCALE: return createSqrtScale();
			case AnalysisPackage.DATE_SCALE: return createDateScale();
			case AnalysisPackage.SCALE: return createScale();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalyticModel createAnalyticModel() {
		AnalyticModelImpl analyticModel = new AnalyticModelImpl();
		return analyticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visualization createVisualization() {
		VisualizationImpl visualization = new VisualizationImpl();
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regression createRegression() {
		RegressionImpl regression = new RegressionImpl();
		return regression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinnearRegression createLinnearRegression() {
		LinnearRegressionImpl linnearRegression = new LinnearRegressionImpl();
		return linnearRegression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogarithmicRegression createLogarithmicRegression() {
		LogarithmicRegressionImpl logarithmicRegression = new LogarithmicRegressionImpl();
		return logarithmicRegression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearPlot createLinearPlot() {
		LinearPlotImpl linearPlot = new LinearPlotImpl();
		return linearPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScatterPlot createScatterPlot() {
		ScatterPlotImpl scatterPlot = new ScatterPlotImpl();
		return scatterPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Animation createAnimation() {
		AnimationImpl animation = new AnimationImpl();
		return animation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Log10Scale createLog10Scale() {
		Log10ScaleImpl log10Scale = new Log10ScaleImpl();
		return log10Scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqrtScale createSqrtScale() {
		SqrtScaleImpl sqrtScale = new SqrtScaleImpl();
		return sqrtScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateScale createDateScale() {
		DateScaleImpl dateScale = new DateScaleImpl();
		return dateScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scale createScale() {
		ScaleImpl scale = new ScaleImpl();
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisPackage getAnalysisPackage() {
		return (AnalysisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnalysisPackage getPackage() {
		return AnalysisPackage.eINSTANCE;
	}

} //AnalysisFactoryImpl
