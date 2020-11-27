/**
 */
package mdse-covid-csv.covidCsv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mdse-covid-csv.covidCsv.CovidCsvPackage
 * @generated
 */
public interface CovidCsvFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CovidCsvFactory eINSTANCE = mdse-covid-csv.covidCsv.impl.CovidCsvFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Health Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Data</em>'.
	 * @generated
	 */
	CSV createHealthData();

	/**
	 * Returns a new object of class '<em>Index Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Data</em>'.
	 * @generated
	 */
	CSV createIndexData();

	/**
	 * Returns a new object of class '<em>Epidemiology Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Epidemiology Data</em>'.
	 * @generated
	 */
	CSV createEpidemiologyData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CovidCsvPackage getCovidCsvPackage();

} //CovidCsvFactory
