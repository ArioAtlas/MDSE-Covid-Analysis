/**
 */
package se.lnu.joa.covid.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getType <em>Type</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getAxes <em>Axes</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getInfo <em>Info</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization()
 * @model
 * @generated
 */
public interface Visualization extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.lnu.joa.covid.model.config.VisualizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see se.lnu.joa.covid.model.config.VisualizationType
	 * @see #setType(VisualizationType)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_Type()
	 * @model
	 * @generated
	 */
	VisualizationType getType();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see se.lnu.joa.covid.model.config.VisualizationType
	 * @see #getType()
	 * @generated
	 */
	void setType(VisualizationType value);

	/**
	 * Returns the value of the '<em><b>Axes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axes</em>' containment reference.
	 * @see #setAxes(Axes)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_Axes()
	 * @model containment="true"
	 * @generated
	 */
	Axes getAxes();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getAxes <em>Axes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axes</em>' containment reference.
	 * @see #getAxes()
	 * @generated
	 */
	void setAxes(Axes value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(VisualizationInfo)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_Info()
	 * @model containment="true"
	 * @generated
	 */
	VisualizationInfo getInfo();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(VisualizationInfo value);

} // Visualization
