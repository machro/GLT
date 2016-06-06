/**
 */
package platoon.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import platoon.Constraints;
import platoon.Model;
import platoon.Platoon;
import platoon.PlatoonPackage;
import platoon.Route;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.ModelImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link platoon.impl.ModelImpl#getPlatoons <em>Platoons</em>}</li>
 *   <li>{@link platoon.impl.ModelImpl#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Constraints constraints;

	/**
	 * The cached value of the '{@link #getPlatoons() <em>Platoons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatoons()
	 * @generated
	 * @ordered
	 */
	protected Platoon platoons;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected Route routes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(Constraints newConstraints, NotificationChain msgs) {
		Constraints oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatoonPackage.MODEL__CONSTRAINTS, oldConstraints, newConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Constraints newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.MODEL__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.MODEL__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.MODEL__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platoon getPlatoons() {
		return platoons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatoons(Platoon newPlatoons, NotificationChain msgs) {
		Platoon oldPlatoons = platoons;
		platoons = newPlatoons;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatoonPackage.MODEL__PLATOONS, oldPlatoons, newPlatoons);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatoons(Platoon newPlatoons) {
		if (newPlatoons != platoons) {
			NotificationChain msgs = null;
			if (platoons != null)
				msgs = ((InternalEObject)platoons).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.MODEL__PLATOONS, null, msgs);
			if (newPlatoons != null)
				msgs = ((InternalEObject)newPlatoons).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.MODEL__PLATOONS, null, msgs);
			msgs = basicSetPlatoons(newPlatoons, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.MODEL__PLATOONS, newPlatoons, newPlatoons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoutes() {
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutes(Route newRoutes, NotificationChain msgs) {
		Route oldRoutes = routes;
		routes = newRoutes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatoonPackage.MODEL__ROUTES, oldRoutes, newRoutes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutes(Route newRoutes) {
		if (newRoutes != routes) {
			NotificationChain msgs = null;
			if (routes != null)
				msgs = ((InternalEObject)routes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.MODEL__ROUTES, null, msgs);
			if (newRoutes != null)
				msgs = ((InternalEObject)newRoutes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.MODEL__ROUTES, null, msgs);
			msgs = basicSetRoutes(newRoutes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.MODEL__ROUTES, newRoutes, newRoutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatoonPackage.MODEL__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
			case PlatoonPackage.MODEL__PLATOONS:
				return basicSetPlatoons(null, msgs);
			case PlatoonPackage.MODEL__ROUTES:
				return basicSetRoutes(null, msgs);
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
			case PlatoonPackage.MODEL__CONSTRAINTS:
				return getConstraints();
			case PlatoonPackage.MODEL__PLATOONS:
				return getPlatoons();
			case PlatoonPackage.MODEL__ROUTES:
				return getRoutes();
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
			case PlatoonPackage.MODEL__CONSTRAINTS:
				setConstraints((Constraints)newValue);
				return;
			case PlatoonPackage.MODEL__PLATOONS:
				setPlatoons((Platoon)newValue);
				return;
			case PlatoonPackage.MODEL__ROUTES:
				setRoutes((Route)newValue);
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
			case PlatoonPackage.MODEL__CONSTRAINTS:
				setConstraints((Constraints)null);
				return;
			case PlatoonPackage.MODEL__PLATOONS:
				setPlatoons((Platoon)null);
				return;
			case PlatoonPackage.MODEL__ROUTES:
				setRoutes((Route)null);
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
			case PlatoonPackage.MODEL__CONSTRAINTS:
				return constraints != null;
			case PlatoonPackage.MODEL__PLATOONS:
				return platoons != null;
			case PlatoonPackage.MODEL__ROUTES:
				return routes != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
