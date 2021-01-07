/**
 */
package se.lnu.joa.covid.model.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see se.lnu.joa.covid.model.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lnu.se/dv651/covid19/config";

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
	ConfigPackage eINSTANCE = se.lnu.joa.covid.model.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.impl.ConfigImpl
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__VISUALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Regression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__REGRESSION = 2;

	/**
	 * The feature id for the '<em><b>Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ANIMATION = 3;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.impl.DataModelImpl
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Dataset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATASET_NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATA_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__COLUMNS = 2;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl <em>Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.impl.VisualizationImpl
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getVisualization()
	 * @generated
	 */
	int VISUALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Axes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__AXES = 1;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__INFO = 2;

	/**
	 * The number of structural features of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.impl.AnimationImpl <em>Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.impl.AnimationImpl
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getAnimation()
	 * @generated
	 */
	int ANIMATION = 3;

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
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__DURATION = 4;

	/**
	 * The feature id for the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__OUTPUT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__OUTPUT_PATH = 6;

	/**
	 * The number of structural features of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION___VALIDATE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.impl.RegressionImpl <em>Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.impl.RegressionImpl
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getRegression()
	 * @generated
	 */
	int REGRESSION = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Dependent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION__DEPENDENT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Independent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION__INDEPENDENT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.impl.AxisImpl <em>Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.impl.AxisImpl
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__SCALE = 2;

	/**
	 * The number of structural features of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.impl.AxesImpl <em>Axes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.impl.AxesImpl
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getAxes()
	 * @generated
	 */
	int AXES = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXES__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXES__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXES__Z = 2;

	/**
	 * The number of structural features of the '<em>Axes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Axes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.impl.VisualizationInfoImpl <em>Visualization Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.impl.VisualizationInfoImpl
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getVisualizationInfo()
	 * @generated
	 */
	int VISUALIZATION_INFO = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_INFO__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Sub Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_INFO__SUB_TITLE = 1;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_INFO__CAPTION = 2;

	/**
	 * The number of structural features of the '<em>Visualization Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_INFO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Visualization Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.impl.ScaleImpl <em>Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.impl.ScaleImpl
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getScale()
	 * @generated
	 */
	int SCALE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Breaks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__BREAKS = 2;

	/**
	 * The number of structural features of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.VisualizationType <em>Visualization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.VisualizationType
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getVisualizationType()
	 * @generated
	 */
	int VISUALIZATION_TYPE = 9;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.RegressionType <em>Regression Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.RegressionType
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getRegressionType()
	 * @generated
	 */
	int REGRESSION_TYPE = 10;


	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.config.ScaleType <em>Scale Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.config.ScaleType
	 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getScaleType()
	 * @generated
	 */
	int SCALE_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.config.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see se.lnu.joa.covid.model.config.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.config.Config#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see se.lnu.joa.covid.model.config.Config#getSource()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Source();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.config.Config#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visualization</em>'.
	 * @see se.lnu.joa.covid.model.config.Config#getVisualization()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Visualization();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.config.Config#getRegression <em>Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regression</em>'.
	 * @see se.lnu.joa.covid.model.config.Config#getRegression()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Regression();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.config.Config#getAnimation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Animation</em>'.
	 * @see se.lnu.joa.covid.model.config.Config#getAnimation()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Animation();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.config.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see se.lnu.joa.covid.model.config.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.DataModel#getDatasetName <em>Dataset Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset Name</em>'.
	 * @see se.lnu.joa.covid.model.config.DataModel#getDatasetName()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_DatasetName();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.DataModel#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see se.lnu.joa.covid.model.config.DataModel#getDataSource()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_DataSource();

	/**
	 * Returns the meta object for the attribute list '{@link se.lnu.joa.covid.model.config.DataModel#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Columns</em>'.
	 * @see se.lnu.joa.covid.model.config.DataModel#getColumns()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_Columns();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.config.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization</em>'.
	 * @see se.lnu.joa.covid.model.config.Visualization
	 * @generated
	 */
	EClass getVisualization();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Visualization#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see se.lnu.joa.covid.model.config.Visualization#getType()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_Type();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.config.Visualization#getAxes <em>Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Axes</em>'.
	 * @see se.lnu.joa.covid.model.config.Visualization#getAxes()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Axes();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.config.Visualization#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see se.lnu.joa.covid.model.config.Visualization#getInfo()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Info();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.config.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation</em>'.
	 * @see se.lnu.joa.covid.model.config.Animation
	 * @generated
	 */
	EClass getAnimation();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Animation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see se.lnu.joa.covid.model.config.Animation#getLabel()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Label();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Animation#getTransitionTime <em>Transition Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Time</em>'.
	 * @see se.lnu.joa.covid.model.config.Animation#getTransitionTime()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_TransitionTime();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Animation#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see se.lnu.joa.covid.model.config.Animation#getWidth()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Width();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Animation#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see se.lnu.joa.covid.model.config.Animation#getHeight()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Height();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Animation#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see se.lnu.joa.covid.model.config.Animation#getDuration()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Duration();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Animation#getOutputName <em>Output Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Name</em>'.
	 * @see se.lnu.joa.covid.model.config.Animation#getOutputName()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_OutputName();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Animation#getOutputPath <em>Output Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Path</em>'.
	 * @see se.lnu.joa.covid.model.config.Animation#getOutputPath()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_OutputPath();

	/**
	 * Returns the meta object for the '{@link se.lnu.joa.covid.model.config.Animation#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see se.lnu.joa.covid.model.config.Animation#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAnimation__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.config.Regression <em>Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regression</em>'.
	 * @see se.lnu.joa.covid.model.config.Regression
	 * @generated
	 */
	EClass getRegression();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Regression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see se.lnu.joa.covid.model.config.Regression#getType()
	 * @see #getRegression()
	 * @generated
	 */
	EAttribute getRegression_Type();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Regression#getDependentValue <em>Dependent Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Value</em>'.
	 * @see se.lnu.joa.covid.model.config.Regression#getDependentValue()
	 * @see #getRegression()
	 * @generated
	 */
	EAttribute getRegression_DependentValue();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Regression#getIndependentValue <em>Independent Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Independent Value</em>'.
	 * @see se.lnu.joa.covid.model.config.Regression#getIndependentValue()
	 * @see #getRegression()
	 * @generated
	 */
	EAttribute getRegression_IndependentValue();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.config.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis</em>'.
	 * @see se.lnu.joa.covid.model.config.Axis
	 * @generated
	 */
	EClass getAxis();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Axis#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see se.lnu.joa.covid.model.config.Axis#getLabel()
	 * @see #getAxis()
	 * @generated
	 */
	EAttribute getAxis_Label();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Axis#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see se.lnu.joa.covid.model.config.Axis#getColumn()
	 * @see #getAxis()
	 * @generated
	 */
	EAttribute getAxis_Column();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.config.Axis#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see se.lnu.joa.covid.model.config.Axis#getScale()
	 * @see #getAxis()
	 * @generated
	 */
	EReference getAxis_Scale();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.config.Axes <em>Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axes</em>'.
	 * @see se.lnu.joa.covid.model.config.Axes
	 * @generated
	 */
	EClass getAxes();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.config.Axes#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see se.lnu.joa.covid.model.config.Axes#getX()
	 * @see #getAxes()
	 * @generated
	 */
	EReference getAxes_X();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.config.Axes#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y</em>'.
	 * @see se.lnu.joa.covid.model.config.Axes#getY()
	 * @see #getAxes()
	 * @generated
	 */
	EReference getAxes_Y();

	/**
	 * Returns the meta object for the containment reference '{@link se.lnu.joa.covid.model.config.Axes#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Z</em>'.
	 * @see se.lnu.joa.covid.model.config.Axes#getZ()
	 * @see #getAxes()
	 * @generated
	 */
	EReference getAxes_Z();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.config.VisualizationInfo <em>Visualization Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Info</em>'.
	 * @see se.lnu.joa.covid.model.config.VisualizationInfo
	 * @generated
	 */
	EClass getVisualizationInfo();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.VisualizationInfo#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see se.lnu.joa.covid.model.config.VisualizationInfo#getTitle()
	 * @see #getVisualizationInfo()
	 * @generated
	 */
	EAttribute getVisualizationInfo_Title();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.VisualizationInfo#getSubTitle <em>Sub Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Title</em>'.
	 * @see se.lnu.joa.covid.model.config.VisualizationInfo#getSubTitle()
	 * @see #getVisualizationInfo()
	 * @generated
	 */
	EAttribute getVisualizationInfo_SubTitle();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.VisualizationInfo#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see se.lnu.joa.covid.model.config.VisualizationInfo#getCaption()
	 * @see #getVisualizationInfo()
	 * @generated
	 */
	EAttribute getVisualizationInfo_Caption();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.config.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale</em>'.
	 * @see se.lnu.joa.covid.model.config.Scale
	 * @generated
	 */
	EClass getScale();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Scale#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see se.lnu.joa.covid.model.config.Scale#getType()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_Type();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Scale#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see se.lnu.joa.covid.model.config.Scale#getFormat()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_Format();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.config.Scale#getBreaks <em>Breaks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breaks</em>'.
	 * @see se.lnu.joa.covid.model.config.Scale#getBreaks()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_Breaks();

	/**
	 * Returns the meta object for enum '{@link se.lnu.joa.covid.model.config.VisualizationType <em>Visualization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visualization Type</em>'.
	 * @see se.lnu.joa.covid.model.config.VisualizationType
	 * @generated
	 */
	EEnum getVisualizationType();

	/**
	 * Returns the meta object for enum '{@link se.lnu.joa.covid.model.config.RegressionType <em>Regression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Regression Type</em>'.
	 * @see se.lnu.joa.covid.model.config.RegressionType
	 * @generated
	 */
	EEnum getRegressionType();

	/**
	 * Returns the meta object for enum '{@link se.lnu.joa.covid.model.config.ScaleType <em>Scale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scale Type</em>'.
	 * @see se.lnu.joa.covid.model.config.ScaleType
	 * @generated
	 */
	EEnum getScaleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

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
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.impl.ConfigImpl
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__SOURCE = eINSTANCE.getConfig_Source();

		/**
		 * The meta object literal for the '<em><b>Visualization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__VISUALIZATION = eINSTANCE.getConfig_Visualization();

		/**
		 * The meta object literal for the '<em><b>Regression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__REGRESSION = eINSTANCE.getConfig_Regression();

		/**
		 * The meta object literal for the '<em><b>Animation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__ANIMATION = eINSTANCE.getConfig_Animation();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.impl.DataModelImpl
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Dataset Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__DATASET_NAME = eINSTANCE.getDataModel_DatasetName();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__DATA_SOURCE = eINSTANCE.getDataModel_DataSource();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__COLUMNS = eINSTANCE.getDataModel_Columns();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl <em>Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.impl.VisualizationImpl
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getVisualization()
		 * @generated
		 */
		EClass VISUALIZATION = eINSTANCE.getVisualization();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__TYPE = eINSTANCE.getVisualization_Type();

		/**
		 * The meta object literal for the '<em><b>Axes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__AXES = eINSTANCE.getVisualization_Axes();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__INFO = eINSTANCE.getVisualization_Info();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.impl.AnimationImpl <em>Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.impl.AnimationImpl
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getAnimation()
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
		 * The meta object literal for the '<em><b>Output Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__OUTPUT_NAME = eINSTANCE.getAnimation_OutputName();

		/**
		 * The meta object literal for the '<em><b>Output Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__OUTPUT_PATH = eINSTANCE.getAnimation_OutputPath();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANIMATION___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAnimation__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.impl.RegressionImpl <em>Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.impl.RegressionImpl
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getRegression()
		 * @generated
		 */
		EClass REGRESSION = eINSTANCE.getRegression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGRESSION__TYPE = eINSTANCE.getRegression_Type();

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
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.impl.AxisImpl <em>Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.impl.AxisImpl
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getAxis()
		 * @generated
		 */
		EClass AXIS = eINSTANCE.getAxis();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS__LABEL = eINSTANCE.getAxis_Label();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS__COLUMN = eINSTANCE.getAxis_Column();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS__SCALE = eINSTANCE.getAxis_Scale();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.impl.AxesImpl <em>Axes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.impl.AxesImpl
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getAxes()
		 * @generated
		 */
		EClass AXES = eINSTANCE.getAxes();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXES__X = eINSTANCE.getAxes_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXES__Y = eINSTANCE.getAxes_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXES__Z = eINSTANCE.getAxes_Z();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.impl.VisualizationInfoImpl <em>Visualization Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.impl.VisualizationInfoImpl
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getVisualizationInfo()
		 * @generated
		 */
		EClass VISUALIZATION_INFO = eINSTANCE.getVisualizationInfo();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION_INFO__TITLE = eINSTANCE.getVisualizationInfo_Title();

		/**
		 * The meta object literal for the '<em><b>Sub Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION_INFO__SUB_TITLE = eINSTANCE.getVisualizationInfo_SubTitle();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION_INFO__CAPTION = eINSTANCE.getVisualizationInfo_Caption();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.impl.ScaleImpl <em>Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.impl.ScaleImpl
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getScale()
		 * @generated
		 */
		EClass SCALE = eINSTANCE.getScale();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__TYPE = eINSTANCE.getScale_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__FORMAT = eINSTANCE.getScale_Format();

		/**
		 * The meta object literal for the '<em><b>Breaks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__BREAKS = eINSTANCE.getScale_Breaks();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.VisualizationType <em>Visualization Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.VisualizationType
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getVisualizationType()
		 * @generated
		 */
		EEnum VISUALIZATION_TYPE = eINSTANCE.getVisualizationType();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.RegressionType <em>Regression Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.RegressionType
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getRegressionType()
		 * @generated
		 */
		EEnum REGRESSION_TYPE = eINSTANCE.getRegressionType();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.config.ScaleType <em>Scale Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.config.ScaleType
		 * @see se.lnu.joa.covid.model.config.impl.ConfigPackageImpl#getScaleType()
		 * @generated
		 */
		EEnum SCALE_TYPE = eINSTANCE.getScaleType();

	}

} //ConfigPackage
