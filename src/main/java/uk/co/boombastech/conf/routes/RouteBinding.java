package uk.co.boombastech.conf.routes;

import uk.co.boombastech.controllers.BoombastechController;

public class RouteBinding {
	private final UriFor uriFor;
	private final HttpMethod httpMethod;
	private final Class<? extends BoombastechController> controller;

	public RouteBinding(UriFor uriFor, HttpMethod httpMethod, Class<? extends BoombastechController> controller) {
		this.uriFor = uriFor;
		this.httpMethod = httpMethod;
		this.controller = controller;
	}

	public UriFor getUriFor() {
		return uriFor;
	}

	public HttpMethod getHttpMethod() {
		return httpMethod;
	}

	public Class<? extends BoombastechController> getController() {
		return controller;
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) return false;

		RouteBinding equivalent = (RouteBinding) object;

		if (this.getUriFor() == equivalent.getUriFor() && this.getHttpMethod() == equivalent.getHttpMethod()) {
			return false;
		}

		return true;
	}
}