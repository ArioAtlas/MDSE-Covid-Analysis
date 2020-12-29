/**
 */
package se.lnu.joa.covid.model.data.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.lnu.joa.covid.model.data.DataPackage;
import se.lnu.joa.covid.model.data.Health;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getLife_expectancy <em>Life expectancy</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getSmoking_prevalence <em>Smoking prevalence</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getDiabetes_prevalence <em>Diabetes prevalence</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getInfant_mortality_rate <em>Infant mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getAdult_male_mortality_rate <em>Adult male mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getAdult_female_mortality_rate <em>Adult female mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getPollution_mortality_rate <em>Pollution mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getComorbidity_mortality_rate <em>Comorbidity mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getHospital_beds <em>Hospital beds</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getNurses <em>Nurses</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getPhysicians <em>Physicians</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getHealth_expenditure <em>Health expenditure</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.HealthImpl#getOut_of_pocket_health_expenditure <em>Out of pocket health expenditure</em>}</li>
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
	protected static final double LIFE_EXPECTANCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLife_expectancy() <em>Life expectancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLife_expectancy()
	 * @generated
	 * @ordered
	 */
	protected double life_expectancy = LIFE_EXPECTANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmoking_prevalence() <em>Smoking prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoking_prevalence()
	 * @generated
	 * @ordered
	 */
	protected static final double SMOKING_PREVALENCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSmoking_prevalence() <em>Smoking prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoking_prevalence()
	 * @generated
	 * @ordered
	 */
	protected double smoking_prevalence = SMOKING_PREVALENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiabetes_prevalence() <em>Diabetes prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiabetes_prevalence()
	 * @generated
	 * @ordered
	 */
	protected static final double DIABETES_PREVALENCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiabetes_prevalence() <em>Diabetes prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiabetes_prevalence()
	 * @generated
	 * @ordered
	 */
	protected double diabetes_prevalence = DIABETES_PREVALENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfant_mortality_rate() <em>Infant mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfant_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final double INFANT_MORTALITY_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInfant_mortality_rate() <em>Infant mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfant_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected double infant_mortality_rate = INFANT_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdult_male_mortality_rate() <em>Adult male mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_male_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final double ADULT_MALE_MORTALITY_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAdult_male_mortality_rate() <em>Adult male mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_male_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected double adult_male_mortality_rate = ADULT_MALE_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdult_female_mortality_rate() <em>Adult female mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_female_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final double ADULT_FEMALE_MORTALITY_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAdult_female_mortality_rate() <em>Adult female mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdult_female_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected double adult_female_mortality_rate = ADULT_FEMALE_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollution_mortality_rate() <em>Pollution mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollution_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final double POLLUTION_MORTALITY_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPollution_mortality_rate() <em>Pollution mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollution_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected double pollution_mortality_rate = POLLUTION_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComorbidity_mortality_rate() <em>Comorbidity mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidity_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected static final double COMORBIDITY_MORTALITY_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getComorbidity_mortality_rate() <em>Comorbidity mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidity_mortality_rate()
	 * @generated
	 * @ordered
	 */
	protected double comorbidity_mortality_rate = COMORBIDITY_MORTALITY_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHospital_beds() <em>Hospital beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospital_beds()
	 * @generated
	 * @ordered
	 */
	protected static final double HOSPITAL_BEDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHospital_beds() <em>Hospital beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospital_beds()
	 * @generated
	 * @ordered
	 */
	protected double hospital_beds = HOSPITAL_BEDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNurses() <em>Nurses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNurses()
	 * @generated
	 * @ordered
	 */
	protected static final double NURSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNurses() <em>Nurses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNurses()
	 * @generated
	 * @ordered
	 */
	protected double nurses = NURSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicians() <em>Physicians</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicians()
	 * @generated
	 * @ordered
	 */
	protected static final double PHYSICIANS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhysicians() <em>Physicians</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicians()
	 * @generated
	 * @ordered
	 */
	protected double physicians = PHYSICIANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealth_expenditure() <em>Health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealth_expenditure()
	 * @generated
	 * @ordered
	 */
	protected static final double HEALTH_EXPENDITURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHealth_expenditure() <em>Health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealth_expenditure()
	 * @generated
	 * @ordered
	 */
	protected double health_expenditure = HEALTH_EXPENDITURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOut_of_pocket_health_expenditure() <em>Out of pocket health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut_of_pocket_health_expenditure()
	 * @generated
	 * @ordered
	 */
	protected static final double OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOut_of_pocket_health_expenditure() <em>Out of pocket health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut_of_pocket_health_expenditure()
	 * @generated
	 * @ordered
	 */
	protected double out_of_pocket_health_expenditure = OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT;

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
		return DataPackage.Literals.HEALTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLife_expectancy() {
		return life_expectancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLife_expectancy(double newLife_expectancy) {
		double oldLife_expectancy = life_expectancy;
		life_expectancy = newLife_expectancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__LIFE_EXPECTANCY, oldLife_expectancy, life_expectancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSmoking_prevalence() {
		return smoking_prevalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmoking_prevalence(double newSmoking_prevalence) {
		double oldSmoking_prevalence = smoking_prevalence;
		smoking_prevalence = newSmoking_prevalence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__SMOKING_PREVALENCE, oldSmoking_prevalence, smoking_prevalence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiabetes_prevalence() {
		return diabetes_prevalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiabetes_prevalence(double newDiabetes_prevalence) {
		double oldDiabetes_prevalence = diabetes_prevalence;
		diabetes_prevalence = newDiabetes_prevalence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__DIABETES_PREVALENCE, oldDiabetes_prevalence, diabetes_prevalence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInfant_mortality_rate() {
		return infant_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfant_mortality_rate(double newInfant_mortality_rate) {
		double oldInfant_mortality_rate = infant_mortality_rate;
		infant_mortality_rate = newInfant_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__INFANT_MORTALITY_RATE, oldInfant_mortality_rate, infant_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAdult_male_mortality_rate() {
		return adult_male_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdult_male_mortality_rate(double newAdult_male_mortality_rate) {
		double oldAdult_male_mortality_rate = adult_male_mortality_rate;
		adult_male_mortality_rate = newAdult_male_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__ADULT_MALE_MORTALITY_RATE, oldAdult_male_mortality_rate, adult_male_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAdult_female_mortality_rate() {
		return adult_female_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdult_female_mortality_rate(double newAdult_female_mortality_rate) {
		double oldAdult_female_mortality_rate = adult_female_mortality_rate;
		adult_female_mortality_rate = newAdult_female_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__ADULT_FEMALE_MORTALITY_RATE, oldAdult_female_mortality_rate, adult_female_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPollution_mortality_rate() {
		return pollution_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollution_mortality_rate(double newPollution_mortality_rate) {
		double oldPollution_mortality_rate = pollution_mortality_rate;
		pollution_mortality_rate = newPollution_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__POLLUTION_MORTALITY_RATE, oldPollution_mortality_rate, pollution_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getComorbidity_mortality_rate() {
		return comorbidity_mortality_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComorbidity_mortality_rate(double newComorbidity_mortality_rate) {
		double oldComorbidity_mortality_rate = comorbidity_mortality_rate;
		comorbidity_mortality_rate = newComorbidity_mortality_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__COMORBIDITY_MORTALITY_RATE, oldComorbidity_mortality_rate, comorbidity_mortality_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHospital_beds() {
		return hospital_beds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospital_beds(double newHospital_beds) {
		double oldHospital_beds = hospital_beds;
		hospital_beds = newHospital_beds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__HOSPITAL_BEDS, oldHospital_beds, hospital_beds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNurses() {
		return nurses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNurses(double newNurses) {
		double oldNurses = nurses;
		nurses = newNurses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__NURSES, oldNurses, nurses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPhysicians() {
		return physicians;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicians(double newPhysicians) {
		double oldPhysicians = physicians;
		physicians = newPhysicians;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__PHYSICIANS, oldPhysicians, physicians));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHealth_expenditure() {
		return health_expenditure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealth_expenditure(double newHealth_expenditure) {
		double oldHealth_expenditure = health_expenditure;
		health_expenditure = newHealth_expenditure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__HEALTH_EXPENDITURE, oldHealth_expenditure, health_expenditure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOut_of_pocket_health_expenditure() {
		return out_of_pocket_health_expenditure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut_of_pocket_health_expenditure(double newOut_of_pocket_health_expenditure) {
		double oldOut_of_pocket_health_expenditure = out_of_pocket_health_expenditure;
		out_of_pocket_health_expenditure = newOut_of_pocket_health_expenditure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE, oldOut_of_pocket_health_expenditure, out_of_pocket_health_expenditure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.HEALTH__LIFE_EXPECTANCY:
				return getLife_expectancy();
			case DataPackage.HEALTH__SMOKING_PREVALENCE:
				return getSmoking_prevalence();
			case DataPackage.HEALTH__DIABETES_PREVALENCE:
				return getDiabetes_prevalence();
			case DataPackage.HEALTH__INFANT_MORTALITY_RATE:
				return getInfant_mortality_rate();
			case DataPackage.HEALTH__ADULT_MALE_MORTALITY_RATE:
				return getAdult_male_mortality_rate();
			case DataPackage.HEALTH__ADULT_FEMALE_MORTALITY_RATE:
				return getAdult_female_mortality_rate();
			case DataPackage.HEALTH__POLLUTION_MORTALITY_RATE:
				return getPollution_mortality_rate();
			case DataPackage.HEALTH__COMORBIDITY_MORTALITY_RATE:
				return getComorbidity_mortality_rate();
			case DataPackage.HEALTH__HOSPITAL_BEDS:
				return getHospital_beds();
			case DataPackage.HEALTH__NURSES:
				return getNurses();
			case DataPackage.HEALTH__PHYSICIANS:
				return getPhysicians();
			case DataPackage.HEALTH__HEALTH_EXPENDITURE:
				return getHealth_expenditure();
			case DataPackage.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE:
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
			case DataPackage.HEALTH__LIFE_EXPECTANCY:
				setLife_expectancy((Double)newValue);
				return;
			case DataPackage.HEALTH__SMOKING_PREVALENCE:
				setSmoking_prevalence((Double)newValue);
				return;
			case DataPackage.HEALTH__DIABETES_PREVALENCE:
				setDiabetes_prevalence((Double)newValue);
				return;
			case DataPackage.HEALTH__INFANT_MORTALITY_RATE:
				setInfant_mortality_rate((Double)newValue);
				return;
			case DataPackage.HEALTH__ADULT_MALE_MORTALITY_RATE:
				setAdult_male_mortality_rate((Double)newValue);
				return;
			case DataPackage.HEALTH__ADULT_FEMALE_MORTALITY_RATE:
				setAdult_female_mortality_rate((Double)newValue);
				return;
			case DataPackage.HEALTH__POLLUTION_MORTALITY_RATE:
				setPollution_mortality_rate((Double)newValue);
				return;
			case DataPackage.HEALTH__COMORBIDITY_MORTALITY_RATE:
				setComorbidity_mortality_rate((Double)newValue);
				return;
			case DataPackage.HEALTH__HOSPITAL_BEDS:
				setHospital_beds((Double)newValue);
				return;
			case DataPackage.HEALTH__NURSES:
				setNurses((Double)newValue);
				return;
			case DataPackage.HEALTH__PHYSICIANS:
				setPhysicians((Double)newValue);
				return;
			case DataPackage.HEALTH__HEALTH_EXPENDITURE:
				setHealth_expenditure((Double)newValue);
				return;
			case DataPackage.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE:
				setOut_of_pocket_health_expenditure((Double)newValue);
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
			case DataPackage.HEALTH__LIFE_EXPECTANCY:
				setLife_expectancy(LIFE_EXPECTANCY_EDEFAULT);
				return;
			case DataPackage.HEALTH__SMOKING_PREVALENCE:
				setSmoking_prevalence(SMOKING_PREVALENCE_EDEFAULT);
				return;
			case DataPackage.HEALTH__DIABETES_PREVALENCE:
				setDiabetes_prevalence(DIABETES_PREVALENCE_EDEFAULT);
				return;
			case DataPackage.HEALTH__INFANT_MORTALITY_RATE:
				setInfant_mortality_rate(INFANT_MORTALITY_RATE_EDEFAULT);
				return;
			case DataPackage.HEALTH__ADULT_MALE_MORTALITY_RATE:
				setAdult_male_mortality_rate(ADULT_MALE_MORTALITY_RATE_EDEFAULT);
				return;
			case DataPackage.HEALTH__ADULT_FEMALE_MORTALITY_RATE:
				setAdult_female_mortality_rate(ADULT_FEMALE_MORTALITY_RATE_EDEFAULT);
				return;
			case DataPackage.HEALTH__POLLUTION_MORTALITY_RATE:
				setPollution_mortality_rate(POLLUTION_MORTALITY_RATE_EDEFAULT);
				return;
			case DataPackage.HEALTH__COMORBIDITY_MORTALITY_RATE:
				setComorbidity_mortality_rate(COMORBIDITY_MORTALITY_RATE_EDEFAULT);
				return;
			case DataPackage.HEALTH__HOSPITAL_BEDS:
				setHospital_beds(HOSPITAL_BEDS_EDEFAULT);
				return;
			case DataPackage.HEALTH__NURSES:
				setNurses(NURSES_EDEFAULT);
				return;
			case DataPackage.HEALTH__PHYSICIANS:
				setPhysicians(PHYSICIANS_EDEFAULT);
				return;
			case DataPackage.HEALTH__HEALTH_EXPENDITURE:
				setHealth_expenditure(HEALTH_EXPENDITURE_EDEFAULT);
				return;
			case DataPackage.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE:
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
			case DataPackage.HEALTH__LIFE_EXPECTANCY:
				return life_expectancy != LIFE_EXPECTANCY_EDEFAULT;
			case DataPackage.HEALTH__SMOKING_PREVALENCE:
				return smoking_prevalence != SMOKING_PREVALENCE_EDEFAULT;
			case DataPackage.HEALTH__DIABETES_PREVALENCE:
				return diabetes_prevalence != DIABETES_PREVALENCE_EDEFAULT;
			case DataPackage.HEALTH__INFANT_MORTALITY_RATE:
				return infant_mortality_rate != INFANT_MORTALITY_RATE_EDEFAULT;
			case DataPackage.HEALTH__ADULT_MALE_MORTALITY_RATE:
				return adult_male_mortality_rate != ADULT_MALE_MORTALITY_RATE_EDEFAULT;
			case DataPackage.HEALTH__ADULT_FEMALE_MORTALITY_RATE:
				return adult_female_mortality_rate != ADULT_FEMALE_MORTALITY_RATE_EDEFAULT;
			case DataPackage.HEALTH__POLLUTION_MORTALITY_RATE:
				return pollution_mortality_rate != POLLUTION_MORTALITY_RATE_EDEFAULT;
			case DataPackage.HEALTH__COMORBIDITY_MORTALITY_RATE:
				return comorbidity_mortality_rate != COMORBIDITY_MORTALITY_RATE_EDEFAULT;
			case DataPackage.HEALTH__HOSPITAL_BEDS:
				return hospital_beds != HOSPITAL_BEDS_EDEFAULT;
			case DataPackage.HEALTH__NURSES:
				return nurses != NURSES_EDEFAULT;
			case DataPackage.HEALTH__PHYSICIANS:
				return physicians != PHYSICIANS_EDEFAULT;
			case DataPackage.HEALTH__HEALTH_EXPENDITURE:
				return health_expenditure != HEALTH_EXPENDITURE_EDEFAULT;
			case DataPackage.HEALTH__OUT_OF_POCKET_HEALTH_EXPENDITURE:
				return out_of_pocket_health_expenditure != OUT_OF_POCKET_HEALTH_EXPENDITURE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

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
