/**
 */
package se.lnu.joa.covid.model.analysis.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.lnu.joa.covid.model.analysis.AnalysisPackage;
import se.lnu.joa.covid.model.analysis.Regression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.RegressionImpl#getDependentValue <em>Dependent Value</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.RegressionImpl#getIndependentValue <em>Independent Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegressionImpl extends MinimalEObjectImpl.Container implements Regression {
	/**
	 * The default value of the '{@link #getDependentValue() <em>Dependent Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependentValue() <em>Dependent Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentValue()
	 * @generated
	 * @ordered
	 */
	protected String dependentValue = DEPENDENT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndependentValue() <em>Independent Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndependentValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEPENDENT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndependentValue() <em>Independent Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndependentValue()
	 * @generated
	 * @ordered
	 */
	protected String independentValue = INDEPENDENT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.REGRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependentValue() {
		return dependentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentValue(String newDependentValue) {
		String oldDependentValue = dependentValue;
		dependentValue = newDependentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.REGRESSION__DEPENDENT_VALUE, oldDependentValue, dependentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndependentValue() {
		return independentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndependentValue(String newIndependentValue) {
		String oldIndependentValue = independentValue;
		independentValue = newIndependentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.REGRESSION__INDEPENDENT_VALUE, oldIndependentValue, independentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisPackage.REGRESSION__DEPENDENT_VALUE:
				return getDependentValue();
			case AnalysisPackage.REGRESSION__INDEPENDENT_VALUE:
				return getIndependentValue();
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
			case AnalysisPackage.REGRESSION__DEPENDENT_VALUE:
				setDependentValue((String)newValue);
				return;
			case AnalysisPackage.REGRESSION__INDEPENDENT_VALUE:
				setIndependentValue((String)newValue);
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
			case AnalysisPackage.REGRESSION__DEPENDENT_VALUE:
				setDependentValue(DEPENDENT_VALUE_EDEFAULT);
				return;
			case AnalysisPackage.REGRESSION__INDEPENDENT_VALUE:
				setIndependentValue(INDEPENDENT_VALUE_EDEFAULT);
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
			case AnalysisPackage.REGRESSION__DEPENDENT_VALUE:
				return DEPENDENT_VALUE_EDEFAULT == null ? dependentValue != null : !DEPENDENT_VALUE_EDEFAULT.equals(dependentValue);
			case AnalysisPackage.REGRESSION__INDEPENDENT_VALUE:
				return INDEPENDENT_VALUE_EDEFAULT == null ? independentValue != null : !INDEPENDENT_VALUE_EDEFAULT.equals(independentValue);
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
		result.append(" (dependentValue: ");
		result.append(dependentValue);
		result.append(", independentValue: ");
		result.append(independentValue);
		result.append(')');
		return result.toString();
	}

} //RegressionImpl
