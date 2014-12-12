package uk.co.boombastech.imperialassault.di;

import com.google.inject.TypeLiteral;
import uk.co.boombastech.conf.di.ModuleRouter;
import uk.co.boombastech.conf.di.ModuleRoutes;
import uk.co.boombastech.imperialassault.DeploymentServiceImpl;
import uk.co.boombastech.imperialassault.models.DeploymentCard;
import uk.co.boombastech.repositories.Repository;
import uk.co.boombastech.repositories.ebean.EbeanRepository;

public class ImperialAssaultModule extends ModuleRoutes {
	@Override
	protected ModuleRouter moduleRouter() {
		return new ImperialAssaultRouter();
	}

	@Override
	protected void bindClasses() {
		bind(DeploymentServiceImpl.class);
		bind(new TypeLiteral<Repository<DeploymentCard>>(){}).to(new TypeLiteral<EbeanRepository<DeploymentCard>>(){});
	}

	@Override
	protected boolean isEnabled() {
		return true;
	}
}