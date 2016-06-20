/**
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.validation;

import com.google.common.base.Objects;
import nl.tue.glt.platoon.FV;
import nl.tue.glt.platoon.PlatoonPackage;
import nl.tue.glt.platoon.Vehicle;
import nl.tue.glt.validation.AbstractPlatoonValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class PlatoonValidator extends AbstractPlatoonValidator {
  @Check
  public void checkNotPullingItself(final FV fv) {
    String _name = fv.getName();
    Vehicle _pulledBy = fv.getPulledBy();
    String _name_1 = _pulledBy.getName();
    boolean _equals = _name.equals(_name_1);
    if (_equals) {
      this.error("A vehicle cannot pull itself.", PlatoonPackage.Literals.FV__PULLED_BY);
    }
  }
  
  @Check
  public void checkSameFrontRunners(final FV fv) {
    EObject _eContainer = fv.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    for (final EObject obj : _eContents) {
      boolean _notEquals = (!Objects.equal(obj, fv));
      if (_notEquals) {
        if ((obj instanceof FV)) {
          Vehicle _pulledBy = ((FV)obj).getPulledBy();
          Vehicle _pulledBy_1 = fv.getPulledBy();
          boolean _equals = Objects.equal(_pulledBy, _pulledBy_1);
          if (_equals) {
            this.error("A vehicle can only pull one FV.", PlatoonPackage.Literals.FV__PULLED_BY);
          }
        }
      }
    }
  }
  
  @Check
  public void checkUniqueName(final Vehicle vehicle) {
    EObject _eContainer = vehicle.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    for (final EObject obj : _eContents) {
      boolean _notEquals = (!Objects.equal(obj, vehicle));
      if (_notEquals) {
        if ((obj instanceof Vehicle)) {
          String _name = ((Vehicle)obj).getName();
          String _name_1 = vehicle.getName();
          boolean _equals = Objects.equal(_name, _name_1);
          if (_equals) {
            this.error("Vehicle names must be unique.", PlatoonPackage.Literals.VEHICLE__NAME);
          }
        }
      }
    }
  }
}
