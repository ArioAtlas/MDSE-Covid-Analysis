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
	public EClass getEpidemiology() {
		return epidemiologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiology_New_confirmed() {
		return (EAttribute) epidemiologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpidemiology_New_deceased() {
		return (EAttribute) epidemiologyEClass.getEStructuralFeatures().get(1);
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

		epidemiologyEClass = createEClass(EPIDEMIOLOGY);
		createEAttribute(epidemiologyEClass, EPIDEMIOLOGY__NEW_CONFIRMED);
		createEAttribute(epidemiologyEClass, EPIDEMIOLOGY__NEW_DECEASED);

		dataPoolEClass = createEClass(DATA_POOL);
		createEReference(dataPoolEClass, DATA_POOL__HEALTH_DATA);
		createEReference(dataPoolEClass, DATA_POOL__EPIDEMIOLOGY_DATA);

		dataRecordEClass = createEClass(DATA_RECORD);
		createEAttribute(dataRecordEClass, DATA_RECORD__KEY);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(healthEClass, Health.class, "Health", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHealth_Life_expectancy(), ecorePackage.getEString(), "life_expectancy", null, 0, 1,
				Health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_Smoking_prevalence(), ecorePackage.getEString(), "smoking_prevalence", null, 0, 1,
				Health.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(epidemiologyEClass, Epidemiology.class, "Epidemiology", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEpidemiology_New_confirmed(), ecorePackage.getEInt(), "new_confirmed", null, 0, 1,
				Epidemiology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpidemiology_New_deceased(), ecorePackage.getEInt(), "new_deceased", null, 0, 1,
				Epidemiology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataPoolEClass, DataPool.class, "DataPool", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPool_HealthData(), this.getHealth(), null, "HealthData", null, 0, -1, DataPool.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPool_EpidemiologyData(), this.getEpidemiology(), null, "EpidemiologyData", null, 0, -1,
				DataPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRecordEClass, DataRecord.class, "DataRecord", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataRecord_Key(), ecorePackage.getEString(), "key", null, 0, 1, DataRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Covid19PackageImpl
