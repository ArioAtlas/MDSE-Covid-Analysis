/**
 */
package mdse.covd.covidCsv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mdse.covd.covidCsv.covidPackage
 * @generated
 */
public interface covidFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	covidFactory eINSTANCE = mdse.covd.covidCsv.impl.covidFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Health Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Record</em>'.
	 * @generated
	 */
	HealthRecord createHealthRecord();

	/**
	 * Returns a new object of class '<em>Index Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Data</em>'.
	 * @generated
	 */
	IndexData createIndexData();

	/**
	 * Returns a new object of class '<em>Epidemiology Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Epidemiology Record</em>'.
	 * @generated
	 */
	EpidemiologyRecord createEpidemiologyRecord();

	/**
	 * Returns a new object of class '<em>Data Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Pool</em>'.
	 * @generated
	 */
	DataPool createDataPool();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	covidPackage getcovidPackage();

} //covidFactory
