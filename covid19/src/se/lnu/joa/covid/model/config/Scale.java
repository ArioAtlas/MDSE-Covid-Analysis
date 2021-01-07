/**
 */
package se.lnu.joa.covid.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.Scale#getType <em>Type</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Scale#getFormat <em>Format</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Scale#getBreaks <em>Breaks</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.config.ConfigPackage#getScale()
 * @model
 * @generated
 */
public interface Scale extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.lnu.joa.covid.model.config.ScaleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see se.lnu.joa.covid.model.config.ScaleType
	 * @see #setType(ScaleType)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getScale_Type()
	 * @model
	 * @generated
	 */
	ScaleType getType();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Scale#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see se.lnu.joa.covid.model.config.ScaleType
	 * @see #getType()
	 * @generated
	 */
	void setType(ScaleType value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getScale_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Scale#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Breaks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breaks</em>' attribute.
	 * @see #setBreaks(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getScale_Breaks()
	 * @model
	 * @generated
	 */
	String getBreaks();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Scale#getBreaks <em>Breaks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breaks</em>' attribute.
	 * @see #getBreaks()
	 * @generated
	 */
	void setBreaks(String value);

} // Scale
