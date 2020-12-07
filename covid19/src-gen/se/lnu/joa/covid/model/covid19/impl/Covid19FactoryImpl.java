/**
 */
package se.lnu.joa.covid.model.covid19.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.lnu.joa.covid.model.covid19.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Covid19FactoryImpl extends EFactoryImpl implements Covid19Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Covid19Factory init() {
		try {
			Covid19Factory theCovid19Factory = (Covid19Factory) EPackage.Registry.INSTANCE
					.getEFactory(Covid19Package.eNS_URI);
			if (theCovid19Factory != null) {
				return theCovid19Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Covid19FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Covid19FactoryImpl() {
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
		case Covid19Package.HEALTH:
			return createHealth();
		case Covid19Package.EPIDEMIOLOGY:
			return createEpidemiology();
		case Covid19Package.DATA_POOL:
			return createDataPool();
		case Covid19Package.DATA_RECORD:
			return createDataRecord();
		case Covid19Package.INDEX:
			return createIndex();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Health createHealth() {
		HealthImpl health = new HealthImpl();
		return health;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Epidemiology createEpidemiology() {
		EpidemiologyImpl epidemiology = new EpidemiologyImpl();
		return epidemiology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPool createDataPool() {
		DataPoolImpl dataPool = new DataPoolImpl();
		return dataPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRecord createDataRecord() {
		DataRecordImpl dataRecord = new DataRecordImpl();
		return dataRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index createIndex() {
		IndexImpl index = new IndexImpl();
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Covid19Package getCovid19Package() {
		return (Covid19Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Covid19Package getPackage() {
		return Covid19Package.eINSTANCE;
	}

} //Covid19FactoryImpl
