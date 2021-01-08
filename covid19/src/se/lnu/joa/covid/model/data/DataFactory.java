/**
 */
package se.lnu.joa.covid.model.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.lnu.joa.covid.model.data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataFactory eINSTANCE = se.lnu.joa.covid.model.data.impl.DataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pool</em>'.
	 * @generated
	 */
	DataPool createDataPool();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	DataSource createDataSource();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	DataSet createDataSet();

	/**
	 * Returns a new object of class '<em>Int Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Set</em>'.
	 * @generated
	 */
	IntSet createIntSet();

	/**
	 * Returns a new object of class '<em>Double Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Set</em>'.
	 * @generated
	 */
	DoubleSet createDoubleSet();

	/**
	 * Returns a new object of class '<em>String Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Set</em>'.
	 * @generated
	 */
	StringSet createStringSet();

	/**
	 * Returns a new object of class '<em>Date Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Set</em>'.
	 * @generated
	 */
	DateSet createDateSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataPackage getDataPackage();

} //DataFactory
