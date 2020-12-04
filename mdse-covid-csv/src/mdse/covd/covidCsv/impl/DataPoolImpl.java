/**
 */
package mdse.covd.covidCsv.impl;

import java.util.Collection;

import mdse.covd.covidCsv.DataPool;
import mdse.covd.covidCsv.EpidemiologyRecord;
import mdse.covd.covidCsv.HealthRecord;
import mdse.covd.covidCsv.covidPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdse.covd.covidCsv.impl.DataPoolImpl#getHealthData <em>Health Data</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.impl.DataPoolImpl#getEpidemiologyData <em>Epidemiology Data</em>}</li>
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
	protected EList<HealthRecord> healthData;

	/**
	 * The cached value of the '{@link #getEpidemiologyData() <em>Epidemiology Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpidemiologyData()
	 * @generated
	 * @ordered
	 */
	protected EList<EpidemiologyRecord> epidemiologyData;

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
		return covidPackage.Literals.DATA_POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthRecord> getHealthData() {
		if (healthData == null) {
			healthData = new EObjectContainmentEList<HealthRecord>(HealthRecord.class, this,
					covidPackage.DATA_POOL__HEALTH_DATA);
		}
		return healthData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EpidemiologyRecord> getEpidemiologyData() {
		if (epidemiologyData == null) {
			epidemiologyData = new EObjectContainmentEList<EpidemiologyRecord>(EpidemiologyRecord.class, this,
					covidPackage.DATA_POOL__EPIDEMIOLOGY_DATA);
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
		case covidPackage.DATA_POOL__HEALTH_DATA:
			return ((InternalEList<?>) getHealthData()).basicRemove(otherEnd, msgs);
		case covidPackage.DATA_POOL__EPIDEMIOLOGY_DATA:
			return ((InternalEList<?>) getEpidemiologyData()).basicRemove(otherEnd, msgs);
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
		case covidPackage.DATA_POOL__HEALTH_DATA:
			return getHealthData();
		case covidPackage.DATA_POOL__EPIDEMIOLOGY_DATA:
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
		case covidPackage.DATA_POOL__HEALTH_DATA:
			getHealthData().clear();
			getHealthData().addAll((Collection<? extends HealthRecord>) newValue);
			return;
		case covidPackage.DATA_POOL__EPIDEMIOLOGY_DATA:
			getEpidemiologyData().clear();
			getEpidemiologyData().addAll((Collection<? extends EpidemiologyRecord>) newValue);
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
		case covidPackage.DATA_POOL__HEALTH_DATA:
			getHealthData().clear();
			return;
		case covidPackage.DATA_POOL__EPIDEMIOLOGY_DATA:
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
		case covidPackage.DATA_POOL__HEALTH_DATA:
			return healthData != null && !healthData.isEmpty();
		case covidPackage.DATA_POOL__EPIDEMIOLOGY_DATA:
			return epidemiologyData != null && !epidemiologyData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataPoolImpl
