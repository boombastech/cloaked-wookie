package uk.co.boombastech.homepage;

import uk.co.boombastech.conf.di.ModuleRouter;
import uk.co.boombastech.conf.di.ModuleRoutes;

public class HomepageModule extends ModuleRoutes {
	@Override
	protected ModuleRouter moduleRouter() {
		return new HomepageModuleRouter();
	}

	@Override
	protected void bindClasses() {

	}

	@Override
	protected boolean isEnabled() {
		return true;
	}
}
