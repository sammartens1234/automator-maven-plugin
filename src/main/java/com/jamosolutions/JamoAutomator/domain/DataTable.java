package com.jamosolutions.JamoAutomator.domain;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class DataTable {
	private String keyString;
	private String name;
	private String description;
	private String data;
	private String metaData;
	private Long nbOfEntries;

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonRawValue
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@JsonRawValue
	public String getMetaData() {
		return metaData;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}

	public Long getNbOfEntries() {
		return nbOfEntries;
	}

	public void setNbOfEntries(Long nbOfEntries) {
		this.nbOfEntries = nbOfEntries;
	}
}
