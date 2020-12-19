/**
 */
package se.lnu.joa.covid.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.Regression#getType <em>Type</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Regression#getDependentValue <em>Dependent Value</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Regression#getIndependentValue <em>Independent Value</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.config.ConfigPackage#getRegression()
 * @model
 * @generated
 */
public interface Regression extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.lnu.joa.covid.model.config.RegressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see se.lnu.joa.covid.model.config.RegressionType
	 * @see #setType(RegressionType)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getRegression_Type()
	 * @model
	 * @generated
	 */
	RegressionType getType();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Regression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see se.lnu.joa.covid.model.config.RegressionType
	 * @see #getType()
	 * @generated
	 */
	void setType(RegressionType value);

	/**
	 * Returns the value of the '<em><b>Dependent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Value</em>' attribute.
	 * @see #setDependentValue(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getRegression_DependentValue()
	 * @model
	 * @generated
	 */
	String getDependentValue();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Regression#getDependentValue <em>Dependent Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Value</em>' attribute.
	 * @see #getDependentValue()
	 * @generated
	 */
	void setDependentValue(String value);

	/**
	 * Returns the value of the '<em><b>Independent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Independent Value</em>' attribute.
	 * @see #setIndependentValue(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getRegression_IndependentValue()
	 * @model
	 * @generated
	 */
	String getIndependentValue();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Regression#getIndependentValue <em>Independent Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Independent Value</em>' attribute.
	 * @see #getIndependentValue()
	 * @generated
	 */
	void setIndependentValue(String value);

} // Regression
