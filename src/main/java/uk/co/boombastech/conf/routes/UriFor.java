package uk.co.boombastech.conf.routes;

public enum UriFor {
	homepage("/"), imperialAssaultLandingPage("/imperial-assault");

	private final String path;

	UriFor(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}
}