/**
 */
package platoon;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see platoon.PlatoonFactory
 * @model kind="package"
 * @generated
 */
public interface PlatoonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platoon";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platoon";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platoon";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatoonPackage eINSTANCE = platoon.impl.PlatoonPackageImpl.init();

	/**
	 * The meta object id for the '{@link platoon.impl.PlatoonImpl <em>Platoon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.PlatoonImpl
	 * @see platoon.impl.PlatoonPackageImpl#getPlatoon()
	 * @generated
	 */
	int PLATOON = 0;

	/**
	 * The feature id for the '<em><b>Followers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON__FOLLOWERS = 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON__FIRST = 1;

	/**
	 * The number of structural features of the '<em>Platoon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Platoon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.RouteImpl
	 * @see platoon.impl.PlatoonPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.VehicleImpl
	 * @see platoon.impl.PlatoonPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.LVImpl <em>LV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.LVImpl
	 * @see platoon.impl.PlatoonPackageImpl#getLV()
	 * @generated
	 */
	int LV = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LV__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LV__ROUTE = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LV_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LV_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.FVImpl <em>FV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.FVImpl
	 * @see platoon.impl.PlatoonPackageImpl#getFV()
	 * @generated
	 */
	int FV = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FV__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Pulled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FV__PULLED_BY = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FV_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FV_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.ModelImpl
	 * @see platoon.impl.PlatoonPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 5;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Platoons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PLATOONS = 1;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ROUTES = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.ActionImpl
	 * @see platoon.impl.PlatoonPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.TurnImpl
	 * @see platoon.impl.PlatoonPackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 7;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.ForwardImpl
	 * @see platoon.impl.PlatoonPackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 8;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD__DISTANCE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.LeftImpl <em>Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.LeftImpl
	 * @see platoon.impl.PlatoonPackageImpl#getLeft()
	 * @generated
	 */
	int LEFT = 9;

	/**
	 * The number of structural features of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FEATURE_COUNT = TURN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OPERATION_COUNT = TURN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.RightImpl
	 * @see platoon.impl.PlatoonPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 10;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = TURN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OPERATION_COUNT = TURN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.ConstraintsImpl <em>Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.ConstraintsImpl
	 * @see platoon.impl.PlatoonPackageImpl#getConstraints()
	 * @generated
	 */
	int CONSTRAINTS = 11;

	/**
	 * The feature id for the '<em><b>Min Headway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__MIN_HEADWAY = 0;

	/**
	 * The feature id for the '<em><b>Max Headway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__MAX_HEADWAY = 1;

	/**
	 * The number of structural features of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link platoon.Platoon <em>Platoon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platoon</em>'.
	 * @see platoon.Platoon
	 * @generated
	 */
	EClass getPlatoon();

	/**
	 * Returns the meta object for the containment reference list '{@link platoon.Platoon#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Followers</em>'.
	 * @see platoon.Platoon#getFollowers()
	 * @see #getPlatoon()
	 * @generated
	 */
	EReference getPlatoon_Followers();

	/**
	 * Returns the meta object for the containment reference '{@link platoon.Platoon#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see platoon.Platoon#getFirst()
	 * @see #getPlatoon()
	 * @generated
	 */
	EReference getPlatoon_First();

	/**
	 * Returns the meta object for class '{@link platoon.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see platoon.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link platoon.Route#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see platoon.Route#getActions()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Actions();

	/**
	 * Returns the meta object for the attribute '{@link platoon.Route#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see platoon.Route#getName()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Name();

	/**
	 * Returns the meta object for class '{@link platoon.LV <em>LV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LV</em>'.
	 * @see platoon.LV
	 * @generated
	 */
	EClass getLV();

	/**
	 * Returns the meta object for the reference '{@link platoon.LV#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see platoon.LV#getRoute()
	 * @see #getLV()
	 * @generated
	 */
	EReference getLV_Route();

	/**
	 * Returns the meta object for class '{@link platoon.FV <em>FV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FV</em>'.
	 * @see platoon.FV
	 * @generated
	 */
	EClass getFV();

	/**
	 * Returns the meta object for the reference '{@link platoon.FV#getPulledBy <em>Pulled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pulled By</em>'.
	 * @see platoon.FV#getPulledBy()
	 * @see #getFV()
	 * @generated
	 */
	EReference getFV_PulledBy();

	/**
	 * Returns the meta object for class '{@link platoon.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see platoon.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link platoon.Vehicle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see platoon.Vehicle#getName()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Name();

	/**
	 * Returns the meta object for class '{@link platoon.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see platoon.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link platoon.Model#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see platoon.Model#getConstraints()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link platoon.Model#getPlatoons <em>Platoons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platoons</em>'.
	 * @see platoon.Model#getPlatoons()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Platoons();

	/**
	 * Returns the meta object for the containment reference '{@link platoon.Model#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Routes</em>'.
	 * @see platoon.Model#getRoutes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Routes();

	/**
	 * Returns the meta object for class '{@link platoon.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see platoon.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link platoon.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see platoon.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for class '{@link platoon.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see platoon.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for the attribute list '{@link platoon.Forward#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Distance</em>'.
	 * @see platoon.Forward#getDistance()
	 * @see #getForward()
	 * @generated
	 */
	EAttribute getForward_Distance();

	/**
	 * Returns the meta object for class '{@link platoon.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left</em>'.
	 * @see platoon.Left
	 * @generated
	 */
	EClass getLeft();

	/**
	 * Returns the meta object for class '{@link platoon.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see platoon.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for class '{@link platoon.Constraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints</em>'.
	 * @see platoon.Constraints
	 * @generated
	 */
	EClass getConstraints();

	/**
	 * Returns the meta object for the attribute '{@link platoon.Constraints#getMinHeadway <em>Min Headway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Headway</em>'.
	 * @see platoon.Constraints#getMinHeadway()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_MinHeadway();

	/**
	 * Returns the meta object for the attribute '{@link platoon.Constraints#getMaxHeadway <em>Max Headway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Headway</em>'.
	 * @see platoon.Constraints#getMaxHeadway()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_MaxHeadway();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatoonFactory getPlatoonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link platoon.impl.PlatoonImpl <em>Platoon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.PlatoonImpl
		 * @see platoon.impl.PlatoonPackageImpl#getPlatoon()
		 * @generated
		 */
		EClass PLATOON = eINSTANCE.getPlatoon();

		/**
		 * The meta object literal for the '<em><b>Followers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATOON__FOLLOWERS = eINSTANCE.getPlatoon_Followers();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATOON__FIRST = eINSTANCE.getPlatoon_First();

		/**
		 * The meta object literal for the '{@link platoon.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.RouteImpl
		 * @see platoon.impl.PlatoonPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__ACTIONS = eINSTANCE.getRoute_Actions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__NAME = eINSTANCE.getRoute_Name();

		/**
		 * The meta object literal for the '{@link platoon.impl.LVImpl <em>LV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.LVImpl
		 * @see platoon.impl.PlatoonPackageImpl#getLV()
		 * @generated
		 */
		EClass LV = eINSTANCE.getLV();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LV__ROUTE = eINSTANCE.getLV_Route();

		/**
		 * The meta object literal for the '{@link platoon.impl.FVImpl <em>FV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.FVImpl
		 * @see platoon.impl.PlatoonPackageImpl#getFV()
		 * @generated
		 */
		EClass FV = eINSTANCE.getFV();

		/**
		 * The meta object literal for the '<em><b>Pulled By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FV__PULLED_BY = eINSTANCE.getFV_PulledBy();

		/**
		 * The meta object literal for the '{@link platoon.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.VehicleImpl
		 * @see platoon.impl.PlatoonPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__NAME = eINSTANCE.getVehicle_Name();

		/**
		 * The meta object literal for the '{@link platoon.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.ModelImpl
		 * @see platoon.impl.PlatoonPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONSTRAINTS = eINSTANCE.getModel_Constraints();

		/**
		 * The meta object literal for the '<em><b>Platoons</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PLATOONS = eINSTANCE.getModel_Platoons();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ROUTES = eINSTANCE.getModel_Routes();

		/**
		 * The meta object literal for the '{@link platoon.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.ActionImpl
		 * @see platoon.impl.PlatoonPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link platoon.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.TurnImpl
		 * @see platoon.impl.PlatoonPackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '{@link platoon.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.ForwardImpl
		 * @see platoon.impl.PlatoonPackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORWARD__DISTANCE = eINSTANCE.getForward_Distance();

		/**
		 * The meta object literal for the '{@link platoon.impl.LeftImpl <em>Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.LeftImpl
		 * @see platoon.impl.PlatoonPackageImpl#getLeft()
		 * @generated
		 */
		EClass LEFT = eINSTANCE.getLeft();

		/**
		 * The meta object literal for the '{@link platoon.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.RightImpl
		 * @see platoon.impl.PlatoonPackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '{@link platoon.impl.ConstraintsImpl <em>Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.ConstraintsImpl
		 * @see platoon.impl.PlatoonPackageImpl#getConstraints()
		 * @generated
		 */
		EClass CONSTRAINTS = eINSTANCE.getConstraints();

		/**
		 * The meta object literal for the '<em><b>Min Headway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__MIN_HEADWAY = eINSTANCE.getConstraints_MinHeadway();

		/**
		 * The meta object literal for the '<em><b>Max Headway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__MAX_HEADWAY = eINSTANCE.getConstraints_MaxHeadway();

	}

} //PlatoonPackage
