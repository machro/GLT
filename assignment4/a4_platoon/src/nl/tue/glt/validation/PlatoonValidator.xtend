/*
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.validation

import org.eclipse.xtext.validation.Check
import nl.tue.glt.platoon.FV
import nl.tue.glt.platoon.PlatoonPackage
import org.eclipse.emf.ecore.EObject
import nl.tue.glt.platoon.Vehicle

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class PlatoonValidator extends AbstractPlatoonValidator {
	@Check
	def checkNotPullingItself(FV fv) {
		if (fv.name.equals(fv.pulledBy.name)) {
			error("A vehicle cannot pull itself.", PlatoonPackage.Literals.FV__PULLED_BY);
		}
	}
	
	@Check
	def checkSameFrontRunners(FV fv) {
		for(EObject obj : fv.eContainer.eContents) {
			if (obj != fv) {
				if (obj instanceof FV) {
					if (obj.pulledBy == fv.pulledBy) {
						error ("A vehicle can only pull one FV.", PlatoonPackage.Literals.FV__PULLED_BY);
					}
				}
			}
		}
	}
	
	@Check
	def checkUniqueName(Vehicle vehicle) {
		for(EObject obj : vehicle.eContainer.eContents) {
			if (obj != vehicle) {
				if (obj instanceof Vehicle) {
					if (obj.name == vehicle.name) {
						error ("Vehicle names must be unique.", PlatoonPackage.Literals.VEHICLE__NAME);
					}
				}
			}
		}
	}
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					PlatoonPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
}
