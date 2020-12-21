/**
 */
package se.lnu.joa.covid.model.analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Scale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.analysis.DateScale#getFormat <em>Format</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.analysis.DateScale#getBreaks <em>Breaks</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getDateScale()
 * @model
 * @generated
 */
public interface DateScale extends Scale {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getDateScale_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.DateScale#getFormat <em>Format</em>}' attribute.
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
	 * @see se.lnu.joa.covid.model.analysis.AnalysisPackage#getDateScale_Breaks()
	 * @model
	 * @generated
	 */
	String getBreaks();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.analysis.DateScale#getBreaks <em>Breaks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breaks</em>' attribute.
	 * @see #getBreaks()
	 * @generated
	 */
	void setBreaks(String value);

} // DateScale
