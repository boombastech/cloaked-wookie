/**
 * Copyright (C) 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.co.boombastech.conf;


import ninja.AssetsController;
import ninja.RouteBuilder;
import ninja.Router;
import ninja.application.ApplicationRoutes;
import uk.co.boombastech.conf.di.ModuleRouter;
import uk.co.boombastech.conf.routes.HttpMethod;
import uk.co.boombastech.conf.routes.RouteBinding;
import uk.co.boombastech.conf.routes.UriFor;
import uk.co.boombastech.controllers.ApplicationController;
import uk.co.boombastech.controllers.BoombastechController;

import javax.inject.Inject;
import java.util.Map;
import java.util.Set;

import static uk.co.boombastech.conf.routes.HttpMethod.GET;

public class Routes implements ApplicationRoutes {

	private final Set<ModuleRouter> moduleRouters;

	@Inject
	public Routes(Set<ModuleRouter> moduleRouters) {
		this.moduleRouters = moduleRouters;
	}

	@Override
	public void init(Router router) {
		router.GET().route("/assets/webjars/{fileName: .*}").with(AssetsController.class, "serveWebJars");
		router.GET().route("/assets/{fileName: .*}").with(AssetsController.class, "serveStatic");

		registerModuleRoutes(router);
	}

	private void registerModuleRoutes(Router router) {
		for (ModuleRouter moduleRouter : moduleRouters) {
			for (RouteBinding routeBinding : moduleRouter.getRouteBindings()) {
				getRouteBuilder(router, routeBinding).route(routeBinding.getUriFor().getPath()).with(routeBinding.getController(), "execute");
			}
		}
	}

	private RouteBuilder getRouteBuilder(Router router, RouteBinding routeBinding) {
		RouteBuilder routeBuilder = null;
		switch (routeBinding.getHttpMethod()) {
			case GET:
				routeBuilder = router.GET();
				break;
			case POST:
				routeBuilder = router.POST();
				break;
			case PUT:
				routeBuilder = router.PUT();
				break;
			case OPTIONS:
				routeBuilder = router.OPTIONS();
				break;
			case HEAD:
				routeBuilder = router.HEAD();
				break;
			case DELETE:
				routeBuilder = router.DELETE();
				break;
		}
		return routeBuilder;
	}
}
