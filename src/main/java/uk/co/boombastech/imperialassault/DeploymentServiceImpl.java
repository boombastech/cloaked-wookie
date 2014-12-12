package uk.co.boombastech.imperialassault;

import uk.co.boombastech.imperialassault.models.DeploymentCard;
import uk.co.boombastech.repositories.Repository;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DeploymentServiceImpl {
	private final Repository<DeploymentCard> deploymentRepository;

	@Inject
	public DeploymentServiceImpl(Repository<DeploymentCard> deploymentRepository) {
		this.deploymentRepository = deploymentRepository;
	}
}