/**
 */
package se.lnu.joa.covid.model.covid19;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.lnu.joa.covid.model.covid19.DataPool#getHealthData <em>Health Data</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.DataPool#getEpidemiologyData <em>Epidemiology Data</em>}</li>
 *   <li>{@link se.lnu.joa.covid.model.covid19.DataPool#getIndexData <em>Index Data</em>}</li>
 * </ul>
 *
 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getDataPool()
 * @model
 * @generated
 */
public interface DataPool extends EObject {
	/**
	 * Returns the value of the '<em><b>Health Data</b></em>' containment reference list.
	 * The list contents are of type {@link se.lnu.joa.covid.model.covid19.Health}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Data</em>' containment reference list.
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getDataPool_HealthData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Health> getHealthData();

	/**
	 * Returns the value of the '<em><b>Epidemiology Data</b></em>' containment reference list.
	 * The list contents are of type {@link se.lnu.joa.covid.model.covid19.Epidemiology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epidemiology Data</em>' containment reference list.
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getDataPool_EpidemiologyData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Epidemiology> getEpidemiologyData();

	/**
	 * Returns the value of the '<em><b>Index Data</b></em>' containment reference list.
	 * The list contents are of type {@link se.lnu.joa.covid.model.covid19.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Data</em>' containment reference list.
	 * @see se.lnu.joa.covid.model.covid19.Covid19Package#getDataPool_IndexData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getIndexData();

} // DataPool
