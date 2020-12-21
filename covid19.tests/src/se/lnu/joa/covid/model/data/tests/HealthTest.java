/**
 */
package se.lnu.joa.covid.model.data.tests;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.data.DataFactory;
import se.lnu.joa.covid.model.data.Health;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Health</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthTest extends DataRecordTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HealthTest.class);
	}

	/**
	 * Constructs a new Health test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Health test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Health getFixture() {
		return (Health)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataFactory.eINSTANCE.createHealth());
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

} //HealthTest
