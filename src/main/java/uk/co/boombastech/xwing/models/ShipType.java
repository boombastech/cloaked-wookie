package uk.co.boombastech.xwing.models;

public class ShipType {
	private int id;
	private String shipTypeName;

	public ShipType() {
	}

	public ShipType(int id, String shipTypeName) {
		this.id = id;
		this.shipTypeName = shipTypeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShipTypeName() {
		return shipTypeName;
	}

	public void setShipTypeName(String shipTypeName) {
		this.shipTypeName = shipTypeName;
	}
}