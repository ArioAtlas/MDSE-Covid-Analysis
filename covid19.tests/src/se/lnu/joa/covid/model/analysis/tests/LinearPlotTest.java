/**
 */
package se.lnu.joa.covid.model.analysis.tests;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.analysis.AnalysisFactory;
import se.lnu.joa.covid.model.analysis.LinearPlot;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Linear Plot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinearPlotTest extends VisualizationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinearPlotTest.class);
	}

	/**
	 * Constructs a new Linear Plot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearPlotTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Linear Plot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinearPlot getFixture() {
		return (LinearPlot)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnalysisFactory.eINSTANCE.createLinearPlot());
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

} //LinearPlotTest
