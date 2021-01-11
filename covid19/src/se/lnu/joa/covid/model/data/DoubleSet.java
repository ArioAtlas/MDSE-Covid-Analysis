/**
 */
package se.lnu.joa.covid.model.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.data.DoubleSet#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.data.DataPackage#getDoubleSet()
 * @model
 * @generated
 */
public interface DoubleSet extends DataSet {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see se.lnu.joa.covid.model.data.DataPackage#getDoubleSet_Values()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getValues();

} // DoubleSet
