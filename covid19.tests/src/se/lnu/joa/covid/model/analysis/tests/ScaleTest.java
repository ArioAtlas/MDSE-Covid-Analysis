/**
 */
package se.lnu.joa.covid.model.analysis.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.analysis.AnalysisFactory;
import se.lnu.joa.covid.model.analysis.Scale;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scale</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScaleTest extends TestCase {

	/**
	 * The fixture for this Scale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Scale fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScaleTest.class);
	}

	/**
	 * Constructs a new Scale test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Scale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Scale fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Scale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Scale getFixture() {
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
		setFixture(AnalysisFactory.eINSTANCE.createScale());
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

} //ScaleTest
