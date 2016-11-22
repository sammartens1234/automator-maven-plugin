package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class ExecutionEnvironment extends BaseEntity implements Serializable {
	private DeviceConfiguration deviceConfiguration;
	private String deviceConfigurationKey;
	private AppVersion appVersion;
	private String appVersionKey;

	public DeviceConfiguration getDeviceConfiguration() {
		return deviceConfiguration;
	}

	public void setDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
		this.deviceConfiguration = deviceConfiguration;
	}

	public String getDeviceConfigurationKey() {
		return deviceConfigurationKey;
	}

	public void setDeviceConfigurationKey(String deviceConfigurationKey) {
		this.deviceConfigurationKey = deviceConfigurationKey;
	}

	public AppVersion getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(AppVersion appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppVersionKey() {
		return appVersionKey;
	}

	public void setAppVersionKey(String appVersionKey) {
		this.appVersionKey = appVersionKey;
	}
}
