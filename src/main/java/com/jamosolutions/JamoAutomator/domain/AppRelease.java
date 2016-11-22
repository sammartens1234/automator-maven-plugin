package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AppRelease extends BaseEntity implements Serializable {
	private String name;
	private String description;
	private AppRelease previousRelease;
	//rename to parent key
	private String previousReleaseKey;
	private List<AppRelease> children = new ArrayList<>();
	private List<AppVersion> appVersions = new ArrayList<>();
	private List<AppDeviceRelease> appDeviceReleases = new ArrayList<>();
	private Application application;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<AppVersion> getAppVersions() {
		return appVersions;
	}

	public void setAppVersions(List<AppVersion> appVersions) {
		this.appVersions = appVersions;
	}

	@JsonIgnore
	public List<AppDeviceRelease> getAppDeviceReleases() {
		return appDeviceReleases;
	}

	public void setAppDeviceReleases(List<AppDeviceRelease> appDeviceReleases) {
		this.appDeviceReleases = appDeviceReleases;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public AppRelease getPreviousRelease() {
		return previousRelease;
	}

	public void setPreviousRelease(AppRelease previousRelease) {
		this.previousRelease = previousRelease;
	}

	public String getPreviousReleaseKey() {
		return previousReleaseKey;
	}

	public void setPreviousReleaseKey(String previousReleaseKey) {
		this.previousReleaseKey = previousReleaseKey;
	}

	public List<AppRelease> getChildren() {
		return children;
	}

	public void setChildren(List<AppRelease> children) {
		this.children = children;
	}
}
