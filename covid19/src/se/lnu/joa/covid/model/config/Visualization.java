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
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getYAxis <em>YAxis</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getColor <em>Color</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getTitle <em>Title</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getSubTitle <em>Sub Title</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getYAxisLabel <em>YAxis Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getColorLabel <em>Color Label</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.config.Visualization#getCaption <em>Caption</em>}</li>
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
	 * Returns the value of the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis</em>' attribute.
	 * @see #setXAxis(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_XAxis()
	 * @model
	 * @generated
	 */
	String getXAxis();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getXAxis <em>XAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis</em>' attribute.
	 * @see #getXAxis()
	 * @generated
	 */
	void setXAxis(String value);

	/**
	 * Returns the value of the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis</em>' attribute.
	 * @see #setYAxis(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_YAxis()
	 * @model
	 * @generated
	 */
	String getYAxis();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getYAxis <em>YAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis</em>' attribute.
	 * @see #getYAxis()
	 * @generated
	 */
	void setYAxis(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getTitle <em>Title</em>}' attribute.
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
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_SubTitle()
	 * @model
	 * @generated
	 */
	String getSubTitle();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getSubTitle <em>Sub Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Title</em>' attribute.
	 * @see #getSubTitle()
	 * @generated
	 */
	void setSubTitle(String value);

	/**
	 * Returns the value of the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis Label</em>' attribute.
	 * @see #setXAxisLabel(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_XAxisLabel()
	 * @model
	 * @generated
	 */
	String getXAxisLabel();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getXAxisLabel <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis Label</em>' attribute.
	 * @see #getXAxisLabel()
	 * @generated
	 */
	void setXAxisLabel(String value);

	/**
	 * Returns the value of the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis Label</em>' attribute.
	 * @see #setYAxisLabel(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_YAxisLabel()
	 * @model
	 * @generated
	 */
	String getYAxisLabel();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getYAxisLabel <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis Label</em>' attribute.
	 * @see #getYAxisLabel()
	 * @generated
	 */
	void setYAxisLabel(String value);

	/**
	 * Returns the value of the '<em><b>Color Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Label</em>' attribute.
	 * @see #setColorLabel(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_ColorLabel()
	 * @model
	 * @generated
	 */
	String getColorLabel();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getColorLabel <em>Color Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Label</em>' attribute.
	 * @see #getColorLabel()
	 * @generated
	 */
	void setColorLabel(String value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see se.lnu.joa.covid.model.config.ConfigPackage#getVisualization_Caption()
	 * @model
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.config.Visualization#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);

} // Visualization
