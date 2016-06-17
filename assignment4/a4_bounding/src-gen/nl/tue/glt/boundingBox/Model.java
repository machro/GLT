/**
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.boundingBox;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.boundingBox.Model#getMoveCommands <em>Move Commands</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.boundingBox.BoundingBoxPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Move Commands</b></em>' containment reference list.
   * The list contents are of type {@link nl.tue.glt.boundingBox.Move}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Move Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Move Commands</em>' containment reference list.
   * @see nl.tue.glt.boundingBox.BoundingBoxPackage#getModel_MoveCommands()
   * @model containment="true"
   * @generated
   */
  EList<Move> getMoveCommands();

} // Model
