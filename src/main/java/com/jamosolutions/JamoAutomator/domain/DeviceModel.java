package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class DeviceModel implements Serializable {
	private String keyString;
	private String uniqueId;
	private String manufacturer;
	private String type;
	private String model;
	private String uniqueDeviceIdentification;
	private boolean available;

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUniqueDeviceIdentification() {
		return uniqueDeviceIdentification;
	}

	public void setUniqueDeviceIdentification(String uniqueDeviceIdentification) {
		this.uniqueDeviceIdentification = uniqueDeviceIdentification;
	}

	@Override
	public String toString() {
		return "DeviceModel [uniqueId=" + uniqueId + ", manufacturer=" + manufacturer + ", type=" + type + ", model=" + model + "]";
	}
}
