/**
 */
package se.lnu.joa.covid.model.covid19.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.lnu.joa.covid.model.covid19.Covid19Package;
import se.lnu.joa.covid.model.covid19.Health;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getLife_expectancy <em>Life expectancy</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getSmoking_prevalence <em>Smoking prevalence</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getDiabetes_prevalence <em>Diabetes prevalence</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getInfant_mortality_rate <em>Infant mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getAdult_male_mortality_rate <em>Adult male mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getAdult_female_mortality_rate <em>Adult female mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getPollution_mortality_rate <em>Pollution mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getComorbidity_mortality_rate <em>Comorbidity mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getHospital_beds <em>Hospital beds</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getNurses <em>Nurses</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getPhysicians <em>Physicians</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getHealth_expenditure <em>Health expenditure</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.HealthImpl#getOut_of_pocket_health_expenditure <em>Out of pocket health expenditure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthImpl extends DataRecordImpl implements Health {
	/**
	 * The default value of the '{@link #getLife_expectancy() <em>Life expectancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLife_expectancy()
	 * @generated
	 * @ordered
	 */
	protected static final String LIFE_EXPECTANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLife_expectancy() <em>Life expectancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLife_expectancy()
	 * @generated
	 * @ordered
	 */
	protected String life_expectancy = LIFE_EXPECTANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmoking_prevalence() <em>Smoking prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoking_prevalence()
	 * @generated
	 * @ordered
	 */
	protected static final String SMOKING_PREVALENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmoking_prevalence() <em>Smoking prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoking_prevalence()
	 * @generated
	 * @ordered
	 */
	protected String smoking_prevalence = SMOKING_PREVALENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiabetes_prevalence() <em>Diabetes prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiabetes_prevalence()
	 * @generated
	 * @ordered
	 */
	protected static final String DIABETES_PREVALENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiabetes_prevalence() <em>Diabetes prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiabetes_prevalence()
	 * @generated
	 * @ordered
	 */
	protected String diabetes_prevalence = DIABETES_PREVALENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfant_mortality_rate() <em>Infant mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfant_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final String INFANT_MORTALITY_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfant_mortality_rate() <em>Infant mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfant_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected String infant_mortality_rate = INFANT_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdult_male_mortality_rate() <em>Adult male mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_male_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final String ADULT_MALE_MORTALITY_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdult_male_mortality_rate() <em>Adult male mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_male_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected String adult_male_mortality_rate = ADULT_MALE_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdult_female_mortality_rate() <em>Adult female mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_female_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final String ADULT_FEMALE_MORTALITY_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdult_female_mortality_rate() <em>Adult female mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_female_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected String adult_female_mortality_rate = ADULT_FEMALE_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollution_mortality_rate() <em>Pollution mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollution_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final String POLLUTION_MORTALITY_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPollution_mortality_rate() <em>Pollution mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollution_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected String pollution_mortality_rate = POLLUTION_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComorbidity_mortality_rate() <em>Comorbidity mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidity_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final String COMORBIDITY_MORTALITY_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComorbidity_mortality_rate() <em>Comorbidity mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidity_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected String comorbidity_mortality_rate = COMORBIDITY_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHospital_beds() <em>Hospital beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospital_beds()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSPITAL_BEDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHospital_beds() <em>Hospital beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospital_beds()
	 * @generated
	 * @ordered
	 */
	protected String hospital_beds = HOSPITAL_BEDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNurses() <em>Nurses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNurses()
	 * @generated
	 * @ordered
	 */
	protected static final String NURSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNurses() <em>Nurses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNurses()
	 * @generated
	 * @ordered
	 */
	protected String nurses = NURSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicians() <em>Physicians</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicians()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICIANS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicians() <em>Physicians</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicians()
	 * @generated
	 * @ordered
	 */
	protected String physicians = PHYSICIANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealth_expenditure() <em>Health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealth_expenditure()
	 * @generated
	 * @ordered
	 */
	protected static final String HEALTH_EXPENDITURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHealth_expenditure() <em>Health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealth_expenditure()
	 * @generated
	 * @ordered
	 */
	protected String health_expenditure = HEALTH_EXPENDITURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOut_of_pocket_health_expenditure() <em>Out of pocket health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut_of_pocket_health_expenditure()
	 * @generated
	 * @ordered
	 */
	protected static final String OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOut_of_pocket_health_expenditure() <em>Out of pocket health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut_of_pocket_health_expenditure()
	 * @generated
	 * @ordered
	 */
	protected String out_of_pocket_health_expenditure = OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Covid19Package.Literals.HEALTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLife_expectancy() {
		return life_expectancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLife_expectancy(String newLife_expectancy) {
		String oldLife_expectancy = life_expectancy;
		life_expectancy = newLife_expectancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__LIFE_EXPECTANCY,
					oldLife_expectancy, life_expectancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSmoking_prevalence() {
		return smoking_prevalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmoking_prevalence(String newSmoking_prevalence) {
		String oldSmoking_prevalence = smoking_prevalence;
		smoking_prevalence = newSmoking_prevalence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__SMOKING_PREVALENCE,
					oldSmoking_prevalence, smoking_prevalence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiabetes_prevalence() {
		return diabetes_prevalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiabetes_prevalence(String newDiabetes_prevalence) {
		String oldDiabetes_prevalence = diabetes_prevalence;
		diabetes_prevalence = newDiabetes_prevalence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__DIABETES_PREVALENCE,
					oldDiabetes_prevalence, diabetes_prevalence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfant_mortality_rate() {
		return infant_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfant_mortality_rate(String newInfant_mortality_rate) {
		String oldInfant_mortality_rate = infant_mortality_rate;
		infant_mortality_rate = newInfant_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__INFANT_MORTALITY_RATE,
					oldInfant_mortality_rate, infant_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdult_male_mortality_rate() {
		return adult_male_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdult_male_mortality_rate(String newAdult_male_mortality_rate) {
		String oldAdult_male_mortality_rate = adult_male_mortality_rate;
		adult_male_mortality_rate = newAdult_male_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__ADULT_MALE_MORTALITY_RATE,
					oldAdult_male_mortality_rate, adult_male_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdult_female_mortality_rate() {
		return adult_female_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdult_female_mortality_rate(String newAdult_female_mortality_rate) {
		String oldAdult_female_mortality_rate = adult_female_mortality_rate;
		adult_female_mortality_rate = newAdult_female_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__ADULT_FEMALE_MORTALITY_RATE,
					oldAdult_female_mortality_rate, adult_female_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPollution_mortality_rate() {
		return pollution_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollution_mortality_rate(String newPollution_mortality_rate) {
		String oldPollution_mortality_rate = pollution_mortality_rate;
		pollution_mortality_rate = newPollution_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__POLLUTION_MORTALITY_RATE,
					oldPollution_mortality_rate, pollution_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComorbidity_mortality_rate() {
		return comorbidity_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComorbidity_mortality_rate(String newComorbidity_mortality_rate) {
		String oldComorbidity_mortality_rate = comorbidity_mortality_rate;
		comorbidity_mortality_rate = newComorbidity_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__COMORBIDITY_MORTALITY_RATE,
					oldComorbidity_mortality_rate, comorbidity_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHospital_beds() {
		return hospital_beds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospital_beds(String newHospital_beds) {
		String oldHospital_beds = hospital_beds;
		hospital_beds = newHospital_beds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__HOSPITAL_BEDS,
					oldHospital_beds, hospital_beds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNurses() {
		return nurses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNurses(String newNurses) {
		String oldNurses = nurses;
		nurses = newNurses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__NURSES, oldNurses, nurses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysicians() {
		return physicians;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicians(String newPhysicians) {
		String oldPhysicians = physicians;
		physicians = newPhysicians;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__PHYSICIANS, oldPhysicians,
					physicians));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHealth_expenditure() {
		return health_expenditure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealth_expenditure(String newHealth_expenditure) {
		String oldHealth_expenditure = health_expenditure;
		health_expenditure = newHealth_expenditure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.HEALTH__HEALTH_EXPENDITURE,
					oldHealth_expenditure, health_expenditure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOut_of_pocket_health_expenditure() {
		return out_of_pocket_health_expenditure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut_of_pocket_health_expenditure(String newOut_of_pocket_health_expenditure) {
		String oldOut_of_pocket_health_expenditure = out_of_pocket_health_expenditure;
		out_of_pocket_health_expenditure = newOut_of_pocket_health_expenditure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Covid19Package.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE, oldOut_of_pocket_health_expenditure,
					out_of_pocket_health_expenditure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Covid19Package.HEALTH__LIFE_EXPECTANCY:
			return getLife_expectancy();
		case Covid19Package.HEALTH__SMOKING_PREVALENCE:
			return getSmoking_prevalence();
		case Covid19Package.HEALTH__DIABETES_PREVALENCE:
			return getDiabetes_prevalence();
		case Covid19Package.HEALTH__INFANT_MORTALITY_RATE:
			return getInfant_mortality_rate();
		case Covid19Package.HEALTH__ADULT_MALE_MORTALITY_RATE:
			return getAdult_male_mortality_rate();
		case Covid19Package.HEALTH__ADULT_FEMALE_MORTALITY_RATE:
			return getAdult_female_mortality_rate();
		case Covid19Package.HEALTH__POLLUTION_MORTALITY_RATE:
			return getPollution_mortality_rate();
		case Covid19Package.HEALTH__COMORBIDITY_MORTALITY_RATE:
			return getComorbidity_mortality_rate();
		case Covid19Package.HEALTH__HOSPITAL_BEDS:
			return getHospital_beds();
		case Covid19Package.HEALTH__NURSES:
			return getNurses();
		case Covid19Package.HEALTH__PHYSICIANS:
			return getPhysicians();
		case Covid19Package.HEALTH__HEALTH_EXPENDITURE:
			return getHealth_expenditure();
		case Covid19Package.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE:
			return getOut_of_pocket_health_expenditure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Covid19Package.HEALTH__LIFE_EXPECTANCY:
			setLife_expectancy((String) newValue);
			return;
		case Covid19Package.HEALTH__SMOKING_PREVALENCE:
			setSmoking_prevalence((String) newValue);
			return;
		case Covid19Package.HEALTH__DIABETES_PREVALENCE:
			setDiabetes_prevalence((String) newValue);
			return;
		case Covid19Package.HEALTH__INFANT_MORTALITY_RATE:
			setInfant_mortality_rate((String) newValue);
			return;
		case Covid19Package.HEALTH__ADULT_MALE_MORTALITY_RATE:
			setAdult_male_mortality_rate((String) newValue);
			return;
		case Covid19Package.HEALTH__ADULT_FEMALE_MORTALITY_RATE:
			setAdult_female_mortality_rate((String) newValue);
			return;
		case Covid19Package.HEALTH__POLLUTION_MORTALITY_RATE:
			setPollution_mortality_rate((String) newValue);
			return;
		case Covid19Package.HEALTH__COMORBIDITY_MORTALITY_RATE:
			setComorbidity_mortality_rate((String) newValue);
			return;
		case Covid19Package.HEALTH__HOSPITAL_BEDS:
			setHospital_beds((String) newValue);
			return;
		case Covid19Package.HEALTH__NURSES:
			setNurses((String) newValue);
			return;
		case Covid19Package.HEALTH__PHYSICIANS:
			setPhysicians((String) newValue);
			return;
		case Covid19Package.HEALTH__HEALTH_EXPENDITURE:
			setHealth_expenditure((String) newValue);
			return;
		case Covid19Package.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE:
			setOut_of_pocket_health_expenditure((String) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case Covid19Package.HEALTH__LIFE_EXPECTANCY:
			setLife_expectancy(LIFE_EXPECTANCY_EDEFAULT);
			return;
		case Covid19Package.HEALTH__SMOKING_PREVALENCE:
			setSmoking_prevalence(SMOKING_PREVALENCE_EDEFAULT);
			return;
		case Covid19Package.HEALTH__DIABETES_PREVALENCE:
			setDiabetes_prevalence(DIABETES_PREVALENCE_EDEFAULT);
			return;
		case Covid19Package.HEALTH__INFANT_MORTALITY_RATE:
			setInfant_mortality_rate(INFANT_MORTALITY_RATE_EDEFAULT);
			return;
		case Covid19Package.HEALTH__ADULT_MALE_MORTALITY_RATE:
			setAdult_male_mortality_rate(ADULT_MALE_MORTALITY_RATE_EDEFAULT);
			return;
		case Covid19Package.HEALTH__ADULT_FEMALE_MORTALITY_RATE:
			setAdult_female_mortality_rate(ADULT_FEMALE_MORTALITY_RATE_EDEFAULT);
			return;
		case Covid19Package.HEALTH__POLLUTION_MORTALITY_RATE:
			setPollution_mortality_rate(POLLUTION_MORTALITY_RATE_EDEFAULT);
			return;
		case Covid19Package.HEALTH__COMORBIDITY_MORTALITY_RATE:
			setComorbidity_mortality_rate(COMORBIDITY_MORTALITY_RATE_EDEFAULT);
			return;
		case Covid19Package.HEALTH__HOSPITAL_BEDS:
			setHospital_beds(HOSPITAL_BEDS_EDEFAULT);
			return;
		case Covid19Package.HEALTH__NURSES:
			setNurses(NURSES_EDEFAULT);
			return;
		case Covid19Package.HEALTH__PHYSICIANS:
			setPhysicians(PHYSICIANS_EDEFAULT);
			return;
		case Covid19Package.HEALTH__HEALTH_EXPENDITURE:
			setHealth_expenditure(HEALTH_EXPENDITURE_EDEFAULT);
			return;
		case Covid19Package.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE:
			setOut_of_pocket_health_expenditure(OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Covid19Package.HEALTH__LIFE_EXPECTANCY:
			return LIFE_EXPECTANCY_EDEFAULT == null ? life_expectancy != null
					: !LIFE_EXPECTANCY_EDEFAULT.equals(life_expectancy);
		case Covid19Package.HEALTH__SMOKING_PREVALENCE:
			return SMOKING_PREVALENCE_EDEFAULT == null ? smoking_prevalence != null
					: !SMOKING_PREVALENCE_EDEFAULT.equals(smoking_prevalence);
		case Covid19Package.HEALTH__DIABETES_PREVALENCE:
			return DIABETES_PREVALENCE_EDEFAULT == null ? diabetes_prevalence != null
					: !DIABETES_PREVALENCE_EDEFAULT.equals(diabetes_prevalence);
		case Covid19Package.HEALTH__INFANT_MORTALITY_RATE:
			return INFANT_MORTALITY_RATE_EDEFAULT == null ? infant_mortality_rate != null
					: !INFANT_MORTALITY_RATE_EDEFAULT.equals(infant_mortality_rate);
		case Covid19Package.HEALTH__ADULT_MALE_MORTALITY_RATE:
			return ADULT_MALE_MORTALITY_RATE_EDEFAULT == null ? adult_male_mortality_rate != null
					: !ADULT_MALE_MORTALITY_RATE_EDEFAULT.equals(adult_male_mortality_rate);
		case Covid19Package.HEALTH__ADULT_FEMALE_MORTALITY_RATE:
			return ADULT_FEMALE_MORTALITY_RATE_EDEFAULT == null ? adult_female_mortality_rate != null
					: !ADULT_FEMALE_MORTALITY_RATE_EDEFAULT.equals(adult_female_mortality_rate);
		case Covid19Package.HEALTH__POLLUTION_MORTALITY_RATE:
			return POLLUTION_MORTALITY_RATE_EDEFAULT == null ? pollution_mortality_rate != null
					: !POLLUTION_MORTALITY_RATE_EDEFAULT.equals(pollution_mortality_rate);
		case Covid19Package.HEALTH__COMORBIDITY_MORTALITY_RATE:
			return COMORBIDITY_MORTALITY_RATE_EDEFAULT == null ? comorbidity_mortality_rate != null
					: !COMORBIDITY_MORTALITY_RATE_EDEFAULT.equals(comorbidity_mortality_rate);
		case Covid19Package.HEALTH__HOSPITAL_BEDS:
			return HOSPITAL_BEDS_EDEFAULT == null ? hospital_beds != null
					: !HOSPITAL_BEDS_EDEFAULT.equals(hospital_beds);
		case Covid19Package.HEALTH__NURSES:
			return NURSES_EDEFAULT == null ? nurses != null : !NURSES_EDEFAULT.equals(nurses);
		case Covid19Package.HEALTH__PHYSICIANS:
			return PHYSICIANS_EDEFAULT == null ? physicians != null : !PHYSICIANS_EDEFAULT.equals(physicians);
		case Covid19Package.HEALTH__HEALTH_EXPENDITURE:
			return HEALTH_EXPENDITURE_EDEFAULT == null ? health_expenditure != null
					: !HEALTH_EXPENDITURE_EDEFAULT.equals(health_expenditure);
		case Covid19Package.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE:
			return OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT == null ? out_of_pocket_health_expenditure != null
					: !OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT.equals(out_of_pocket_health_expenditure);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (life_expectancy: ");
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

} //HealthImpl
