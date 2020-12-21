/**
 */
package se.lnu.joa.covid.model.analysis.tests;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.analysis.AnalysisFactory;
import se.lnu.joa.covid.model.analysis.Log10Scale;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Log10 Scale</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Log10ScaleTest extends ScaleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Log10ScaleTest.class);
	}

	/**
	 * Constructs a new Log10 Scale test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log10ScaleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Log10 Scale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Log10Scale getFixture() {
		return (Log10Scale)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnalysisFactory.eINSTANCE.createLog10Scale());
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

} //Log10ScaleTest
