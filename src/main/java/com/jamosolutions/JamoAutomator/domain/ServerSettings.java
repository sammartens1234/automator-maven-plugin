package com.jamosolutions.JamoAutomator.domain;


public class ServerSettings extends BaseEntity {
	private String testableCreatorUrl;
	private Boolean isOnPremise;
	private String serverIp;
	private String jamoUrl;

	public String getTestableCreatorUrl() {
		return testableCreatorUrl;
	}

	public void setTestableCreatorUrl(String testableCreatorUrl) {
		this.testableCreatorUrl = testableCreatorUrl;
	}

	public Boolean getIsOnPremise() {
		return isOnPremise;
	}

	public void setIsOnPremise(Boolean isOnPremise) {
		this.isOnPremise = (isOnPremise != null) ? isOnPremise : false;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getJamoUrl() {
		return jamoUrl;
	}

	public void setJamoUrl(String jamoUrl) {
		this.jamoUrl = jamoUrl;
	}
}