package com.jamosolutions.JamoAutomator.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AppVersion extends BaseEntity {
	private String qaVersion;
	private String developerVersion;
	private String jamoVersion;
	private String appPackage;
	//private String installationFileName;
	private String installationFileKeyString;
	private Long installationFileSize;
	private String testableFileKeyString;
	private Long testableFileSize;
	private String testableAppVersion;
	private String launcherKeyString;
	private Long order;
	private String stringRepresentation;
	private AppDeviceRelease appDeviceRelease;
	private Date creationDate;

	public String getQaVersion() {
		return qaVersion;
	}

	public void setQaVersion(String qaVersion) {
		this.qaVersion = qaVersion;
	}

	public String getDeveloperVersion() {
		return developerVersion;
	}

	public void setDeveloperVersion(String developerVersion) {
		this.developerVersion = developerVersion;
	}

	public String getAppPackage() {
		return appPackage;
	}

	public void setAppPackage(String appPackage) {
		this.appPackage = appPackage;
	}

	public String getInstallationFileKeyString() {
		return installationFileKeyString;
	}

	public void setInstallationFileKeyString(String installationFileKeyString) {
		this.installationFileKeyString = installationFileKeyString;
	}

	public Long getInstallationFileSize() {
		return installationFileSize;
	}

	public void setInstallationFileSize(Long installationFileSize) {
		this.installationFileSize = installationFileSize;
	}

	public String getTestableFileKeyString() {
		return testableFileKeyString;
	}

	public void setTestableFileKeyString(String testableFileKeyString) {
		this.testableFileKeyString = testableFileKeyString;
	}

	public Long getTestableFileSize() {
		return testableFileSize;
	}

	public void setTestableFileSize(Long testableFileSize) {
		this.testableFileSize = testableFileSize;
	}

	public String getLauncherKeyString() {
		return launcherKeyString;
	}

	public void setLauncherKeyString(String launcherKeyString) {
		this.launcherKeyString = launcherKeyString;
	}

	public String getStringRepresentation() {
		return stringRepresentation;
	}

	public void setStringRepresentation(String stringRepresentation) {
		this.stringRepresentation = stringRepresentation;
	}

	public AppDeviceRelease getAppDeviceRelease() {
		return appDeviceRelease;
	}

	public void setAppDeviceRelease(AppDeviceRelease appDeviceRelease) {
		this.appDeviceRelease = appDeviceRelease;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public String getJamoVersion() {
		return jamoVersion;
	}

	public void setJamoVersion(String jamoVersion) {
		this.jamoVersion = jamoVersion;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ssZ")
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
