/**
 */
package se.lnu.joa.covid.model.data.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.data.DataFactory;
import se.lnu.joa.covid.model.data.DataPool;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPoolTest extends TestCase {

	/**
	 * The fixture for this Pool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPool fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataPoolTest.class);
	}

	/**
	 * Constructs a new Pool test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPoolTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataPool fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPool getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataFactory.eINSTANCE.createDataPool());
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

} //DataPoolTest
