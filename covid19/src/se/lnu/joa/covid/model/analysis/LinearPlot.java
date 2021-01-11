/**
 */
package se.lnu.joa.covid.model.analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.LinearPlot#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.LinearPlot#getLineAlpha <em>Line Alpha</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.LinearPlot#getAnimation <em>Animation</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getLinearPlot()
 * @model
 * @generated
 */
public interface LinearPlot extends Visualization {
	/**
	 * Returns the value of the '<em><b>Line Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Size</em>' attribute.
	 * @see #setLineSize(float)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getLinearPlot_LineSize()
	 * @model
	 * @generated
	 */
	float getLineSize();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.LinearPlot#getLineSize <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Size</em>' attribute.
	 * @see #getLineSize()
	 * @generated
	 */
	void setLineSize(float value);

	/**
	 * Returns the value of the '<em><b>Line Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Alpha</em>' attribute.
	 * @see #setLineAlpha(float)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getLinearPlot_LineAlpha()
	 * @model
	 * @generated
	 */
	float getLineAlpha();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.LinearPlot#getLineAlpha <em>Line Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Alpha</em>' attribute.
	 * @see #getLineAlpha()
	 * @generated
	 */
	void setLineAlpha(float value);

	/**
	 * Returns the value of the '<em><b>Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation</em>' containment reference.
	 * @see #setAnimation(Animation)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getLinearPlot_Animation()
	 * @model containment="true"
	 * @generated
	 */
	Animation getAnimation();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.LinearPlot#getAnimation <em>Animation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation</em>' containment reference.
	 * @see #getAnimation()
	 * @generated
	 */
	void setAnimation(Animation value);

} // LinearPlot
