package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;
import java.util.List;

public class PingDeviceTask extends AccountNamespace implements Serializable {
	private String method = "relax";
	private AppVersion appVersion;
	private String testCaseKey;
	//TODO remove this blobkey
	private String blobKey;
	private String message;
	private Boolean usePreferedVersion;
	private List<String> appPackages;
	private Boolean deviceLicenseAvailable;
	private Boolean forceJamoUpdate = Boolean.FALSE;
	private String executionId;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public AppVersion getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(AppVersion appVersion) {
		this.appVersion = appVersion;
	}

	public String getBlobKey() {
		return blobKey;
	}

	public String getTestCaseKey() {
		return testCaseKey;
	}

	public void setTestCaseKey(String testCaseKey) {
		this.testCaseKey = testCaseKey;
	}

	public void setBlobKey(String blobKey) {
		this.blobKey = blobKey;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getUsePreferedVersion() {
		return usePreferedVersion;
	}

	public void setUsePreferedVersion(Boolean usePreferedVersion) {
		this.usePreferedVersion = usePreferedVersion;
	}

	public List<String> getAppPackages() {
		return appPackages;
	}

	public void setAppPackages(List<String> appPackages) {
		this.appPackages = appPackages;
	}

	public Boolean getDeviceLicenseAvailable() {
		return deviceLicenseAvailable;
	}

	public void setDeviceLicenseAvailable(Boolean deviceLicenseAvailable) {
		this.deviceLicenseAvailable = deviceLicenseAvailable;
	}

	public Boolean getForceJamoUpdate() {
		return forceJamoUpdate;
	}

	public void setForceJamoUpdate(Boolean forceJamoUpdate) {
		this.forceJamoUpdate = forceJamoUpdate;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}
}
