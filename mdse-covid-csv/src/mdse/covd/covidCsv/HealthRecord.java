/**
 */
package mdse.covd.covidCsv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getKey <em>Key</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getLife_expectancy <em>Life expectancy</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getSmoking_prevalence <em>Smoking prevalence</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getDiabetes_prevalence <em>Diabetes prevalence</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getInfant_mortality_rate <em>Infant mortality rate</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getAdult_male_mortality_rate <em>Adult male mortality rate</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getAdult_female_mortality_rate <em>Adult female mortality rate</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getPollution_mortality_rate <em>Pollution mortality rate</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getComorbidity_mortality_rate <em>Comorbidity mortality rate</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getHospital_beds <em>Hospital beds</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getNurses <em>Nurses</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getPhysicians <em>Physicians</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getHealth_expenditure <em>Health expenditure</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getOut_of_pocket_health_expenditure <em>Out of pocket health expenditure</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.HealthRecord#getIndexData <em>Index Data</em>}</li>
 * </ul>
 *
 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord()
 * @model
 * @generated
 */
public interface HealthRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Key()
	 * @model id="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Life expectancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life expectancy</em>' attribute.
	 * @see #setLife_expectancy(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Life_expectancy()
	 * @model
	 * @generated
	 */
	float getLife_expectancy();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getLife_expectancy <em>Life expectancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life expectancy</em>' attribute.
	 * @see #getLife_expectancy()
	 * @generated
	 */
	void setLife_expectancy(float value);

	/**
	 * Returns the value of the '<em><b>Smoking prevalence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smoking prevalence</em>' attribute.
	 * @see #setSmoking_prevalence(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Smoking_prevalence()
	 * @model
	 * @generated
	 */
	float getSmoking_prevalence();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getSmoking_prevalence <em>Smoking prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smoking prevalence</em>' attribute.
	 * @see #getSmoking_prevalence()
	 * @generated
	 */
	void setSmoking_prevalence(float value);

	/**
	 * Returns the value of the '<em><b>Diabetes prevalence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diabetes prevalence</em>' attribute.
	 * @see #setDiabetes_prevalence(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Diabetes_prevalence()
	 * @model
	 * @generated
	 */
	float getDiabetes_prevalence();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getDiabetes_prevalence <em>Diabetes prevalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diabetes prevalence</em>' attribute.
	 * @see #getDiabetes_prevalence()
	 * @generated
	 */
	void setDiabetes_prevalence(float value);

	/**
	 * Returns the value of the '<em><b>Infant mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infant mortality rate</em>' attribute.
	 * @see #setInfant_mortality_rate(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Infant_mortality_rate()
	 * @model
	 * @generated
	 */
	float getInfant_mortality_rate();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getInfant_mortality_rate <em>Infant mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infant mortality rate</em>' attribute.
	 * @see #getInfant_mortality_rate()
	 * @generated
	 */
	void setInfant_mortality_rate(float value);

	/**
	 * Returns the value of the '<em><b>Adult male mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adult male mortality rate</em>' attribute.
	 * @see #setAdult_male_mortality_rate(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Adult_male_mortality_rate()
	 * @model
	 * @generated
	 */
	float getAdult_male_mortality_rate();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getAdult_male_mortality_rate <em>Adult male mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adult male mortality rate</em>' attribute.
	 * @see #getAdult_male_mortality_rate()
	 * @generated
	 */
	void setAdult_male_mortality_rate(float value);

	/**
	 * Returns the value of the '<em><b>Adult female mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adult female mortality rate</em>' attribute.
	 * @see #setAdult_female_mortality_rate(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Adult_female_mortality_rate()
	 * @model
	 * @generated
	 */
	float getAdult_female_mortality_rate();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getAdult_female_mortality_rate <em>Adult female mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adult female mortality rate</em>' attribute.
	 * @see #getAdult_female_mortality_rate()
	 * @generated
	 */
	void setAdult_female_mortality_rate(float value);

	/**
	 * Returns the value of the '<em><b>Pollution mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pollution mortality rate</em>' attribute.
	 * @see #setPollution_mortality_rate(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Pollution_mortality_rate()
	 * @model
	 * @generated
	 */
	float getPollution_mortality_rate();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getPollution_mortality_rate <em>Pollution mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pollution mortality rate</em>' attribute.
	 * @see #getPollution_mortality_rate()
	 * @generated
	 */
	void setPollution_mortality_rate(float value);

	/**
	 * Returns the value of the '<em><b>Comorbidity mortality rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comorbidity mortality rate</em>' attribute.
	 * @see #setComorbidity_mortality_rate(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Comorbidity_mortality_rate()
	 * @model
	 * @generated
	 */
	float getComorbidity_mortality_rate();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getComorbidity_mortality_rate <em>Comorbidity mortality rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comorbidity mortality rate</em>' attribute.
	 * @see #getComorbidity_mortality_rate()
	 * @generated
	 */
	void setComorbidity_mortality_rate(float value);

	/**
	 * Returns the value of the '<em><b>Hospital beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospital beds</em>' attribute.
	 * @see #setHospital_beds(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Hospital_beds()
	 * @model
	 * @generated
	 */
	float getHospital_beds();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getHospital_beds <em>Hospital beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospital beds</em>' attribute.
	 * @see #getHospital_beds()
	 * @generated
	 */
	void setHospital_beds(float value);

	/**
	 * Returns the value of the '<em><b>Nurses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nurses</em>' attribute.
	 * @see #setNurses(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Nurses()
	 * @model
	 * @generated
	 */
	float getNurses();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getNurses <em>Nurses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nurses</em>' attribute.
	 * @see #getNurses()
	 * @generated
	 */
	void setNurses(float value);

	/**
	 * Returns the value of the '<em><b>Physicians</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicians</em>' attribute.
	 * @see #setPhysicians(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Physicians()
	 * @model
	 * @generated
	 */
	float getPhysicians();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getPhysicians <em>Physicians</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicians</em>' attribute.
	 * @see #getPhysicians()
	 * @generated
	 */
	void setPhysicians(float value);

	/**
	 * Returns the value of the '<em><b>Health expenditure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health expenditure</em>' attribute.
	 * @see #setHealth_expenditure(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Health_expenditure()
	 * @model
	 * @generated
	 */
	float getHealth_expenditure();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getHealth_expenditure <em>Health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health expenditure</em>' attribute.
	 * @see #getHealth_expenditure()
	 * @generated
	 */
	void setHealth_expenditure(float value);

	/**
	 * Returns the value of the '<em><b>Out of pocket health expenditure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out of pocket health expenditure</em>' attribute.
	 * @see #setOut_of_pocket_health_expenditure(float)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_Out_of_pocket_health_expenditure()
	 * @model
	 * @generated
	 */
	float getOut_of_pocket_health_expenditure();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getOut_of_pocket_health_expenditure <em>Out of pocket health expenditure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out of pocket health expenditure</em>' attribute.
	 * @see #getOut_of_pocket_health_expenditure()
	 * @generated
	 */
	void setOut_of_pocket_health_expenditure(float value);

	/**
	 * Returns the value of the '<em><b>Index Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Data</em>' reference.
	 * @see #setIndexData(IndexData)
	 * @see mdse.covd.covidCsv.covidPackage#getHealthRecord_IndexData()
	 * @model
	 * @generated
	 */
	IndexData getIndexData();

	/**
	 * Sets the value of the '{@link mdse.covd.covidCsv.HealthRecord#getIndexData <em>Index Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Data</em>' reference.
	 * @see #getIndexData()
	 * @generated
	 */
	void setIndexData(IndexData value);

} // HealthRecord
