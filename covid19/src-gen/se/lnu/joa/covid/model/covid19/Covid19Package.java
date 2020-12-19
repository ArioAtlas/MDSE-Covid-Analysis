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
	String eNS_URI = "http://lnu.se/dv651/covid19/csv";

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
	 * The feature id for the '<em><b>Diabetes prevalence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__DIABETES_PREVALENCE = DATA_RECORD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Infant mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__INFANT_MORTALITY_RATE = DATA_RECORD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Adult male mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__ADULT_MALE_MORTALITY_RATE = DATA_RECORD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Adult female mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__ADULT_FEMALE_MORTALITY_RATE = DATA_RECORD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pollution mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__POLLUTION_MORTALITY_RATE = DATA_RECORD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comorbidity mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__COMORBIDITY_MORTALITY_RATE = DATA_RECORD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Hospital beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__HOSPITAL_BEDS = DATA_RECORD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Nurses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__NURSES = DATA_RECORD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Physicians</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__PHYSICIANS = DATA_RECORD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Health expenditure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__HEALTH_EXPENDITURE = DATA_RECORD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Out of pocket health expenditure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE = DATA_RECORD_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Health</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_FEATURE_COUNT = DATA_RECORD_FEATURE_COUNT + 13;

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
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__DATE = DATA_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__NEW_CONFIRMED = DATA_RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New deceased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__NEW_DECEASED = DATA_RECORD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New recovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__NEW_RECOVERED = DATA_RECORD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New tested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__NEW_TESTED = DATA_RECORD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__TOTAL_CONFIRMED = DATA_RECORD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Total deceased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__TOTAL_DECEASED = DATA_RECORD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Total recovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__TOTAL_RECOVERED = DATA_RECORD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Total tested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY__TOTAL_TESTED = DATA_RECORD_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Epidemiology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_FEATURE_COUNT = DATA_RECORD_FEATURE_COUNT + 9;

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
	 * The feature id for the '<em><b>Epidemiology Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL__EPIDEMIOLOGY_DATA = 1;

	/**
	 * The feature id for the '<em><b>Index Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL__INDEX_DATA = 2;

	/**
	 * The number of structural features of the '<em>Data Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.lnu.joa.covid.model.covid19.impl.IndexImpl
	 * @see se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__KEY = DATA_RECORD__KEY;

	/**
	 * The feature id for the '<em><b>Wikidata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__WIKIDATA = DATA_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datacommons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__DATACOMMONS = DATA_RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Country code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__COUNTRY_CODE = DATA_RECORD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__COUNTRY_NAME = DATA_RECORD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subregion1 code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__SUBREGION1_CODE = DATA_RECORD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subregion1 name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__SUBREGION1_NAME = DATA_RECORD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subregion2 code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__SUBREGION2_CODE = DATA_RECORD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Subregion2 name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__SUBREGION2_NAME = DATA_RECORD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Locality code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__LOCALITY_CODE = DATA_RECORD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Locality name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__LOCALITY_NAME = DATA_RECORD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Alpha 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ALPHA_2 = DATA_RECORD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Alpha 3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ALPHA_3 = DATA_RECORD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Aggregation level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__AGGREGATION_LEVEL = DATA_RECORD_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = DATA_RECORD_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = DATA_RECORD_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getDiabetes_prevalence <em>Diabetes prevalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diabetes prevalence</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getDiabetes_prevalence()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Diabetes_prevalence();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getInfant_mortality_rate <em>Infant mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infant mortality rate</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getInfant_mortality_rate()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Infant_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getAdult_male_mortality_rate <em>Adult male mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adult male mortality rate</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getAdult_male_mortality_rate()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Adult_male_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getAdult_female_mortality_rate <em>Adult female mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adult female mortality rate</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getAdult_female_mortality_rate()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Adult_female_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getPollution_mortality_rate <em>Pollution mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pollution mortality rate</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getPollution_mortality_rate()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Pollution_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getComorbidity_mortality_rate <em>Comorbidity mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comorbidity mortality rate</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getComorbidity_mortality_rate()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Comorbidity_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getHospital_beds <em>Hospital beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hospital beds</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getHospital_beds()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Hospital_beds();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getNurses <em>Nurses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nurses</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getNurses()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Nurses();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getPhysicians <em>Physicians</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physicians</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getPhysicians()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Physicians();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getHealth_expenditure <em>Health expenditure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health expenditure</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getHealth_expenditure()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Health_expenditure();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Health#getOut_of_pocket_health_expenditure <em>Out of pocket health expenditure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out of pocket health expenditure</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Health#getOut_of_pocket_health_expenditure()
	 * @see #getHealth()
	 * @generated
	 */
	EAttribute getHealth_Out_of_pocket_health_expenditure();

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
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Epidemiology#getDate()
	 * @see #getEpidemiology()
	 * @generated
	 */
	EAttribute getEpidemiology_Date();

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
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_recovered <em>New recovered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New recovered</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Epidemiology#getNew_recovered()
	 * @see #getEpidemiology()
	 * @generated
	 */
	EAttribute getEpidemiology_New_recovered();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_tested <em>New tested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New tested</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Epidemiology#getNew_tested()
	 * @see #getEpidemiology()
	 * @generated
	 */
	EAttribute getEpidemiology_New_tested();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_confirmed <em>Total confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total confirmed</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_confirmed()
	 * @see #getEpidemiology()
	 * @generated
	 */
	EAttribute getEpidemiology_Total_confirmed();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_deceased <em>Total deceased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total deceased</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_deceased()
	 * @see #getEpidemiology()
	 * @generated
	 */
	EAttribute getEpidemiology_Total_deceased();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_recovered <em>Total recovered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total recovered</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_recovered()
	 * @see #getEpidemiology()
	 * @generated
	 */
	EAttribute getEpidemiology_Total_recovered();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_tested <em>Total tested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total tested</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_tested()
	 * @see #getEpidemiology()
	 * @generated
	 */
	EAttribute getEpidemiology_Total_tested();

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
	 * Returns the meta object for the containment reference list '{@link se.lnu.joa.covid.model.covid19.DataPool#getEpidemiologyData <em>Epidemiology Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Epidemiology Data</em>'.
	 * @see se.lnu.joa.covid.model.covid19.DataPool#getEpidemiologyData()
	 * @see #getDataPool()
	 * @generated
	 */
	EReference getDataPool_EpidemiologyData();

	/**
	 * Returns the meta object for the containment reference list '{@link se.lnu.joa.covid.model.covid19.DataPool#getIndexData <em>Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index Data</em>'.
	 * @see se.lnu.joa.covid.model.covid19.DataPool#getIndexData()
	 * @see #getDataPool()
	 * @generated
	 */
	EReference getDataPool_IndexData();

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
	 * Returns the meta object for class '{@link se.lnu.joa.covid.model.covid19.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getWikidata <em>Wikidata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wikidata</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getWikidata()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Wikidata();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getDatacommons <em>Datacommons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacommons</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getDatacommons()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Datacommons();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getCountry_code <em>Country code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country code</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getCountry_code()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Country_code();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getCountry_name <em>Country name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country name</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getCountry_name()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Country_name();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getSubregion1_code <em>Subregion1 code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion1 code</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getSubregion1_code()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Subregion1_code();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getSubregion1_name <em>Subregion1 name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion1 name</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getSubregion1_name()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Subregion1_name();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getSubregion2_code <em>Subregion2 code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion2 code</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getSubregion2_code()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Subregion2_code();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getSubregion2_name <em>Subregion2 name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion2 name</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getSubregion2_name()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Subregion2_name();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getLocality_code <em>Locality code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality code</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getLocality_code()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Locality_code();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getLocality_name <em>Locality name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality name</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getLocality_name()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Locality_name();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getAlpha_2 <em>Alpha 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha 2</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getAlpha_2()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Alpha_2();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getAlpha_3 <em>Alpha 3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha 3</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getAlpha_3()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Alpha_3();

	/**
	 * Returns the meta object for the attribute '{@link se.lnu.joa.covid.model.covid19.Index#getAggregation_level <em>Aggregation level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation level</em>'.
	 * @see se.lnu.joa.covid.model.covid19.Index#getAggregation_level()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Aggregation_level();

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
		 * The meta object literal for the '<em><b>Diabetes prevalence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__DIABETES_PREVALENCE = eINSTANCE.getHealth_Diabetes_prevalence();

		/**
		 * The meta object literal for the '<em><b>Infant mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__INFANT_MORTALITY_RATE = eINSTANCE.getHealth_Infant_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Adult male mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__ADULT_MALE_MORTALITY_RATE = eINSTANCE.getHealth_Adult_male_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Adult female mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__ADULT_FEMALE_MORTALITY_RATE = eINSTANCE.getHealth_Adult_female_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Pollution mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__POLLUTION_MORTALITY_RATE = eINSTANCE.getHealth_Pollution_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Comorbidity mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__COMORBIDITY_MORTALITY_RATE = eINSTANCE.getHealth_Comorbidity_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Hospital beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__HOSPITAL_BEDS = eINSTANCE.getHealth_Hospital_beds();

		/**
		 * The meta object literal for the '<em><b>Nurses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__NURSES = eINSTANCE.getHealth_Nurses();

		/**
		 * The meta object literal for the '<em><b>Physicians</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__PHYSICIANS = eINSTANCE.getHealth_Physicians();

		/**
		 * The meta object literal for the '<em><b>Health expenditure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__HEALTH_EXPENDITURE = eINSTANCE.getHealth_Health_expenditure();

		/**
		 * The meta object literal for the '<em><b>Out of pocket health expenditure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE = eINSTANCE.getHealth_Out_of_pocket_health_expenditure();

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
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY__DATE = eINSTANCE.getEpidemiology_Date();

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
		 * The meta object literal for the '<em><b>New recovered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY__NEW_RECOVERED = eINSTANCE.getEpidemiology_New_recovered();

		/**
		 * The meta object literal for the '<em><b>New tested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY__NEW_TESTED = eINSTANCE.getEpidemiology_New_tested();

		/**
		 * The meta object literal for the '<em><b>Total confirmed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY__TOTAL_CONFIRMED = eINSTANCE.getEpidemiology_Total_confirmed();

		/**
		 * The meta object literal for the '<em><b>Total deceased</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY__TOTAL_DECEASED = eINSTANCE.getEpidemiology_Total_deceased();

		/**
		 * The meta object literal for the '<em><b>Total recovered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY__TOTAL_RECOVERED = eINSTANCE.getEpidemiology_Total_recovered();

		/**
		 * The meta object literal for the '<em><b>Total tested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY__TOTAL_TESTED = eINSTANCE.getEpidemiology_Total_tested();

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
		 * The meta object literal for the '<em><b>Epidemiology Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_POOL__EPIDEMIOLOGY_DATA = eINSTANCE.getDataPool_EpidemiologyData();

		/**
		 * The meta object literal for the '<em><b>Index Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_POOL__INDEX_DATA = eINSTANCE.getDataPool_IndexData();

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

		/**
		 * The meta object literal for the '{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.lnu.joa.covid.model.covid19.impl.IndexImpl
		 * @see se.lnu.joa.covid.model.covid19.impl.Covid19PackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Wikidata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__WIKIDATA = eINSTANCE.getIndex_Wikidata();

		/**
		 * The meta object literal for the '<em><b>Datacommons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__DATACOMMONS = eINSTANCE.getIndex_Datacommons();

		/**
		 * The meta object literal for the '<em><b>Country code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__COUNTRY_CODE = eINSTANCE.getIndex_Country_code();

		/**
		 * The meta object literal for the '<em><b>Country name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__COUNTRY_NAME = eINSTANCE.getIndex_Country_name();

		/**
		 * The meta object literal for the '<em><b>Subregion1 code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__SUBREGION1_CODE = eINSTANCE.getIndex_Subregion1_code();

		/**
		 * The meta object literal for the '<em><b>Subregion1 name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__SUBREGION1_NAME = eINSTANCE.getIndex_Subregion1_name();

		/**
		 * The meta object literal for the '<em><b>Subregion2 code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__SUBREGION2_CODE = eINSTANCE.getIndex_Subregion2_code();

		/**
		 * The meta object literal for the '<em><b>Subregion2 name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__SUBREGION2_NAME = eINSTANCE.getIndex_Subregion2_name();

		/**
		 * The meta object literal for the '<em><b>Locality code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__LOCALITY_CODE = eINSTANCE.getIndex_Locality_code();

		/**
		 * The meta object literal for the '<em><b>Locality name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__LOCALITY_NAME = eINSTANCE.getIndex_Locality_name();

		/**
		 * The meta object literal for the '<em><b>Alpha 2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__ALPHA_2 = eINSTANCE.getIndex_Alpha_2();

		/**
		 * The meta object literal for the '<em><b>Alpha 3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__ALPHA_3 = eINSTANCE.getIndex_Alpha_3();

		/**
		 * The meta object literal for the '<em><b>Aggregation level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__AGGREGATION_LEVEL = eINSTANCE.getIndex_Aggregation_level();

	}

} //Covid19Package
