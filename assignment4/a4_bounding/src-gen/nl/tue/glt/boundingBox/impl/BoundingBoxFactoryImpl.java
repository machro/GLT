/**
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.boundingBox.impl;

import nl.tue.glt.boundingBox.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundingBoxFactoryImpl extends EFactoryImpl implements BoundingBoxFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BoundingBoxFactory init()
  {
    try
    {
      BoundingBoxFactory theBoundingBoxFactory = (BoundingBoxFactory)EPackage.Registry.INSTANCE.getEFactory(BoundingBoxPackage.eNS_URI);
      if (theBoundingBoxFactory != null)
      {
        return theBoundingBoxFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BoundingBoxFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundingBoxFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BoundingBoxPackage.WORLD: return createWorld();
      case BoundingBoxPackage.MOVE: return createMove();
      case BoundingBoxPackage.MOVE_X: return createMoveX();
      case BoundingBoxPackage.MOVE_Y: return createMoveY();
      case BoundingBoxPackage.MOVE_LEFT: return createMoveLeft();
      case BoundingBoxPackage.MOVE_RIGHT: return createMoveRight();
      case BoundingBoxPackage.MOVE_UP: return createMoveUp();
      case BoundingBoxPackage.MOVE_DOWN: return createMoveDown();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public World createWorld()
  {
    WorldImpl world = new WorldImpl();
    return world;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Move createMove()
  {
    MoveImpl move = new MoveImpl();
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveX createMoveX()
  {
    MoveXImpl moveX = new MoveXImpl();
    return moveX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveY createMoveY()
  {
    MoveYImpl moveY = new MoveYImpl();
    return moveY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveLeft createMoveLeft()
  {
    MoveLeftImpl moveLeft = new MoveLeftImpl();
    return moveLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveRight createMoveRight()
  {
    MoveRightImpl moveRight = new MoveRightImpl();
    return moveRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveUp createMoveUp()
  {
    MoveUpImpl moveUp = new MoveUpImpl();
    return moveUp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveDown createMoveDown()
  {
    MoveDownImpl moveDown = new MoveDownImpl();
    return moveDown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundingBoxPackage getBoundingBoxPackage()
  {
    return (BoundingBoxPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BoundingBoxPackage getPackage()
  {
    return BoundingBoxPackage.eINSTANCE;
  }

} //BoundingBoxFactoryImpl
