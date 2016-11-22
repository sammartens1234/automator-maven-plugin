package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class LoginStatus implements Serializable {
	private boolean success;
	private String username;
	private String userKeyString;
	private Boolean isSuperAdmin;
	private Boolean isAdmin;
	private Boolean isEditor;
	private Boolean isActivated;

	public LoginStatus() {
	}

	public LoginStatus(boolean success, String username) {
		this.success = success;
		this.username = username;
		this.isSuperAdmin = false;
		this.isAdmin = false;
		this.isEditor = false;
		this.isActivated = false;
		this.userKeyString = null;
	}

	public LoginStatus(boolean success, String username, Boolean isSuperAdmin, Boolean isAdmin, Boolean isEditor, Boolean isActivated, String userKeyString) {
		this.success = success;
		this.username = username;
		this.isSuperAdmin = isSuperAdmin;
		this.isAdmin = isAdmin;
		this.isEditor = isEditor;
		this.isActivated = isActivated;
		this.userKeyString = userKeyString;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getUsername() {
		return username;
	}

	public Boolean isAdmin() {
		return isAdmin;
	}

	public Boolean isEditor() {
		return isEditor;
	}

	public Boolean isSuperAdmin() {
		return isSuperAdmin;
	}

	public Boolean isActivated() {
		return isActivated;
	}

	public String getUserKeyString() {
		return userKeyString;
	}
}
