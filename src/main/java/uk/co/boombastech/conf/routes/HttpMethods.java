package uk.co.boombastech.conf.routes;


import com.google.common.collect.Maps;
import uk.co.boombastech.controllers.BoombastechController;

import java.util.Map;

public class HttpMethods {
	private final Map<HttpMethod, BoombastechController> controllerMap;

	public HttpMethods() {
		controllerMap = Maps.newHashMap();
	}
}
