/**
 */
package se.lnu.joa.covid.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.config.VisualizationInfo#getTitle <em>Title</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.VisualizationInfo#getSubTitle <em>Sub Title</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.VisualizationInfo#getCaption <em>Caption</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualizationInfo()
 * @model
 * @generated
 */
public interface VisualizationInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualizationInfo_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.VisualizationInfo#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Sub Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Title</em>' attribute.
	 * @see #setSubTitle(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualizationInfo_SubTitle()
	 * @model
	 * @generated
	 */
	String getSubTitle();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.VisualizationInfo#getSubTitle <em>Sub Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Title</em>' attribute.
	 * @see #getSubTitle()
	 * @generated
	 */
	void setSubTitle(String value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualizationInfo_Caption()
	 * @model
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.VisualizationInfo#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);

} // VisualizationInfo
