/**
 */
package mdse-covid-csv.covidCsv;

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
 * @see mdse-covid-csv.covidCsv.CovidCsvFactory
 * @model kind="package"
 * @generated
 */
public interface CovidCsvPackage extends EPackage
{
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
	CovidCsvPackage eINSTANCE = mdse-covid-csv.covidCsv.impl.CovidCsvPackageImpl.init();

	/**
	 * The meta object id for the '{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl <em>Health Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdse-covid-csv.covidCsv.impl.HealthDataImpl
	 * @see mdse-covid-csv.covidCsv.impl.CovidCsvPackageImpl#getHealthData()
	 * @generated
	 */
	int HEALTH_DATA = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__KEY = 0;

	/**
	 * The feature id for the '<em><b>Life expectancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__LIFE_EXPECTANCY = 1;

	/**
	 * The feature id for the '<em><b>Smoking prevalence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__SMOKING_PREVALENCE = 2;

	/**
	 * The feature id for the '<em><b>Diabetes prevalence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__DIABETES_PREVALENCE = 3;

	/**
	 * The feature id for the '<em><b>Infant mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__INFANT_MORTALITY_RATE = 4;

	/**
	 * The feature id for the '<em><b>Adult male mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__ADULT_MALE_MORTALITY_RATE = 5;

	/**
	 * The feature id for the '<em><b>Adult female mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__ADULT_FEMALE_MORTALITY_RATE = 6;

	/**
	 * The feature id for the '<em><b>Pollution mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__POLLUTION_MORTALITY_RATE = 7;

	/**
	 * The feature id for the '<em><b>Comorbidity mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__COMORBIDITY_MORTALITY_RATE = 8;

	/**
	 * The feature id for the '<em><b>Hospital beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__HOSPITAL_BEDS = 9;

	/**
	 * The feature id for the '<em><b>Nurses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__NURSES = 10;

	/**
	 * The feature id for the '<em><b>Physicians</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__PHYSICIANS = 11;

	/**
	 * The feature id for the '<em><b>Health expenditure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__HEALTH_EXPENDITURE = 12;

	/**
	 * The feature id for the '<em><b>Out of pocket health expenditure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__OUT_OF_POCKET_HEALTH_EXPENDITURE = 13;

	/**
	 * The feature id for the '<em><b>Index Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA__INDEX_DATA = 14;

	/**
	 * The number of structural features of the '<em>Health Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Health Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdse-covid-csv.covidCsv.impl.IndexDataImpl <em>Index Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdse-covid-csv.covidCsv.impl.IndexDataImpl
	 * @see mdse-covid-csv.covidCsv.impl.CovidCsvPackageImpl#getIndexData()
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
	 * The meta object id for the '{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl <em>Epidemiology Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl
	 * @see mdse-covid-csv.covidCsv.impl.CovidCsvPackageImpl#getEpidemiologyData()
	 * @generated
	 */
	int EPIDEMIOLOGY_DATA = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA__DATE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA__KEY = 1;

	/**
	 * The feature id for the '<em><b>New confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA__NEW_CONFIRMED = 2;

	/**
	 * The feature id for the '<em><b>New deceased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA__NEW_DECEASED = 3;

	/**
	 * The feature id for the '<em><b>New recovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA__NEW_RECOVERED = 4;

	/**
	 * The feature id for the '<em><b>New tested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA__NEW_TESTED = 5;

	/**
	 * The feature id for the '<em><b>Total confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA__TOTAL_CONFIRMED = 6;

	/**
	 * The feature id for the '<em><b>Total deceased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA__TOTAL_DECEASED = 7;

	/**
	 * The feature id for the '<em><b>Total tested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA__TOTAL_TESTED = 8;

	/**
	 * The feature id for the '<em><b>Index Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA__INDEX_DATA = 9;

	/**
	 * The number of structural features of the '<em>Epidemiology Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Epidemiology Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIDEMIOLOGY_DATA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Health Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Data</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="CSV"
	 * @generated
	 */
	EClass getHealthData();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.lang.Object#getKey()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getLife_expectancy <em>Life expectancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life expectancy</em>'.
	 * @see java.lang.Object#getLife_expectancy()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Life_expectancy();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getSmoking_prevalence <em>Smoking prevalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smoking prevalence</em>'.
	 * @see java.lang.Object#getSmoking_prevalence()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Smoking_prevalence();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getDiabetes_prevalence <em>Diabetes prevalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diabetes prevalence</em>'.
	 * @see java.lang.Object#getDiabetes_prevalence()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Diabetes_prevalence();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getInfant_mortality_rate <em>Infant mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infant mortality rate</em>'.
	 * @see java.lang.Object#getInfant_mortality_rate()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Infant_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getAdult_male_mortality_rate <em>Adult male mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adult male mortality rate</em>'.
	 * @see java.lang.Object#getAdult_male_mortality_rate()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Adult_male_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getAdult_female_mortality_rate <em>Adult female mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adult female mortality rate</em>'.
	 * @see java.lang.Object#getAdult_female_mortality_rate()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Adult_female_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getPollution_mortality_rate <em>Pollution mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pollution mortality rate</em>'.
	 * @see java.lang.Object#getPollution_mortality_rate()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Pollution_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getComorbidity_mortality_rate <em>Comorbidity mortality rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comorbidity mortality rate</em>'.
	 * @see java.lang.Object#getComorbidity_mortality_rate()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Comorbidity_mortality_rate();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getHospital_beds <em>Hospital beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hospital beds</em>'.
	 * @see java.lang.Object#getHospital_beds()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Hospital_beds();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getNurses <em>Nurses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nurses</em>'.
	 * @see java.lang.Object#getNurses()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Nurses();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getPhysicians <em>Physicians</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physicians</em>'.
	 * @see java.lang.Object#getPhysicians()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Physicians();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getHealth_expenditure <em>Health expenditure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health expenditure</em>'.
	 * @see java.lang.Object#getHealth_expenditure()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Health_expenditure();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getOut_of_pocket_health_expenditure <em>Out of pocket health expenditure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out of pocket health expenditure</em>'.
	 * @see java.lang.Object#getOut_of_pocket_health_expenditure()
	 * @see #getHealthData()
	 * @generated
	 */
	EAttribute getHealthData_Out_of_pocket_health_expenditure();

	/**
	 * Returns the meta object for the reference '{@link java.lang.Object#getIndexData <em>Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index Data</em>'.
	 * @see java.lang.Object#getIndexData()
	 * @see #getHealthData()
	 * @generated
	 */
	EReference getHealthData_IndexData();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Data</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="CSV"
	 * @generated
	 */
	EClass getIndexData();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.lang.Object#getKey()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getWikidata <em>Wikidata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wikidata</em>'.
	 * @see java.lang.Object#getWikidata()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Wikidata();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getDatacommons <em>Datacommons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacommons</em>'.
	 * @see java.lang.Object#getDatacommons()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Datacommons();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getCountry_code <em>Country code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country code</em>'.
	 * @see java.lang.Object#getCountry_code()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Country_code();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getCountry_name <em>Country name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country name</em>'.
	 * @see java.lang.Object#getCountry_name()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Country_name();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getSubregion1_code <em>Subregion1 code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion1 code</em>'.
	 * @see java.lang.Object#getSubregion1_code()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Subregion1_code();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getSubregion1_name <em>Subregion1 name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion1 name</em>'.
	 * @see java.lang.Object#getSubregion1_name()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Subregion1_name();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getSubregion2_code <em>Subregion2 code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion2 code</em>'.
	 * @see java.lang.Object#getSubregion2_code()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Subregion2_code();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getSubregion2_name <em>Subregion2 name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subregion2 name</em>'.
	 * @see java.lang.Object#getSubregion2_name()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Subregion2_name();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getAlpha_2 <em>Alpha 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha 2</em>'.
	 * @see java.lang.Object#getAlpha_2()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Alpha_2();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getAlpha_3 <em>Alpha 3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha 3</em>'.
	 * @see java.lang.Object#getAlpha_3()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Alpha_3();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getAggregation_level <em>Aggregation level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation level</em>'.
	 * @see java.lang.Object#getAggregation_level()
	 * @see #getIndexData()
	 * @generated
	 */
	EAttribute getIndexData_Aggregation_level();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Epidemiology Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epidemiology Data</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="CSV"
	 * @generated
	 */
	EClass getEpidemiologyData();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see java.lang.Object#getDate()
	 * @see #getEpidemiologyData()
	 * @generated
	 */
	EAttribute getEpidemiologyData_Date();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.lang.Object#getKey()
	 * @see #getEpidemiologyData()
	 * @generated
	 */
	EAttribute getEpidemiologyData_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getNew_confirmed <em>New confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New confirmed</em>'.
	 * @see java.lang.Object#getNew_confirmed()
	 * @see #getEpidemiologyData()
	 * @generated
	 */
	EAttribute getEpidemiologyData_New_confirmed();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getNew_deceased <em>New deceased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New deceased</em>'.
	 * @see java.lang.Object#getNew_deceased()
	 * @see #getEpidemiologyData()
	 * @generated
	 */
	EAttribute getEpidemiologyData_New_deceased();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getNew_recovered <em>New recovered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New recovered</em>'.
	 * @see java.lang.Object#getNew_recovered()
	 * @see #getEpidemiologyData()
	 * @generated
	 */
	EAttribute getEpidemiologyData_New_recovered();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getNew_tested <em>New tested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New tested</em>'.
	 * @see java.lang.Object#getNew_tested()
	 * @see #getEpidemiologyData()
	 * @generated
	 */
	EAttribute getEpidemiologyData_New_tested();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getTotal_confirmed <em>Total confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total confirmed</em>'.
	 * @see java.lang.Object#getTotal_confirmed()
	 * @see #getEpidemiologyData()
	 * @generated
	 */
	EAttribute getEpidemiologyData_Total_confirmed();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getTotal_deceased <em>Total deceased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total deceased</em>'.
	 * @see java.lang.Object#getTotal_deceased()
	 * @see #getEpidemiologyData()
	 * @generated
	 */
	EAttribute getEpidemiologyData_Total_deceased();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getTotal_tested <em>Total tested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total tested</em>'.
	 * @see java.lang.Object#getTotal_tested()
	 * @see #getEpidemiologyData()
	 * @generated
	 */
	EAttribute getEpidemiologyData_Total_tested();

	/**
	 * Returns the meta object for the reference '{@link java.lang.Object#getIndexData <em>Index Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index Data</em>'.
	 * @see java.lang.Object#getIndexData()
	 * @see #getEpidemiologyData()
	 * @generated
	 */
	EReference getEpidemiologyData_IndexData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CovidCsvFactory getCovidCsvFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl <em>Health Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdse-covid-csv.covidCsv.impl.HealthDataImpl
		 * @see mdse-covid-csv.covidCsv.impl.CovidCsvPackageImpl#getHealthData()
		 * @generated
		 */
		EClass HEALTH_DATA = eINSTANCE.getHealthData();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__KEY = eINSTANCE.getHealthData_Key();

		/**
		 * The meta object literal for the '<em><b>Life expectancy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__LIFE_EXPECTANCY = eINSTANCE.getHealthData_Life_expectancy();

		/**
		 * The meta object literal for the '<em><b>Smoking prevalence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__SMOKING_PREVALENCE = eINSTANCE.getHealthData_Smoking_prevalence();

		/**
		 * The meta object literal for the '<em><b>Diabetes prevalence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__DIABETES_PREVALENCE = eINSTANCE.getHealthData_Diabetes_prevalence();

		/**
		 * The meta object literal for the '<em><b>Infant mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__INFANT_MORTALITY_RATE = eINSTANCE.getHealthData_Infant_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Adult male mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__ADULT_MALE_MORTALITY_RATE = eINSTANCE.getHealthData_Adult_male_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Adult female mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__ADULT_FEMALE_MORTALITY_RATE = eINSTANCE.getHealthData_Adult_female_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Pollution mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__POLLUTION_MORTALITY_RATE = eINSTANCE.getHealthData_Pollution_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Comorbidity mortality rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__COMORBIDITY_MORTALITY_RATE = eINSTANCE.getHealthData_Comorbidity_mortality_rate();

		/**
		 * The meta object literal for the '<em><b>Hospital beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__HOSPITAL_BEDS = eINSTANCE.getHealthData_Hospital_beds();

		/**
		 * The meta object literal for the '<em><b>Nurses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__NURSES = eINSTANCE.getHealthData_Nurses();

		/**
		 * The meta object literal for the '<em><b>Physicians</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__PHYSICIANS = eINSTANCE.getHealthData_Physicians();

		/**
		 * The meta object literal for the '<em><b>Health expenditure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__HEALTH_EXPENDITURE = eINSTANCE.getHealthData_Health_expenditure();

		/**
		 * The meta object literal for the '<em><b>Out of pocket health expenditure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_DATA__OUT_OF_POCKET_HEALTH_EXPENDITURE = eINSTANCE.getHealthData_Out_of_pocket_health_expenditure();

		/**
		 * The meta object literal for the '<em><b>Index Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALTH_DATA__INDEX_DATA = eINSTANCE.getHealthData_IndexData();

		/**
		 * The meta object literal for the '{@link mdse-covid-csv.covidCsv.impl.IndexDataImpl <em>Index Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdse-covid-csv.covidCsv.impl.IndexDataImpl
		 * @see mdse-covid-csv.covidCsv.impl.CovidCsvPackageImpl#getIndexData()
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
		 * The meta object literal for the '{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl <em>Epidemiology Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl
		 * @see mdse-covid-csv.covidCsv.impl.CovidCsvPackageImpl#getEpidemiologyData()
		 * @generated
		 */
		EClass EPIDEMIOLOGY_DATA = eINSTANCE.getEpidemiologyData();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_DATA__DATE = eINSTANCE.getEpidemiologyData_Date();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_DATA__KEY = eINSTANCE.getEpidemiologyData_Key();

		/**
		 * The meta object literal for the '<em><b>New confirmed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_DATA__NEW_CONFIRMED = eINSTANCE.getEpidemiologyData_New_confirmed();

		/**
		 * The meta object literal for the '<em><b>New deceased</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_DATA__NEW_DECEASED = eINSTANCE.getEpidemiologyData_New_deceased();

		/**
		 * The meta object literal for the '<em><b>New recovered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_DATA__NEW_RECOVERED = eINSTANCE.getEpidemiologyData_New_recovered();

		/**
		 * The meta object literal for the '<em><b>New tested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_DATA__NEW_TESTED = eINSTANCE.getEpidemiologyData_New_tested();

		/**
		 * The meta object literal for the '<em><b>Total confirmed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_DATA__TOTAL_CONFIRMED = eINSTANCE.getEpidemiologyData_Total_confirmed();

		/**
		 * The meta object literal for the '<em><b>Total deceased</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_DATA__TOTAL_DECEASED = eINSTANCE.getEpidemiologyData_Total_deceased();

		/**
		 * The meta object literal for the '<em><b>Total tested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPIDEMIOLOGY_DATA__TOTAL_TESTED = eINSTANCE.getEpidemiologyData_Total_tested();

		/**
		 * The meta object literal for the '<em><b>Index Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPIDEMIOLOGY_DATA__INDEX_DATA = eINSTANCE.getEpidemiologyData_IndexData();

	}

} //CovidCsvPackage
