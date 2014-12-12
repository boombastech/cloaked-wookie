package uk.co.boombastech.imperialassault.di;

import uk.co.boombastech.conf.di.ModuleRouter;
import uk.co.boombastech.conf.routes.HttpMethod;
import uk.co.boombastech.conf.routes.UriFor;
import uk.co.boombastech.imperialassault.controllers.ImperialAssaultLandingPage;

public class ImperialAssaultRouter extends ModuleRouter {
	@Override
	protected void registerRoutes() {
		registerRoute(UriFor.imperialAssaultLandingPage, HttpMethod.GET, ImperialAssaultLandingPage.class);
	}
}