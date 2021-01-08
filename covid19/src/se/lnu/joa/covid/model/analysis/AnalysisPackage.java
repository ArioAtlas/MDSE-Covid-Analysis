/**
 */
package se.lnu.joa.covid.model.analysis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.lnu.joa.covid.model.analysis.AnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface AnalysisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "analysis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lnu.se/dv651/covid19/analysis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "covid19";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisPackage eINSTANCE = se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.AnalyticModelImpl <em>Analytic Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalyticModelImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getAnalyticModel()
	 * @generated
	 */
	int ANALYTIC_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Regression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_MODEL__REGRESSION = 0;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_MODEL__VISUALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_MODEL__DATA_SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Analytic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Analytic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl <em>Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.VisualizationImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getVisualization()
	 * @generated
	 */
	int VISUALIZATION = 1;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__XAXIS = 0;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__YAXIS = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Sub Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__SUB_TITLE = 4;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__XAXIS_LABEL = 5;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__YAXIS_LABEL = 6;

	/**
	 * The feature id for the '<em><b>Color Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__COLOR_LABEL = 7;

	/**
	 * The feature id for the '<em><b>Scale x</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__SCALE_X = 8;

	/**
	 * The feature id for the '<em><b>Scale y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__SCALE_Y = 9;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__CAPTION = 10;

	/**
	 * The number of structural features of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.RegressionImpl <em>Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.RegressionImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getRegression()
	 * @generated
	 */
	int REGRESSION = 2;

	/**
	 * The feature id for the '<em><b>Dependent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION__DEPENDENT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Independent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION__INDEPENDENT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.LinnearRegressionImpl <em>Linnear Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.LinnearRegressionImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getLinnearRegression()
	 * @generated
	 */
	int LINNEAR_REGRESSION = 3;

	/**
	 * The feature id for the '<em><b>Dependent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINNEAR_REGRESSION__DEPENDENT_VALUE = REGRESSION__DEPENDENT_VALUE;

	/**
	 * The feature id for the '<em><b>Independent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINNEAR_REGRESSION__INDEPENDENT_VALUE = REGRESSION__INDEPENDENT_VALUE;

	/**
	 * The number of structural features of the '<em>Linnear Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINNEAR_REGRESSION_FEATURE_COUNT = REGRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linnear Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINNEAR_REGRESSION_OPERATION_COUNT = REGRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.LogarithmicRegressionImpl <em>Logarithmic Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.LogarithmicRegressionImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getLogarithmicRegression()
	 * @generated
	 */
	int LOGARITHMIC_REGRESSION = 4;

	/**
	 * The feature id for the '<em><b>Dependent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_REGRESSION__DEPENDENT_VALUE = REGRESSION__DEPENDENT_VALUE;

	/**
	 * The feature id for the '<em><b>Independent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_REGRESSION__INDEPENDENT_VALUE = REGRESSION__INDEPENDENT_VALUE;

	/**
	 * The number of structural features of the '<em>Logarithmic Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_REGRESSION_FEATURE_COUNT = REGRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logarithmic Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_REGRESSION_OPERATION_COUNT = REGRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.LinearPlotImpl <em>Linear Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.LinearPlotImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getLinearPlot()
	 * @generated
	 */
	int LINEAR_PLOT = 5;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__XAXIS = VISUALIZATION__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__YAXIS = VISUALIZATION__YAXIS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__COLOR = VISUALIZATION__COLOR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__TITLE = VISUALIZATION__TITLE;

	/**
	 * The feature id for the '<em><b>Sub Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__SUB_TITLE = VISUALIZATION__SUB_TITLE;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__XAXIS_LABEL = VISUALIZATION__XAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__YAXIS_LABEL = VISUALIZATION__YAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>Color Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__COLOR_LABEL = VISUALIZATION__COLOR_LABEL;

	/**
	 * The feature id for the '<em><b>Scale x</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__SCALE_X = VISUALIZATION__SCALE_X;

	/**
	 * The feature id for the '<em><b>Scale y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__SCALE_Y = VISUALIZATION__SCALE_Y;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__CAPTION = VISUALIZATION__CAPTION;

	/**
	 * The feature id for the '<em><b>Line Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__LINE_SIZE = VISUALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__LINE_ALPHA = VISUALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Animation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT__ANIMATION = VISUALIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Linear Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT_FEATURE_COUNT = VISUALIZATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Linear Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_PLOT_OPERATION_COUNT = VISUALIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.ScatterPlotImpl <em>Scatter Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.ScatterPlotImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getScatterPlot()
	 * @generated
	 */
	int SCATTER_PLOT = 6;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__XAXIS = VISUALIZATION__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__YAXIS = VISUALIZATION__YAXIS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__COLOR = VISUALIZATION__COLOR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__TITLE = VISUALIZATION__TITLE;

	/**
	 * The feature id for the '<em><b>Sub Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__SUB_TITLE = VISUALIZATION__SUB_TITLE;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__XAXIS_LABEL = VISUALIZATION__XAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__YAXIS_LABEL = VISUALIZATION__YAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>Color Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__COLOR_LABEL = VISUALIZATION__COLOR_LABEL;

	/**
	 * The feature id for the '<em><b>Scale x</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__SCALE_X = VISUALIZATION__SCALE_X;

	/**
	 * The feature id for the '<em><b>Scale y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__SCALE_Y = VISUALIZATION__SCALE_Y;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__CAPTION = VISUALIZATION__CAPTION;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__ALPHA = VISUALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__STROKE = VISUALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Animation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__ANIMATION = VISUALIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scatter Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT_FEATURE_COUNT = VISUALIZATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Scatter Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT_OPERATION_COUNT = VISUALIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl <em>Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.AnimationImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getAnimation()
	 * @generated
	 */
	int ANIMATION = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__TRANSITION_TIME = 1;

	/**
	 * The feature id for the '<em><b>Shadow Wake</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__SHADOW_WAKE = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__HEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__DURATION = 5;

	/**
	 * The feature id for the '<em><b>Fps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__FPS = 6;

	/**
	 * The feature id for the '<em><b>End Pause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__END_PAUSE = 7;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__RESOLUTION = 8;

	/**
	 * The feature id for the '<em><b>Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__OUTPUT_PATH = 9;

	/**
	 * The feature id for the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__OUTPUT_NAME = 10;

	/**
	 * The number of structural features of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.ScaleImpl <em>Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.ScaleImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getScale()
	 * @generated
	 */
	int SCALE = 11;

	/**
	 * The number of structural features of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.Log10ScaleImpl <em>Log10 Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.Log10ScaleImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getLog10Scale()
	 * @generated
	 */
	int LOG10_SCALE = 8;

	/**
	 * The number of structural features of the '<em>Log10 Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG10_SCALE_FEATURE_COUNT = SCALE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Log10 Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG10_SCALE_OPERATION_COUNT = SCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.SqrtScaleImpl <em>Sqrt Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.SqrtScaleImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getSqrtScale()
	 * @generated
	 */
	int SQRT_SCALE = 9;

	/**
	 * The number of structural features of the '<em>Sqrt Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT_SCALE_FEATURE_COUNT = SCALE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqrt Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT_SCALE_OPERATION_COUNT = SCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.DateScaleImpl <em>Date Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.DateScaleImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getDateScale()
	 * @generated
	 */
	int DATE_SCALE = 10;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SCALE__FORMAT = SCALE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Breaks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SCALE__BREAKS = SCALE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SCALE_FEATURE_COUNT = SCALE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SCALE_OPERATION_COUNT = SCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.DataSourceImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DATA = 2;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.analysis.impl.DataColumnImpl <em>Data Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.analysis.impl.DataColumnImpl
	 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getDataColumn()
	 * @generated
	 */
	int DATA_COLUMN = 13;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLUMN__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLUMN__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Data Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLUMN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.AnalyticModel <em>Analytic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analytic Model</em>'.
	 * @see se.lnu.joa.covid.model.analysis.AnalyticModel
	 * @generated
	 */
	EClass getAnalyticModel();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getRegression <em>Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regression</em>'.
	 * @see se.lnu.joa.covid.model.analysis.AnalyticModel#getRegression()
	 * @see #getAnalyticModel()
	 * @generated
	 */
	EReference getAnalyticModel_Regression();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visualization</em>'.
	 * @see se.lnu.joa.covid.model.analysis.AnalyticModel#getVisualization()
	 * @see #getAnalyticModel()
	 * @generated
	 */
	EReference getAnalyticModel_Visualization();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.analysis.AnalyticModel#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Source</em>'.
	 * @see se.lnu.joa.covid.model.analysis.AnalyticModel#getDataSource()
	 * @see #getAnalyticModel()
	 * @generated
	 */
	EReference getAnalyticModel_DataSource();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization
	 * @generated
	 */
	EClass getVisualization();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Visualization#getXAxis <em>XAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization#getXAxis()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_XAxis();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Visualization#getYAxis <em>YAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization#getYAxis()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_YAxis();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Visualization#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization#getColor()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_Color();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Visualization#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization#getTitle()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_Title();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Visualization#getSubTitle <em>Sub Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Title</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization#getSubTitle()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_SubTitle();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Visualization#getXAxisLabel <em>XAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis Label</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization#getXAxisLabel()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_XAxisLabel();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Visualization#getYAxisLabel <em>YAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis Label</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization#getYAxisLabel()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_YAxisLabel();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Visualization#getColorLabel <em>Color Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Label</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization#getColorLabel()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_ColorLabel();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.analysis.Visualization#getScale_x <em>Scale x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale x</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization#getScale_x()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Scale_x();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.analysis.Visualization#getScale_y <em>Scale y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale y</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization#getScale_y()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Scale_y();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Visualization#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Visualization#getCaption()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_Caption();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.Regression <em>Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regression</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Regression
	 * @generated
	 */
	EClass getRegression();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Regression#getDependentValue <em>Dependent Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Value</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Regression#getDependentValue()
	 * @see #getRegression()
	 * @generated
	 */
	EAttribute getRegression_DependentValue();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Regression#getIndependentValue <em>Independent Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Independent Value</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Regression#getIndependentValue()
	 * @see #getRegression()
	 * @generated
	 */
	EAttribute getRegression_IndependentValue();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.LinnearRegression <em>Linnear Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linnear Regression</em>'.
	 * @see se.lnu.joa.covid.model.analysis.LinnearRegression
	 * @generated
	 */
	EClass getLinnearRegression();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.LogarithmicRegression <em>Logarithmic Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logarithmic Regression</em>'.
	 * @see se.lnu.joa.covid.model.analysis.LogarithmicRegression
	 * @generated
	 */
	EClass getLogarithmicRegression();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.LinearPlot <em>Linear Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Plot</em>'.
	 * @see se.lnu.joa.covid.model.analysis.LinearPlot
	 * @generated
	 */
	EClass getLinearPlot();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.LinearPlot#getLineSize <em>Line Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Size</em>'.
	 * @see se.lnu.joa.covid.model.analysis.LinearPlot#getLineSize()
	 * @see #getLinearPlot()
	 * @generated
	 */
	EAttribute getLinearPlot_LineSize();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.LinearPlot#getLineAlpha <em>Line Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Alpha</em>'.
	 * @see se.lnu.joa.covid.model.analysis.LinearPlot#getLineAlpha()
	 * @see #getLinearPlot()
	 * @generated
	 */
	EAttribute getLinearPlot_LineAlpha();

	/**
	 * Returns the meta object for the containment reference list '{@link se.lnu.joa.covid.model.analysis.LinearPlot#getAnimation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animation</em>'.
	 * @see se.lnu.joa.covid.model.analysis.LinearPlot#getAnimation()
	 * @see #getLinearPlot()
	 * @generated
	 */
	EReference getLinearPlot_Animation();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.ScatterPlot <em>Scatter Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scatter Plot</em>'.
	 * @see se.lnu.joa.covid.model.analysis.ScatterPlot
	 * @generated
	 */
	EClass getScatterPlot();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.ScatterPlot#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see se.lnu.joa.covid.model.analysis.ScatterPlot#getAlpha()
	 * @see #getScatterPlot()
	 * @generated
	 */
	EAttribute getScatterPlot_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.ScatterPlot#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see se.lnu.joa.covid.model.analysis.ScatterPlot#getStroke()
	 * @see #getScatterPlot()
	 * @generated
	 */
	EAttribute getScatterPlot_Stroke();

	/**
	 * Returns the meta object for the containment reference list '{@link se.lnu.joa.covid.model.analysis.ScatterPlot#getAnimation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animation</em>'.
	 * @see se.lnu.joa.covid.model.analysis.ScatterPlot#getAnimation()
	 * @see #getScatterPlot()
	 * @generated
	 */
	EReference getScatterPlot_Animation();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation
	 * @generated
	 */
	EClass getAnimation();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Animation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation#getLabel()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Label();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Animation#getTransitionTime <em>Transition Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Time</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation#getTransitionTime()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_TransitionTime();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Animation#getShadowWake <em>Shadow Wake</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Wake</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation#getShadowWake()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_ShadowWake();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Animation#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation#getWidth()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Width();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Animation#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation#getHeight()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Height();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Animation#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation#getDuration()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Duration();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Animation#getFps <em>Fps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fps</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation#getFps()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Fps();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Animation#getEndPause <em>End Pause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Pause</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation#getEndPause()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_EndPause();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Animation#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation#getResolution()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Animation#getOutputPath <em>Output Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Path</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation#getOutputPath()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_OutputPath();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.Animation#getOutputName <em>Output Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Name</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Animation#getOutputName()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_OutputName();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.Log10Scale <em>Log10 Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log10 Scale</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Log10Scale
	 * @generated
	 */
	EClass getLog10Scale();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.SqrtScale <em>Sqrt Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqrt Scale</em>'.
	 * @see se.lnu.joa.covid.model.analysis.SqrtScale
	 * @generated
	 */
	EClass getSqrtScale();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.DateScale <em>Date Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Scale</em>'.
	 * @see se.lnu.joa.covid.model.analysis.DateScale
	 * @generated
	 */
	EClass getDateScale();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.DateScale#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see se.lnu.joa.covid.model.analysis.DateScale#getFormat()
	 * @see #getDateScale()
	 * @generated
	 */
	EAttribute getDateScale_Format();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.DateScale#getBreaks <em>Breaks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breaks</em>'.
	 * @see se.lnu.joa.covid.model.analysis.DateScale#getBreaks()
	 * @see #getDateScale()
	 * @generated
	 */
	EAttribute getDateScale_Breaks();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale</em>'.
	 * @see se.lnu.joa.covid.model.analysis.Scale
	 * @generated
	 */
	EClass getScale();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see se.lnu.joa.covid.model.analysis.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.DataSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.lnu.joa.covid.model.analysis.DataSource#getName()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.DataSource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see se.lnu.joa.covid.model.analysis.DataSource#getPath()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link se.lnu.joa.covid.model.analysis.DataSource#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see se.lnu.joa.covid.model.analysis.DataSource#getData()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Data();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.analysis.DataColumn <em>Data Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Column</em>'.
	 * @see se.lnu.joa.covid.model.analysis.DataColumn
	 * @generated
	 */
	EClass getDataColumn();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.analysis.DataColumn#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see se.lnu.joa.covid.model.analysis.DataColumn#getHeader()
	 * @see #getDataColumn()
	 * @generated
	 */
	EAttribute getDataColumn_Header();

	/**
	 * Returns the meta object for the attribute list '{@link se.lnu.joa.covid.model.analysis.DataColumn#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see se.lnu.joa.covid.model.analysis.DataColumn#getValues()
	 * @see #getDataColumn()
	 * @generated
	 */
	EAttribute getDataColumn_Values();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnalysisFactory getAnalysisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.AnalyticModelImpl <em>Analytic Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalyticModelImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getAnalyticModel()
		 * @generated
		 */
		EClass ANALYTIC_MODEL = eINSTANCE.getAnalyticModel();

		/**
		 * The meta object literal for the '<em><b>Regression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYTIC_MODEL__REGRESSION = eINSTANCE.getAnalyticModel_Regression();

		/**
		 * The meta object literal for the '<em><b>Visualization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYTIC_MODEL__VISUALIZATION = eINSTANCE.getAnalyticModel_Visualization();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYTIC_MODEL__DATA_SOURCE = eINSTANCE.getAnalyticModel_DataSource();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.VisualizationImpl <em>Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.VisualizationImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getVisualization()
		 * @generated
		 */
		EClass VISUALIZATION = eINSTANCE.getVisualization();

		/**
		 * The meta object literal for the '<em><b>XAxis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__XAXIS = eINSTANCE.getVisualization_XAxis();

		/**
		 * The meta object literal for the '<em><b>YAxis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__YAXIS = eINSTANCE.getVisualization_YAxis();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__COLOR = eINSTANCE.getVisualization_Color();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__TITLE = eINSTANCE.getVisualization_Title();

		/**
		 * The meta object literal for the '<em><b>Sub Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__SUB_TITLE = eINSTANCE.getVisualization_SubTitle();

		/**
		 * The meta object literal for the '<em><b>XAxis Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__XAXIS_LABEL = eINSTANCE.getVisualization_XAxisLabel();

		/**
		 * The meta object literal for the '<em><b>YAxis Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__YAXIS_LABEL = eINSTANCE.getVisualization_YAxisLabel();

		/**
		 * The meta object literal for the '<em><b>Color Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__COLOR_LABEL = eINSTANCE.getVisualization_ColorLabel();

		/**
		 * The meta object literal for the '<em><b>Scale x</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__SCALE_X = eINSTANCE.getVisualization_Scale_x();

		/**
		 * The meta object literal for the '<em><b>Scale y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__SCALE_Y = eINSTANCE.getVisualization_Scale_y();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__CAPTION = eINSTANCE.getVisualization_Caption();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.RegressionImpl <em>Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.RegressionImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getRegression()
		 * @generated
		 */
		EClass REGRESSION = eINSTANCE.getRegression();

		/**
		 * The meta object literal for the '<em><b>Dependent Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGRESSION__DEPENDENT_VALUE = eINSTANCE.getRegression_DependentValue();

		/**
		 * The meta object literal for the '<em><b>Independent Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGRESSION__INDEPENDENT_VALUE = eINSTANCE.getRegression_IndependentValue();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.LinnearRegressionImpl <em>Linnear Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.LinnearRegressionImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getLinnearRegression()
		 * @generated
		 */
		EClass LINNEAR_REGRESSION = eINSTANCE.getLinnearRegression();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.LogarithmicRegressionImpl <em>Logarithmic Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.LogarithmicRegressionImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getLogarithmicRegression()
		 * @generated
		 */
		EClass LOGARITHMIC_REGRESSION = eINSTANCE.getLogarithmicRegression();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.LinearPlotImpl <em>Linear Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.LinearPlotImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getLinearPlot()
		 * @generated
		 */
		EClass LINEAR_PLOT = eINSTANCE.getLinearPlot();

		/**
		 * The meta object literal for the '<em><b>Line Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_PLOT__LINE_SIZE = eINSTANCE.getLinearPlot_LineSize();

		/**
		 * The meta object literal for the '<em><b>Line Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_PLOT__LINE_ALPHA = eINSTANCE.getLinearPlot_LineAlpha();

		/**
		 * The meta object literal for the '<em><b>Animation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEAR_PLOT__ANIMATION = eINSTANCE.getLinearPlot_Animation();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.ScatterPlotImpl <em>Scatter Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.ScatterPlotImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getScatterPlot()
		 * @generated
		 */
		EClass SCATTER_PLOT = eINSTANCE.getScatterPlot();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCATTER_PLOT__ALPHA = eINSTANCE.getScatterPlot_Alpha();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCATTER_PLOT__STROKE = eINSTANCE.getScatterPlot_Stroke();

		/**
		 * The meta object literal for the '<em><b>Animation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCATTER_PLOT__ANIMATION = eINSTANCE.getScatterPlot_Animation();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.AnimationImpl <em>Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.AnimationImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getAnimation()
		 * @generated
		 */
		EClass ANIMATION = eINSTANCE.getAnimation();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__LABEL = eINSTANCE.getAnimation_Label();

		/**
		 * The meta object literal for the '<em><b>Transition Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__TRANSITION_TIME = eINSTANCE.getAnimation_TransitionTime();

		/**
		 * The meta object literal for the '<em><b>Shadow Wake</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__SHADOW_WAKE = eINSTANCE.getAnimation_ShadowWake();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__WIDTH = eINSTANCE.getAnimation_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__HEIGHT = eINSTANCE.getAnimation_Height();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__DURATION = eINSTANCE.getAnimation_Duration();

		/**
		 * The meta object literal for the '<em><b>Fps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__FPS = eINSTANCE.getAnimation_Fps();

		/**
		 * The meta object literal for the '<em><b>End Pause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__END_PAUSE = eINSTANCE.getAnimation_EndPause();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__RESOLUTION = eINSTANCE.getAnimation_Resolution();

		/**
		 * The meta object literal for the '<em><b>Output Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__OUTPUT_PATH = eINSTANCE.getAnimation_OutputPath();

		/**
		 * The meta object literal for the '<em><b>Output Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__OUTPUT_NAME = eINSTANCE.getAnimation_OutputName();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.Log10ScaleImpl <em>Log10 Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.Log10ScaleImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getLog10Scale()
		 * @generated
		 */
		EClass LOG10_SCALE = eINSTANCE.getLog10Scale();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.SqrtScaleImpl <em>Sqrt Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.SqrtScaleImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getSqrtScale()
		 * @generated
		 */
		EClass SQRT_SCALE = eINSTANCE.getSqrtScale();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.DateScaleImpl <em>Date Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.DateScaleImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getDateScale()
		 * @generated
		 */
		EClass DATE_SCALE = eINSTANCE.getDateScale();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_SCALE__FORMAT = eINSTANCE.getDateScale_Format();

		/**
		 * The meta object literal for the '<em><b>Breaks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_SCALE__BREAKS = eINSTANCE.getDateScale_Breaks();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.ScaleImpl <em>Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.ScaleImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getScale()
		 * @generated
		 */
		EClass SCALE = eINSTANCE.getScale();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.DataSourceImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__NAME = eINSTANCE.getDataSource_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__PATH = eINSTANCE.getDataSource_Path();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__DATA = eINSTANCE.getDataSource_Data();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.analysis.impl.DataColumnImpl <em>Data Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.analysis.impl.DataColumnImpl
		 * @see se.lnu.joa.covid.model.analysis.impl.AnalysisPackageImpl#getDataColumn()
		 * @generated
		 */
		EClass DATA_COLUMN = eINSTANCE.getDataColumn();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLUMN__HEADER = eINSTANCE.getDataColumn_Header();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLUMN__VALUES = eINSTANCE.getDataColumn_Values();

	}

} //AnalysisPackage
