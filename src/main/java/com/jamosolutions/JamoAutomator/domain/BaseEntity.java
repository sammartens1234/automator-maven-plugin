package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	private String keyString;

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}
}
