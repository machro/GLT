/**
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.platoon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.platoon.Route#getName <em>Name</em>}</li>
 *   <li>{@link nl.tue.glt.platoon.Route#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.platoon.PlatoonPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.tue.glt.platoon.PlatoonPackage#getRoute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.tue.glt.platoon.Route#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link nl.tue.glt.platoon.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see nl.tue.glt.platoon.PlatoonPackage#getRoute_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // Route