/**
 */
package se.lnu.joa.covid.model.analysis.tests;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.analysis.AnalysisFactory;
import se.lnu.joa.covid.model.analysis.LinnearRegression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Linnear Regression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinnearRegressionTest extends RegressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinnearRegressionTest.class);
	}

	/**
	 * Constructs a new Linnear Regression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinnearRegressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Linnear Regression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinnearRegression getFixture() {
		return (LinnearRegression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnalysisFactory.eINSTANCE.createLinnearRegression());
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

} //LinnearRegressionTest
