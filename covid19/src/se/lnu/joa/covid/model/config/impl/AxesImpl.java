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
import se.lnu.joa.covid.model.config.Axis;
import se.lnu.joa.covid.model.config.ConfigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.AxesImpl#getX <em>X</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.AxesImpl#getY <em>Y</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.impl.AxesImpl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxesImpl extends MinimalEObjectImpl.Container implements Axes {
	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Axis x;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Axis y;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected Axis z;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.AXES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(Axis newX, NotificationChain msgs) {
		Axis oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.AXES__X, oldX, newX);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Axis newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject)x).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.AXES__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject)newX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.AXES__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.AXES__X, newX, newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetY(Axis newY, NotificationChain msgs) {
		Axis oldY = y;
		y = newY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.AXES__Y, oldY, newY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Axis newY) {
		if (newY != y) {
			NotificationChain msgs = null;
			if (y != null)
				msgs = ((InternalEObject)y).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.AXES__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject)newY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.AXES__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.AXES__Y, newY, newY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZ(Axis newZ, NotificationChain msgs) {
		Axis oldZ = z;
		z = newZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.AXES__Z, oldZ, newZ);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(Axis newZ) {
		if (newZ != z) {
			NotificationChain msgs = null;
			if (z != null)
				msgs = ((InternalEObject)z).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.AXES__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject)newZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.AXES__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.AXES__Z, newZ, newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.AXES__X:
				return basicSetX(null, msgs);
			case ConfigPackage.AXES__Y:
				return basicSetY(null, msgs);
			case ConfigPackage.AXES__Z:
				return basicSetZ(null, msgs);
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
			case ConfigPackage.AXES__X:
				return getX();
			case ConfigPackage.AXES__Y:
				return getY();
			case ConfigPackage.AXES__Z:
				return getZ();
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
			case ConfigPackage.AXES__X:
				setX((Axis)newValue);
				return;
			case ConfigPackage.AXES__Y:
				setY((Axis)newValue);
				return;
			case ConfigPackage.AXES__Z:
				setZ((Axis)newValue);
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
			case ConfigPackage.AXES__X:
				setX((Axis)null);
				return;
			case ConfigPackage.AXES__Y:
				setY((Axis)null);
				return;
			case ConfigPackage.AXES__Z:
				setZ((Axis)null);
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
			case ConfigPackage.AXES__X:
				return x != null;
			case ConfigPackage.AXES__Y:
				return y != null;
			case ConfigPackage.AXES__Z:
				return z != null;
		}
		return super.eIsSet(featureID);
	}

} //AxesImpl
