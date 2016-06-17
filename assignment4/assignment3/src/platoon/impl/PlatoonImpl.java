/**
 */
package platoon.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import platoon.FV;
import platoon.LV;
import platoon.Platoon;
import platoon.PlatoonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platoon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.PlatoonImpl#getFollowers <em>Followers</em>}</li>
 *   <li>{@link platoon.impl.PlatoonImpl#getFirst <em>First</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatoonImpl extends MinimalEObjectImpl.Container implements Platoon {
	/**
	 * The cached value of the '{@link #getFollowers() <em>Followers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers()
	 * @generated
	 * @ordered
	 */
	protected EList<FV> followers;

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected LV first;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatoonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.PLATOON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FV> getFollowers() {
		if (followers == null) {
			followers = new EObjectContainmentEList<FV>(FV.class, this, PlatoonPackage.PLATOON__FOLLOWERS);
		}
		return followers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LV getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst(LV newFirst, NotificationChain msgs) {
		LV oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatoonPackage.PLATOON__FIRST, oldFirst, newFirst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(LV newFirst) {
		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.PLATOON__FIRST, null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.PLATOON__FIRST, null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.PLATOON__FIRST, newFirst, newFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatoonPackage.PLATOON__FOLLOWERS:
				return ((InternalEList<?>)getFollowers()).basicRemove(otherEnd, msgs);
			case PlatoonPackage.PLATOON__FIRST:
				return basicSetFirst(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatoonPackage.PLATOON__FOLLOWERS:
				return getFollowers();
			case PlatoonPackage.PLATOON__FIRST:
				return getFirst();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatoonPackage.PLATOON__FOLLOWERS:
				getFollowers().clear();
				getFollowers().addAll((Collection<? extends FV>)newValue);
				return;
			case PlatoonPackage.PLATOON__FIRST:
				setFirst((LV)newValue);
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
			case PlatoonPackage.PLATOON__FOLLOWERS:
				getFollowers().clear();
				return;
			case PlatoonPackage.PLATOON__FIRST:
				setFirst((LV)null);
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
			case PlatoonPackage.PLATOON__FOLLOWERS:
				return followers != null && !followers.isEmpty();
			case PlatoonPackage.PLATOON__FIRST:
				return first != null;
		}
		return super.eIsSet(featureID);
	}

} //PlatoonImpl
