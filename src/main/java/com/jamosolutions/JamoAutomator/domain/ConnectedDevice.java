package com.jamosolutions.JamoAutomator.domain;

public class ConnectedDevice {
	public ConnectedDevice() {
	}

	public ConnectedDevice(String uniqueDeviceIdentifier, String name, String model) {
		super();
		this.uniqueDeviceIdentifier = uniqueDeviceIdentifier;
		this.name = name;
		this.model = model;
	}

	private String uniqueDeviceIdentifier;
	private String name;
	private String model;

	public String getUniqueDeviceIdentifier() {
		return uniqueDeviceIdentifier;
	}

	public void setUniqueDeviceIdentifier(String uniqueDeviceIdentifier) {
		this.uniqueDeviceIdentifier = uniqueDeviceIdentifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}