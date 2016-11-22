package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AppDeviceRelease extends BaseEntity implements Serializable {
	private List<AppVersion> appVersions = new ArrayList<>();
	private String mobileOS;
	private String devicePlatform = "both";

	public String getMobileOS() {
		return mobileOS;
	}

	public void setMobileOS(String mobileOS) {
		this.mobileOS = mobileOS;
	}

	@JsonIgnore
	public List<AppVersion> getAppVersions() {
		return appVersions;
	}

	public void setAppVersions(List<AppVersion> appVersions) {
		this.appVersions = appVersions;
	}

	public String getDevicePlatform() {
		return devicePlatform;
	}

	public void setDevicePlatform(String devicePlatform) {
		this.devicePlatform = devicePlatform;
	}
}
