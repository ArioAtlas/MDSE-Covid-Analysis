/**
 */
package se.lnu.joa.covid.model.analysis.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
	 * The cached value of the '{@link #getRegression() <em>Regression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegression()
	 * @generated
	 * @ordered
	 */
	protected Regression regression;

	/**
	 * The cached value of the '{@link #getVisualization() <em>Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualization()
	 * @generated
	 * @ordered
	 */
	protected Visualization visualization;

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
	public Regression getRegression() {
		return regression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegression(Regression newRegression, NotificationChain msgs) {
		Regression oldRegression = regression;
		regression = newRegression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYTIC_MODEL__REGRESSION, oldRegression, newRegression);
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
	public void setRegression(Regression newRegression) {
		if (newRegression != regression) {
			NotificationChain msgs = null;
			if (regression != null)
				msgs = ((InternalEObject)regression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYTIC_MODEL__REGRESSION, null, msgs);
			if (newRegression != null)
				msgs = ((InternalEObject)newRegression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYTIC_MODEL__REGRESSION, null, msgs);
			msgs = basicSetRegression(newRegression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYTIC_MODEL__REGRESSION, newRegression, newRegression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visualization getVisualization() {
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisualization(Visualization newVisualization, NotificationChain msgs) {
		Visualization oldVisualization = visualization;
		visualization = newVisualization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION, oldVisualization, newVisualization);
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
	public void setVisualization(Visualization newVisualization) {
		if (newVisualization != visualization) {
			NotificationChain msgs = null;
			if (visualization != null)
				msgs = ((InternalEObject)visualization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION, null, msgs);
			if (newVisualization != null)
				msgs = ((InternalEObject)newVisualization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION, null, msgs);
			msgs = basicSetVisualization(newVisualization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION, newVisualization, newVisualization));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.ANALYTIC_MODEL__REGRESSION:
				return basicSetRegression(null, msgs);
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				return basicSetVisualization(null, msgs);
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
				setRegression((Regression)newValue);
				return;
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				setVisualization((Visualization)newValue);
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
				setRegression((Regression)null);
				return;
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				setVisualization((Visualization)null);
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
				return regression != null;
			case AnalysisPackage.ANALYTIC_MODEL__VISUALIZATION:
				return visualization != null;
			case AnalysisPackage.ANALYTIC_MODEL__DATA_SOURCE:
				return dataSource != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalyticModelImpl
