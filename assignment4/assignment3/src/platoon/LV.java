/**
 */
package platoon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.LV#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getLV()
 * @model
 * @generated
 */
public interface LV extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see platoon.PlatoonPackage#getLV_Route()
	 * @model required="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link platoon.LV#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

} // LV
