/**
 */
package se.lnu.joa.covid.model.covid19;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.lnu.joa.covid.model.covid19.Covid19Package
 * @generated
 */
public interface Covid19Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Covid19Factory eINSTANCE = se.lnu.joa.covid.model.covid19.impl.Covid19FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Health</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health</em>'.
	 * @generated
	 */
	Health createHealth();

	/**
	 * Returns a new object of class '<em>Epidemiology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Epidemiology</em>'.
	 * @generated
	 */
	Epidemiology createEpidemiology();

	/**
	 * Returns a new object of class '<em>Data Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Pool</em>'.
	 * @generated
	 */
	DataPool createDataPool();

	/**
	 * Returns a new object of class '<em>Data Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Record</em>'.
	 * @generated
	 */
	DataRecord createDataRecord();

	/**
	 * Returns a new object of class '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index</em>'.
	 * @generated
	 */
	Index createIndex();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Covid19Package getCovid19Package();

} //Covid19Factory
