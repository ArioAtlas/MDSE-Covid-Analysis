/**
 */
package se.lnu.joa.covid.model.analysis;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Animation</b></em>' containment reference list.
	 * The list contents are of type {@link se.lnu.joa.covid.model.analysis.Animation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation</em>' containment reference list.
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getScatterPlot_Animation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Animation> getAnimation();

} // ScatterPlot
