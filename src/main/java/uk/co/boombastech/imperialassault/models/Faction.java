package uk.co.boombastech.imperialassault.models;

import uk.co.boombastech.repositories.RepositoryItem;

public class Faction implements RepositoryItem {
	private int id;
	private String name;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}
}