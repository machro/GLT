/**
 */
package platoon.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import platoon.FV;
import platoon.PlatoonPackage;
import platoon.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.FVImpl#getPulledBy <em>Pulled By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FVImpl extends VehicleImpl implements FV {
	/**
	 * The cached value of the '{@link #getPulledBy() <em>Pulled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulledBy()
	 * @generated
	 * @ordered
	 */
	protected Vehicle pulledBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.FV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getPulledBy() {
		if (pulledBy != null && pulledBy.eIsProxy()) {
			InternalEObject oldPulledBy = (InternalEObject)pulledBy;
			pulledBy = (Vehicle)eResolveProxy(oldPulledBy);
			if (pulledBy != oldPulledBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatoonPackage.FV__PULLED_BY, oldPulledBy, pulledBy));
			}
		}
		return pulledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle basicGetPulledBy() {
		return pulledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPulledBy(Vehicle newPulledBy) {
		Vehicle oldPulledBy = pulledBy;
		pulledBy = newPulledBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.FV__PULLED_BY, oldPulledBy, pulledBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatoonPackage.FV__PULLED_BY:
				if (resolve) return getPulledBy();
				return basicGetPulledBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatoonPackage.FV__PULLED_BY:
				setPulledBy((Vehicle)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlatoonPackage.FV__PULLED_BY:
				setPulledBy((Vehicle)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlatoonPackage.FV__PULLED_BY:
				return pulledBy != null;
		}
		return super.eIsSet(featureID);
	}

} //FVImpl
