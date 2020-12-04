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
 *   <li>{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_confirmed <em>New confirmed</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_deceased <em>New deceased</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology()
 * @model
 * @generated
 */
public interface Epidemiology extends DataRecord {
	/**
	 * Returns the value of the '<em><b>New confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New confirmed</em>' attribute.
	 * @see #setNew_confirmed(int)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology_New_confirmed()
	 * @model
	 * @generated
	 */
	int getNew_confirmed();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_confirmed <em>New confirmed</em>}' attribute.
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
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getEpidemiology_New_deceased()
	 * @model
	 * @generated
	 */
	int getNew_deceased();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Epidemiology#getNew_deceased <em>New deceased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New deceased</em>' attribute.
	 * @see #getNew_deceased()
	 * @generated
	 */
	void setNew_deceased(int value);

} // Epidemiology
