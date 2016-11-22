package com.jamosolutions.JamoAutomator.domain;

public class JamoVersion extends BaseEntity {
	private String androidVersion;
	private String iosVersion;
	private String iosAgentVersion;
	private String cloudVersion;

	public String getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}

	public String getIosVersion() {
		return iosVersion;
	}

	public void setIosVersion(String iosVersion) {
		this.iosVersion = iosVersion;
	}

	public String getCloudVersion() {
		return cloudVersion;
	}

	public void setCloudVersion(String cloudVersion) {
		this.cloudVersion = cloudVersion;
	}

	public String getIosAgentVersion() {
		return iosAgentVersion;
	}

	public void setIosAgentVersion(String iosAgentVersion) {
		this.iosAgentVersion = iosAgentVersion;
	}
}
