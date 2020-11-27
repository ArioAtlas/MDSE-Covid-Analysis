/**
 */
package mdse-covid-csv.covidCsv.impl;

import mdse-covid-csv.covidCsv.CovidCsvFactory;
import mdse-covid-csv.covidCsv.CovidCsvPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CovidCsvPackageImpl extends EPackageImpl implements CovidCsvPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epidemiologyDataEClass = null;

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
	 * @see mdse-covid-csv.covidCsv.CovidCsvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CovidCsvPackageImpl()
	{
		super(eNS_URI, CovidCsvFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CovidCsvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CovidCsvPackage init()
	{
		if (isInited) return (CovidCsvPackage)EPackage.Registry.INSTANCE.getEPackage(CovidCsvPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCovidCsvPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CovidCsvPackageImpl theCovidCsvPackage = registeredCovidCsvPackage instanceof CovidCsvPackageImpl ? (CovidCsvPackageImpl)registeredCovidCsvPackage : new CovidCsvPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCovidCsvPackage.createPackageContents();

		// Initialize created meta-data
		theCovidCsvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCovidCsvPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CovidCsvPackage.eNS_URI, theCovidCsvPackage);
		return theCovidCsvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthData()
	{
		return healthDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Key()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Life_expectancy()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Smoking_prevalence()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Diabetes_prevalence()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Infant_mortality_rate()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Adult_male_mortality_rate()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Adult_female_mortality_rate()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Pollution_mortality_rate()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Comorbidity_mortality_rate()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Hospital_beds()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Nurses()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Physicians()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Health_expenditure()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthData_Out_of_pocket_health_expenditure()
	{
		return (EAttribute)healthDataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthData_IndexData()
	{
		return (EReference)healthDataEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexData()
	{
		return indexDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Key()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Wikidata()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Datacommons()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Country_code()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Country_name()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Subregion1_code()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Subregion1_name()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Subregion2_code()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Subregion2_name()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Alpha_2()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Alpha_3()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Aggregation_level()
	{
		return (EAttribute)indexDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpidemiologyData()
	{
		return epidemiologyDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyData_Date()
	{
		return (EAttribute)epidemiologyDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyData_Key()
	{
		return (EAttribute)epidemiologyDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyData_New_confirmed()
	{
		return (EAttribute)epidemiologyDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyData_New_deceased()
	{
		return (EAttribute)epidemiologyDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyData_New_recovered()
	{
		return (EAttribute)epidemiologyDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyData_New_tested()
	{
		return (EAttribute)epidemiologyDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyData_Total_confirmed()
	{
		return (EAttribute)epidemiologyDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyData_Total_deceased()
	{
		return (EAttribute)epidemiologyDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyData_Total_tested()
	{
		return (EAttribute)epidemiologyDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpidemiologyData_IndexData()
	{
		return (EReference)epidemiologyDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CovidCsvFactory getCovidCsvFactory()
	{
		return (CovidCsvFactory)getEFactoryInstance();
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
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		healthDataEClass = createEClass(HEALTH_DATA);
		createEAttribute(healthDataEClass, HEALTH_DATA__KEY);
		createEAttribute(healthDataEClass, HEALTH_DATA__LIFE_EXPECTANCY);
		createEAttribute(healthDataEClass, HEALTH_DATA__SMOKING_PREVALENCE);
		createEAttribute(healthDataEClass, HEALTH_DATA__DIABETES_PREVALENCE);
		createEAttribute(healthDataEClass, HEALTH_DATA__INFANT_MORTALITY_RATE);
		createEAttribute(healthDataEClass, HEALTH_DATA__ADULT_MALE_MORTALITY_RATE);
		createEAttribute(healthDataEClass, HEALTH_DATA__ADULT_FEMALE_MORTALITY_RATE);
		createEAttribute(healthDataEClass, HEALTH_DATA__POLLUTION_MORTALITY_RATE);
		createEAttribute(healthDataEClass, HEALTH_DATA__COMORBIDITY_MORTALITY_RATE);
		createEAttribute(healthDataEClass, HEALTH_DATA__HOSPITAL_BEDS);
		createEAttribute(healthDataEClass, HEALTH_DATA__NURSES);
		createEAttribute(healthDataEClass, HEALTH_DATA__PHYSICIANS);
		createEAttribute(healthDataEClass, HEALTH_DATA__HEALTH_EXPENDITURE);
		createEAttribute(healthDataEClass, HEALTH_DATA__OUT_OF_POCKET_HEALTH_EXPENDITURE);
		createEReference(healthDataEClass, HEALTH_DATA__INDEX_DATA);

		indexDataEClass = createEClass(INDEX_DATA);
		createEAttribute(indexDataEClass, INDEX_DATA__KEY);
		createEAttribute(indexDataEClass, INDEX_DATA__WIKIDATA);
		createEAttribute(indexDataEClass, INDEX_DATA__DATACOMMONS);
		createEAttribute(indexDataEClass, INDEX_DATA__COUNTRY_CODE);
		createEAttribute(indexDataEClass, INDEX_DATA__COUNTRY_NAME);
		createEAttribute(indexDataEClass, INDEX_DATA__SUBREGION1_CODE);
		createEAttribute(indexDataEClass, INDEX_DATA__SUBREGION1_NAME);
		createEAttribute(indexDataEClass, INDEX_DATA__SUBREGION2_CODE);
		createEAttribute(indexDataEClass, INDEX_DATA__SUBREGION2_NAME);
		createEAttribute(indexDataEClass, INDEX_DATA__ALPHA_2);
		createEAttribute(indexDataEClass, INDEX_DATA__ALPHA_3);
		createEAttribute(indexDataEClass, INDEX_DATA__AGGREGATION_LEVEL);

		epidemiologyDataEClass = createEClass(EPIDEMIOLOGY_DATA);
		createEAttribute(epidemiologyDataEClass, EPIDEMIOLOGY_DATA__DATE);
		createEAttribute(epidemiologyDataEClass, EPIDEMIOLOGY_DATA__KEY);
		createEAttribute(epidemiologyDataEClass, EPIDEMIOLOGY_DATA__NEW_CONFIRMED);
		createEAttribute(epidemiologyDataEClass, EPIDEMIOLOGY_DATA__NEW_DECEASED);
		createEAttribute(epidemiologyDataEClass, EPIDEMIOLOGY_DATA__NEW_RECOVERED);
		createEAttribute(epidemiologyDataEClass, EPIDEMIOLOGY_DATA__NEW_TESTED);
		createEAttribute(epidemiologyDataEClass, EPIDEMIOLOGY_DATA__TOTAL_CONFIRMED);
		createEAttribute(epidemiologyDataEClass, EPIDEMIOLOGY_DATA__TOTAL_DECEASED);
		createEAttribute(epidemiologyDataEClass, EPIDEMIOLOGY_DATA__TOTAL_TESTED);
		createEReference(epidemiologyDataEClass, EPIDEMIOLOGY_DATA__INDEX_DATA);
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
	public void initializePackageContents()
	{
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
		initEClass(healthDataEClass, Object.class, "HealthData", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHealthData_Key(), ecorePackage.getEString(), "key", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Life_expectancy(), ecorePackage.getEFloat(), "life_expectancy", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Smoking_prevalence(), ecorePackage.getEFloat(), "smoking_prevalence", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Diabetes_prevalence(), ecorePackage.getEFloat(), "diabetes_prevalence", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Infant_mortality_rate(), ecorePackage.getEFloat(), "infant_mortality_rate", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Adult_male_mortality_rate(), ecorePackage.getEFloat(), "adult_male_mortality_rate", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Adult_female_mortality_rate(), ecorePackage.getEFloat(), "adult_female_mortality_rate", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Pollution_mortality_rate(), ecorePackage.getEFloat(), "pollution_mortality_rate", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Comorbidity_mortality_rate(), ecorePackage.getEFloat(), "comorbidity_mortality_rate", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Hospital_beds(), ecorePackage.getEFloat(), "hospital_beds", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Nurses(), ecorePackage.getEFloat(), "nurses", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Physicians(), ecorePackage.getEFloat(), "physicians", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Health_expenditure(), ecorePackage.getEFloat(), "health_expenditure", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthData_Out_of_pocket_health_expenditure(), ecorePackage.getEFloat(), "out_of_pocket_health_expenditure", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHealthData_IndexData(), this.getIndexData(), null, "IndexData", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexDataEClass, Object.class, "IndexData", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexData_Key(), ecorePackage.getEString(), "key", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Wikidata(), ecorePackage.getEString(), "wikidata", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Datacommons(), ecorePackage.getEString(), "datacommons", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Country_code(), ecorePackage.getEString(), "country_code", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Country_name(), ecorePackage.getEString(), "country_name", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Subregion1_code(), ecorePackage.getEString(), "subregion1_code", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Subregion1_name(), ecorePackage.getEString(), "subregion1_name", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Subregion2_code(), ecorePackage.getEString(), "subregion2_code", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Subregion2_name(), ecorePackage.getEString(), "subregion2_name", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Alpha_2(), ecorePackage.getEString(), "alpha_2", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Alpha_3(), ecorePackage.getEString(), "alpha_3", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Aggregation_level(), ecorePackage.getEInt(), "aggregation_level", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(epidemiologyDataEClass, Object.class, "EpidemiologyData", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEpidemiologyData_Date(), ecorePackage.getEString(), "date", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyData_Key(), ecorePackage.getEString(), "key", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyData_New_confirmed(), ecorePackage.getEInt(), "new_confirmed", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyData_New_deceased(), ecorePackage.getEInt(), "new_deceased", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyData_New_recovered(), ecorePackage.getEInt(), "new_recovered", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyData_New_tested(), ecorePackage.getEInt(), "new_tested", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyData_Total_confirmed(), ecorePackage.getEInt(), "total_confirmed", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyData_Total_deceased(), ecorePackage.getEInt(), "total_deceased", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyData_Total_tested(), ecorePackage.getEInt(), "total_tested", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpidemiologyData_IndexData(), this.getIndexData(), null, "IndexData", null, 0, 1, CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CovidCsvPackageImpl
