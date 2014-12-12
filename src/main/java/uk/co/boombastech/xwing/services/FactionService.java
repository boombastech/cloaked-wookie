package uk.co.boombastech.xwing.services;

import uk.co.boombastech.repositories.Repository;
import uk.co.boombastech.repositories.search.SearchCriteria;
import uk.co.boombastech.xwing.models.Faction;

import javax.inject.Inject;
import java.util.List;

public class FactionService {

	private final Repository<Faction> factionRepository;

	@Inject
	public FactionService(Repository<Faction> factionRepository) {
		this.factionRepository = factionRepository;
	}

	public List<Faction> getFactions() {
		return factionRepository.retrieve(new SearchCriteria<Faction>() {
			@Override
			public Class<Faction> getItemClass() {
				return Faction.class;
			}
		});
	}
}