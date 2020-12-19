/**
 */
package se.lnu.joa.covid.model.config.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.lnu.joa.covid.model.config.ConfigPackage;
import se.lnu.joa.covid.model.config.DataModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.DataModelImpl#getDatasetName <em>Dataset Name</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.DataModelImpl#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataModelImpl extends MinimalEObjectImpl.Container implements DataModel {
	/**
	 * The default value of the '{@link #getDatasetName() <em>Dataset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatasetName() <em>Dataset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetName()
	 * @generated
	 * @ordered
	 */
	protected String datasetName = DATASET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected String dataSource = DATA_SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatasetName() {
		return datasetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasetName(String newDatasetName) {
		String oldDatasetName = datasetName;
		datasetName = newDatasetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.DATA_MODEL__DATASET_NAME, oldDatasetName, datasetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(String newDataSource) {
		String oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.DATA_MODEL__DATA_SOURCE, oldDataSource, dataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.DATA_MODEL__DATASET_NAME:
				return getDatasetName();
			case ConfigPackage.DATA_MODEL__DATA_SOURCE:
				return getDataSource();
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
			case ConfigPackage.DATA_MODEL__DATASET_NAME:
				setDatasetName((String)newValue);
				return;
			case ConfigPackage.DATA_MODEL__DATA_SOURCE:
				setDataSource((String)newValue);
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
			case ConfigPackage.DATA_MODEL__DATASET_NAME:
				setDatasetName(DATASET_NAME_EDEFAULT);
				return;
			case ConfigPackage.DATA_MODEL__DATA_SOURCE:
				setDataSource(DATA_SOURCE_EDEFAULT);
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
			case ConfigPackage.DATA_MODEL__DATASET_NAME:
				return DATASET_NAME_EDEFAULT == null ? datasetName != null : !DATASET_NAME_EDEFAULT.equals(datasetName);
			case ConfigPackage.DATA_MODEL__DATA_SOURCE:
				return DATA_SOURCE_EDEFAULT == null ? dataSource != null : !DATA_SOURCE_EDEFAULT.equals(dataSource);
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
		result.append(" (datasetName: ");
		result.append(datasetName);
		result.append(", dataSource: ");
		result.append(dataSource);
		result.append(')');
		return result.toString();
	}

} //DataModelImpl
