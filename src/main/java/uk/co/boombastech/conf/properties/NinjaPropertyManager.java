package uk.co.boombastech.conf.properties;

import ninja.utils.NinjaProperties;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Properties;

@Singleton
public class NinjaPropertyManager implements PropertyManager {

	private final Properties properties;

	@Inject
	public NinjaPropertyManager(NinjaProperties ninjaProperties) {
		properties = ninjaProperties.getAllCurrentNinjaProperties();
	}


}