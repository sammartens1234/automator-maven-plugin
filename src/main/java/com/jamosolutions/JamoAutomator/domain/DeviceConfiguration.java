package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class DeviceConfiguration extends BaseEntity implements Serializable {
	private DeviceSettings deviceSettings;
	private String deviceSettingsKey;
	private MobileOS mobileOS;
	private String mobileOSKey;
	private DeviceModel deviceModel;
	private String deviceModelKey;
	private boolean active;
	private String stringRepresentation;
	private String status = "idle";

	public DeviceModel getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(DeviceModel deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getDeviceModelKey() {
		return deviceModelKey;
	}

	public void setDeviceModelKey(String deviceModelKey) {
		this.deviceModelKey = deviceModelKey;
	}

	public MobileOS getMobileOS() {
		return mobileOS;
	}

	public void setMobileOS(MobileOS mobileOS) {
		this.mobileOS = mobileOS;
	}

	public String getMobileOSKey() {
		return mobileOSKey;
	}

	public void setMobileOSKey(String mobileOSKey) {
		this.mobileOSKey = mobileOSKey;
	}

	public DeviceSettings getDeviceSettings() {
		return deviceSettings;
	}

	public void setDeviceSettings(DeviceSettings deviceSettings) {
		this.deviceSettings = deviceSettings;
	}

	public String getDeviceSettingsKey() {
		return deviceSettingsKey;
	}

	public void setDeviceSettingsKey(String deviceSettingsKey) {
		this.deviceSettingsKey = deviceSettingsKey;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getStringRepresentation() {
		StringBuilder result = new StringBuilder();
		if (this.mobileOS != null) {
			result.append(mobileOS.getType()).append(" ").append(mobileOS.getVersion());
		}
		if (this.deviceModel != null) {
			result.append(" ").append(deviceModel.getModel()).append(" ").append(deviceModel.getType());
		}
		if (this.deviceSettings != null) {
			result.append(" ").append(deviceSettings.getScreenOrientation()).append(" ").append(deviceSettings.getLocalisation());
		}
		return result.toString();
	}

	public void setStringRepresentation(String stringRepresentation) {
		this.stringRepresentation = stringRepresentation;
	}

	@Override
	public String toString() {
		return "DeviceConfiguration [deviceSettings=" + deviceSettings + ", mobileOS=" + mobileOS + ", deviceModel=" + deviceModel + "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
