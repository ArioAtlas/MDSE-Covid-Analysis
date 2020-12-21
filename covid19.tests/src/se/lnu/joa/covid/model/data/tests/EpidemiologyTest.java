/**
 */
package se.lnu.joa.covid.model.data.tests;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.data.DataFactory;
import se.lnu.joa.covid.model.data.Epidemiology;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Epidemiology</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EpidemiologyTest extends DataRecordTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EpidemiologyTest.class);
	}

	/**
	 * Constructs a new Epidemiology test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpidemiologyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Epidemiology test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Epidemiology getFixture() {
		return (Epidemiology)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataFactory.eINSTANCE.createEpidemiology());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EpidemiologyTest
