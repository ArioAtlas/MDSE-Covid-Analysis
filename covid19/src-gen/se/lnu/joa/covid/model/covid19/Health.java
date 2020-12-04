/**
 */
package se.lnu.joa.covid.model.covid19;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Health#getLife_expectancy <em>Life expectancy</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Health#getSmoking_prevalence <em>Smoking prevalence</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getHealth()
 * @model
 * @generated
 */
public interface Health extends DataRecord {
	/**
	 * Returns the value of the '<em><b>Life expectancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life expectancy</em>' attribute.
	 * @see #setLife_expectancy(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getHealth_Life_expectancy()
	 * @model
	 * @generated
	 */
	String getLife_expectancy();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Health#getLife_expectancy <em>Life expectancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life expectancy</em>' attribute.
	 * @see #getLife_expectancy()
	 * @generated
	 */
	void setLife_expectancy(String value);

	/**
	 * Returns the value of the '<em><b>Smoking prevalence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smoking prevalence</em>' attribute.
	 * @see #setSmoking_prevalence(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getHealth_Smoking_prevalence()
	 * @model
	 * @generated
	 */
	String getSmoking_prevalence();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Health#getSmoking_prevalence <em>Smoking prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smoking prevalence</em>' attribute.
	 * @see #getSmoking_prevalence()
	 * @generated
	 */
	void setSmoking_prevalence(String value);

} // Health
