package com.jamosolutions.JamoAutomator.domain;

public class AppVersionDetail extends BaseEntity {
	private String qaVersion;
	private String devicePlatform;
	private String mobileOS;
	private String jamoVersion;
	private String appRelease;
	private String appName;

	public String getQaVersion() {
		return qaVersion;
	}

	public void setQaVersion(String qaVersion) {
		this.qaVersion = qaVersion;
	}

	public String getDevicePlatform() {
		return devicePlatform;
	}

	public void setDevicePlatform(String devicePlatform) {
		this.devicePlatform = devicePlatform;
	}

	public String getAppRelease() {
		return appRelease;
	}

	public void setAppRelease(String appRelease) {
		this.appRelease = appRelease;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getMobileOS() {
		return mobileOS;
	}

	public void setMobileOS(String mobileOS) {
		this.mobileOS = mobileOS;
	}

	public String getJamoVersion() {
		return jamoVersion;
	}

	public void setJamoVersion(String jamoVersion) {
		this.jamoVersion = jamoVersion;
	}
}
