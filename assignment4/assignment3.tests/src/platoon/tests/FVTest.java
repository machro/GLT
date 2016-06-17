/**
 */
package platoon.tests;

import junit.textui.TestRunner;

import platoon.FV;
import platoon.PlatoonFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FV</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FVTest extends VehicleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FVTest.class);
	}

	/**
	 * Constructs a new FV test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FVTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this FV test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FV getFixture() {
		return (FV)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatoonFactory.eINSTANCE.createFV());
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

} //FVTest
