/**
 */
package se.lnu.joa.covid.model.config.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.lnu.joa.covid.model.config.Animation;
import se.lnu.joa.covid.model.config.ConfigFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnimationTest extends TestCase {

	/**
	 * The fixture for this Animation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Animation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnimationTest.class);
	}

	/**
	 * Constructs a new Animation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Animation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Animation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Animation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Animation getFixture() {
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
		setFixture(ConfigFactory.eINSTANCE.createAnimation());
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

} //AnimationTest
