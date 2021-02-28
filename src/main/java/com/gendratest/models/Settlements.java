package com.gendratest.models;

public class Settlements {

	private String name; // colonia
	private String zoneType; //
	private String settlementType;

	public Settlements(String name, String zoneType, String settlementType) {
		this.name = name;
		this.zoneType = zoneType;
		this.settlementType = settlementType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZoneType() {
		return zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}

	public String getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	@Override
	public String toString() {
		return "Settlements [name=" + name + ", zoneType=" + zoneType + ", settlementType=" + settlementType + "]";
	}

	
}
