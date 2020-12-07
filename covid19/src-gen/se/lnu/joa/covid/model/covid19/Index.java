/**
 */
package se.lnu.joa.covid.model.covid19;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.covid19.Index#getWikidata <em>Wikidata</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getIndex()
 * @model
 * @generated
 */
public interface Index extends DataRecord {
	/**
	 * Returns the value of the '<em><b>Wikidata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wikidata</em>' attribute.
	 * @see #setWikidata(String)
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getIndex_Wikidata()
	 * @model
	 * @generated
	 */
	String getWikidata();

	/**
	 * Sets the value of the '{@link se.lnu.joa.covid.model.covid19.Index#getWikidata <em>Wikidata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wikidata</em>' attribute.
	 * @see #getWikidata()
	 * @generated
	 */
	void setWikidata(String value);

} // Index
