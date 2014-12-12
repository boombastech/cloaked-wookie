package uk.co.boombastech.conf.di;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public abstract class ModuleRoutes extends AbstractModule {

	protected abstract ModuleRouter moduleRouter();
	protected abstract void bindClasses();
	protected abstract boolean isEnabled();

	@Override
	protected void configure() {
		if (isEnabled()) {
			Multibinder<ModuleRouter> multibinder = Multibinder.newSetBinder(binder(), ModuleRouter.class);
			multibinder.addBinding().toInstance(moduleRouter());

			bindClasses();
		}
	}
}