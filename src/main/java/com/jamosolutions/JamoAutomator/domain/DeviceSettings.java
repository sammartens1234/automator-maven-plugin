package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class DeviceSettings implements Serializable {
	private String keyString;
	private String name;
	private String localisation;
	private String screenOrientation;

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public String getScreenOrientation() {
		return screenOrientation;
	}

	public void setScreenOrientation(String screenOrientation) {
		this.screenOrientation = screenOrientation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DeviceSettings [name=" + name + ", localisation=" + localisation + ", screenOrientation=" + screenOrientation + "]";
	}
}
