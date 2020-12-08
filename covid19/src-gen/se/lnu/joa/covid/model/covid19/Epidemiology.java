/**
 */
package se.lnu.joa.covid.model.covid19;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Epidemiology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Epidemiology#getDate <em>Date</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_confirmed <em>New confirmed</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_deceased <em>New deceased</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_recovered <em>New recovered</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_tested <em>New tested</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_confirmed <em>Total confirmed</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_deceased <em>Total deceased</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_recovered <em>Total recovered</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_tested <em>Total tested</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology()
 * @model
 * @generated
 */
public interface Epidemiology extends DataRecord {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>New confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New confirmed</em>' attribute.
	 * @see #setNew_confirmed(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology_New_confirmed()
	 * @model
	 * @generated
	 */
	String getNew_confirmed();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_confirmed <em>New confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New confirmed</em>' attribute.
	 * @see #getNew_confirmed()
	 * @generated
	 */
	void setNew_confirmed(String value);

	/**
	 * Returns the value of the '<em><b>New deceased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New deceased</em>' attribute.
	 * @see #setNew_deceased(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology_New_deceased()
	 * @model
	 * @generated
	 */
	String getNew_deceased();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_deceased <em>New deceased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New deceased</em>' attribute.
	 * @see #getNew_deceased()
	 * @generated
	 */
	void setNew_deceased(String value);

	/**
	 * Returns the value of the '<em><b>New recovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New recovered</em>' attribute.
	 * @see #setNew_recovered(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology_New_recovered()
	 * @model
	 * @generated
	 */
	String getNew_recovered();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_recovered <em>New recovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New recovered</em>' attribute.
	 * @see #getNew_recovered()
	 * @generated
	 */
	void setNew_recovered(String value);

	/**
	 * Returns the value of the '<em><b>New tested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New tested</em>' attribute.
	 * @see #setNew_tested(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology_New_tested()
	 * @model
	 * @generated
	 */
	String getNew_tested();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_tested <em>New tested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New tested</em>' attribute.
	 * @see #getNew_tested()
	 * @generated
	 */
	void setNew_tested(String value);

	/**
	 * Returns the value of the '<em><b>Total confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total confirmed</em>' attribute.
	 * @see #setTotal_confirmed(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology_Total_confirmed()
	 * @model
	 * @generated
	 */
	String getTotal_confirmed();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_confirmed <em>Total confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total confirmed</em>' attribute.
	 * @see #getTotal_confirmed()
	 * @generated
	 */
	void setTotal_confirmed(String value);

	/**
	 * Returns the value of the '<em><b>Total deceased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total deceased</em>' attribute.
	 * @see #setTotal_deceased(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology_Total_deceased()
	 * @model
	 * @generated
	 */
	String getTotal_deceased();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_deceased <em>Total deceased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total deceased</em>' attribute.
	 * @see #getTotal_deceased()
	 * @generated
	 */
	void setTotal_deceased(String value);

	/**
	 * Returns the value of the '<em><b>Total recovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total recovered</em>' attribute.
	 * @see #setTotal_recovered(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology_Total_recovered()
	 * @model
	 * @generated
	 */
	String getTotal_recovered();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_recovered <em>Total recovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total recovered</em>' attribute.
	 * @see #getTotal_recovered()
	 * @generated
	 */
	void setTotal_recovered(String value);

	/**
	 * Returns the value of the '<em><b>Total tested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total tested</em>' attribute.
	 * @see #setTotal_tested(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology_Total_tested()
	 * @model
	 * @generated
	 */
	String getTotal_tested();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getTotal_tested <em>Total tested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total tested</em>' attribute.
	 * @see #getTotal_tested()
	 * @generated
	 */
	void setTotal_tested(String value);

} // Epidemiology
