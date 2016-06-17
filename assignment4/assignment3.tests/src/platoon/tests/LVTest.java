/**
 */
package platoon.tests;

import junit.textui.TestRunner;

import platoon.LV;
import platoon.PlatoonFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>LV</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LVTest extends VehicleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LVTest.class);
	}

	/**
	 * Constructs a new LV test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LVTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this LV test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LV getFixture() {
		return (LV)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatoonFactory.eINSTANCE.createLV());
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

} //LVTest
