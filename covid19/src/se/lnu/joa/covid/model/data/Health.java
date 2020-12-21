/**
 */
package se.lnu.joa.covid.model.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getLife_expectancy <em>Life expectancy</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getSmoking_prevalence <em>Smoking prevalence</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getDiabetes_prevalence <em>Diabetes prevalence</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getInfant_mortality_rate <em>Infant mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getAdult_male_mortality_rate <em>Adult male mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getAdult_female_mortality_rate <em>Adult female mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getPollution_mortality_rate <em>Pollution mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getComorbidity_mortality_rate <em>Comorbidity mortality rate</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getHospital_beds <em>Hospital beds</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getNurses <em>Nurses</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getPhysicians <em>Physicians</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getHealth_expenditure <em>Health expenditure</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.data.Health#getOut_of_pocket_health_expenditure <em>Out of pocket health expenditure</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth()
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
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Life_expectancy()
	 * @model
	 * @generated
	 */
	String getLife_expectancy();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getLife_expectancy <em>Life expectancy</em>}' attribute.
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
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Smoking_prevalence()
	 * @model
	 * @generated
	 */
	String getSmoking_prevalence();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getSmoking_prevalence <em>Smoking prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smoking prevalence</em>' attribute.
	 * @see #getSmoking_prevalence()
	 * @generated
	 */
	void setSmoking_prevalence(String value);

	/**
	 * Returns the value of the '<em><b>Diabetes prevalence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diabetes prevalence</em>' attribute.
	 * @see #setDiabetes_prevalence(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Diabetes_prevalence()
	 * @model
	 * @generated
	 */
	String getDiabetes_prevalence();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getDiabetes_prevalence <em>Diabetes prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diabetes prevalence</em>' attribute.
	 * @see #getDiabetes_prevalence()
	 * @generated
	 */
	void setDiabetes_prevalence(String value);

	/**
	 * Returns the value of the '<em><b>Infant mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infant mortality rate</em>' attribute.
	 * @see #setInfant_mortality_rate(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Infant_mortality_rate()
	 * @model
	 * @generated
	 */
	String getInfant_mortality_rate();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getInfant_mortality_rate <em>Infant mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infant mortality rate</em>' attribute.
	 * @see #getInfant_mortality_rate()
	 * @generated
	 */
	void setInfant_mortality_rate(String value);

	/**
	 * Returns the value of the '<em><b>Adult male mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adult male mortality rate</em>' attribute.
	 * @see #setAdult_male_mortality_rate(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Adult_male_mortality_rate()
	 * @model
	 * @generated
	 */
	String getAdult_male_mortality_rate();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getAdult_male_mortality_rate <em>Adult male mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adult male mortality rate</em>' attribute.
	 * @see #getAdult_male_mortality_rate()
	 * @generated
	 */
	void setAdult_male_mortality_rate(String value);

	/**
	 * Returns the value of the '<em><b>Adult female mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adult female mortality rate</em>' attribute.
	 * @see #setAdult_female_mortality_rate(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Adult_female_mortality_rate()
	 * @model
	 * @generated
	 */
	String getAdult_female_mortality_rate();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getAdult_female_mortality_rate <em>Adult female mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adult female mortality rate</em>' attribute.
	 * @see #getAdult_female_mortality_rate()
	 * @generated
	 */
	void setAdult_female_mortality_rate(String value);

	/**
	 * Returns the value of the '<em><b>Pollution mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pollution mortality rate</em>' attribute.
	 * @see #setPollution_mortality_rate(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Pollution_mortality_rate()
	 * @model
	 * @generated
	 */
	String getPollution_mortality_rate();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getPollution_mortality_rate <em>Pollution mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pollution mortality rate</em>' attribute.
	 * @see #getPollution_mortality_rate()
	 * @generated
	 */
	void setPollution_mortality_rate(String value);

	/**
	 * Returns the value of the '<em><b>Comorbidity mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comorbidity mortality rate</em>' attribute.
	 * @see #setComorbidity_mortality_rate(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Comorbidity_mortality_rate()
	 * @model
	 * @generated
	 */
	String getComorbidity_mortality_rate();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getComorbidity_mortality_rate <em>Comorbidity mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comorbidity mortality rate</em>' attribute.
	 * @see #getComorbidity_mortality_rate()
	 * @generated
	 */
	void setComorbidity_mortality_rate(String value);

	/**
	 * Returns the value of the '<em><b>Hospital beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospital beds</em>' attribute.
	 * @see #setHospital_beds(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Hospital_beds()
	 * @model
	 * @generated
	 */
	String getHospital_beds();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getHospital_beds <em>Hospital beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospital beds</em>' attribute.
	 * @see #getHospital_beds()
	 * @generated
	 */
	void setHospital_beds(String value);

	/**
	 * Returns the value of the '<em><b>Nurses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nurses</em>' attribute.
	 * @see #setNurses(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Nurses()
	 * @model
	 * @generated
	 */
	String getNurses();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getNurses <em>Nurses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nurses</em>' attribute.
	 * @see #getNurses()
	 * @generated
	 */
	void setNurses(String value);

	/**
	 * Returns the value of the '<em><b>Physicians</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicians</em>' attribute.
	 * @see #setPhysicians(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Physicians()
	 * @model
	 * @generated
	 */
	String getPhysicians();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getPhysicians <em>Physicians</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicians</em>' attribute.
	 * @see #getPhysicians()
	 * @generated
	 */
	void setPhysicians(String value);

	/**
	 * Returns the value of the '<em><b>Health expenditure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health expenditure</em>' attribute.
	 * @see #setHealth_expenditure(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Health_expenditure()
	 * @model
	 * @generated
	 */
	String getHealth_expenditure();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getHealth_expenditure <em>Health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health expenditure</em>' attribute.
	 * @see #getHealth_expenditure()
	 * @generated
	 */
	void setHealth_expenditure(String value);

	/**
	 * Returns the value of the '<em><b>Out of pocket health expenditure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out of pocket health expenditure</em>' attribute.
	 * @see #setOut_of_pocket_health_expenditure(String)
	 * @see se.lnu.joa.covid.model.data.DataPackage#getHealth_Out_of_pocket_health_expenditure()
	 * @model
	 * @generated
	 */
	String getOut_of_pocket_health_expenditure();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.data.Health#getOut_of_pocket_health_expenditure <em>Out of pocket health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out of pocket health expenditure</em>' attribute.
	 * @see #getOut_of_pocket_health_expenditure()
	 * @generated
	 */
	void setOut_of_pocket_health_expenditure(String value);

} // Health
