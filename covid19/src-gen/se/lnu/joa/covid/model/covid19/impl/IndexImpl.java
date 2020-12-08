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
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getDatacommons <em>Datacommons</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getCountry_code <em>Country code</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getCountry_name <em>Country name</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getSubregion1_code <em>Subregion1 code</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getSubregion1_name <em>Subregion1 name</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getSubregion2_code <em>Subregion2 code</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getSubregion2_name <em>Subregion2 name</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getLocality_code <em>Locality code</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getLocality_name <em>Locality name</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getAlpha_2 <em>Alpha 2</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getAlpha_3 <em>Alpha 3</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.impl.IndexImpl#getAggregation_level <em>Aggregation level</em>}</li>
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
	 * The default value of the '{@link #getDatacommons() <em>Datacommons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacommons()
	 * @generated
	 * @ordered
	 */
	protected static final String DATACOMMONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatacommons() <em>Datacommons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacommons()
	 * @generated
	 * @ordered
	 */
	protected String datacommons = DATACOMMONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry_code() <em>Country code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry_code()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry_code() <em>Country code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry_code()
	 * @generated
	 * @ordered
	 */
	protected String country_code = COUNTRY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry_name() <em>Country name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry_name()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry_name() <em>Country name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry_name()
	 * @generated
	 * @ordered
	 */
	protected String country_name = COUNTRY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubregion1_code() <em>Subregion1 code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubregion1_code()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBREGION1_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubregion1_code() <em>Subregion1 code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubregion1_code()
	 * @generated
	 * @ordered
	 */
	protected String subregion1_code = SUBREGION1_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubregion1_name() <em>Subregion1 name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubregion1_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBREGION1_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubregion1_name() <em>Subregion1 name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubregion1_name()
	 * @generated
	 * @ordered
	 */
	protected String subregion1_name = SUBREGION1_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubregion2_code() <em>Subregion2 code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubregion2_code()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBREGION2_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubregion2_code() <em>Subregion2 code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubregion2_code()
	 * @generated
	 * @ordered
	 */
	protected String subregion2_code = SUBREGION2_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubregion2_name() <em>Subregion2 name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubregion2_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBREGION2_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubregion2_name() <em>Subregion2 name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubregion2_name()
	 * @generated
	 * @ordered
	 */
	protected String subregion2_name = SUBREGION2_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocality_code() <em>Locality code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality_code()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocality_code() <em>Locality code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality_code()
	 * @generated
	 * @ordered
	 */
	protected String locality_code = LOCALITY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocality_name() <em>Locality name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality_name()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocality_name() <em>Locality name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality_name()
	 * @generated
	 * @ordered
	 */
	protected String locality_name = LOCALITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlpha_2() <em>Alpha 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha_2()
	 * @generated
	 * @ordered
	 */
	protected static final String ALPHA_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlpha_2() <em>Alpha 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha_2()
	 * @generated
	 * @ordered
	 */
	protected String alpha_2 = ALPHA_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlpha_3() <em>Alpha 3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha_3()
	 * @generated
	 * @ordered
	 */
	protected static final String ALPHA_3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlpha_3() <em>Alpha 3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha_3()
	 * @generated
	 * @ordered
	 */
	protected String alpha_3 = ALPHA_3_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregation_level() <em>Aggregation level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation_level()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregation_level() <em>Aggregation level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation_level()
	 * @generated
	 * @ordered
	 */
	protected String aggregation_level = AGGREGATION_LEVEL_EDEFAULT;

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
	public String getDatacommons() {
		return datacommons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacommons(String newDatacommons) {
		String oldDatacommons = datacommons;
		datacommons = newDatacommons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__DATACOMMONS, oldDatacommons,
					datacommons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry_code() {
		return country_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry_code(String newCountry_code) {
		String oldCountry_code = country_code;
		country_code = newCountry_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__COUNTRY_CODE, oldCountry_code,
					country_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry_name() {
		return country_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry_name(String newCountry_name) {
		String oldCountry_name = country_name;
		country_name = newCountry_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__COUNTRY_NAME, oldCountry_name,
					country_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubregion1_code() {
		return subregion1_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubregion1_code(String newSubregion1_code) {
		String oldSubregion1_code = subregion1_code;
		subregion1_code = newSubregion1_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__SUBREGION1_CODE,
					oldSubregion1_code, subregion1_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubregion1_name() {
		return subregion1_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubregion1_name(String newSubregion1_name) {
		String oldSubregion1_name = subregion1_name;
		subregion1_name = newSubregion1_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__SUBREGION1_NAME,
					oldSubregion1_name, subregion1_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubregion2_code() {
		return subregion2_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubregion2_code(String newSubregion2_code) {
		String oldSubregion2_code = subregion2_code;
		subregion2_code = newSubregion2_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__SUBREGION2_CODE,
					oldSubregion2_code, subregion2_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubregion2_name() {
		return subregion2_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubregion2_name(String newSubregion2_name) {
		String oldSubregion2_name = subregion2_name;
		subregion2_name = newSubregion2_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__SUBREGION2_NAME,
					oldSubregion2_name, subregion2_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocality_code() {
		return locality_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocality_code(String newLocality_code) {
		String oldLocality_code = locality_code;
		locality_code = newLocality_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__LOCALITY_CODE, oldLocality_code,
					locality_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocality_name() {
		return locality_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocality_name(String newLocality_name) {
		String oldLocality_name = locality_name;
		locality_name = newLocality_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__LOCALITY_NAME, oldLocality_name,
					locality_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlpha_2() {
		return alpha_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha_2(String newAlpha_2) {
		String oldAlpha_2 = alpha_2;
		alpha_2 = newAlpha_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__ALPHA_2, oldAlpha_2, alpha_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlpha_3() {
		return alpha_3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha_3(String newAlpha_3) {
		String oldAlpha_3 = alpha_3;
		alpha_3 = newAlpha_3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__ALPHA_3, oldAlpha_3, alpha_3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAggregation_level() {
		return aggregation_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation_level(String newAggregation_level) {
		String oldAggregation_level = aggregation_level;
		aggregation_level = newAggregation_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Covid19Package.INDEX__AGGREGATION_LEVEL,
					oldAggregation_level, aggregation_level));
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
		case Covid19Package.INDEX__DATACOMMONS:
			return getDatacommons();
		case Covid19Package.INDEX__COUNTRY_CODE:
			return getCountry_code();
		case Covid19Package.INDEX__COUNTRY_NAME:
			return getCountry_name();
		case Covid19Package.INDEX__SUBREGION1_CODE:
			return getSubregion1_code();
		case Covid19Package.INDEX__SUBREGION1_NAME:
			return getSubregion1_name();
		case Covid19Package.INDEX__SUBREGION2_CODE:
			return getSubregion2_code();
		case Covid19Package.INDEX__SUBREGION2_NAME:
			return getSubregion2_name();
		case Covid19Package.INDEX__LOCALITY_CODE:
			return getLocality_code();
		case Covid19Package.INDEX__LOCALITY_NAME:
			return getLocality_name();
		case Covid19Package.INDEX__ALPHA_2:
			return getAlpha_2();
		case Covid19Package.INDEX__ALPHA_3:
			return getAlpha_3();
		case Covid19Package.INDEX__AGGREGATION_LEVEL:
			return getAggregation_level();
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
		case Covid19Package.INDEX__DATACOMMONS:
			setDatacommons((String) newValue);
			return;
		case Covid19Package.INDEX__COUNTRY_CODE:
			setCountry_code((String) newValue);
			return;
		case Covid19Package.INDEX__COUNTRY_NAME:
			setCountry_name((String) newValue);
			return;
		case Covid19Package.INDEX__SUBREGION1_CODE:
			setSubregion1_code((String) newValue);
			return;
		case Covid19Package.INDEX__SUBREGION1_NAME:
			setSubregion1_name((String) newValue);
			return;
		case Covid19Package.INDEX__SUBREGION2_CODE:
			setSubregion2_code((String) newValue);
			return;
		case Covid19Package.INDEX__SUBREGION2_NAME:
			setSubregion2_name((String) newValue);
			return;
		case Covid19Package.INDEX__LOCALITY_CODE:
			setLocality_code((String) newValue);
			return;
		case Covid19Package.INDEX__LOCALITY_NAME:
			setLocality_name((String) newValue);
			return;
		case Covid19Package.INDEX__ALPHA_2:
			setAlpha_2((String) newValue);
			return;
		case Covid19Package.INDEX__ALPHA_3:
			setAlpha_3((String) newValue);
			return;
		case Covid19Package.INDEX__AGGREGATION_LEVEL:
			setAggregation_level((String) newValue);
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
		case Covid19Package.INDEX__DATACOMMONS:
			setDatacommons(DATACOMMONS_EDEFAULT);
			return;
		case Covid19Package.INDEX__COUNTRY_CODE:
			setCountry_code(COUNTRY_CODE_EDEFAULT);
			return;
		case Covid19Package.INDEX__COUNTRY_NAME:
			setCountry_name(COUNTRY_NAME_EDEFAULT);
			return;
		case Covid19Package.INDEX__SUBREGION1_CODE:
			setSubregion1_code(SUBREGION1_CODE_EDEFAULT);
			return;
		case Covid19Package.INDEX__SUBREGION1_NAME:
			setSubregion1_name(SUBREGION1_NAME_EDEFAULT);
			return;
		case Covid19Package.INDEX__SUBREGION2_CODE:
			setSubregion2_code(SUBREGION2_CODE_EDEFAULT);
			return;
		case Covid19Package.INDEX__SUBREGION2_NAME:
			setSubregion2_name(SUBREGION2_NAME_EDEFAULT);
			return;
		case Covid19Package.INDEX__LOCALITY_CODE:
			setLocality_code(LOCALITY_CODE_EDEFAULT);
			return;
		case Covid19Package.INDEX__LOCALITY_NAME:
			setLocality_name(LOCALITY_NAME_EDEFAULT);
			return;
		case Covid19Package.INDEX__ALPHA_2:
			setAlpha_2(ALPHA_2_EDEFAULT);
			return;
		case Covid19Package.INDEX__ALPHA_3:
			setAlpha_3(ALPHA_3_EDEFAULT);
			return;
		case Covid19Package.INDEX__AGGREGATION_LEVEL:
			setAggregation_level(AGGREGATION_LEVEL_EDEFAULT);
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
		case Covid19Package.INDEX__DATACOMMONS:
			return DATACOMMONS_EDEFAULT == null ? datacommons != null : !DATACOMMONS_EDEFAULT.equals(datacommons);
		case Covid19Package.INDEX__COUNTRY_CODE:
			return COUNTRY_CODE_EDEFAULT == null ? country_code != null : !COUNTRY_CODE_EDEFAULT.equals(country_code);
		case Covid19Package.INDEX__COUNTRY_NAME:
			return COUNTRY_NAME_EDEFAULT == null ? country_name != null : !COUNTRY_NAME_EDEFAULT.equals(country_name);
		case Covid19Package.INDEX__SUBREGION1_CODE:
			return SUBREGION1_CODE_EDEFAULT == null ? subregion1_code != null
					: !SUBREGION1_CODE_EDEFAULT.equals(subregion1_code);
		case Covid19Package.INDEX__SUBREGION1_NAME:
			return SUBREGION1_NAME_EDEFAULT == null ? subregion1_name != null
					: !SUBREGION1_NAME_EDEFAULT.equals(subregion1_name);
		case Covid19Package.INDEX__SUBREGION2_CODE:
			return SUBREGION2_CODE_EDEFAULT == null ? subregion2_code != null
					: !SUBREGION2_CODE_EDEFAULT.equals(subregion2_code);
		case Covid19Package.INDEX__SUBREGION2_NAME:
			return SUBREGION2_NAME_EDEFAULT == null ? subregion2_name != null
					: !SUBREGION2_NAME_EDEFAULT.equals(subregion2_name);
		case Covid19Package.INDEX__LOCALITY_CODE:
			return LOCALITY_CODE_EDEFAULT == null ? locality_code != null
					: !LOCALITY_CODE_EDEFAULT.equals(locality_code);
		case Covid19Package.INDEX__LOCALITY_NAME:
			return LOCALITY_NAME_EDEFAULT == null ? locality_name != null
					: !LOCALITY_NAME_EDEFAULT.equals(locality_name);
		case Covid19Package.INDEX__ALPHA_2:
			return ALPHA_2_EDEFAULT == null ? alpha_2 != null : !ALPHA_2_EDEFAULT.equals(alpha_2);
		case Covid19Package.INDEX__ALPHA_3:
			return ALPHA_3_EDEFAULT == null ? alpha_3 != null : !ALPHA_3_EDEFAULT.equals(alpha_3);
		case Covid19Package.INDEX__AGGREGATION_LEVEL:
			return AGGREGATION_LEVEL_EDEFAULT == null ? aggregation_level != null
					: !AGGREGATION_LEVEL_EDEFAULT.equals(aggregation_level);
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
		result.append(", datacommons: ");
		result.append(datacommons);
		result.append(", country_code: ");
		result.append(country_code);
		result.append(", country_name: ");
		result.append(country_name);
		result.append(", subregion1_code: ");
		result.append(subregion1_code);
		result.append(", subregion1_name: ");
		result.append(subregion1_name);
		result.append(", subregion2_code: ");
		result.append(subregion2_code);
		result.append(", subregion2_name: ");
		result.append(subregion2_name);
		result.append(", locality_code: ");
		result.append(locality_code);
		result.append(", locality_name: ");
		result.append(locality_name);
		result.append(", alpha_2: ");
		result.append(alpha_2);
		result.append(", alpha_3: ");
		result.append(alpha_3);
		result.append(", aggregation_level: ");
		result.append(aggregation_level);
		result.append(')');
		return result.toString();
	}

} //IndexImpl
