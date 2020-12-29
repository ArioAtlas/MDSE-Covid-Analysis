/**
 */
package se.lnu.joa.covid.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.Config#getSource <em>Source</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Config#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Config#getRegression <em>Regression</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Config#getAnimation <em>Animation</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.config.ConfigPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(DataModel)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getConfig_Source()
	 * @model containment="true"
	 * @generated
	 */
	DataModel getSource();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Config#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DataModel value);

	/**
	 * Returns the value of the '<em><b>Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization</em>' containment reference.
	 * @see #setVisualization(Visualization)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getConfig_Visualization()
	 * @model containment="true"
	 * @generated
	 */
	Visualization getVisualization();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Config#getVisualization <em>Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualization</em>' containment reference.
	 * @see #getVisualization()
	 * @generated
	 */
	void setVisualization(Visualization value);

	/**
	 * Returns the value of the '<em><b>Regression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regression</em>' containment reference.
	 * @see #setRegression(Regression)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getConfig_Regression()
	 * @model containment="true"
	 * @generated
	 */
	Regression getRegression();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Config#getRegression <em>Regression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regression</em>' containment reference.
	 * @see #getRegression()
	 * @generated
	 */
	void setRegression(Regression value);

	/**
	 * Returns the value of the '<em><b>Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation</em>' containment reference.
	 * @see #setAnimation(Animation)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getConfig_Animation()
	 * @model containment="true"
	 * @generated
	 */
	Animation getAnimation();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Config#getAnimation <em>Animation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation</em>' containment reference.
	 * @see #getAnimation()
	 * @generated
	 */
	void setAnimation(Animation value);

} // Config
