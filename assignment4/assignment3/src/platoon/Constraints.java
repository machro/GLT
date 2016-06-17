/**
 */
package platoon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.Constraints#getMinHeadway <em>Min Headway</em>}</li>
 *   <li>{@link platoon.Constraints#getMaxHeadway <em>Max Headway</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getConstraints()
 * @model
 * @generated
 */
public interface Constraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Headway</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Headway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Headway</em>' attribute.
	 * @see #setMinHeadway(int)
	 * @see platoon.PlatoonPackage#getConstraints_MinHeadway()
	 * @model default="10"
	 * @generated
	 */
	int getMinHeadway();

	/**
	 * Sets the value of the '{@link platoon.Constraints#getMinHeadway <em>Min Headway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Headway</em>' attribute.
	 * @see #getMinHeadway()
	 * @generated
	 */
	void setMinHeadway(int value);

	/**
	 * Returns the value of the '<em><b>Max Headway</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Headway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Headway</em>' attribute.
	 * @see #setMaxHeadway(int)
	 * @see platoon.PlatoonPackage#getConstraints_MaxHeadway()
	 * @model default="10"
	 * @generated
	 */
	int getMaxHeadway();

	/**
	 * Sets the value of the '{@link platoon.Constraints#getMaxHeadway <em>Max Headway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Headway</em>' attribute.
	 * @see #getMaxHeadway()
	 * @generated
	 */
	void setMaxHeadway(int value);

} // Constraints
