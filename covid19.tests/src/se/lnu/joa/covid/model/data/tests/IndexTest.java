/**
 */
package se.lnu.joa.covid.model.data.tests;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.data.DataFactory;
import se.lnu.joa.covid.model.data.Index;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndexTest extends DataRecordTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndexTest.class);
	}

	/**
	 * Constructs a new Index test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Index test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Index getFixture() {
		return (Index)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataFactory.eINSTANCE.createIndex());
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

} //IndexTest
