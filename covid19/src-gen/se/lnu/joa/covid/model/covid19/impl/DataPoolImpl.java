/**
 */
package se.lnu.joa.covid.model.covid19.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.lnu.joa.covid.model.covid19.Covid19Package;
import se.lnu.joa.covid.model.covid19.DataPool;
import se.lnu.joa.covid.model.covid19.Epidemiology;
import se.lnu.joa.covid.model.covid19.Health;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.DataPoolImpl#getHealthData <em>Health Data</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.DataPoolImpl#getEpidemiologyData <em>Epidemiology Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPoolImpl extends MinimalEObjectImpl.Container implements DataPool {
	/**
	 * The cached value of the '{@link #getHealthData() <em>Health Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthData()
	 * @generated
	 * @ordered
	 */
	protected EList<Health> healthData;

	/**
	 * The cached value of the '{@link #getEpidemiologyData() <em>Epidemiology Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpidemiologyData()
	 * @generated
	 * @ordered
	 */
	protected EList<Epidemiology> epidemiologyData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Covid19Package.Literals.DATA_POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Health> getHealthData() {
		if (healthData == null) {
			healthData = new EObjectContainmentEList<Health>(Health.class, this, Covid19Package.DATA_POOL__HEALTH_DATA);
		}
		return healthData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Epidemiology> getEpidemiologyData() {
		if (epidemiologyData == null) {
			epidemiologyData = new EObjectResolvingEList<Epidemiology>(Epidemiology.class, this,
					Covid19Package.DATA_POOL__EPIDEMIOLOGY_DATA);
		}
		return epidemiologyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Covid19Package.DATA_POOL__HEALTH_DATA:
			return ((InternalEList<?>) getHealthData()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Covid19Package.DATA_POOL__HEALTH_DATA:
			return getHealthData();
		case Covid19Package.DATA_POOL__EPIDEMIOLOGY_DATA:
			return getEpidemiologyData();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Covid19Package.DATA_POOL__HEALTH_DATA:
			getHealthData().clear();
			getHealthData().addAll((Collection<? extends Health>) newValue);
			return;
		case Covid19Package.DATA_POOL__EPIDEMIOLOGY_DATA:
			getEpidemiologyData().clear();
			getEpidemiologyData().addAll((Collection<? extends Epidemiology>) newValue);
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
		case Covid19Package.DATA_POOL__HEALTH_DATA:
			getHealthData().clear();
			return;
		case Covid19Package.DATA_POOL__EPIDEMIOLOGY_DATA:
			getEpidemiologyData().clear();
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
		case Covid19Package.DATA_POOL__HEALTH_DATA:
			return healthData != null && !healthData.isEmpty();
		case Covid19Package.DATA_POOL__EPIDEMIOLOGY_DATA:
			return epidemiologyData != null && !epidemiologyData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataPoolImpl
