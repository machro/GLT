/**
 */
package boundingbox;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link boundingbox.Move#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see boundingbox.BoundingboxPackage#getMove()
 * @model abstract="true"
 * @generated
 */
public interface Move extends EObject {
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
	 * @see boundingbox.BoundingboxPackage#getMove_Distance()
	 * @model
	 * @generated
	 */
	EList<Integer> getDistance();

} // Move
