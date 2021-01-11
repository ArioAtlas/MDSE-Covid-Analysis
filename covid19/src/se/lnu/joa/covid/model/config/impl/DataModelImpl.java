/**
 */
package se.lnu.joa.covid.model.config.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.lnu.joa.covid.model.config.ConfigPackage;
import se.lnu.joa.covid.model.config.DataModel;
import se.lnu.joa.covid.model.config.Filter;

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
 *   <li>{@link se.lnu.joa.covid.model.config.impl.DataModelImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.DataModelImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.DataModelImpl#getDateFormat <em>Date Format</em>}</li>
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
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<String> columns;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filters;

	/**
	 * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected String dateFormat = DATE_FORMAT_EDEFAULT;

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
	public EList<String> getColumns() {
		if (columns == null) {
			columns = new EDataTypeUniqueEList<String>(String.class, this, ConfigPackage.DATA_MODEL__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<Filter>(Filter.class, this, ConfigPackage.DATA_MODEL__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateFormat() {
		return dateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFormat(String newDateFormat) {
		String oldDateFormat = dateFormat;
		dateFormat = newDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.DATA_MODEL__DATE_FORMAT, oldDateFormat, dateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.DATA_MODEL__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
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
			case ConfigPackage.DATA_MODEL__DATASET_NAME:
				return getDatasetName();
			case ConfigPackage.DATA_MODEL__DATA_SOURCE:
				return getDataSource();
			case ConfigPackage.DATA_MODEL__COLUMNS:
				return getColumns();
			case ConfigPackage.DATA_MODEL__FILTERS:
				return getFilters();
			case ConfigPackage.DATA_MODEL__DATE_FORMAT:
				return getDateFormat();
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
			case ConfigPackage.DATA_MODEL__DATASET_NAME:
				setDatasetName((String)newValue);
				return;
			case ConfigPackage.DATA_MODEL__DATA_SOURCE:
				setDataSource((String)newValue);
				return;
			case ConfigPackage.DATA_MODEL__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends String>)newValue);
				return;
			case ConfigPackage.DATA_MODEL__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case ConfigPackage.DATA_MODEL__DATE_FORMAT:
				setDateFormat((String)newValue);
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
			case ConfigPackage.DATA_MODEL__COLUMNS:
				getColumns().clear();
				return;
			case ConfigPackage.DATA_MODEL__FILTERS:
				getFilters().clear();
				return;
			case ConfigPackage.DATA_MODEL__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
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
			case ConfigPackage.DATA_MODEL__COLUMNS:
				return columns != null && !columns.isEmpty();
			case ConfigPackage.DATA_MODEL__FILTERS:
				return filters != null && !filters.isEmpty();
			case ConfigPackage.DATA_MODEL__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
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
		result.append(", columns: ");
		result.append(columns);
		result.append(", dateFormat: ");
		result.append(dateFormat);
		result.append(')');
		return result.toString();
	}

} //DataModelImpl
