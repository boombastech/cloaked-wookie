package uk.co.boombastech.conf.di;

import com.google.common.collect.Sets;
import uk.co.boombastech.conf.routes.HttpMethod;
import uk.co.boombastech.conf.routes.RouteBinding;
import uk.co.boombastech.conf.routes.UriFor;
import uk.co.boombastech.controllers.BoombastechController;

import java.util.Set;

import static java.lang.String.format;

public abstract class ModuleRouter {
	private final Set<RouteBinding> routeBindings;

	protected ModuleRouter() {
		routeBindings = Sets.newHashSet();
		registerRoutes();
	}

	public void registerRoute(UriFor uriFor, HttpMethod httpMethod, Class<? extends BoombastechController> controller) {
		boolean unique = routeBindings.add(new RouteBinding(uriFor, httpMethod, controller));
		if (!unique) {
			throw new IllegalArgumentException(format("Route for path %s and http method %s has already been bound", uriFor.getPath(), httpMethod));
		}
	}

	public Set<RouteBinding> getRouteBindings() {
		return routeBindings;
	}

	protected abstract void registerRoutes();
}