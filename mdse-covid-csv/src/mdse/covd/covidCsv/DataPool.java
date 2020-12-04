/**
 */
package mdse.covd.covidCsv;

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
 *   <li>{@link mdse.covd.covidCsv.DataPool#getHealthData <em>Health Data</em>}</li>
 *   <li>{@link mdse.covd.covidCsv.DataPool#getEpidemiologyData <em>Epidemiology Data</em>}</li>
 * </ul>
 *
 * @see mdse.covd.covidCsv.covidPackage#getDataPool()
 * @model
 * @generated
 */
public interface DataPool extends EObject {
	/**
	 * Returns the value of the '<em><b>Health Data</b></em>' containment reference list.
	 * The list contents are of type {@link mdse.covd.covidCsv.HealthRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Data</em>' containment reference list.
	 * @see mdse.covd.covidCsv.covidPackage#getDataPool_HealthData()
	 * @model containment="true"
	 * @generated
	 */
	EList<HealthRecord> getHealthData();

	/**
	 * Returns the value of the '<em><b>Epidemiology Data</b></em>' containment reference list.
	 * The list contents are of type {@link mdse.covd.covidCsv.EpidemiologyRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epidemiology Data</em>' containment reference list.
	 * @see mdse.covd.covidCsv.covidPackage#getDataPool_EpidemiologyData()
	 * @model containment="true"
	 * @generated
	 */
	EList<EpidemiologyRecord> getEpidemiologyData();

} // DataPool
