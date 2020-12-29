/**
 */
package se.lnu.joa.covid.model.data.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.lnu.joa.covid.model.data.DataPackage;
import se.lnu.joa.covid.model.data.Epidemiology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Epidemiology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.EpidemiologyImpl#getDate <em>Date</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.EpidemiologyImpl#getNew_confirmed <em>New confirmed</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.EpidemiologyImpl#getNew_deceased <em>New deceased</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.EpidemiologyImpl#getNew_recovered <em>New recovered</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.EpidemiologyImpl#getNew_tested <em>New tested</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.EpidemiologyImpl#getTotal_confirmed <em>Total confirmed</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.EpidemiologyImpl#getTotal_deceased <em>Total deceased</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.EpidemiologyImpl#getTotal_recovered <em>Total recovered</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.impl.EpidemiologyImpl#getTotal_tested <em>Total tested</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpidemiologyImpl extends DataRecordImpl implements Epidemiology {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

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
	 * The default value of the '{@link #getNew_recovered() <em>New recovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_recovered()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_RECOVERED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_recovered() <em>New recovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_recovered()
	 * @generated
	 * @ordered
	 */
	protected int new_recovered = NEW_RECOVERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_tested() <em>New tested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_tested()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_TESTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_tested() <em>New tested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_tested()
	 * @generated
	 * @ordered
	 */
	protected int new_tested = NEW_TESTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_confirmed() <em>Total confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_confirmed()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_CONFIRMED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_confirmed() <em>Total confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_confirmed()
	 * @generated
	 * @ordered
	 */
	protected int total_confirmed = TOTAL_CONFIRMED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_deceased() <em>Total deceased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_deceased()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_DECEASED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_deceased() <em>Total deceased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_deceased()
	 * @generated
	 * @ordered
	 */
	protected int total_deceased = TOTAL_DECEASED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_recovered() <em>Total recovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_recovered()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_RECOVERED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_recovered() <em>Total recovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_recovered()
	 * @generated
	 * @ordered
	 */
	protected int total_recovered = TOTAL_RECOVERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_tested() <em>Total tested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_tested()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_TESTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_tested() <em>Total tested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_tested()
	 * @generated
	 * @ordered
	 */
	protected int total_tested = TOTAL_TESTED_EDEFAULT;

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
		return DataPackage.Literals.EPIDEMIOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.EPIDEMIOLOGY__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.EPIDEMIOLOGY__NEW_CONFIRMED, oldNew_confirmed, new_confirmed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.EPIDEMIOLOGY__NEW_DECEASED, oldNew_deceased, new_deceased));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_recovered() {
		return new_recovered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_recovered(int newNew_recovered) {
		int oldNew_recovered = new_recovered;
		new_recovered = newNew_recovered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.EPIDEMIOLOGY__NEW_RECOVERED, oldNew_recovered, new_recovered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_tested() {
		return new_tested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_tested(int newNew_tested) {
		int oldNew_tested = new_tested;
		new_tested = newNew_tested;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.EPIDEMIOLOGY__NEW_TESTED, oldNew_tested, new_tested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_confirmed() {
		return total_confirmed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_confirmed(int newTotal_confirmed) {
		int oldTotal_confirmed = total_confirmed;
		total_confirmed = newTotal_confirmed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.EPIDEMIOLOGY__TOTAL_CONFIRMED, oldTotal_confirmed, total_confirmed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_deceased() {
		return total_deceased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_deceased(int newTotal_deceased) {
		int oldTotal_deceased = total_deceased;
		total_deceased = newTotal_deceased;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.EPIDEMIOLOGY__TOTAL_DECEASED, oldTotal_deceased, total_deceased));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_recovered() {
		return total_recovered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_recovered(int newTotal_recovered) {
		int oldTotal_recovered = total_recovered;
		total_recovered = newTotal_recovered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.EPIDEMIOLOGY__TOTAL_RECOVERED, oldTotal_recovered, total_recovered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_tested() {
		return total_tested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_tested(int newTotal_tested) {
		int oldTotal_tested = total_tested;
		total_tested = newTotal_tested;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.EPIDEMIOLOGY__TOTAL_TESTED, oldTotal_tested, total_tested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.EPIDEMIOLOGY__DATE:
				return getDate();
			case DataPackage.EPIDEMIOLOGY__NEW_CONFIRMED:
				return getNew_confirmed();
			case DataPackage.EPIDEMIOLOGY__NEW_DECEASED:
				return getNew_deceased();
			case DataPackage.EPIDEMIOLOGY__NEW_RECOVERED:
				return getNew_recovered();
			case DataPackage.EPIDEMIOLOGY__NEW_TESTED:
				return getNew_tested();
			case DataPackage.EPIDEMIOLOGY__TOTAL_CONFIRMED:
				return getTotal_confirmed();
			case DataPackage.EPIDEMIOLOGY__TOTAL_DECEASED:
				return getTotal_deceased();
			case DataPackage.EPIDEMIOLOGY__TOTAL_RECOVERED:
				return getTotal_recovered();
			case DataPackage.EPIDEMIOLOGY__TOTAL_TESTED:
				return getTotal_tested();
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
			case DataPackage.EPIDEMIOLOGY__DATE:
				setDate((String)newValue);
				return;
			case DataPackage.EPIDEMIOLOGY__NEW_CONFIRMED:
				setNew_confirmed((Integer)newValue);
				return;
			case DataPackage.EPIDEMIOLOGY__NEW_DECEASED:
				setNew_deceased((Integer)newValue);
				return;
			case DataPackage.EPIDEMIOLOGY__NEW_RECOVERED:
				setNew_recovered((Integer)newValue);
				return;
			case DataPackage.EPIDEMIOLOGY__NEW_TESTED:
				setNew_tested((Integer)newValue);
				return;
			case DataPackage.EPIDEMIOLOGY__TOTAL_CONFIRMED:
				setTotal_confirmed((Integer)newValue);
				return;
			case DataPackage.EPIDEMIOLOGY__TOTAL_DECEASED:
				setTotal_deceased((Integer)newValue);
				return;
			case DataPackage.EPIDEMIOLOGY__TOTAL_RECOVERED:
				setTotal_recovered((Integer)newValue);
				return;
			case DataPackage.EPIDEMIOLOGY__TOTAL_TESTED:
				setTotal_tested((Integer)newValue);
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
			case DataPackage.EPIDEMIOLOGY__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case DataPackage.EPIDEMIOLOGY__NEW_CONFIRMED:
				setNew_confirmed(NEW_CONFIRMED_EDEFAULT);
				return;
			case DataPackage.EPIDEMIOLOGY__NEW_DECEASED:
				setNew_deceased(NEW_DECEASED_EDEFAULT);
				return;
			case DataPackage.EPIDEMIOLOGY__NEW_RECOVERED:
				setNew_recovered(NEW_RECOVERED_EDEFAULT);
				return;
			case DataPackage.EPIDEMIOLOGY__NEW_TESTED:
				setNew_tested(NEW_TESTED_EDEFAULT);
				return;
			case DataPackage.EPIDEMIOLOGY__TOTAL_CONFIRMED:
				setTotal_confirmed(TOTAL_CONFIRMED_EDEFAULT);
				return;
			case DataPackage.EPIDEMIOLOGY__TOTAL_DECEASED:
				setTotal_deceased(TOTAL_DECEASED_EDEFAULT);
				return;
			case DataPackage.EPIDEMIOLOGY__TOTAL_RECOVERED:
				setTotal_recovered(TOTAL_RECOVERED_EDEFAULT);
				return;
			case DataPackage.EPIDEMIOLOGY__TOTAL_TESTED:
				setTotal_tested(TOTAL_TESTED_EDEFAULT);
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
			case DataPackage.EPIDEMIOLOGY__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case DataPackage.EPIDEMIOLOGY__NEW_CONFIRMED:
				return new_confirmed != NEW_CONFIRMED_EDEFAULT;
			case DataPackage.EPIDEMIOLOGY__NEW_DECEASED:
				return new_deceased != NEW_DECEASED_EDEFAULT;
			case DataPackage.EPIDEMIOLOGY__NEW_RECOVERED:
				return new_recovered != NEW_RECOVERED_EDEFAULT;
			case DataPackage.EPIDEMIOLOGY__NEW_TESTED:
				return new_tested != NEW_TESTED_EDEFAULT;
			case DataPackage.EPIDEMIOLOGY__TOTAL_CONFIRMED:
				return total_confirmed != TOTAL_CONFIRMED_EDEFAULT;
			case DataPackage.EPIDEMIOLOGY__TOTAL_DECEASED:
				return total_deceased != TOTAL_DECEASED_EDEFAULT;
			case DataPackage.EPIDEMIOLOGY__TOTAL_RECOVERED:
				return total_recovered != TOTAL_RECOVERED_EDEFAULT;
			case DataPackage.EPIDEMIOLOGY__TOTAL_TESTED:
				return total_tested != TOTAL_TESTED_EDEFAULT;
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
		result.append(" (date: ");
		result.append(date);
		result.append(", new_confirmed: ");
		result.append(new_confirmed);
		result.append(", new_deceased: ");
		result.append(new_deceased);
		result.append(", new_recovered: ");
		result.append(new_recovered);
		result.append(", new_tested: ");
		result.append(new_tested);
		result.append(", total_confirmed: ");
		result.append(total_confirmed);
		result.append(", total_deceased: ");
		result.append(total_deceased);
		result.append(", total_recovered: ");
		result.append(total_recovered);
		result.append(", total_tested: ");
		result.append(total_tested);
		result.append(')');
		return result.toString();
	}

} //EpidemiologyImpl
