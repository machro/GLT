/**
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.platoon;

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
 *   <li>{@link nl.tue.glt.platoon.Model#getPlatoons <em>Platoons</em>}</li>
 *   <li>{@link nl.tue.glt.platoon.Model#getRoutes <em>Routes</em>}</li>
 *   <li>{@link nl.tue.glt.platoon.Model#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.platoon.PlatoonPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Platoons</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Platoons</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Platoons</em>' containment reference.
   * @see #setPlatoons(Platoon)
   * @see nl.tue.glt.platoon.PlatoonPackage#getModel_Platoons()
   * @model containment="true"
   * @generated
   */
  Platoon getPlatoons();

  /**
   * Sets the value of the '{@link nl.tue.glt.platoon.Model#getPlatoons <em>Platoons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Platoons</em>' containment reference.
   * @see #getPlatoons()
   * @generated
   */
  void setPlatoons(Platoon value);

  /**
   * Returns the value of the '<em><b>Routes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Routes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Routes</em>' containment reference.
   * @see #setRoutes(Route)
   * @see nl.tue.glt.platoon.PlatoonPackage#getModel_Routes()
   * @model containment="true"
   * @generated
   */
  Route getRoutes();

  /**
   * Sets the value of the '{@link nl.tue.glt.platoon.Model#getRoutes <em>Routes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Routes</em>' containment reference.
   * @see #getRoutes()
   * @generated
   */
  void setRoutes(Route value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference.
   * @see #setConstraints(Constraints)
   * @see nl.tue.glt.platoon.PlatoonPackage#getModel_Constraints()
   * @model containment="true"
   * @generated
   */
  Constraints getConstraints();

  /**
   * Sets the value of the '{@link nl.tue.glt.platoon.Model#getConstraints <em>Constraints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraints</em>' containment reference.
   * @see #getConstraints()
   * @generated
   */
  void setConstraints(Constraints value);

} // Model
