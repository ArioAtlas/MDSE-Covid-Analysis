/**
 */
package se.lnu.joa.covid.model.analysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.lnu.joa.covid.model.analysis.AnalysisPackage;
import se.lnu.joa.covid.model.analysis.AnalyticModel;
import se.lnu.joa.covid.model.analysis.Regression;
import se.lnu.joa.covid.model.analysis.Visualization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analytic Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnalyticModelImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnalyticModelImpl#getDatasetName <em>Dataset Name</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnalyticModelImpl#getRegression <em>Regression</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnalyticModelImpl#getVisualization <em>Visualization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyticModelImpl extends MinimalEObjectImpl.Container implements AnalyticModel {
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
	 * The cached value of the '{@link #getRegression() <em>Regression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegression()
	 * @generated
	 * @ordered
	 */
	protected EList<Regression> regression;

	/**
	 * The cached value of the '{@link #getVisualization() <em>Visualization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualization()
	 * @generated
	 * @ordered
	 */
	protected EList<Visualization> visualization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalyticModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.ANALYTIC_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE, oldDataSource, dataSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYTIC_MODEL__DATASET_NAME, oldDatasetName, datasetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regression> getRegression() {
		if (regression == null) {
			regression = new EObjectContainmentEList<Regression>(Regression.class, this, AnalysisPackage.ANALYTIC_MODEL__REGRESSION);
		}
		return regression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Visualization> getVisualization() {
		if (visualization == null) {
			visualization = new EObjectContainmentEList<Visualization>(Visualization.class, this, AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION);
		}
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.ANALYTIC_MODEL__REGRESSION:
				return ((InternalEList<?>)getRegression()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				return ((InternalEList<?>)getVisualization()).basicRemove(otherEnd, msgs);
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
			case AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE:
				return getDataSource();
			case AnalysisPackage.ANALYTIC_MODEL__DATASET_NAME:
				return getDatasetName();
			case AnalysisPackage.ANALYTIC_MODEL__REGRESSION:
				return getRegression();
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				return getVisualization();
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
			case AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE:
				setDataSource((String)newValue);
				return;
			case AnalysisPackage.ANALYTIC_MODEL__DATASET_NAME:
				setDatasetName((String)newValue);
				return;
			case AnalysisPackage.ANALYTIC_MODEL__REGRESSION:
				getRegression().clear();
				getRegression().addAll((Collection<? extends Regression>)newValue);
				return;
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				getVisualization().clear();
				getVisualization().addAll((Collection<? extends Visualization>)newValue);
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
			case AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE:
				setDataSource(DATA_SOURCE_EDEFAULT);
				return;
			case AnalysisPackage.ANALYTIC_MODEL__DATASET_NAME:
				setDatasetName(DATASET_NAME_EDEFAULT);
				return;
			case AnalysisPackage.ANALYTIC_MODEL__REGRESSION:
				getRegression().clear();
				return;
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				getVisualization().clear();
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
			case AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE:
				return DATA_SOURCE_EDEFAULT == null ? dataSource != null : !DATA_SOURCE_EDEFAULT.equals(dataSource);
			case AnalysisPackage.ANALYTIC_MODEL__DATASET_NAME:
				return DATASET_NAME_EDEFAULT == null ? datasetName != null : !DATASET_NAME_EDEFAULT.equals(datasetName);
			case AnalysisPackage.ANALYTIC_MODEL__REGRESSION:
				return regression != null && !regression.isEmpty();
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				return visualization != null && !visualization.isEmpty();
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
		result.append(" (dataSource: ");
		result.append(dataSource);
		result.append(", datasetName: ");
		result.append(datasetName);
		result.append(')');
		return result.toString();
	}

} //AnalyticModelImpl
