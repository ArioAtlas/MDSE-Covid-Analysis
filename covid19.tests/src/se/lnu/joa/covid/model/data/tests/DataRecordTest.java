/**
 */
package se.lnu.joa.covid.model.data.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.data.DataFactory;
import se.lnu.joa.covid.model.data.DataRecord;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataRecordTest extends TestCase {

	/**
	 * The fixture for this Record test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRecord fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataRecordTest.class);
	}

	/**
	 * Constructs a new Record test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRecordTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Record test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataRecord fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Record test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRecord getFixture() {
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
		setFixture(DataFactory.eINSTANCE.createDataRecord());
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

} //DataRecordTest
