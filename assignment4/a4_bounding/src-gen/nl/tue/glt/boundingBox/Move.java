/**
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.boundingBox;

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
 *   <li>{@link nl.tue.glt.boundingBox.Move#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.boundingBox.BoundingBoxPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends EObject
{
  /**
   * Returns the value of the '<em><b>Distance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distance</em>' attribute.
   * @see #setDistance(int)
   * @see nl.tue.glt.boundingBox.BoundingBoxPackage#getMove_Distance()
   * @model
   * @generated
   */
  int getDistance();

  /**
   * Sets the value of the '{@link nl.tue.glt.boundingBox.Move#getDistance <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distance</em>' attribute.
   * @see #getDistance()
   * @generated
   */
  void setDistance(int value);

} // Move