/**
 */
package se.lnu.joa.covid.model.config.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.lnu.joa.covid.model.config.Animation;
import se.lnu.joa.covid.model.config.Axes;
import se.lnu.joa.covid.model.config.Axis;
import se.lnu.joa.covid.model.config.Config;
import se.lnu.joa.covid.model.config.ConfigFactory;
import se.lnu.joa.covid.model.config.ConfigPackage;
import se.lnu.joa.covid.model.config.DataModel;
import se.lnu.joa.covid.model.config.Filter;
import se.lnu.joa.covid.model.config.Regression;
import se.lnu.joa.covid.model.config.RegressionType;
import se.lnu.joa.covid.model.config.Scale;
import se.lnu.joa.covid.model.config.ScaleType;
import se.lnu.joa.covid.model.config.Visualization;
import se.lnu.joa.covid.model.config.VisualizationInfo;
import se.lnu.joa.covid.model.config.VisualizationType;

import se.lnu.joa.covid.model.config.util.ConfigValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigPackageImpl extends EPackageImpl implements ConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visualizationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regressionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scaleTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigPackageImpl() {
		super(eNS_URI, ConfigFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigPackage init() {
		if (isInited) return (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigPackageImpl theConfigPackage = registeredConfigPackage instanceof ConfigPackageImpl ? (ConfigPackageImpl)registeredConfigPackage : new ConfigPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theConfigPackage.createPackageContents();

		// Initialize created meta-data
		theConfigPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theConfigPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ConfigValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theConfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigPackage.eNS_URI, theConfigPackage);
		return theConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Source() {
		return (EReference)configEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Visualization() {
		return (EReference)configEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Regression() {
		return (EReference)configEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Animation() {
		return (EReference)configEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModel() {
		return dataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataModel_DatasetName() {
		return (EAttribute)dataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataModel_DataSource() {
		return (EAttribute)dataModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataModel_Columns() {
		return (EAttribute)dataModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataModel_Filters() {
		return (EReference)dataModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataModel_DateFormat() {
		return (EAttribute)dataModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualization() {
		return visualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualization_Type() {
		return (EAttribute)visualizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualization_Axes() {
		return (EReference)visualizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualization_Info() {
		return (EReference)visualizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualization_Size() {
		return (EAttribute)visualizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimation() {
		return animationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_Label() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_TransitionTime() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_Width() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_Height() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_Duration() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_OutputName() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_OutputPath() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnimation__Validate__DiagnosticChain_Map() {
		return animationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegression() {
		return regressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegression_Type() {
		return (EAttribute)regressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegression_DependentValue() {
		return (EAttribute)regressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegression_IndependentValue() {
		return (EAttribute)regressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxis() {
		return axisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxis_Label() {
		return (EAttribute)axisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxis_Column() {
		return (EAttribute)axisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxis_Scale() {
		return (EReference)axisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxes() {
		return axesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxes_X() {
		return (EReference)axesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxes_Y() {
		return (EReference)axesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxes_Z() {
		return (EReference)axesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualizationInfo() {
		return visualizationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualizationInfo_Title() {
		return (EAttribute)visualizationInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualizationInfo_SubTitle() {
		return (EAttribute)visualizationInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualizationInfo_Caption() {
		return (EAttribute)visualizationInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScale() {
		return scaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_Type() {
		return (EAttribute)scaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_Format() {
		return (EAttribute)scaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_Breaks() {
		return (EAttribute)scaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Key() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Value() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisualizationType() {
		return visualizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRegressionType() {
		return regressionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScaleType() {
		return scaleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactory getConfigFactory() {
		return (ConfigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configEClass = createEClass(CONFIG);
		createEReference(configEClass, CONFIG__SOURCE);
		createEReference(configEClass, CONFIG__VISUALIZATION);
		createEReference(configEClass, CONFIG__REGRESSION);
		createEReference(configEClass, CONFIG__ANIMATION);

		dataModelEClass = createEClass(DATA_MODEL);
		createEAttribute(dataModelEClass, DATA_MODEL__DATASET_NAME);
		createEAttribute(dataModelEClass, DATA_MODEL__DATA_SOURCE);
		createEAttribute(dataModelEClass, DATA_MODEL__COLUMNS);
		createEReference(dataModelEClass, DATA_MODEL__FILTERS);
		createEAttribute(dataModelEClass, DATA_MODEL__DATE_FORMAT);

		visualizationEClass = createEClass(VISUALIZATION);
		createEAttribute(visualizationEClass, VISUALIZATION__TYPE);
		createEReference(visualizationEClass, VISUALIZATION__AXES);
		createEReference(visualizationEClass, VISUALIZATION__INFO);
		createEAttribute(visualizationEClass, VISUALIZATION__SIZE);

		animationEClass = createEClass(ANIMATION);
		createEAttribute(animationEClass, ANIMATION__LABEL);
		createEAttribute(animationEClass, ANIMATION__TRANSITION_TIME);
		createEAttribute(animationEClass, ANIMATION__WIDTH);
		createEAttribute(animationEClass, ANIMATION__HEIGHT);
		createEAttribute(animationEClass, ANIMATION__DURATION);
		createEAttribute(animationEClass, ANIMATION__OUTPUT_NAME);
		createEAttribute(animationEClass, ANIMATION__OUTPUT_PATH);
		createEOperation(animationEClass, ANIMATION___VALIDATE__DIAGNOSTICCHAIN_MAP);

		regressionEClass = createEClass(REGRESSION);
		createEAttribute(regressionEClass, REGRESSION__TYPE);
		createEAttribute(regressionEClass, REGRESSION__DEPENDENT_VALUE);
		createEAttribute(regressionEClass, REGRESSION__INDEPENDENT_VALUE);

		axisEClass = createEClass(AXIS);
		createEAttribute(axisEClass, AXIS__LABEL);
		createEAttribute(axisEClass, AXIS__COLUMN);
		createEReference(axisEClass, AXIS__SCALE);

		axesEClass = createEClass(AXES);
		createEReference(axesEClass, AXES__X);
		createEReference(axesEClass, AXES__Y);
		createEReference(axesEClass, AXES__Z);

		visualizationInfoEClass = createEClass(VISUALIZATION_INFO);
		createEAttribute(visualizationInfoEClass, VISUALIZATION_INFO__TITLE);
		createEAttribute(visualizationInfoEClass, VISUALIZATION_INFO__SUB_TITLE);
		createEAttribute(visualizationInfoEClass, VISUALIZATION_INFO__CAPTION);

		scaleEClass = createEClass(SCALE);
		createEAttribute(scaleEClass, SCALE__TYPE);
		createEAttribute(scaleEClass, SCALE__FORMAT);
		createEAttribute(scaleEClass, SCALE__BREAKS);

		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__KEY);
		createEAttribute(filterEClass, FILTER__VALUE);

		// Create enums
		visualizationTypeEEnum = createEEnum(VISUALIZATION_TYPE);
		regressionTypeEEnum = createEEnum(REGRESSION_TYPE);
		scaleTypeEEnum = createEEnum(SCALE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfig_Source(), this.getDataModel(), null, "source", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Visualization(), this.getVisualization(), null, "visualization", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Regression(), this.getRegression(), null, "regression", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Animation(), this.getAnimation(), null, "animation", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataModelEClass, DataModel.class, "DataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataModel_DatasetName(), ecorePackage.getEString(), "datasetName", null, 0, 1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataModel_DataSource(), ecorePackage.getEString(), "dataSource", null, 0, 1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataModel_Columns(), ecorePackage.getEString(), "columns", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataModel_Filters(), this.getFilter(), null, "filters", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataModel_DateFormat(), ecorePackage.getEString(), "dateFormat", null, 0, 1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualizationEClass, Visualization.class, "Visualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualization_Type(), this.getVisualizationType(), "type", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualization_Axes(), this.getAxes(), null, "axes", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualization_Info(), this.getVisualizationInfo(), null, "info", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisualization_Size(), ecorePackage.getEString(), "size", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animationEClass, Animation.class, "Animation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimation_Label(), ecorePackage.getEString(), "label", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimation_TransitionTime(), ecorePackage.getEString(), "transitionTime", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimation_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimation_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimation_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimation_OutputName(), ecorePackage.getEString(), "outputName", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimation_OutputPath(), ecorePackage.getEString(), "outputPath", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAnimation__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostic", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(regressionEClass, Regression.class, "Regression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegression_Type(), this.getRegressionType(), "type", null, 0, 1, Regression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegression_DependentValue(), ecorePackage.getEString(), "dependentValue", null, 0, 1, Regression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegression_IndependentValue(), ecorePackage.getEString(), "independentValue", null, 0, 1, Regression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axisEClass, Axis.class, "Axis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAxis_Label(), ecorePackage.getEString(), "label", null, 0, 1, Axis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxis_Column(), ecorePackage.getEString(), "column", null, 0, 1, Axis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxis_Scale(), this.getScale(), null, "scale", null, 0, 1, Axis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axesEClass, Axes.class, "Axes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxes_X(), this.getAxis(), null, "x", null, 0, 1, Axes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxes_Y(), this.getAxis(), null, "y", null, 0, 1, Axes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxes_Z(), this.getAxis(), null, "z", null, 0, 1, Axes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualizationInfoEClass, VisualizationInfo.class, "VisualizationInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualizationInfo_Title(), ecorePackage.getEString(), "title", null, 0, 1, VisualizationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisualizationInfo_SubTitle(), ecorePackage.getEString(), "subTitle", null, 0, 1, VisualizationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisualizationInfo_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, VisualizationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaleEClass, Scale.class, "Scale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScale_Type(), this.getScaleType(), "type", null, 0, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScale_Format(), ecorePackage.getEString(), "format", null, 0, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScale_Breaks(), ecorePackage.getEString(), "breaks", null, 0, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_Key(), ecorePackage.getEString(), "key", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visualizationTypeEEnum, VisualizationType.class, "VisualizationType");
		addEEnumLiteral(visualizationTypeEEnum, VisualizationType.LINEAR_PLOT);
		addEEnumLiteral(visualizationTypeEEnum, VisualizationType.SCATTER_PLOT);

		initEEnum(regressionTypeEEnum, RegressionType.class, "RegressionType");
		addEEnumLiteral(regressionTypeEEnum, RegressionType.LINNEAR);
		addEEnumLiteral(regressionTypeEEnum, RegressionType.LOGARITHMIC);

		initEEnum(scaleTypeEEnum, ScaleType.class, "ScaleType");
		addEEnumLiteral(scaleTypeEEnum, ScaleType.RANGE);
		addEEnumLiteral(scaleTypeEEnum, ScaleType.LOG);
		addEEnumLiteral(scaleTypeEEnum, ScaleType.SQRT);
		addEEnumLiteral(scaleTypeEEnum, ScaleType.DATE);

		// Create resource
		createResource(eNS_URI);
	}

} //ConfigPackageImpl
