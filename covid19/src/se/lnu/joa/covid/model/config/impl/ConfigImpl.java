/**
 */
package se.lnu.joa.covid.model.config.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.lnu.joa.covid.model.config.Animation;
import se.lnu.joa.covid.model.config.Config;
import se.lnu.joa.covid.model.config.ConfigPackage;
import se.lnu.joa.covid.model.config.DataModel;
import se.lnu.joa.covid.model.config.Regression;
import se.lnu.joa.covid.model.config.Visualization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.ConfigImpl#getSource <em>Source</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.ConfigImpl#getVisualizatoin <em>Visualizatoin</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.ConfigImpl#getRegression <em>Regression</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.ConfigImpl#getAnimation <em>Animation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigImpl extends MinimalEObjectImpl.Container implements Config {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DataModel source;

	/**
	 * The cached value of the '{@link #getVisualizatoin() <em>Visualizatoin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizatoin()
	 * @generated
	 * @ordered
	 */
	protected Visualization visualizatoin;

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
	 * The cached value of the '{@link #getAnimation() <em>Animation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimation()
	 * @generated
	 * @ordered
	 */
	protected Animation animation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(DataModel newSource, NotificationChain msgs) {
		DataModel oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DataModel newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.CONFIG__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.CONFIG__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization getVisualizatoin() {
		return visualizatoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisualizatoin(Visualization newVisualizatoin, NotificationChain msgs) {
		Visualization oldVisualizatoin = visualizatoin;
		visualizatoin = newVisualizatoin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__VISUALIZATOIN, oldVisualizatoin, newVisualizatoin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualizatoin(Visualization newVisualizatoin) {
		if (newVisualizatoin != visualizatoin) {
			NotificationChain msgs = null;
			if (visualizatoin != null)
				msgs = ((InternalEObject)visualizatoin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.CONFIG__VISUALIZATOIN, null, msgs);
			if (newVisualizatoin != null)
				msgs = ((InternalEObject)newVisualizatoin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.CONFIG__VISUALIZATOIN, null, msgs);
			msgs = basicSetVisualizatoin(newVisualizatoin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__VISUALIZATOIN, newVisualizatoin, newVisualizatoin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__REGRESSION, oldRegression, newRegression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegression(Regression newRegression) {
		if (newRegression != regression) {
			NotificationChain msgs = null;
			if (regression != null)
				msgs = ((InternalEObject)regression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.CONFIG__REGRESSION, null, msgs);
			if (newRegression != null)
				msgs = ((InternalEObject)newRegression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.CONFIG__REGRESSION, null, msgs);
			msgs = basicSetRegression(newRegression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__REGRESSION, newRegression, newRegression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animation getAnimation() {
		return animation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimation(Animation newAnimation, NotificationChain msgs) {
		Animation oldAnimation = animation;
		animation = newAnimation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__ANIMATION, oldAnimation, newAnimation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimation(Animation newAnimation) {
		if (newAnimation != animation) {
			NotificationChain msgs = null;
			if (animation != null)
				msgs = ((InternalEObject)animation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.CONFIG__ANIMATION, null, msgs);
			if (newAnimation != null)
				msgs = ((InternalEObject)newAnimation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.CONFIG__ANIMATION, null, msgs);
			msgs = basicSetAnimation(newAnimation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__ANIMATION, newAnimation, newAnimation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.CONFIG__SOURCE:
				return basicSetSource(null, msgs);
			case ConfigPackage.CONFIG__VISUALIZATOIN:
				return basicSetVisualizatoin(null, msgs);
			case ConfigPackage.CONFIG__REGRESSION:
				return basicSetRegression(null, msgs);
			case ConfigPackage.CONFIG__ANIMATION:
				return basicSetAnimation(null, msgs);
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
			case ConfigPackage.CONFIG__SOURCE:
				return getSource();
			case ConfigPackage.CONFIG__VISUALIZATOIN:
				return getVisualizatoin();
			case ConfigPackage.CONFIG__REGRESSION:
				return getRegression();
			case ConfigPackage.CONFIG__ANIMATION:
				return getAnimation();
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
			case ConfigPackage.CONFIG__SOURCE:
				setSource((DataModel)newValue);
				return;
			case ConfigPackage.CONFIG__VISUALIZATOIN:
				setVisualizatoin((Visualization)newValue);
				return;
			case ConfigPackage.CONFIG__REGRESSION:
				setRegression((Regression)newValue);
				return;
			case ConfigPackage.CONFIG__ANIMATION:
				setAnimation((Animation)newValue);
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
			case ConfigPackage.CONFIG__SOURCE:
				setSource((DataModel)null);
				return;
			case ConfigPackage.CONFIG__VISUALIZATOIN:
				setVisualizatoin((Visualization)null);
				return;
			case ConfigPackage.CONFIG__REGRESSION:
				setRegression((Regression)null);
				return;
			case ConfigPackage.CONFIG__ANIMATION:
				setAnimation((Animation)null);
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
			case ConfigPackage.CONFIG__SOURCE:
				return source != null;
			case ConfigPackage.CONFIG__VISUALIZATOIN:
				return visualizatoin != null;
			case ConfigPackage.CONFIG__REGRESSION:
				return regression != null;
			case ConfigPackage.CONFIG__ANIMATION:
				return animation != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigImpl
