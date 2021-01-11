/**
 */
package se.lnu.joa.covid.model.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.data.IntSet#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.data.DataPackage#getIntSet()
 * @model
 * @generated
 */
public interface IntSet extends DataSet {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see se.lnu.joa.covid.model.data.DataPackage#getIntSet_Values()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getValues();

} // IntSet
