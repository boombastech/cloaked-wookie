package uk.co.boombastech.xwing.models;

import uk.co.boombastech.repositories.RepositoryItem;

public class Faction implements RepositoryItem{
	private int factionId;
	private String factionName;

	public Faction() {
	}

	public Faction(int factionId, String factionName) {
		this.factionId = factionId;
		this.factionName = factionName;
	}

	public int getFactionId() {
		return factionId;
	}

	public void setFactionId(int factionId) {
		this.factionId = factionId;
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	@Override
	public Integer getId() {
		return factionId;
	}

	@Override
	public void setId(int id) {
		this.factionId = id;
	}
}