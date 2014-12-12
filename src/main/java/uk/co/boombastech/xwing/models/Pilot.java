package uk.co.boombastech.xwing.models;

import uk.co.boombastech.repositories.RepositoryItem;

import java.util.List;

public class Pilot implements RepositoryItem {
	private int id;
	private String pilotName;
	private Ship ship;
	private int pilotSkill;
	private int attack;
	private int agilty;
	private int hullPoints;
	private int shieldPoints;
	private List<ActionType> actions;
	private List<UpgradeType> upgrades;


	public Pilot() {
	}

	public Pilot(int id, String pilotName, Ship ship, int pilotSkill, int attack, int agilty, int hullPoints, int shieldPoints) {
		this.id = id;
		this.pilotName = pilotName;
		this.ship = ship;
		this.pilotSkill = pilotSkill;
		this.attack = attack;
		this.agilty = agilty;
		this.hullPoints = hullPoints;
		this.shieldPoints = shieldPoints;
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	public String getPilotName() {
		return pilotName;
	}

	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public int getPilotSkill() {
		return pilotSkill;
	}

	public void setPilotSkill(int pilotSkill) {
		this.pilotSkill = pilotSkill;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getAgilty() {
		return agilty;
	}

	public void setAgilty(int agilty) {
		this.agilty = agilty;
	}

	public int getHullPoints() {
		return hullPoints;
	}

	public void setHullPoints(int hullPoints) {
		this.hullPoints = hullPoints;
	}

	public int getShieldPoints() {
		return shieldPoints;
	}

	public void setShieldPoints(int shieldPoints) {
		this.shieldPoints = shieldPoints;
	}
}