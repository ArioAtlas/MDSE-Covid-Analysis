/**
 */
package se.lnu.joa.covid.model.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Epidemiology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.data.Epidemiology#getDate <em>Date</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Epidemiology#getNew_confirmed <em>New confirmed</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Epidemiology#getNew_deceased <em>New deceased</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Epidemiology#getNew_recovered <em>New recovered</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Epidemiology#getNew_tested <em>New tested</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Epidemiology#getTotal_confirmed <em>Total confirmed</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Epidemiology#getTotal_deceased <em>Total deceased</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Epidemiology#getTotal_recovered <em>Total recovered</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Epidemiology#getTotal_tested <em>Total tested</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.data.DataPackage#getEpidemiology()
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
	 * @see se.lnu.joa.covid.model.data.DataPackage#getEpidemiology_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Epidemiology#getDate <em>Date</em>}' attribute.
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
	 * @see #setNew_confirmed(int)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getEpidemiology_New_confirmed()
	 * @model
	 * @generated
	 */
	int getNew_confirmed();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Epidemiology#getNew_confirmed <em>New confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New confirmed</em>' attribute.
	 * @see #getNew_confirmed()
	 * @generated
	 */
	void setNew_confirmed(int value);

	/**
	 * Returns the value of the '<em><b>New deceased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New deceased</em>' attribute.
	 * @see #setNew_deceased(int)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getEpidemiology_New_deceased()
	 * @model
	 * @generated
	 */
	int getNew_deceased();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Epidemiology#getNew_deceased <em>New deceased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New deceased</em>' attribute.
	 * @see #getNew_deceased()
	 * @generated
	 */
	void setNew_deceased(int value);

	/**
	 * Returns the value of the '<em><b>New recovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New recovered</em>' attribute.
	 * @see #setNew_recovered(int)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getEpidemiology_New_recovered()
	 * @model
	 * @generated
	 */
	int getNew_recovered();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Epidemiology#getNew_recovered <em>New recovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New recovered</em>' attribute.
	 * @see #getNew_recovered()
	 * @generated
	 */
	void setNew_recovered(int value);

	/**
	 * Returns the value of the '<em><b>New tested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New tested</em>' attribute.
	 * @see #setNew_tested(int)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getEpidemiology_New_tested()
	 * @model
	 * @generated
	 */
	int getNew_tested();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Epidemiology#getNew_tested <em>New tested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New tested</em>' attribute.
	 * @see #getNew_tested()
	 * @generated
	 */
	void setNew_tested(int value);

	/**
	 * Returns the value of the '<em><b>Total confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total confirmed</em>' attribute.
	 * @see #setTotal_confirmed(int)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getEpidemiology_Total_confirmed()
	 * @model
	 * @generated
	 */
	int getTotal_confirmed();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Epidemiology#getTotal_confirmed <em>Total confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total confirmed</em>' attribute.
	 * @see #getTotal_confirmed()
	 * @generated
	 */
	void setTotal_confirmed(int value);

	/**
	 * Returns the value of the '<em><b>Total deceased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total deceased</em>' attribute.
	 * @see #setTotal_deceased(int)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getEpidemiology_Total_deceased()
	 * @model
	 * @generated
	 */
	int getTotal_deceased();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Epidemiology#getTotal_deceased <em>Total deceased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total deceased</em>' attribute.
	 * @see #getTotal_deceased()
	 * @generated
	 */
	void setTotal_deceased(int value);

	/**
	 * Returns the value of the '<em><b>Total recovered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total recovered</em>' attribute.
	 * @see #setTotal_recovered(int)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getEpidemiology_Total_recovered()
	 * @model
	 * @generated
	 */
	int getTotal_recovered();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Epidemiology#getTotal_recovered <em>Total recovered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total recovered</em>' attribute.
	 * @see #getTotal_recovered()
	 * @generated
	 */
	void setTotal_recovered(int value);

	/**
	 * Returns the value of the '<em><b>Total tested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total tested</em>' attribute.
	 * @see #setTotal_tested(int)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getEpidemiology_Total_tested()
	 * @model
	 * @generated
	 */
	int getTotal_tested();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Epidemiology#getTotal_tested <em>Total tested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total tested</em>' attribute.
	 * @see #getTotal_tested()
	 * @generated
	 */
	void setTotal_tested(int value);

} // Epidemiology
