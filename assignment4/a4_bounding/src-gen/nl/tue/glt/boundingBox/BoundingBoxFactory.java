/**
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.boundingBox;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.tue.glt.boundingBox.BoundingBoxPackage
 * @generated
 */
public interface BoundingBoxFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BoundingBoxFactory eINSTANCE = nl.tue.glt.boundingBox.impl.BoundingBoxFactoryImpl.init();

  /**
   * Returns a new object of class '<em>World</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>World</em>'.
   * @generated
   */
  World createWorld();

  /**
   * Returns a new object of class '<em>Move</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move</em>'.
   * @generated
   */
  Move createMove();

  /**
   * Returns a new object of class '<em>Move X</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move X</em>'.
   * @generated
   */
  MoveX createMoveX();

  /**
   * Returns a new object of class '<em>Move Y</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move Y</em>'.
   * @generated
   */
  MoveY createMoveY();

  /**
   * Returns a new object of class '<em>Move Left</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move Left</em>'.
   * @generated
   */
  MoveLeft createMoveLeft();

  /**
   * Returns a new object of class '<em>Move Right</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move Right</em>'.
   * @generated
   */
  MoveRight createMoveRight();

  /**
   * Returns a new object of class '<em>Move Up</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move Up</em>'.
   * @generated
   */
  MoveUp createMoveUp();

  /**
   * Returns a new object of class '<em>Move Down</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move Down</em>'.
   * @generated
   */
  MoveDown createMoveDown();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BoundingBoxPackage getBoundingBoxPackage();

} //BoundingBoxFactory
