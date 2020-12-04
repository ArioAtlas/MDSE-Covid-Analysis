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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Covid19Package.HEALTH__LIFE_EXPECTANCY:
			return getLife_expectancy();
		case Covid19Package.HEALTH__SMOKING_PREVALENCE:
			return getSmoking_prevalence();
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
		result.append(')');
		return result.toString();
	}

} //HealthImpl
