/**
 */
package mdse-covid-csv.covidCsv.impl;

import mdse-covid-csv.covidCsv.CovidCsvPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getKey <em>Key</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getLife_expectancy <em>Life expectancy</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getSmoking_prevalence <em>Smoking prevalence</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getDiabetes_prevalence <em>Diabetes prevalence</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getInfant_mortality_rate <em>Infant mortality rate</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getAdult_male_mortality_rate <em>Adult male mortality rate</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getAdult_female_mortality_rate <em>Adult female mortality rate</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getPollution_mortality_rate <em>Pollution mortality rate</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getComorbidity_mortality_rate <em>Comorbidity mortality rate</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getHospital_beds <em>Hospital beds</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getNurses <em>Nurses</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getPhysicians <em>Physicians</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getHealth_expenditure <em>Health expenditure</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getOut_of_pocket_health_expenditure <em>Out of pocket health expenditure</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.HealthDataImpl#getIndexData <em>Index Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthDataImpl extends MinimalEObjectImpl.Container implements CSV
{
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLife_expectancy() <em>Life expectancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLife_expectancy()
	 * @generated
	 * @ordered
	 */
	protected static final float LIFE_EXPECTANCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLife_expectancy() <em>Life expectancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLife_expectancy()
	 * @generated
	 * @ordered
	 */
	protected float life_expectancy = LIFE_EXPECTANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmoking_prevalence() <em>Smoking prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoking_prevalence()
	 * @generated
	 * @ordered
	 */
	protected static final float SMOKING_PREVALENCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSmoking_prevalence() <em>Smoking prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoking_prevalence()
	 * @generated
	 * @ordered
	 */
	protected float smoking_prevalence = SMOKING_PREVALENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiabetes_prevalence() <em>Diabetes prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiabetes_prevalence()
	 * @generated
	 * @ordered
	 */
	protected static final float DIABETES_PREVALENCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiabetes_prevalence() <em>Diabetes prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiabetes_prevalence()
	 * @generated
	 * @ordered
	 */
	protected float diabetes_prevalence = DIABETES_PREVALENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfant_mortality_rate() <em>Infant mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfant_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final float INFANT_MORTALITY_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInfant_mortality_rate() <em>Infant mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfant_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected float infant_mortality_rate = INFANT_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdult_male_mortality_rate() <em>Adult male mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_male_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final float ADULT_MALE_MORTALITY_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAdult_male_mortality_rate() <em>Adult male mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_male_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected float adult_male_mortality_rate = ADULT_MALE_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdult_female_mortality_rate() <em>Adult female mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_female_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final float ADULT_FEMALE_MORTALITY_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAdult_female_mortality_rate() <em>Adult female mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_female_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected float adult_female_mortality_rate = ADULT_FEMALE_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollution_mortality_rate() <em>Pollution mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollution_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final float POLLUTION_MORTALITY_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPollution_mortality_rate() <em>Pollution mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollution_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected float pollution_mortality_rate = POLLUTION_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComorbidity_mortality_rate() <em>Comorbidity mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidity_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final float COMORBIDITY_MORTALITY_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getComorbidity_mortality_rate() <em>Comorbidity mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidity_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected float comorbidity_mortality_rate = COMORBIDITY_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHospital_beds() <em>Hospital beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospital_beds()
	 * @generated
	 * @ordered
	 */
	protected static final float HOSPITAL_BEDS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHospital_beds() <em>Hospital beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospital_beds()
	 * @generated
	 * @ordered
	 */
	protected float hospital_beds = HOSPITAL_BEDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNurses() <em>Nurses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNurses()
	 * @generated
	 * @ordered
	 */
	protected static final float NURSES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNurses() <em>Nurses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNurses()
	 * @generated
	 * @ordered
	 */
	protected float nurses = NURSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicians() <em>Physicians</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicians()
	 * @generated
	 * @ordered
	 */
	protected static final float PHYSICIANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhysicians() <em>Physicians</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicians()
	 * @generated
	 * @ordered
	 */
	protected float physicians = PHYSICIANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealth_expenditure() <em>Health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealth_expenditure()
	 * @generated
	 * @ordered
	 */
	protected static final float HEALTH_EXPENDITURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHealth_expenditure() <em>Health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealth_expenditure()
	 * @generated
	 * @ordered
	 */
	protected float health_expenditure = HEALTH_EXPENDITURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOut_of_pocket_health_expenditure() <em>Out of pocket health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut_of_pocket_health_expenditure()
	 * @generated
	 * @ordered
	 */
	protected static final float OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOut_of_pocket_health_expenditure() <em>Out of pocket health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut_of_pocket_health_expenditure()
	 * @generated
	 * @ordered
	 */
	protected float out_of_pocket_health_expenditure = OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndexData() <em>Index Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexData()
	 * @generated
	 * @ordered
	 */
	protected CSV indexData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthDataImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return CovidCsvPackage.Literals.HEALTH_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey()
	{
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey)
	{
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLife_expectancy()
	{
		return life_expectancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLife_expectancy(float newLife_expectancy)
	{
		float oldLife_expectancy = life_expectancy;
		life_expectancy = newLife_expectancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__LIFE_EXPECTANCY, oldLife_expectancy, life_expectancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSmoking_prevalence()
	{
		return smoking_prevalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmoking_prevalence(float newSmoking_prevalence)
	{
		float oldSmoking_prevalence = smoking_prevalence;
		smoking_prevalence = newSmoking_prevalence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__SMOKING_PREVALENCE, oldSmoking_prevalence, smoking_prevalence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDiabetes_prevalence()
	{
		return diabetes_prevalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiabetes_prevalence(float newDiabetes_prevalence)
	{
		float oldDiabetes_prevalence = diabetes_prevalence;
		diabetes_prevalence = newDiabetes_prevalence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__DIABETES_PREVALENCE, oldDiabetes_prevalence, diabetes_prevalence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInfant_mortality_rate()
	{
		return infant_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfant_mortality_rate(float newInfant_mortality_rate)
	{
		float oldInfant_mortality_rate = infant_mortality_rate;
		infant_mortality_rate = newInfant_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__INFANT_MORTALITY_RATE, oldInfant_mortality_rate, infant_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAdult_male_mortality_rate()
	{
		return adult_male_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdult_male_mortality_rate(float newAdult_male_mortality_rate)
	{
		float oldAdult_male_mortality_rate = adult_male_mortality_rate;
		adult_male_mortality_rate = newAdult_male_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__ADULT_MALE_MORTALITY_RATE, oldAdult_male_mortality_rate, adult_male_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAdult_female_mortality_rate()
	{
		return adult_female_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdult_female_mortality_rate(float newAdult_female_mortality_rate)
	{
		float oldAdult_female_mortality_rate = adult_female_mortality_rate;
		adult_female_mortality_rate = newAdult_female_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__ADULT_FEMALE_MORTALITY_RATE, oldAdult_female_mortality_rate, adult_female_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPollution_mortality_rate()
	{
		return pollution_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollution_mortality_rate(float newPollution_mortality_rate)
	{
		float oldPollution_mortality_rate = pollution_mortality_rate;
		pollution_mortality_rate = newPollution_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__POLLUTION_MORTALITY_RATE, oldPollution_mortality_rate, pollution_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getComorbidity_mortality_rate()
	{
		return comorbidity_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComorbidity_mortality_rate(float newComorbidity_mortality_rate)
	{
		float oldComorbidity_mortality_rate = comorbidity_mortality_rate;
		comorbidity_mortality_rate = newComorbidity_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__COMORBIDITY_MORTALITY_RATE, oldComorbidity_mortality_rate, comorbidity_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHospital_beds()
	{
		return hospital_beds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospital_beds(float newHospital_beds)
	{
		float oldHospital_beds = hospital_beds;
		hospital_beds = newHospital_beds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__HOSPITAL_BEDS, oldHospital_beds, hospital_beds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNurses()
	{
		return nurses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNurses(float newNurses)
	{
		float oldNurses = nurses;
		nurses = newNurses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__NURSES, oldNurses, nurses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPhysicians()
	{
		return physicians;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicians(float newPhysicians)
	{
		float oldPhysicians = physicians;
		physicians = newPhysicians;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__PHYSICIANS, oldPhysicians, physicians));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHealth_expenditure()
	{
		return health_expenditure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealth_expenditure(float newHealth_expenditure)
	{
		float oldHealth_expenditure = health_expenditure;
		health_expenditure = newHealth_expenditure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__HEALTH_EXPENDITURE, oldHealth_expenditure, health_expenditure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOut_of_pocket_health_expenditure()
	{
		return out_of_pocket_health_expenditure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut_of_pocket_health_expenditure(float newOut_of_pocket_health_expenditure)
	{
		float oldOut_of_pocket_health_expenditure = out_of_pocket_health_expenditure;
		out_of_pocket_health_expenditure = newOut_of_pocket_health_expenditure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__OUT_OF_POCKET_HEALTH_EXPENDITURE, oldOut_of_pocket_health_expenditure, out_of_pocket_health_expenditure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public CSV getIndexData()
	{
		if (indexData != null && ((EObject)indexData).eIsProxy())
		{
			InternalEObject oldIndexData = (InternalEObject)indexData;
			indexData = (CSV)eResolveProxy(oldIndexData);
			if (indexData != oldIndexData)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CovidCsvPackage.HEALTH_DATA__INDEX_DATA, oldIndexData, indexData));
			}
		}
		return indexData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSV basicGetIndexData()
	{
		return indexData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexData(CSV newIndexData)
	{
		CSV oldIndexData = indexData;
		indexData = newIndexData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.HEALTH_DATA__INDEX_DATA, oldIndexData, indexData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case CovidCsvPackage.HEALTH_DATA__KEY:
				return getKey();
			case CovidCsvPackage.HEALTH_DATA__LIFE_EXPECTANCY:
				return getLife_expectancy();
			case CovidCsvPackage.HEALTH_DATA__SMOKING_PREVALENCE:
				return getSmoking_prevalence();
			case CovidCsvPackage.HEALTH_DATA__DIABETES_PREVALENCE:
				return getDiabetes_prevalence();
			case CovidCsvPackage.HEALTH_DATA__INFANT_MORTALITY_RATE:
				return getInfant_mortality_rate();
			case CovidCsvPackage.HEALTH_DATA__ADULT_MALE_MORTALITY_RATE:
				return getAdult_male_mortality_rate();
			case CovidCsvPackage.HEALTH_DATA__ADULT_FEMALE_MORTALITY_RATE:
				return getAdult_female_mortality_rate();
			case CovidCsvPackage.HEALTH_DATA__POLLUTION_MORTALITY_RATE:
				return getPollution_mortality_rate();
			case CovidCsvPackage.HEALTH_DATA__COMORBIDITY_MORTALITY_RATE:
				return getComorbidity_mortality_rate();
			case CovidCsvPackage.HEALTH_DATA__HOSPITAL_BEDS:
				return getHospital_beds();
			case CovidCsvPackage.HEALTH_DATA__NURSES:
				return getNurses();
			case CovidCsvPackage.HEALTH_DATA__PHYSICIANS:
				return getPhysicians();
			case CovidCsvPackage.HEALTH_DATA__HEALTH_EXPENDITURE:
				return getHealth_expenditure();
			case CovidCsvPackage.HEALTH_DATA__OUT_OF_POCKET_HEALTH_EXPENDITURE:
				return getOut_of_pocket_health_expenditure();
			case CovidCsvPackage.HEALTH_DATA__INDEX_DATA:
				if (resolve) return getIndexData();
				return basicGetIndexData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case CovidCsvPackage.HEALTH_DATA__KEY:
				setKey((String)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__LIFE_EXPECTANCY:
				setLife_expectancy((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__SMOKING_PREVALENCE:
				setSmoking_prevalence((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__DIABETES_PREVALENCE:
				setDiabetes_prevalence((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__INFANT_MORTALITY_RATE:
				setInfant_mortality_rate((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__ADULT_MALE_MORTALITY_RATE:
				setAdult_male_mortality_rate((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__ADULT_FEMALE_MORTALITY_RATE:
				setAdult_female_mortality_rate((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__POLLUTION_MORTALITY_RATE:
				setPollution_mortality_rate((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__COMORBIDITY_MORTALITY_RATE:
				setComorbidity_mortality_rate((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__HOSPITAL_BEDS:
				setHospital_beds((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__NURSES:
				setNurses((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__PHYSICIANS:
				setPhysicians((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__HEALTH_EXPENDITURE:
				setHealth_expenditure((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__OUT_OF_POCKET_HEALTH_EXPENDITURE:
				setOut_of_pocket_health_expenditure((Float)newValue);
				return;
			case CovidCsvPackage.HEALTH_DATA__INDEX_DATA:
				setIndexData((CSV)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case CovidCsvPackage.HEALTH_DATA__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__LIFE_EXPECTANCY:
				setLife_expectancy(LIFE_EXPECTANCY_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__SMOKING_PREVALENCE:
				setSmoking_prevalence(SMOKING_PREVALENCE_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__DIABETES_PREVALENCE:
				setDiabetes_prevalence(DIABETES_PREVALENCE_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__INFANT_MORTALITY_RATE:
				setInfant_mortality_rate(INFANT_MORTALITY_RATE_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__ADULT_MALE_MORTALITY_RATE:
				setAdult_male_mortality_rate(ADULT_MALE_MORTALITY_RATE_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__ADULT_FEMALE_MORTALITY_RATE:
				setAdult_female_mortality_rate(ADULT_FEMALE_MORTALITY_RATE_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__POLLUTION_MORTALITY_RATE:
				setPollution_mortality_rate(POLLUTION_MORTALITY_RATE_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__COMORBIDITY_MORTALITY_RATE:
				setComorbidity_mortality_rate(COMORBIDITY_MORTALITY_RATE_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__HOSPITAL_BEDS:
				setHospital_beds(HOSPITAL_BEDS_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__NURSES:
				setNurses(NURSES_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__PHYSICIANS:
				setPhysicians(PHYSICIANS_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__HEALTH_EXPENDITURE:
				setHealth_expenditure(HEALTH_EXPENDITURE_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__OUT_OF_POCKET_HEALTH_EXPENDITURE:
				setOut_of_pocket_health_expenditure(OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT);
				return;
			case CovidCsvPackage.HEALTH_DATA__INDEX_DATA:
				setIndexData((CSV)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case CovidCsvPackage.HEALTH_DATA__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case CovidCsvPackage.HEALTH_DATA__LIFE_EXPECTANCY:
				return life_expectancy != LIFE_EXPECTANCY_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__SMOKING_PREVALENCE:
				return smoking_prevalence != SMOKING_PREVALENCE_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__DIABETES_PREVALENCE:
				return diabetes_prevalence != DIABETES_PREVALENCE_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__INFANT_MORTALITY_RATE:
				return infant_mortality_rate != INFANT_MORTALITY_RATE_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__ADULT_MALE_MORTALITY_RATE:
				return adult_male_mortality_rate != ADULT_MALE_MORTALITY_RATE_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__ADULT_FEMALE_MORTALITY_RATE:
				return adult_female_mortality_rate != ADULT_FEMALE_MORTALITY_RATE_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__POLLUTION_MORTALITY_RATE:
				return pollution_mortality_rate != POLLUTION_MORTALITY_RATE_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__COMORBIDITY_MORTALITY_RATE:
				return comorbidity_mortality_rate != COMORBIDITY_MORTALITY_RATE_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__HOSPITAL_BEDS:
				return hospital_beds != HOSPITAL_BEDS_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__NURSES:
				return nurses != NURSES_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__PHYSICIANS:
				return physicians != PHYSICIANS_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__HEALTH_EXPENDITURE:
				return health_expenditure != HEALTH_EXPENDITURE_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__OUT_OF_POCKET_HEALTH_EXPENDITURE:
				return out_of_pocket_health_expenditure != OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT;
			case CovidCsvPackage.HEALTH_DATA__INDEX_DATA:
				return indexData != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (key: ");
		result.append(key);
		result.append(", life_expectancy: ");
		result.append(life_expectancy);
		result.append(", smoking_prevalence: ");
		result.append(smoking_prevalence);
		result.append(", diabetes_prevalence: ");
		result.append(diabetes_prevalence);
		result.append(", infant_mortality_rate: ");
		result.append(infant_mortality_rate);
		result.append(", adult_male_mortality_rate: ");
		result.append(adult_male_mortality_rate);
		result.append(", adult_female_mortality_rate: ");
		result.append(adult_female_mortality_rate);
		result.append(", pollution_mortality_rate: ");
		result.append(pollution_mortality_rate);
		result.append(", comorbidity_mortality_rate: ");
		result.append(comorbidity_mortality_rate);
		result.append(", hospital_beds: ");
		result.append(hospital_beds);
		result.append(", nurses: ");
		result.append(nurses);
		result.append(", physicians: ");
		result.append(physicians);
		result.append(", health_expenditure: ");
		result.append(health_expenditure);
		result.append(", out_of_pocket_health_expenditure: ");
		result.append(out_of_pocket_health_expenditure);
		result.append(')');
		return result.toString();
	}

} //HealthDataImpl
