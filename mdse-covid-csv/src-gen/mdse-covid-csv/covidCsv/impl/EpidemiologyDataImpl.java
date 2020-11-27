/**
 */
package mdse-covid-csv.covidCsv.impl;

import mdse-covid-csv.covidCsv.CovidCsvPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Epidemiology Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl#getKey <em>Key</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl#getNew_confirmed <em>New confirmed</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl#getNew_deceased <em>New deceased</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl#getNew_recovered <em>New recovered</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl#getNew_tested <em>New tested</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl#getTotal_confirmed <em>Total confirmed</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl#getTotal_deceased <em>Total deceased</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl#getTotal_tested <em>Total tested</em>}</li>
 *   <li>{@link mdse-covid-csv.covidCsv.impl.EpidemiologyDataImpl#getIndexData <em>Index Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpidemiologyDataImpl extends MinimalEObjectImpl.Container implements CSV
{
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
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

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
	 * The cached value of the '{@link #getIndexData() <em>Index Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexData()
	 * @generated
	 * @ordered
	 */
	protected CSV indexData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpidemiologyDataImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return CovidCsvPackage.Literals.EPIDEMIOLOGY_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate()
	{
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate)
	{
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.EPIDEMIOLOGY_DATA__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey()
	{
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey)
	{
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.EPIDEMIOLOGY_DATA__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_confirmed()
	{
		return new_confirmed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_confirmed(int newNew_confirmed)
	{
		int oldNew_confirmed = new_confirmed;
		new_confirmed = newNew_confirmed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_CONFIRMED, oldNew_confirmed, new_confirmed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_deceased()
	{
		return new_deceased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_deceased(int newNew_deceased)
	{
		int oldNew_deceased = new_deceased;
		new_deceased = newNew_deceased;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_DECEASED, oldNew_deceased, new_deceased));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_recovered()
	{
		return new_recovered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_recovered(int newNew_recovered)
	{
		int oldNew_recovered = new_recovered;
		new_recovered = newNew_recovered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_RECOVERED, oldNew_recovered, new_recovered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_tested()
	{
		return new_tested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_tested(int newNew_tested)
	{
		int oldNew_tested = new_tested;
		new_tested = newNew_tested;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_TESTED, oldNew_tested, new_tested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_confirmed()
	{
		return total_confirmed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_confirmed(int newTotal_confirmed)
	{
		int oldTotal_confirmed = total_confirmed;
		total_confirmed = newTotal_confirmed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_CONFIRMED, oldTotal_confirmed, total_confirmed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_deceased()
	{
		return total_deceased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_deceased(int newTotal_deceased)
	{
		int oldTotal_deceased = total_deceased;
		total_deceased = newTotal_deceased;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_DECEASED, oldTotal_deceased, total_deceased));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_tested()
	{
		return total_tested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_tested(int newTotal_tested)
	{
		int oldTotal_tested = total_tested;
		total_tested = newTotal_tested;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_TESTED, oldTotal_tested, total_tested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public CSV getIndexData()
	{
		if (indexData != null && ((EObject)indexData).eIsProxy())
		{
			InternalEObject oldIndexData = (InternalEObject)indexData;
			indexData = (CSV)eResolveProxy(oldIndexData);
			if (indexData != oldIndexData)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CovidCsvPackage.EPIDEMIOLOGY_DATA__INDEX_DATA, oldIndexData, indexData));
			}
		}
		return indexData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSV basicGetIndexData()
	{
		return indexData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexData(CSV newIndexData)
	{
		CSV oldIndexData = indexData;
		indexData = newIndexData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CovidCsvPackage.EPIDEMIOLOGY_DATA__INDEX_DATA, oldIndexData, indexData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__DATE:
				return getDate();
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__KEY:
				return getKey();
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_CONFIRMED:
				return getNew_confirmed();
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_DECEASED:
				return getNew_deceased();
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_RECOVERED:
				return getNew_recovered();
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_TESTED:
				return getNew_tested();
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_CONFIRMED:
				return getTotal_confirmed();
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_DECEASED:
				return getTotal_deceased();
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_TESTED:
				return getTotal_tested();
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__INDEX_DATA:
				if (resolve) return getIndexData();
				return basicGetIndexData();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__DATE:
				setDate((String)newValue);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__KEY:
				setKey((String)newValue);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_CONFIRMED:
				setNew_confirmed((Integer)newValue);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_DECEASED:
				setNew_deceased((Integer)newValue);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_RECOVERED:
				setNew_recovered((Integer)newValue);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_TESTED:
				setNew_tested((Integer)newValue);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_CONFIRMED:
				setTotal_confirmed((Integer)newValue);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_DECEASED:
				setTotal_deceased((Integer)newValue);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_TESTED:
				setTotal_tested((Integer)newValue);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__INDEX_DATA:
				setIndexData((CSV)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_CONFIRMED:
				setNew_confirmed(NEW_CONFIRMED_EDEFAULT);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_DECEASED:
				setNew_deceased(NEW_DECEASED_EDEFAULT);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_RECOVERED:
				setNew_recovered(NEW_RECOVERED_EDEFAULT);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_TESTED:
				setNew_tested(NEW_TESTED_EDEFAULT);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_CONFIRMED:
				setTotal_confirmed(TOTAL_CONFIRMED_EDEFAULT);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_DECEASED:
				setTotal_deceased(TOTAL_DECEASED_EDEFAULT);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_TESTED:
				setTotal_tested(TOTAL_TESTED_EDEFAULT);
				return;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__INDEX_DATA:
				setIndexData((CSV)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_CONFIRMED:
				return new_confirmed != NEW_CONFIRMED_EDEFAULT;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_DECEASED:
				return new_deceased != NEW_DECEASED_EDEFAULT;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_RECOVERED:
				return new_recovered != NEW_RECOVERED_EDEFAULT;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__NEW_TESTED:
				return new_tested != NEW_TESTED_EDEFAULT;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_CONFIRMED:
				return total_confirmed != TOTAL_CONFIRMED_EDEFAULT;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_DECEASED:
				return total_deceased != TOTAL_DECEASED_EDEFAULT;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__TOTAL_TESTED:
				return total_tested != TOTAL_TESTED_EDEFAULT;
			case CovidCsvPackage.EPIDEMIOLOGY_DATA__INDEX_DATA:
				return indexData != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (date: ");
		result.append(date);
		result.append(", key: ");
		result.append(key);
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
		result.append(", total_tested: ");
		result.append(total_tested);
		result.append(')');
		return result.toString();
	}

} //EpidemiologyDataImpl
