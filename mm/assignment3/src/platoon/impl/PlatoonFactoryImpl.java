/**
 */
package platoon.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import platoon.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatoonFactoryImpl extends EFactoryImpl implements PlatoonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatoonFactory init() {
		try {
			PlatoonFactory thePlatoonFactory = (PlatoonFactory)EPackage.Registry.INSTANCE.getEFactory(PlatoonPackage.eNS_URI);
			if (thePlatoonFactory != null) {
				return thePlatoonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatoonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatoonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlatoonPackage.PLATOON: return createPlatoon();
			case PlatoonPackage.ROUTE: return createRoute();
			case PlatoonPackage.LV: return createLV();
			case PlatoonPackage.FV: return createFV();
			case PlatoonPackage.MODEL: return createModel();
			case PlatoonPackage.FORWARD: return createForward();
			case PlatoonPackage.LEFT: return createLeft();
			case PlatoonPackage.RIGHT: return createRight();
			case PlatoonPackage.CONSTRAINTS: return createConstraints();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platoon createPlatoon() {
		PlatoonImpl platoon = new PlatoonImpl();
		return platoon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LV createLV() {
		LVImpl lv = new LVImpl();
		return lv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FV createFV() {
		FVImpl fv = new FVImpl();
		return fv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forward createForward() {
		ForwardImpl forward = new ForwardImpl();
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Left createLeft() {
		LeftImpl left = new LeftImpl();
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Right createRight() {
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints createConstraints() {
		ConstraintsImpl constraints = new ConstraintsImpl();
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatoonPackage getPlatoonPackage() {
		return (PlatoonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatoonPackage getPackage() {
		return PlatoonPackage.eINSTANCE;
	}

} //PlatoonFactoryImpl
