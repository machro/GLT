/*
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.ui;

import a4_platoon.ui.internal.A4_platoonActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PlatoonExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return A4_platoonActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return A4_platoonActivator.getInstance().getInjector(A4_platoonActivator.NL_TUE_GLT_PLATOON);
	}
	
}
