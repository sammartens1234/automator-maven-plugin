package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class MobileOS implements Serializable {
	private String keyString;
	private String type;
	private String version;

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "MobileOS [type=" + type + ", version=" + version + "]";
	}
}
