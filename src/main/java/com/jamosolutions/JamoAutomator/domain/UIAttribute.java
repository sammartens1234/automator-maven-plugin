package com.jamosolutions.JamoAutomator.domain;


public class UIAttribute {
	private String name;
	private String value;

	public UIAttribute() {
		super();
	}

	public UIAttribute(String attributeName, String attributeValue) {
		this.name = attributeName;
		this.value = attributeValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
