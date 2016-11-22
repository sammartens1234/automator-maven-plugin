package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class Application extends BaseEntity implements Serializable {
	private String name;
	private String description;
	private Project project;
	private String projectKey;
	private AppRelease rootAppRelease;

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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getProjectKey() {
		return projectKey;
	}

	public void setProjectKey(String projectKey) {
		this.projectKey = projectKey;
	}

	//	public List<AppRelease> getAppReleases() {
	//		return appReleases;
	//	}
	//
	//	public void setAppReleases(List<AppRelease> appReleases) {
	//		this.appReleases = appReleases;
	//	}
	public AppRelease getRootAppRelease() {
		return rootAppRelease;
	}

	public void setRootAppRelease(AppRelease rootAppRelease) {
		this.rootAppRelease = rootAppRelease;
	}
}
