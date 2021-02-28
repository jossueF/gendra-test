package com.gendratest.models;

import java.util.List;

public class ZipCodeData {

	private String zipCode;
	private String locality; // localidad
	private String federalEntity; // estado
	private List<Settlements> settlements;
	private String municipality;

	public ZipCodeData(String zipCode, String locality, String federalEntity, List<Settlements> setlements,
			String municipality) {
		this.zipCode = zipCode;
		this.locality = locality;
		this.federalEntity = federalEntity;
		this.settlements = setlements;
		this.municipality = municipality;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getFederalEntity() {
		return federalEntity;
	}

	public void setFederalEntity(String federalEntity) {
		this.federalEntity = federalEntity;
	}

	public List<Settlements> getSetlements() {
		return settlements;
	}

	public void setSetlements(List<Settlements> settlements) {
		this.settlements = settlements;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	@Override
	public String toString() {
		return "ZipCodeData [zipCode=" + zipCode + ", locality=" + locality + ", federalEntity=" + federalEntity
				+ ", setlements=" + settlements + ", municipality=" + municipality + "]";
	}

	

	
}
