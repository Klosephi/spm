
package org.pklose.simplespec;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SimplespecStandaloneSetup extends SimplespecStandaloneSetupGenerated{

	public static void doSetup() {
		new SimplespecStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

