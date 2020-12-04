/**
 */
package mdse.covd.covidCsv.impl;

import mdse.covd.covidCsv.DataPool;
import mdse.covd.covidCsv.EpidemiologyRecord;
import mdse.covd.covidCsv.HealthRecord;
import mdse.covd.covidCsv.IndexData;
import mdse.covd.covidCsv.covidFactory;
import mdse.covd.covidCsv.covidPackage;

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
public class covidPackageImpl extends EPackageImpl implements covidPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthRecordEClass = null;

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
	private EClass epidemiologyRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPoolEClass = null;

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
	 * @see mdse.covd.covidCsv.covidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private covidPackageImpl() {
		super(eNS_URI, covidFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link covidPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static covidPackage init() {
		if (isInited)
			return (covidPackage) EPackage.Registry.INSTANCE.getEPackage(covidPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredcovidPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		covidPackageImpl thecovidPackage = registeredcovidPackage instanceof covidPackageImpl
				? (covidPackageImpl) registeredcovidPackage
				: new covidPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thecovidPackage.createPackageContents();

		// Initialize created meta-data
		thecovidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecovidPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(covidPackage.eNS_URI, thecovidPackage);
		return thecovidPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthRecord() {
		return healthRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Key() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Life_expectancy() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Smoking_prevalence() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Diabetes_prevalence() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Infant_mortality_rate() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Adult_male_mortality_rate() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Adult_female_mortality_rate() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Pollution_mortality_rate() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Comorbidity_mortality_rate() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Hospital_beds() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Nurses() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Physicians() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Health_expenditure() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthRecord_Out_of_pocket_health_expenditure() {
		return (EAttribute) healthRecordEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthRecord_IndexData() {
		return (EReference) healthRecordEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexData() {
		return indexDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Key() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Wikidata() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Datacommons() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Country_code() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Country_name() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Subregion1_code() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Subregion1_name() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Subregion2_code() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Subregion2_name() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Alpha_2() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Alpha_3() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexData_Aggregation_level() {
		return (EAttribute) indexDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpidemiologyRecord() {
		return epidemiologyRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyRecord_Date() {
		return (EAttribute) epidemiologyRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyRecord_Key() {
		return (EAttribute) epidemiologyRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyRecord_New_confirmed() {
		return (EAttribute) epidemiologyRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyRecord_New_deceased() {
		return (EAttribute) epidemiologyRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyRecord_New_recovered() {
		return (EAttribute) epidemiologyRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyRecord_New_tested() {
		return (EAttribute) epidemiologyRecordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyRecord_Total_confirmed() {
		return (EAttribute) epidemiologyRecordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyRecord_Total_deceased() {
		return (EAttribute) epidemiologyRecordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiologyRecord_Total_tested() {
		return (EAttribute) epidemiologyRecordEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpidemiologyRecord_IndexData() {
		return (EReference) epidemiologyRecordEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPool() {
		return dataPoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPool_HealthData() {
		return (EReference) dataPoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPool_EpidemiologyData() {
		return (EReference) dataPoolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public covidFactory getcovidFactory() {
		return (covidFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		healthRecordEClass = createEClass(HEALTH_RECORD);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__KEY);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__LIFE_EXPECTANCY);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__SMOKING_PREVALENCE);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__DIABETES_PREVALENCE);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__INFANT_MORTALITY_RATE);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__ADULT_MALE_MORTALITY_RATE);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__ADULT_FEMALE_MORTALITY_RATE);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__POLLUTION_MORTALITY_RATE);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__COMORBIDITY_MORTALITY_RATE);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__HOSPITAL_BEDS);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__NURSES);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__PHYSICIANS);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__HEALTH_EXPENDITURE);
		createEAttribute(healthRecordEClass, HEALTH_RECORD__OUT_OF_POCKET_HEALTH_EXPENDITURE);
		createEReference(healthRecordEClass, HEALTH_RECORD__INDEX_DATA);

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

		epidemiologyRecordEClass = createEClass(EPIDEMIOLOGY_RECORD);
		createEAttribute(epidemiologyRecordEClass, EPIDEMIOLOGY_RECORD__DATE);
		createEAttribute(epidemiologyRecordEClass, EPIDEMIOLOGY_RECORD__KEY);
		createEAttribute(epidemiologyRecordEClass, EPIDEMIOLOGY_RECORD__NEW_CONFIRMED);
		createEAttribute(epidemiologyRecordEClass, EPIDEMIOLOGY_RECORD__NEW_DECEASED);
		createEAttribute(epidemiologyRecordEClass, EPIDEMIOLOGY_RECORD__NEW_RECOVERED);
		createEAttribute(epidemiologyRecordEClass, EPIDEMIOLOGY_RECORD__NEW_TESTED);
		createEAttribute(epidemiologyRecordEClass, EPIDEMIOLOGY_RECORD__TOTAL_CONFIRMED);
		createEAttribute(epidemiologyRecordEClass, EPIDEMIOLOGY_RECORD__TOTAL_DECEASED);
		createEAttribute(epidemiologyRecordEClass, EPIDEMIOLOGY_RECORD__TOTAL_TESTED);
		createEReference(epidemiologyRecordEClass, EPIDEMIOLOGY_RECORD__INDEX_DATA);

		dataPoolEClass = createEClass(DATA_POOL);
		createEReference(dataPoolEClass, DATA_POOL__HEALTH_DATA);
		createEReference(dataPoolEClass, DATA_POOL__EPIDEMIOLOGY_DATA);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(healthRecordEClass, HealthRecord.class, "HealthRecord", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHealthRecord_Key(), ecorePackage.getEString(), "key", null, 0, 1, HealthRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Life_expectancy(), ecorePackage.getEFloat(), "life_expectancy", null, 0, 1,
				HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Smoking_prevalence(), ecorePackage.getEFloat(), "smoking_prevalence", null, 0, 1,
				HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Diabetes_prevalence(), ecorePackage.getEFloat(), "diabetes_prevalence", null, 0,
				1, HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Infant_mortality_rate(), ecorePackage.getEFloat(), "infant_mortality_rate", null,
				0, 1, HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Adult_male_mortality_rate(), ecorePackage.getEFloat(),
				"adult_male_mortality_rate", null, 0, 1, HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Adult_female_mortality_rate(), ecorePackage.getEFloat(),
				"adult_female_mortality_rate", null, 0, 1, HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Pollution_mortality_rate(), ecorePackage.getEFloat(), "pollution_mortality_rate",
				null, 0, 1, HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Comorbidity_mortality_rate(), ecorePackage.getEFloat(),
				"comorbidity_mortality_rate", null, 0, 1, HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Hospital_beds(), ecorePackage.getEFloat(), "hospital_beds", null, 0, 1,
				HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Nurses(), ecorePackage.getEFloat(), "nurses", null, 0, 1, HealthRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Physicians(), ecorePackage.getEFloat(), "physicians", null, 0, 1,
				HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Health_expenditure(), ecorePackage.getEFloat(), "health_expenditure", null, 0, 1,
				HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthRecord_Out_of_pocket_health_expenditure(), ecorePackage.getEFloat(),
				"out_of_pocket_health_expenditure", null, 0, 1, HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHealthRecord_IndexData(), this.getIndexData(), null, "IndexData", null, 0, 1,
				HealthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexDataEClass, IndexData.class, "IndexData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexData_Key(), ecorePackage.getEString(), "key", null, 0, 1, IndexData.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Wikidata(), ecorePackage.getEString(), "wikidata", null, 0, 1, IndexData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Datacommons(), ecorePackage.getEString(), "datacommons", null, 0, 1,
				IndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Country_code(), ecorePackage.getEString(), "country_code", null, 0, 1,
				IndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Country_name(), ecorePackage.getEString(), "country_name", null, 0, 1,
				IndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Subregion1_code(), ecorePackage.getEString(), "subregion1_code", null, 0, 1,
				IndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Subregion1_name(), ecorePackage.getEString(), "subregion1_name", null, 0, 1,
				IndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Subregion2_code(), ecorePackage.getEString(), "subregion2_code", null, 0, 1,
				IndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Subregion2_name(), ecorePackage.getEString(), "subregion2_name", null, 0, 1,
				IndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Alpha_2(), ecorePackage.getEString(), "alpha_2", null, 0, 1, IndexData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Alpha_3(), ecorePackage.getEString(), "alpha_3", null, 0, 1, IndexData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexData_Aggregation_level(), ecorePackage.getEInt(), "aggregation_level", null, 0, 1,
				IndexData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(epidemiologyRecordEClass, EpidemiologyRecord.class, "EpidemiologyRecord", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEpidemiologyRecord_Date(), ecorePackage.getEString(), "date", null, 0, 1,
				EpidemiologyRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyRecord_Key(), ecorePackage.getEString(), "key", null, 0, 1,
				EpidemiologyRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyRecord_New_confirmed(), ecorePackage.getEInt(), "new_confirmed", null, 0, 1,
				EpidemiologyRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyRecord_New_deceased(), ecorePackage.getEInt(), "new_deceased", null, 0, 1,
				EpidemiologyRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyRecord_New_recovered(), ecorePackage.getEInt(), "new_recovered", null, 0, 1,
				EpidemiologyRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyRecord_New_tested(), ecorePackage.getEInt(), "new_tested", null, 0, 1,
				EpidemiologyRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyRecord_Total_confirmed(), ecorePackage.getEInt(), "total_confirmed", null, 0, 1,
				EpidemiologyRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyRecord_Total_deceased(), ecorePackage.getEInt(), "total_deceased", null, 0, 1,
				EpidemiologyRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiologyRecord_Total_tested(), ecorePackage.getEInt(), "total_tested", null, 0, 1,
				EpidemiologyRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEpidemiologyRecord_IndexData(), this.getIndexData(), null, "IndexData", null, 0, 1,
				EpidemiologyRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPoolEClass, DataPool.class, "DataPool", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPool_HealthData(), this.getHealthRecord(), null, "HealthData", null, 0, -1,
				DataPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPool_EpidemiologyData(), this.getEpidemiologyRecord(), null, "EpidemiologyData", null, 0,
				-1, DataPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //covidPackageImpl
