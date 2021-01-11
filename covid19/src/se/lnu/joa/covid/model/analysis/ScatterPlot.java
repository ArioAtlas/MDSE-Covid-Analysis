/**
 */
package se.lnu.joa.covid.model.analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scatter Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.ScatterPlot#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.ScatterPlot#getStroke <em>Stroke</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.ScatterPlot#getAnimation <em>Animation</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.ScatterPlot#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getScatterPlot()
 * @model
 * @generated
 */
public interface ScatterPlot extends Visualization {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(float)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getScatterPlot_Alpha()
	 * @model
	 * @generated
	 */
	float getAlpha();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.ScatterPlot#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(float value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' attribute.
	 * @see #setStroke(float)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getScatterPlot_Stroke()
	 * @model
	 * @generated
	 */
	float getStroke();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.ScatterPlot#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' attribute.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(float value);

	/**
	 * Returns the value of the '<em><b>Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation</em>' containment reference.
	 * @see #setAnimation(Animation)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getScatterPlot_Animation()
	 * @model containment="true"
	 * @generated
	 */
	Animation getAnimation();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.ScatterPlot#getAnimation <em>Animation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation</em>' containment reference.
	 * @see #getAnimation()
	 * @generated
	 */
	void setAnimation(Animation value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getScatterPlot_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.ScatterPlot#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

} // ScatterPlot
