/*
 * generated by Xtext 2.10.0
 */
package nl.tue.glt


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BoundingBoxStandaloneSetup extends BoundingBoxStandaloneSetupGenerated {

	def static void doSetup() {
		new BoundingBoxStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
