/**
 */
package se.lnu.joa.covid.model.analysis.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.analysis.AnalysisFactory;
import se.lnu.joa.covid.model.analysis.AnalyticModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Analytic Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalyticModelTest extends TestCase {

	/**
	 * The fixture for this Analytic Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalyticModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnalyticModelTest.class);
	}

	/**
	 * Constructs a new Analytic Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyticModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Analytic Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AnalyticModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Analytic Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalyticModel getFixture() {
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
		setFixture(AnalysisFactory.eINSTANCE.createAnalyticModel());
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

} //AnalyticModelTest
