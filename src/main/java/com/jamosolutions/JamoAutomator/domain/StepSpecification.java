package com.jamosolutions.JamoAutomator.domain;

public class StepSpecification {
	private String name;
	private String description;
	private String keyString;
	private String parentKeyString;

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

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public String getParentKeyString() {
		return parentKeyString;
	}

	public void setParentKeyString(String parentKeyString) {
		this.parentKeyString = parentKeyString;
	}
}
