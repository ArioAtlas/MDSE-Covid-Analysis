/**
 */
package mdse.covd.covidCsv.impl;

import mdse.covd.covidCsv.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class covidFactoryImpl extends EFactoryImpl implements covidFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static covidFactory init() {
		try {
			covidFactory thecovidFactory = (covidFactory) EPackage.Registry.INSTANCE.getEFactory(covidPackage.eNS_URI);
			if (thecovidFactory != null) {
				return thecovidFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new covidFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public covidFactoryImpl() {
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
		case covidPackage.HEALTH_RECORD:
			return createHealthRecord();
		case covidPackage.INDEX_DATA:
			return createIndexData();
		case covidPackage.EPIDEMIOLOGY_RECORD:
			return createEpidemiologyRecord();
		case covidPackage.DATA_POOL:
			return createDataPool();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthRecord createHealthRecord() {
		HealthRecordImpl healthRecord = new HealthRecordImpl();
		return healthRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexData createIndexData() {
		IndexDataImpl indexData = new IndexDataImpl();
		return indexData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpidemiologyRecord createEpidemiologyRecord() {
		EpidemiologyRecordImpl epidemiologyRecord = new EpidemiologyRecordImpl();
		return epidemiologyRecord;
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
	public covidPackage getcovidPackage() {
		return (covidPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static covidPackage getPackage() {
		return covidPackage.eINSTANCE;
	}

} //covidFactoryImpl
