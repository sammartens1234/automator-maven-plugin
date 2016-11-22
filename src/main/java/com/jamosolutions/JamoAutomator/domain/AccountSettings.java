package com.jamosolutions.JamoAutomator.domain;


public class AccountSettings extends BaseEntity {
	private String testableCreatorUrl;
	private String fileStorageUrl = "";
	private String deviceLabUrl = "";

	public String getTestableCreatorUrl() {
		return testableCreatorUrl;
	}

	public void setTestableCreatorUrl(String testableCreatorUrl) {
		this.testableCreatorUrl = testableCreatorUrl;
	}

	public String getFileStorageUrl() {
		return fileStorageUrl;
	}

	public void setFileStorageUrl(String fileStorageUrl) {
		this.fileStorageUrl = fileStorageUrl;
	}

	public String getDeviceLabUrl() {
		return deviceLabUrl;
	}

	public void setDeviceLabUrl(String deviceLabUrl) {
		this.deviceLabUrl = deviceLabUrl;
	}
}
