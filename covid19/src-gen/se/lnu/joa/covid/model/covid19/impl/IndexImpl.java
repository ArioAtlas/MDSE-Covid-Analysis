/**
 */
package se.lnu.joa.covid.model.covid19.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.lnu.joa.covid.model.covid19.Covid19Package;
import se.lnu.joa.covid.model.covid19.Index;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getWikidata <em>Wikidata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexImpl extends DataRecordImpl implements Index {
	/**
	 * The default value of the '{@link #getWikidata() <em>Wikidata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWikidata()
	 * @generated
	 * @ordered
	 */
	protected static final String WIKIDATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWikidata() <em>Wikidata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWikidata()
	 * @generated
	 * @ordered
	 */
	protected String wikidata = WIKIDATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Covid19Package.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWikidata() {
		return wikidata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWikidata(String newWikidata) {
		String oldWikidata = wikidata;
		wikidata = newWikidata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__WIKIDATA, oldWikidata,
					wikidata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Covid19Package.INDEX__WIKIDATA:
			return getWikidata();
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
		case Covid19Package.INDEX__WIKIDATA:
			setWikidata((String) newValue);
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
		case Covid19Package.INDEX__WIKIDATA:
			setWikidata(WIKIDATA_EDEFAULT);
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
		case Covid19Package.INDEX__WIKIDATA:
			return WIKIDATA_EDEFAULT == null ? wikidata != null : !WIKIDATA_EDEFAULT.equals(wikidata);
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
		result.append(" (wikidata: ");
		result.append(wikidata);
		result.append(')');
		return result.toString();
	}

} //IndexImpl
