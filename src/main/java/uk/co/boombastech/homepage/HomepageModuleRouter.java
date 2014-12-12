package uk.co.boombastech.homepage;

import uk.co.boombastech.conf.di.ModuleRouter;
import uk.co.boombastech.conf.routes.HttpMethod;
import uk.co.boombastech.conf.routes.UriFor;
import uk.co.boombastech.controllers.ApplicationController;

public class HomepageModuleRouter extends ModuleRouter {

	@Override
	protected void registerRoutes() {
		registerRoute(UriFor.homepage, HttpMethod.GET, ApplicationController.class);
	}
}