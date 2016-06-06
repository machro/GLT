/**
 */
package platoon;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.Forward#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getForward()
 * @model
 * @generated
 */
public interface Forward extends Action {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute list.
	 * @see platoon.PlatoonPackage#getForward_Distance()
	 * @model default="10"
	 * @generated
	 */
	EList<Integer> getDistance();

} // Forward
