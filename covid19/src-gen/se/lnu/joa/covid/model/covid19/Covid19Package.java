/**
 */
package se.lnu.joa.covid.model.covid19;

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
 * @see se.lnu.joa.covid.model.covid19.Covid19Factory
 * @model kind="package"
 * @generated
 */
public interface Covid19Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "covid19";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/covid19";

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
	Covid19Package eINSTANCE = se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl.init();

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.covid19.impl.DataRecordImpl <em>Data Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.covid19.impl.DataRecordImpl
	 * @see se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl#getDataRecord()
	 * @generated
	 */
	int DATA_RECORD = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECORD__KEY = 0;

	/**
	 * The number of structural features of the '<em>Data Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECORD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl <em>Health</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.covid19.impl.HealthImpl
	 * @see se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl#getHealth()
	 * @generated
	 */
	int HEALTH = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__KEY = DATA_RECORD__KEY;

	/**
	 * The feature id for the '<em><b>Life expectancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__LIFE_EXPECTANCY = DATA_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Smoking prevalence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__SMOKING_PREVALENCE = DATA_RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Health</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_FEATURE_COUNT = DATA_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Health</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_OPERATION_COUNT = DATA_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.covid19.impl.EpidemiologyImpl <em>Epidemiology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.covid19.impl.EpidemiologyImpl
	 * @see se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl#getEpidemiology()
	 * @generated
	 */
	int EPIDEMIOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__KEY = DATA_RECORD__KEY;

	/**
	 * The feature id for the '<em><b>New confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__NEW_CONFIRMED = DATA_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New deceased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__NEW_DECEASED = DATA_RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Epidemiology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_FEATURE_COUNT = DATA_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Epidemiology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_OPERATION_COUNT = DATA_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.covid19.impl.DataPoolImpl <em>Data Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.covid19.impl.DataPoolImpl
	 * @see se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl#getDataPool()
	 * @generated
	 */
	int DATA_POOL = 2;

	/**
	 * The feature id for the '<em><b>Health Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL__HEALTH_DATA = 0;

	/**
	 * The feature id for the '<em><b>Epidemiology Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL__EPIDEMIOLOGY_DATA = 1;

	/**
	 * The number of structural features of the '<em>Data Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.covid19.Health <em>Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health
	 * @generated
	 */
	EClass getHealth();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getLife_expectancy <em>Life expectancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life expectancy</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getLife_expectancy()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Life_expectancy();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getSmoking_prevalence <em>Smoking prevalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smoking prevalence</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getSmoking_prevalence()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Smoking_prevalence();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.covid19.Epidemiology <em>Epidemiology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epidemiology</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Epidemiology
	 * @generated
	 */
	EClass getEpidemiology();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_confirmed <em>New confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New confirmed</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Epidemiology#getNew_confirmed()
	 * @see #getEpidemiology()
	 * @generated
	 */
	EAttribute getEpidemiology_New_confirmed();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_deceased <em>New deceased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New deceased</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Epidemiology#getNew_deceased()
	 * @see #getEpidemiology()
	 * @generated
	 */
	EAttribute getEpidemiology_New_deceased();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.covid19.DataPool <em>Data Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pool</em>'.
	 * @see se.lnu.joa.covid.model.covid19.DataPool
	 * @generated
	 */
	EClass getDataPool();

	/**
	 * Returns the meta object for the containment reference list '{@link se.lnu.joa.covid.model.covid19.DataPool#getHealthData <em>Health Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Health Data</em>'.
	 * @see se.lnu.joa.covid.model.covid19.DataPool#getHealthData()
	 * @see #getDataPool()
	 * @generated
	 */
	EReference getDataPool_HealthData();

	/**
	 * Returns the meta object for the reference list '{@link se.lnu.joa.covid.model.covid19.DataPool#getEpidemiologyData <em>Epidemiology Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Epidemiology Data</em>'.
	 * @see se.lnu.joa.covid.model.covid19.DataPool#getEpidemiologyData()
	 * @see #getDataPool()
	 * @generated
	 */
	EReference getDataPool_EpidemiologyData();

	/**
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.covid19.DataRecord <em>Data Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Record</em>'.
	 * @see se.lnu.joa.covid.model.covid19.DataRecord
	 * @generated
	 */
	EClass getDataRecord();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.DataRecord#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see se.lnu.joa.covid.model.covid19.DataRecord#getKey()
	 * @see #getDataRecord()
	 * @generated
	 */
	EAttribute getDataRecord_Key();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Covid19Factory getCovid19Factory();

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
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl <em>Health</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.covid19.impl.HealthImpl
		 * @see se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl#getHealth()
		 * @generated
		 */
		EClass HEALTH = eINSTANCE.getHealth();

		/**
		 * The meta object literal for the '<em><b>Life expectancy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__LIFE_EXPECTANCY = eINSTANCE.getHealth_Life_expectancy();

		/**
		 * The meta object literal for the '<em><b>Smoking prevalence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__SMOKING_PREVALENCE = eINSTANCE.getHealth_Smoking_prevalence();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.covid19.impl.EpidemiologyImpl <em>Epidemiology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.covid19.impl.EpidemiologyImpl
		 * @see se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl#getEpidemiology()
		 * @generated
		 */
		EClass EPIDEMIOLOGY = eINSTANCE.getEpidemiology();

		/**
		 * The meta object literal for the '<em><b>New confirmed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY__NEW_CONFIRMED = eINSTANCE.getEpidemiology_New_confirmed();

		/**
		 * The meta object literal for the '<em><b>New deceased</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY__NEW_DECEASED = eINSTANCE.getEpidemiology_New_deceased();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.covid19.impl.DataPoolImpl <em>Data Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.covid19.impl.DataPoolImpl
		 * @see se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl#getDataPool()
		 * @generated
		 */
		EClass DATA_POOL = eINSTANCE.getDataPool();

		/**
		 * The meta object literal for the '<em><b>Health Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_POOL__HEALTH_DATA = eINSTANCE.getDataPool_HealthData();

		/**
		 * The meta object literal for the '<em><b>Epidemiology Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_POOL__EPIDEMIOLOGY_DATA = eINSTANCE.getDataPool_EpidemiologyData();

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.covid19.impl.DataRecordImpl <em>Data Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.covid19.impl.DataRecordImpl
		 * @see se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl#getDataRecord()
		 * @generated
		 */
		EClass DATA_RECORD = eINSTANCE.getDataRecord();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RECORD__KEY = eINSTANCE.getDataRecord_Key();

	}

} //Covid19Package
