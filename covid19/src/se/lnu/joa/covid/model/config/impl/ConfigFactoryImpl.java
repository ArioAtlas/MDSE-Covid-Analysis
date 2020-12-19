/**
 */
package se.lnu.joa.covid.model.config.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.lnu.joa.covid.model.config.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigFactoryImpl extends EFactoryImpl implements ConfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigFactory init() {
		try {
			ConfigFactory theConfigFactory = (ConfigFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigPackage.eNS_URI);
			if (theConfigFactory != null) {
				return theConfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactoryImpl() {
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
			case ConfigPackage.CONFIG: return createConfig();
			case ConfigPackage.DATA_MODEL: return createDataModel();
			case ConfigPackage.VISUALIZATION: return createVisualization();
			case ConfigPackage.ANIMATION: return createAnimation();
			case ConfigPackage.REGRESSION: return createRegression();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigPackage.VISUALIZATION_TYPE:
				return createVisualizationTypeFromString(eDataType, initialValue);
			case ConfigPackage.REGRESSION_TYPE:
				return createRegressionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigPackage.VISUALIZATION_TYPE:
				return convertVisualizationTypeToString(eDataType, instanceValue);
			case ConfigPackage.REGRESSION_TYPE:
				return convertRegressionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config createConfig() {
		ConfigImpl config = new ConfigImpl();
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel createDataModel() {
		DataModelImpl dataModel = new DataModelImpl();
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization createVisualization() {
		VisualizationImpl visualization = new VisualizationImpl();
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animation createAnimation() {
		AnimationImpl animation = new AnimationImpl();
		return animation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regression createRegression() {
		RegressionImpl regression = new RegressionImpl();
		return regression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationType createVisualizationTypeFromString(EDataType eDataType, String initialValue) {
		VisualizationType result = VisualizationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisualizationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegressionType createRegressionTypeFromString(EDataType eDataType, String initialValue) {
		RegressionType result = RegressionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegressionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigPackage getConfigPackage() {
		return (ConfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigPackage getPackage() {
		return ConfigPackage.eINSTANCE;
	}

} //ConfigFactoryImpl
