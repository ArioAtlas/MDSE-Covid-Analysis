/**
 */
package se.lnu.joa.covid.model.analysis.tests;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.analysis.AnalysisFactory;
import se.lnu.joa.covid.model.analysis.LogarithmicRegression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logarithmic Regression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogarithmicRegressionTest extends RegressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogarithmicRegressionTest.class);
	}

	/**
	 * Constructs a new Logarithmic Regression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogarithmicRegressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Logarithmic Regression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LogarithmicRegression getFixture() {
		return (LogarithmicRegression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnalysisFactory.eINSTANCE.createLogarithmicRegression());
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

} //LogarithmicRegressionTest
