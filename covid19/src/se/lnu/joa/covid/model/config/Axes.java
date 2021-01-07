/**
 */
package se.lnu.joa.covid.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.Axes#getX <em>X</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Axes#getY <em>Y</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Axes#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.config.ConfigPackage#getAxes()
 * @model
 * @generated
 */
public interface Axes extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(Axis)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getAxes_X()
	 * @model containment="true"
	 * @generated
	 */
	Axis getX();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Axes#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Axis value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(Axis)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getAxes_Y()
	 * @model containment="true"
	 * @generated
	 */
	Axis getY();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Axes#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(Axis value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(Axis)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getAxes_Z()
	 * @model containment="true"
	 * @generated
	 */
	Axis getZ();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Axes#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(Axis value);

} // Axes
