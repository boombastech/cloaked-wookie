package uk.co.boombastech.xwing.search;

import uk.co.boombastech.repositories.search.SearchCriteria;
import uk.co.boombastech.xwing.models.Ship;

public class ShipSearchCriteria extends SearchCriteria<Ship> {

	@Override
	public Class<Ship> getItemClass() {
		return Ship.class;
	}
}