package uk.co.boombastech.imperialassault.models;

import uk.co.boombastech.repositories.RepositoryItem;

import java.util.List;

public class DeploymentCard implements RepositoryItem {
	private int id;
	private String name;
	private boolean unique;
	private int health;
	private int speed;
	private List<Die> defenseDice;
	private List<Die> attackDice;
	private AttackType attackType;
	private int quantity;
	private int cost;
	private List<Type> types;
	private Faction faction;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}
}