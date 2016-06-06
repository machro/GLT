/**
 */
package platoon.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import platoon.Constraints;
import platoon.PlatoonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.ConstraintsImpl#getMinHeadway <em>Min Headway</em>}</li>
 *   <li>{@link platoon.impl.ConstraintsImpl#getMaxHeadway <em>Max Headway</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintsImpl extends MinimalEObjectImpl.Container implements Constraints {
	/**
	 * The default value of the '{@link #getMinHeadway() <em>Min Headway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeadway()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_HEADWAY_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getMinHeadway() <em>Min Headway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeadway()
	 * @generated
	 * @ordered
	 */
	protected int minHeadway = MIN_HEADWAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxHeadway() <em>Max Headway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeadway()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_HEADWAY_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getMaxHeadway() <em>Max Headway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeadway()
	 * @generated
	 * @ordered
	 */
	protected int maxHeadway = MAX_HEADWAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinHeadway() {
		return minHeadway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinHeadway(int newMinHeadway) {
		int oldMinHeadway = minHeadway;
		minHeadway = newMinHeadway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.CONSTRAINTS__MIN_HEADWAY, oldMinHeadway, minHeadway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxHeadway() {
		return maxHeadway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxHeadway(int newMaxHeadway) {
		int oldMaxHeadway = maxHeadway;
		maxHeadway = newMaxHeadway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.CONSTRAINTS__MAX_HEADWAY, oldMaxHeadway, maxHeadway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatoonPackage.CONSTRAINTS__MIN_HEADWAY:
				return getMinHeadway();
			case PlatoonPackage.CONSTRAINTS__MAX_HEADWAY:
				return getMaxHeadway();
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
			case PlatoonPackage.CONSTRAINTS__MIN_HEADWAY:
				setMinHeadway((Integer)newValue);
				return;
			case PlatoonPackage.CONSTRAINTS__MAX_HEADWAY:
				setMaxHeadway((Integer)newValue);
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
			case PlatoonPackage.CONSTRAINTS__MIN_HEADWAY:
				setMinHeadway(MIN_HEADWAY_EDEFAULT);
				return;
			case PlatoonPackage.CONSTRAINTS__MAX_HEADWAY:
				setMaxHeadway(MAX_HEADWAY_EDEFAULT);
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
			case PlatoonPackage.CONSTRAINTS__MIN_HEADWAY:
				return minHeadway != MIN_HEADWAY_EDEFAULT;
			case PlatoonPackage.CONSTRAINTS__MAX_HEADWAY:
				return maxHeadway != MAX_HEADWAY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minHeadway: ");
		result.append(minHeadway);
		result.append(", maxHeadway: ");
		result.append(maxHeadway);
		result.append(')');
		return result.toString();
	}

} //ConstraintsImpl
