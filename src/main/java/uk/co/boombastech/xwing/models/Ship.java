package uk.co.boombastech.xwing.models;

import uk.co.boombastech.repositories.RepositoryItem;

public class Ship implements RepositoryItem {
	private int id;
	private String shipName;
	private Faction faction;
	private ShipType shipType;

	public Ship() {
	}

	public Ship(int id, String shipName, Faction faction, ShipType shipType) {
		this.id = id;
		this.shipName = shipName;
		this.faction = faction;
		this.shipType = shipType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public Faction getFaction() {
		return faction;
	}

	public void setFaction(Faction faction) {
		this.faction = faction;
	}

	public ShipType getShipType() {
		return shipType;
	}

	public void setShipType(ShipType shipType) {
		this.shipType = shipType;
	}
}