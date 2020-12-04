/**
 */
package se.lnu.joa.covid.model.covid19.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.lnu.joa.covid.model.covid19.Covid19Package;
import se.lnu.joa.covid.model.covid19.Epidemiology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Epidemiology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.EpidemiologyImpl#getNew_confirmed <em>New confirmed</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.EpidemiologyImpl#getNew_deceased <em>New deceased</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpidemiologyImpl extends DataRecordImpl implements Epidemiology {
	/**
	 * The default value of the '{@link #getNew_confirmed() <em>New confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_confirmed()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_CONFIRMED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_confirmed() <em>New confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_confirmed()
	 * @generated
	 * @ordered
	 */
	protected int new_confirmed = NEW_CONFIRMED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_deceased() <em>New deceased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_deceased()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_DECEASED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_deceased() <em>New deceased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_deceased()
	 * @generated
	 * @ordered
	 */
	protected int new_deceased = NEW_DECEASED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpidemiologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Covid19Package.Literals.EPIDEMIOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_confirmed() {
		return new_confirmed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_confirmed(int newNew_confirmed) {
		int oldNew_confirmed = new_confirmed;
		new_confirmed = newNew_confirmed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.EPIDEMIOLOGY__NEW_CONFIRMED,
					oldNew_confirmed, new_confirmed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_deceased() {
		return new_deceased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_deceased(int newNew_deceased) {
		int oldNew_deceased = new_deceased;
		new_deceased = newNew_deceased;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.EPIDEMIOLOGY__NEW_DECEASED,
					oldNew_deceased, new_deceased));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Covid19Package.EPIDEMIOLOGY__NEW_CONFIRMED:
			return getNew_confirmed();
		case Covid19Package.EPIDEMIOLOGY__NEW_DECEASED:
			return getNew_deceased();
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
		case Covid19Package.EPIDEMIOLOGY__NEW_CONFIRMED:
			setNew_confirmed((Integer) newValue);
			return;
		case Covid19Package.EPIDEMIOLOGY__NEW_DECEASED:
			setNew_deceased((Integer) newValue);
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
		case Covid19Package.EPIDEMIOLOGY__NEW_CONFIRMED:
			setNew_confirmed(NEW_CONFIRMED_EDEFAULT);
			return;
		case Covid19Package.EPIDEMIOLOGY__NEW_DECEASED:
			setNew_deceased(NEW_DECEASED_EDEFAULT);
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
		case Covid19Package.EPIDEMIOLOGY__NEW_CONFIRMED:
			return new_confirmed != NEW_CONFIRMED_EDEFAULT;
		case Covid19Package.EPIDEMIOLOGY__NEW_DECEASED:
			return new_deceased != NEW_DECEASED_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (new_confirmed: ");
		result.append(new_confirmed);
		result.append(", new_deceased: ");
		result.append(new_deceased);
		result.append(')');
		return result.toString();
	}

} //EpidemiologyImpl
