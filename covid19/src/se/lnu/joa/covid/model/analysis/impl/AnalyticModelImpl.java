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
import se.lnu.joa.covid.model.analysis.DataSource;
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
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnalyticModelImpl#getRegression <em>Regression</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnalyticModelImpl#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.impl.AnalyticModelImpl#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyticModelImpl extends MinimalEObjectImpl.Container implements AnalyticModel {
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
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSource;

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
	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(DataSource newDataSource, NotificationChain msgs) {
		DataSource oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE, oldDataSource, newDataSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSource(DataSource newDataSource) {
		if (newDataSource != dataSource) {
			NotificationChain msgs = null;
			if (dataSource != null)
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE, null, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE, null, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE, newDataSource, newDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
			case AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
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
			case AnalysisPackage.ANALYTIC_MODEL__REGRESSION:
				return getRegression();
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				return getVisualization();
			case AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE:
				return getDataSource();
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
			case AnalysisPackage.ANALYTIC_MODEL__REGRESSION:
				getRegression().clear();
				getRegression().addAll((Collection<? extends Regression>)newValue);
				return;
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				getVisualization().clear();
				getVisualization().addAll((Collection<? extends Visualization>)newValue);
				return;
			case AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE:
				setDataSource((DataSource)newValue);
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
			case AnalysisPackage.ANALYTIC_MODEL__REGRESSION:
				getRegression().clear();
				return;
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				getVisualization().clear();
				return;
			case AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE:
				setDataSource((DataSource)null);
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
			case AnalysisPackage.ANALYTIC_MODEL__REGRESSION:
				return regression != null && !regression.isEmpty();
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				return visualization != null && !visualization.isEmpty();
			case AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE:
				return dataSource != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalyticModelImpl
