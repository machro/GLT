/**
 */
package platoon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.FV#getPulledBy <em>Pulled By</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getFV()
 * @model
 * @generated
 */
public interface FV extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Pulled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pulled By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pulled By</em>' reference.
	 * @see #setPulledBy(Vehicle)
	 * @see platoon.PlatoonPackage#getFV_PulledBy()
	 * @model required="true"
	 * @generated
	 */
	Vehicle getPulledBy();

	/**
	 * Sets the value of the '{@link platoon.FV#getPulledBy <em>Pulled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulled By</em>' reference.
	 * @see #getPulledBy()
	 * @generated
	 */
	void setPulledBy(Vehicle value);

} // FV
