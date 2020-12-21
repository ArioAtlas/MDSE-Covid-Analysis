/**
 */
package se.lnu.joa.covid.model.analysis.tests;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.analysis.AnalysisFactory;
import se.lnu.joa.covid.model.analysis.DateScale;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date Scale</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DateScaleTest extends ScaleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DateScaleTest.class);
	}

	/**
	 * Constructs a new Date Scale test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateScaleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Date Scale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DateScale getFixture() {
		return (DateScale)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnalysisFactory.eINSTANCE.createDateScale());
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

} //DateScaleTest
