/**
 */
package se.lnu.joa.covid.model.covid19.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.lnu.joa.covid.model.covid19.Covid19Factory;
import se.lnu.joa.covid.model.covid19.Covid19Package;
import se.lnu.joa.covid.model.covid19.DataPool;
import se.lnu.joa.covid.model.covid19.DataRecord;
import se.lnu.joa.covid.model.covid19.Epidemiology;
import se.lnu.joa.covid.model.covid19.Health;
import se.lnu.joa.covid.model.covid19.Index;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Covid19PackageImpl extends EPackageImpl implements Covid19Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epidemiologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

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
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Covid19PackageImpl() {
		super(eNS_URI, Covid19Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Covid19Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Covid19Package init() {
		if (isInited)
			return (Covid19Package) EPackage.Registry.INSTANCE.getEPackage(Covid19Package.eNS_URI);

		// Obtain or create and register package
		Object registeredCovid19Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Covid19PackageImpl theCovid19Package = registeredCovid19Package instanceof Covid19PackageImpl
				? (Covid19PackageImpl) registeredCovid19Package
				: new Covid19PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCovid19Package.createPackageContents();

		// Initialize created meta-data
		theCovid19Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCovid19Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Covid19Package.eNS_URI, theCovid19Package);
		return theCovid19Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealth() {
		return healthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Life_expectancy() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Smoking_prevalence() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Diabetes_prevalence() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Infant_mortality_rate() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Adult_male_mortality_rate() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Adult_female_mortality_rate() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Pollution_mortality_rate() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Comorbidity_mortality_rate() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Hospital_beds() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Nurses() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Physicians() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Health_expenditure() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealth_Out_of_pocket_health_expenditure() {
		return (EAttribute) healthEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpidemiology() {
		return epidemiologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiology_Date() {
		return (EAttribute) epidemiologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiology_New_confirmed() {
		return (EAttribute) epidemiologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiology_New_deceased() {
		return (EAttribute) epidemiologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiology_New_recovered() {
		return (EAttribute) epidemiologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiology_New_tested() {
		return (EAttribute) epidemiologyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiology_Total_confirmed() {
		return (EAttribute) epidemiologyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiology_Total_deceased() {
		return (EAttribute) epidemiologyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiology_Total_tested() {
		return (EAttribute) epidemiologyEClass.getEStructuralFeatures().get(7);
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
	public EReference getDataPool_IndexData() {
		return (EReference) dataPoolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRecord() {
		return dataRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRecord_Key() {
		return (EAttribute) dataRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndex_Wikidata() {
		return (EAttribute) indexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Covid19Factory getCovid19Factory() {
		return (Covid19Factory) getEFactoryInstance();
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
		healthEClass = createEClass(HEALTH);
		createEAttribute(healthEClass, HEALTH__LIFE_EXPECTANCY);
		createEAttribute(healthEClass, HEALTH__SMOKING_PREVALENCE);
		createEAttribute(healthEClass, HEALTH__DIABETES_PREVALENCE);
		createEAttribute(healthEClass, HEALTH__INFANT_MORTALITY_RATE);
		createEAttribute(healthEClass, HEALTH__ADULT_MALE_MORTALITY_RATE);
		createEAttribute(healthEClass, HEALTH__ADULT_FEMALE_MORTALITY_RATE);
		createEAttribute(healthEClass, HEALTH__POLLUTION_MORTALITY_RATE);
		createEAttribute(healthEClass, HEALTH__COMORBIDITY_MORTALITY_RATE);
		createEAttribute(healthEClass, HEALTH__HOSPITAL_BEDS);
		createEAttribute(healthEClass, HEALTH__NURSES);
		createEAttribute(healthEClass, HEALTH__PHYSICIANS);
		createEAttribute(healthEClass, HEALTH__HEALTH_EXPENDITURE);
		createEAttribute(healthEClass, HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE);

		epidemiologyEClass = createEClass(EPIDEMIOLOGY);
		createEAttribute(epidemiologyEClass, EPIDEMIOLOGY__DATE);
		createEAttribute(epidemiologyEClass, EPIDEMIOLOGY__NEW_CONFIRMED);
		createEAttribute(epidemiologyEClass, EPIDEMIOLOGY__NEW_DECEASED);
		createEAttribute(epidemiologyEClass, EPIDEMIOLOGY__NEW_RECOVERED);
		createEAttribute(epidemiologyEClass, EPIDEMIOLOGY__NEW_TESTED);
		createEAttribute(epidemiologyEClass, EPIDEMIOLOGY__TOTAL_CONFIRMED);
		createEAttribute(epidemiologyEClass, EPIDEMIOLOGY__TOTAL_DECEASED);
		createEAttribute(epidemiologyEClass, EPIDEMIOLOGY__TOTAL_TESTED);

		dataPoolEClass = createEClass(DATA_POOL);
		createEReference(dataPoolEClass, DATA_POOL__HEALTH_DATA);
		createEReference(dataPoolEClass, DATA_POOL__EPIDEMIOLOGY_DATA);
		createEReference(dataPoolEClass, DATA_POOL__INDEX_DATA);

		dataRecordEClass = createEClass(DATA_RECORD);
		createEAttribute(dataRecordEClass, DATA_RECORD__KEY);

		indexEClass = createEClass(INDEX);
		createEAttribute(indexEClass, INDEX__WIKIDATA);
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
		healthEClass.getESuperTypes().add(this.getDataRecord());
		epidemiologyEClass.getESuperTypes().add(this.getDataRecord());
		indexEClass.getESuperTypes().add(this.getDataRecord());

		// Initialize classes, features, and operations; add parameters
		initEClass(healthEClass, Health.class, "Health", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHealth_Life_expectancy(), ecorePackage.getEString(), "life_expectancy", null, 0, 1,
				Health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Smoking_prevalence(), ecorePackage.getEString(), "smoking_prevalence", null, 0, 1,
				Health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Diabetes_prevalence(), ecorePackage.getEString(), "diabetes_prevalence", null, 0, 1,
				Health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Infant_mortality_rate(), ecorePackage.getEString(), "infant_mortality_rate", null, 0,
				1, Health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Adult_male_mortality_rate(), ecorePackage.getEString(), "adult_male_mortality_rate",
				null, 0, 1, Health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Adult_female_mortality_rate(), ecorePackage.getEString(),
				"adult_female_mortality_rate", null, 0, 1, Health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Pollution_mortality_rate(), ecorePackage.getEString(), "pollution_mortality_rate",
				null, 0, 1, Health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Comorbidity_mortality_rate(), ecorePackage.getEString(), "comorbidity_mortality_rate",
				null, 0, 1, Health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Hospital_beds(), ecorePackage.getEString(), "hospital_beds", null, 0, 1, Health.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Nurses(), ecorePackage.getEString(), "nurses", null, 0, 1, Health.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Physicians(), ecorePackage.getEString(), "physicians", null, 0, 1, Health.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Health_expenditure(), ecorePackage.getEString(), "health_expenditure", null, 0, 1,
				Health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Out_of_pocket_health_expenditure(), ecorePackage.getEString(),
				"out_of_pocket_health_expenditure", null, 0, 1, Health.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(epidemiologyEClass, Epidemiology.class, "Epidemiology", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEpidemiology_Date(), ecorePackage.getEString(), "date", null, 0, 1, Epidemiology.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiology_New_confirmed(), ecorePackage.getEInt(), "new_confirmed", null, 0, 1,
				Epidemiology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiology_New_deceased(), ecorePackage.getEInt(), "new_deceased", null, 0, 1,
				Epidemiology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiology_New_recovered(), ecorePackage.getEInt(), "new_recovered", null, 0, 1,
				Epidemiology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiology_New_tested(), ecorePackage.getEInt(), "new_tested", null, 0, 1,
				Epidemiology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiology_Total_confirmed(), ecorePackage.getEInt(), "total_confirmed", null, 0, 1,
				Epidemiology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiology_Total_deceased(), ecorePackage.getEInt(), "total_deceased", null, 0, 1,
				Epidemiology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiology_Total_tested(), ecorePackage.getEInt(), "total_tested", null, 0, 1,
				Epidemiology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataPoolEClass, DataPool.class, "DataPool", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPool_HealthData(), this.getHealth(), null, "HealthData", null, 0, -1, DataPool.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPool_EpidemiologyData(), this.getEpidemiology(), null, "EpidemiologyData", null, 0, -1,
				DataPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPool_IndexData(), this.getIndex(), null, "IndexData", null, 0, -1, DataPool.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRecordEClass, DataRecord.class, "DataRecord", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataRecord_Key(), ecorePackage.getEString(), "key", null, 0, 1, DataRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexEClass, Index.class, "Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndex_Wikidata(), ecorePackage.getEString(), "wikidata", null, 0, 1, Index.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Covid19PackageImpl
