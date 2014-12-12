package uk.co.boombastech.xwing.search;

import uk.co.boombastech.repositories.search.SearchCriteria;
import uk.co.boombastech.xwing.models.Pilot;

public class PilotSearchCriteria extends SearchCriteria<Pilot> {
	@Override
	public Class<Pilot> getItemClass() {
		return Pilot.class;
	}
}