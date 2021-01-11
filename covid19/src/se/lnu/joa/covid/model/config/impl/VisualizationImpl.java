/**
 */
package se.lnu.joa.covid.model.config.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.lnu.joa.covid.model.config.Axes;
import se.lnu.joa.covid.model.config.ConfigPackage;
import se.lnu.joa.covid.model.config.Visualization;
import se.lnu.joa.covid.model.config.VisualizationInfo;
import se.lnu.joa.covid.model.config.VisualizationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getType <em>Type</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getAxes <em>Axes</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.VisualizationImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationImpl extends MinimalEObjectImpl.Container implements Visualization {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VisualizationType TYPE_EDEFAULT = VisualizationType.LINEAR_PLOT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VisualizationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAxes() <em>Axes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxes()
	 * @generated
	 * @ordered
	 */
	protected Axes axes;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected VisualizationInfo info;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.VISUALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(VisualizationType newType) {
		VisualizationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axes getAxes() {
		return axes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxes(Axes newAxes, NotificationChain msgs) {
		Axes oldAxes = axes;
		axes = newAxes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__AXES, oldAxes, newAxes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxes(Axes newAxes) {
		if (newAxes != axes) {
			NotificationChain msgs = null;
			if (axes != null)
				msgs = ((InternalEObject)axes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.VISUALIZATION__AXES, null, msgs);
			if (newAxes != null)
				msgs = ((InternalEObject)newAxes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.VISUALIZATION__AXES, null, msgs);
			msgs = basicSetAxes(newAxes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__AXES, newAxes, newAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationInfo getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(VisualizationInfo newInfo, NotificationChain msgs) {
		VisualizationInfo oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(VisualizationInfo newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.VISUALIZATION__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.VISUALIZATION__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.VISUALIZATION__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.VISUALIZATION__AXES:
				return basicSetAxes(null, msgs);
			case ConfigPackage.VISUALIZATION__INFO:
				return basicSetInfo(null, msgs);
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
			case ConfigPackage.VISUALIZATION__TYPE:
				return getType();
			case ConfigPackage.VISUALIZATION__AXES:
				return getAxes();
			case ConfigPackage.VISUALIZATION__INFO:
				return getInfo();
			case ConfigPackage.VISUALIZATION__SIZE:
				return getSize();
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
			case ConfigPackage.VISUALIZATION__TYPE:
				setType((VisualizationType)newValue);
				return;
			case ConfigPackage.VISUALIZATION__AXES:
				setAxes((Axes)newValue);
				return;
			case ConfigPackage.VISUALIZATION__INFO:
				setInfo((VisualizationInfo)newValue);
				return;
			case ConfigPackage.VISUALIZATION__SIZE:
				setSize((String)newValue);
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
			case ConfigPackage.VISUALIZATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ConfigPackage.VISUALIZATION__AXES:
				setAxes((Axes)null);
				return;
			case ConfigPackage.VISUALIZATION__INFO:
				setInfo((VisualizationInfo)null);
				return;
			case ConfigPackage.VISUALIZATION__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case ConfigPackage.VISUALIZATION__TYPE:
				return type != TYPE_EDEFAULT;
			case ConfigPackage.VISUALIZATION__AXES:
				return axes != null;
			case ConfigPackage.VISUALIZATION__INFO:
				return info != null;
			case ConfigPackage.VISUALIZATION__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //VisualizationImpl
