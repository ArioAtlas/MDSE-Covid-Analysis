/**
 */
package mdse.covd.covidCsv;

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
 * @see mdse.covd.covidCsv.covidFactory
 * @model kind="package"
 * @generated
 */
public interface covidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "covidCsv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/covidCsv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "covidCsv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	covidPackage eINSTANCE = mdse.covd.covidCsv.impl.covidPackageImpl.init();

	/**
	 * The meta object id for the '{@link mdse.covd.covidCsv.impl.HealthRecordImpl <em>Health Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdse.covd.covidCsv.impl.HealthRecordImpl
	 * @see mdse.covd.covidCsv.impl.covidPackageImpl#getHealthRecord()
	 * @generated
	 */
	int HEALTH_RECORD = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__KEY = 0;

	/**
	 * The feature id for the '<em><b>Life expectancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__LIFE_EXPECTANCY = 1;

	/**
	 * The feature id for the '<em><b>Smoking prevalence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__SMOKING_PREVALENCE = 2;

	/**
	 * The feature id for the '<em><b>Diabetes prevalence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__DIABETES_PREVALENCE = 3;

	/**
	 * The feature id for the '<em><b>Infant mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__INFANT_MORTALITY_RATE = 4;

	/**
	 * The feature id for the '<em><b>Adult male mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__ADULT_MALE_MORTALITY_RATE = 5;

	/**
	 * The feature id for the '<em><b>Adult female mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__ADULT_FEMALE_MORTALITY_RATE = 6;

	/**
	 * The feature id for the '<em><b>Pollution mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__POLLUTION_MORTALITY_RATE = 7;

	/**
	 * The feature id for the '<em><b>Comorbidity mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__COMORBIDITY_MORTALITY_RATE = 8;

	/**
	 * The feature id for the '<em><b>Hospital beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__HOSPITAL_BEDS = 9;

	/**
	 * The feature id for the '<em><b>Nurses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__NURSES = 10;

	/**
	 * The feature id for the '<em><b>Physicians</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__PHYSICIANS = 11;

	/**
	 * The feature id for the '<em><b>Health expenditure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__HEALTH_EXPENDITURE = 12;

	/**
	 * The feature id for the '<em><b>Out of pocket health expenditure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__OUT_OF_POCKET_HEALTH_EXPENDITURE = 13;

	/**
	 * The feature id for the '<em><b>Index Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD__INDEX_DATA = 14;

	/**
	 * The number of structural features of the '<em>Health Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Health Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdse.covd.covidCsv.impl.IndexDataImpl <em>Index Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdse.covd.covidCsv.impl.IndexDataImpl
	 * @see mdse.covd.covidCsv.impl.covidPackageImpl#getIndexData()
	 * @generated
	 */
	int INDEX_DATA = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__KEY = 0;

	/**
	 * The feature id for the '<em><b>Wikidata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__WIKIDATA = 1;

	/**
	 * The feature id for the '<em><b>Datacommons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__DATACOMMONS = 2;

	/**
	 * The feature id for the '<em><b>Country code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__COUNTRY_CODE = 3;

	/**
	 * The feature id for the '<em><b>Country name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__COUNTRY_NAME = 4;

	/**
	 * The feature id for the '<em><b>Subregion1 code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__SUBREGION1_CODE = 5;

	/**
	 * The feature id for the '<em><b>Subregion1 name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__SUBREGION1_NAME = 6;

	/**
	 * The feature id for the '<em><b>Subregion2 code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__SUBREGION2_CODE = 7;

	/**
	 * The feature id for the '<em><b>Subregion2 name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__SUBREGION2_NAME = 8;

	/**
	 * The feature id for the '<em><b>Alpha 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__ALPHA_2 = 9;

	/**
	 * The feature id for the '<em><b>Alpha 3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__ALPHA_3 = 10;

	/**
	 * The feature id for the '<em><b>Aggregation level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA__AGGREGATION_LEVEL = 11;

	/**
	 * The number of structural features of the '<em>Index Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Index Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdse.covd.covidCsv.impl.EpidemiologyRecordImpl <em>Epidemiology Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdse.covd.covidCsv.impl.EpidemiologyRecordImpl
	 * @see mdse.covd.covidCsv.impl.covidPackageImpl#getEpidemiologyRecord()
	 * @generated
	 */
	int EPIDEMIOLOGY_RECORD = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD__DATE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD__KEY = 1;

	/**
	 * The feature id for the '<em><b>New confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD__NEW_CONFIRMED = 2;

	/**
	 * The feature id for the '<em><b>New deceased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD__NEW_DECEASED = 3;

	/**
	 * The feature id for the '<em><b>New recovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD__NEW_RECOVERED = 4;

	/**
	 * The feature id for the '<em><b>New tested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD__NEW_TESTED = 5;

	/**
	 * The feature id for the '<em><b>Total confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD__TOTAL_CONFIRMED = 6;

	/**
	 * The feature id for the '<em><b>Total deceased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD__TOTAL_DECEASED = 7;

	/**
	 * The feature id for the '<em><b>Total tested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD__TOTAL_TESTED = 8;

	/**
	 * The feature id for the '<em><b>Index Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD__INDEX_DATA = 9;

	/**
	 * The number of structural features of the '<em>Epidemiology Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Epidemiology Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdse.covd.covidCsv.impl.DataPoolImpl <em>Data Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdse.covd.covidCsv.impl.DataPoolImpl
	 * @see mdse.covd.covidCsv.impl.covidPackageImpl#getDataPool()
	 * @generated
	 */
	int DATA_POOL = 3;

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
	 * Returns the meta object for class '{@link mdse.covd.covidCsv.HealthRecord <em>Health Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Record</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord
	 * @generated
	 */
	EClass getHealthRecord();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getKey()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Key();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getLife_expectancy <em>Life expectancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life expectancy</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getLife_expectancy()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Life_expectancy();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getSmoking_prevalence <em>Smoking prevalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smoking prevalence</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getSmoking_prevalence()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Smoking_prevalence();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getDiabetes_prevalence <em>Diabetes prevalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diabetes prevalence</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getDiabetes_prevalence()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Diabetes_prevalence();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getInfant_mortality_rate <em>Infant mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infant mortality rate</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getInfant_mortality_rate()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Infant_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getAdult_male_mortality_rate <em>Adult male mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adult male mortality rate</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getAdult_male_mortality_rate()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Adult_male_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getAdult_female_mortality_rate <em>Adult female mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adult female mortality rate</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getAdult_female_mortality_rate()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Adult_female_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getPollution_mortality_rate <em>Pollution mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pollution mortality rate</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getPollution_mortality_rate()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Pollution_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getComorbidity_mortality_rate <em>Comorbidity mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comorbidity mortality rate</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getComorbidity_mortality_rate()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Comorbidity_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getHospital_beds <em>Hospital beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hospital beds</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getHospital_beds()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Hospital_beds();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getNurses <em>Nurses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nurses</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getNurses()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Nurses();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getPhysicians <em>Physicians</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physicians</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getPhysicians()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Physicians();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getHealth_expenditure <em>Health expenditure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health expenditure</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getHealth_expenditure()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Health_expenditure();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.HealthRecord#getOut_of_pocket_health_expenditure <em>Out of pocket health expenditure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out of pocket health expenditure</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getOut_of_pocket_health_expenditure()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EAttribute getHealthRecord_Out_of_pocket_health_expenditure();

	/**
	 * Returns the meta object for the reference '{@link mdse.covd.covidCsv.HealthRecord#getIndexData <em>Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index Data</em>'.
	 * @see mdse.covd.covidCsv.HealthRecord#getIndexData()
	 * @see #getHealthRecord()
	 * @generated
	 */
	EReference getHealthRecord_IndexData();

	/**
	 * Returns the meta object for class '{@link mdse.covd.covidCsv.IndexData <em>Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Data</em>'.
	 * @see mdse.covd.covidCsv.IndexData
	 * @generated
	 */
	EClass getIndexData();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getKey()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Key();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getWikidata <em>Wikidata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wikidata</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getWikidata()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Wikidata();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getDatacommons <em>Datacommons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacommons</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getDatacommons()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Datacommons();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getCountry_code <em>Country code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country code</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getCountry_code()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Country_code();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getCountry_name <em>Country name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country name</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getCountry_name()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Country_name();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getSubregion1_code <em>Subregion1 code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion1 code</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getSubregion1_code()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Subregion1_code();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getSubregion1_name <em>Subregion1 name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion1 name</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getSubregion1_name()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Subregion1_name();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getSubregion2_code <em>Subregion2 code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion2 code</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getSubregion2_code()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Subregion2_code();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getSubregion2_name <em>Subregion2 name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion2 name</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getSubregion2_name()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Subregion2_name();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getAlpha_2 <em>Alpha 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha 2</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getAlpha_2()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Alpha_2();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getAlpha_3 <em>Alpha 3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha 3</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getAlpha_3()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Alpha_3();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.IndexData#getAggregation_level <em>Aggregation level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation level</em>'.
	 * @see mdse.covd.covidCsv.IndexData#getAggregation_level()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Aggregation_level();

	/**
	 * Returns the meta object for class '{@link mdse.covd.covidCsv.EpidemiologyRecord <em>Epidemiology Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epidemiology Record</em>'.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord
	 * @generated
	 */
	EClass getEpidemiologyRecord();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.EpidemiologyRecord#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord#getDate()
	 * @see #getEpidemiologyRecord()
	 * @generated
	 */
	EAttribute getEpidemiologyRecord_Date();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.EpidemiologyRecord#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord#getKey()
	 * @see #getEpidemiologyRecord()
	 * @generated
	 */
	EAttribute getEpidemiologyRecord_Key();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.EpidemiologyRecord#getNew_confirmed <em>New confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New confirmed</em>'.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord#getNew_confirmed()
	 * @see #getEpidemiologyRecord()
	 * @generated
	 */
	EAttribute getEpidemiologyRecord_New_confirmed();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.EpidemiologyRecord#getNew_deceased <em>New deceased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New deceased</em>'.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord#getNew_deceased()
	 * @see #getEpidemiologyRecord()
	 * @generated
	 */
	EAttribute getEpidemiologyRecord_New_deceased();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.EpidemiologyRecord#getNew_recovered <em>New recovered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New recovered</em>'.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord#getNew_recovered()
	 * @see #getEpidemiologyRecord()
	 * @generated
	 */
	EAttribute getEpidemiologyRecord_New_recovered();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.EpidemiologyRecord#getNew_tested <em>New tested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New tested</em>'.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord#getNew_tested()
	 * @see #getEpidemiologyRecord()
	 * @generated
	 */
	EAttribute getEpidemiologyRecord_New_tested();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.EpidemiologyRecord#getTotal_confirmed <em>Total confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total confirmed</em>'.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord#getTotal_confirmed()
	 * @see #getEpidemiologyRecord()
	 * @generated
	 */
	EAttribute getEpidemiologyRecord_Total_confirmed();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.EpidemiologyRecord#getTotal_deceased <em>Total deceased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total deceased</em>'.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord#getTotal_deceased()
	 * @see #getEpidemiologyRecord()
	 * @generated
	 */
	EAttribute getEpidemiologyRecord_Total_deceased();

	/**
	 * Returns the meta object for the attribute '{@link mdse.covd.covidCsv.EpidemiologyRecord#getTotal_tested <em>Total tested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total tested</em>'.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord#getTotal_tested()
	 * @see #getEpidemiologyRecord()
	 * @generated
	 */
	EAttribute getEpidemiologyRecord_Total_tested();

	/**
	 * Returns the meta object for the reference '{@link mdse.covd.covidCsv.EpidemiologyRecord#getIndexData <em>Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index Data</em>'.
	 * @see mdse.covd.covidCsv.EpidemiologyRecord#getIndexData()
	 * @see #getEpidemiologyRecord()
	 * @generated
	 */
	EReference getEpidemiologyRecord_IndexData();

	/**
	 * Returns the meta object for class '{@link mdse.covd.covidCsv.DataPool <em>Data Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pool</em>'.
	 * @see mdse.covd.covidCsv.DataPool
	 * @generated
	 */
	EClass getDataPool();

	/**
	 * Returns the meta object for the containment reference list '{@link mdse.covd.covidCsv.DataPool#getHealthData <em>Health Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Health Data</em>'.
	 * @see mdse.covd.covidCsv.DataPool#getHealthData()
	 * @see #getDataPool()
	 * @generated
	 */
	EReference getDataPool_HealthData();

	/**
	 * Returns the meta object for the containment reference list '{@link mdse.covd.covidCsv.DataPool#getEpidemiologyData <em>Epidemiology Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Epidemiology Data</em>'.
	 * @see mdse.covd.covidCsv.DataPool#getEpidemiologyData()
	 * @see #getDataPool()
	 * @generated
	 */
	EReference getDataPool_EpidemiologyData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	covidFactory getcovidFactory();

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
		 * The meta object literal for the '{@link mdse.covd.covidCsv.impl.HealthRecordImpl <em>Health Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdse.covd.covidCsv.impl.HealthRecordImpl
		 * @see mdse.covd.covidCsv.impl.covidPackageImpl#getHealthRecord()
		 * @generated
		 */
		EClass HEALTH_RECORD = eINSTANCE.getHealthRecord();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__KEY = eINSTANCE.getHealthRecord_Key();

		/**
		 * The meta object literal for the '<em><b>Life expectancy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__LIFE_EXPECTANCY = eINSTANCE.getHealthRecord_Life_expectancy();

		/**
		 * The meta object literal for the '<em><b>Smoking prevalence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__SMOKING_PREVALENCE = eINSTANCE.getHealthRecord_Smoking_prevalence();

		/**
		 * The meta object literal for the '<em><b>Diabetes prevalence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__DIABETES_PREVALENCE = eINSTANCE.getHealthRecord_Diabetes_prevalence();

		/**
		 * The meta object literal for the '<em><b>Infant mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__INFANT_MORTALITY_RATE = eINSTANCE.getHealthRecord_Infant_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Adult male mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__ADULT_MALE_MORTALITY_RATE = eINSTANCE.getHealthRecord_Adult_male_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Adult female mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__ADULT_FEMALE_MORTALITY_RATE = eINSTANCE.getHealthRecord_Adult_female_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Pollution mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__POLLUTION_MORTALITY_RATE = eINSTANCE.getHealthRecord_Pollution_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Comorbidity mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__COMORBIDITY_MORTALITY_RATE = eINSTANCE.getHealthRecord_Comorbidity_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Hospital beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__HOSPITAL_BEDS = eINSTANCE.getHealthRecord_Hospital_beds();

		/**
		 * The meta object literal for the '<em><b>Nurses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__NURSES = eINSTANCE.getHealthRecord_Nurses();

		/**
		 * The meta object literal for the '<em><b>Physicians</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__PHYSICIANS = eINSTANCE.getHealthRecord_Physicians();

		/**
		 * The meta object literal for the '<em><b>Health expenditure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__HEALTH_EXPENDITURE = eINSTANCE.getHealthRecord_Health_expenditure();

		/**
		 * The meta object literal for the '<em><b>Out of pocket health expenditure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_RECORD__OUT_OF_POCKET_HEALTH_EXPENDITURE = eINSTANCE
				.getHealthRecord_Out_of_pocket_health_expenditure();

		/**
		 * The meta object literal for the '<em><b>Index Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALTH_RECORD__INDEX_DATA = eINSTANCE.getHealthRecord_IndexData();

		/**
		 * The meta object literal for the '{@link mdse.covd.covidCsv.impl.IndexDataImpl <em>Index Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdse.covd.covidCsv.impl.IndexDataImpl
		 * @see mdse.covd.covidCsv.impl.covidPackageImpl#getIndexData()
		 * @generated
		 */
		EClass INDEX_DATA = eINSTANCE.getIndexData();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__KEY = eINSTANCE.getIndexData_Key();

		/**
		 * The meta object literal for the '<em><b>Wikidata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__WIKIDATA = eINSTANCE.getIndexData_Wikidata();

		/**
		 * The meta object literal for the '<em><b>Datacommons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__DATACOMMONS = eINSTANCE.getIndexData_Datacommons();

		/**
		 * The meta object literal for the '<em><b>Country code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__COUNTRY_CODE = eINSTANCE.getIndexData_Country_code();

		/**
		 * The meta object literal for the '<em><b>Country name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__COUNTRY_NAME = eINSTANCE.getIndexData_Country_name();

		/**
		 * The meta object literal for the '<em><b>Subregion1 code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__SUBREGION1_CODE = eINSTANCE.getIndexData_Subregion1_code();

		/**
		 * The meta object literal for the '<em><b>Subregion1 name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__SUBREGION1_NAME = eINSTANCE.getIndexData_Subregion1_name();

		/**
		 * The meta object literal for the '<em><b>Subregion2 code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__SUBREGION2_CODE = eINSTANCE.getIndexData_Subregion2_code();

		/**
		 * The meta object literal for the '<em><b>Subregion2 name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__SUBREGION2_NAME = eINSTANCE.getIndexData_Subregion2_name();

		/**
		 * The meta object literal for the '<em><b>Alpha 2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__ALPHA_2 = eINSTANCE.getIndexData_Alpha_2();

		/**
		 * The meta object literal for the '<em><b>Alpha 3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__ALPHA_3 = eINSTANCE.getIndexData_Alpha_3();

		/**
		 * The meta object literal for the '<em><b>Aggregation level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DATA__AGGREGATION_LEVEL = eINSTANCE.getIndexData_Aggregation_level();

		/**
		 * The meta object literal for the '{@link mdse.covd.covidCsv.impl.EpidemiologyRecordImpl <em>Epidemiology Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdse.covd.covidCsv.impl.EpidemiologyRecordImpl
		 * @see mdse.covd.covidCsv.impl.covidPackageImpl#getEpidemiologyRecord()
		 * @generated
		 */
		EClass EPIDEMIOLOGY_RECORD = eINSTANCE.getEpidemiologyRecord();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_RECORD__DATE = eINSTANCE.getEpidemiologyRecord_Date();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_RECORD__KEY = eINSTANCE.getEpidemiologyRecord_Key();

		/**
		 * The meta object literal for the '<em><b>New confirmed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_RECORD__NEW_CONFIRMED = eINSTANCE.getEpidemiologyRecord_New_confirmed();

		/**
		 * The meta object literal for the '<em><b>New deceased</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_RECORD__NEW_DECEASED = eINSTANCE.getEpidemiologyRecord_New_deceased();

		/**
		 * The meta object literal for the '<em><b>New recovered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_RECORD__NEW_RECOVERED = eINSTANCE.getEpidemiologyRecord_New_recovered();

		/**
		 * The meta object literal for the '<em><b>New tested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_RECORD__NEW_TESTED = eINSTANCE.getEpidemiologyRecord_New_tested();

		/**
		 * The meta object literal for the '<em><b>Total confirmed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_RECORD__TOTAL_CONFIRMED = eINSTANCE.getEpidemiologyRecord_Total_confirmed();

		/**
		 * The meta object literal for the '<em><b>Total deceased</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_RECORD__TOTAL_DECEASED = eINSTANCE.getEpidemiologyRecord_Total_deceased();

		/**
		 * The meta object literal for the '<em><b>Total tested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_RECORD__TOTAL_TESTED = eINSTANCE.getEpidemiologyRecord_Total_tested();

		/**
		 * The meta object literal for the '<em><b>Index Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPIDEMIOLOGY_RECORD__INDEX_DATA = eINSTANCE.getEpidemiologyRecord_IndexData();

		/**
		 * The meta object literal for the '{@link mdse.covd.covidCsv.impl.DataPoolImpl <em>Data Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdse.covd.covidCsv.impl.DataPoolImpl
		 * @see mdse.covd.covidCsv.impl.covidPackageImpl#getDataPool()
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

	}

} //covidPackage
