/**
 */
package se.lnu.joa.covid.model.data;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.data.DateSet#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.data.DataPackage#getDateSet()
 * @model
 * @generated
 */
public interface DateSet extends DataSet {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Date}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see se.lnu.joa.covid.model.data.DataPackage#getDateSet_Values()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<Date> getValues();

} // DateSet
