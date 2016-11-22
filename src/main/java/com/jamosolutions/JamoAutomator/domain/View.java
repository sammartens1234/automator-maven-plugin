package com.jamosolutions.JamoAutomator.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class View {
	private String keyString;
	private String active;
	private String completeness;
	private DeviceConfiguration deviceConfiguration;
	private String deviceConfigurationKey;
	private String latestAppVersionKey;
	private AppVersion latestAppVersion;
	private String reportCursor;
	private List<ViewStep> viewSteps = new ArrayList<>();
	// TODO move this to super class with these extra fields
	private List<Report> reports = new ArrayList<>();
	private String latestReportKey;
	private Report latestReport;
	private String latestSuccessReportKey;
	private Report latestSuccessReport;
	private String latestFailureReportKey;
	private Report latestFailureReport;
	private String ancestorDescription;
	private String appName;
	private String specificationKeyString;
	private String testCaseKeyString;
	private Boolean dirty = false;
	private String parentKeyString;

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCompleteness() {
		return completeness;
	}

	public void setCompleteness(String completeness) {
		this.completeness = completeness;
	}

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public List<ViewStep> getViewSteps() {
		return viewSteps;
	}

	public void setViewSteps(List<ViewStep> viewSteps) {
		this.viewSteps = viewSteps;
	}

	public String getLatestAppVersionKey() {
		return latestAppVersionKey;
	}

	public void setLatestAppVersionKey(String latestAppVersionKey) {
		this.latestAppVersionKey = latestAppVersionKey;
	}

	public AppVersion getLatestAppVersion() {
		return latestAppVersion;
	}

	public void setLatestAppVersion(AppVersion latestAppVersion) {
		this.latestAppVersion = latestAppVersion;
	}

	public DeviceConfiguration getDeviceConfiguration() {
		return deviceConfiguration;
	}

	public void setDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
		this.deviceConfiguration = deviceConfiguration;
	}

	public String getDeviceConfigurationKey() {
		return deviceConfigurationKey;
	}

	public void setDeviceConfigurationKey(String deviceConfigurationKey) {
		this.deviceConfigurationKey = deviceConfigurationKey;
	}

	public String getLatestReportKey() {
		return latestReportKey;
	}

	public void setLatestReportKey(String latestReportKey) {
		this.latestReportKey = latestReportKey;
	}

	public Report getLatestReport() {
		return latestReport;
	}

	public void setLatestReport(Report latestReport) {
		this.latestReport = latestReport;
	}

	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	public Report getLatestSuccessReport() {
		return latestSuccessReport;
	}

	public void setLatestSuccessReport(Report latestSuccessReport) {
		this.latestSuccessReport = latestSuccessReport;
	}

	public String getLatestSuccessReportKey() {
		return latestSuccessReportKey;
	}

	public void setLatestSuccessReportKey(String latestSuccessReportKey) {
		this.latestSuccessReportKey = latestSuccessReportKey;
	}

	public Report getLatestFailureReport() {
		return latestFailureReport;
	}

	public void setLatestFailureReport(Report latestFailureReport) {
		this.latestFailureReport = latestFailureReport;
	}

	public String getLatestFailureReportKey() {
		return latestFailureReportKey;
	}

	public void setLatestFailureReportKey(String latestFailureReportKey) {
		this.latestFailureReportKey = latestFailureReportKey;
	}

	public String getAncestorDescription() {
		return ancestorDescription;
	}

	public void setAncestorDescription(String ancestorDescription) {
		this.ancestorDescription = ancestorDescription;
	}

	public String getSpecificationKeyString() {
		return specificationKeyString;
	}

	public void setSpecificationKeyString(String specificationKeyString) {
		this.specificationKeyString = specificationKeyString;
	}

	public String getTestCaseKeyString() {
		return testCaseKeyString;
	}

	public void setTestCaseKeyString(String testCaseKeyString) {
		this.testCaseKeyString = testCaseKeyString;
	}

	public String getReportCursor() {
		return reportCursor;
	}

	public void setReportCursor(String reportCursor) {
		this.reportCursor = reportCursor;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	@JsonIgnore
	public ExecutionEnvironment getExecutionEnvironment() {
		ExecutionEnvironment executionEnvironment = new ExecutionEnvironment();
		executionEnvironment.setAppVersion(this.latestAppVersion);
		executionEnvironment.setAppVersionKey(this.latestAppVersionKey);
		executionEnvironment.setDeviceConfiguration(this.deviceConfiguration);
		executionEnvironment.setDeviceConfigurationKey(this.deviceConfigurationKey);
		return executionEnvironment;
	}

	public Boolean getDirty() {
		return dirty;
	}

	public void setDirty(Boolean dirty) {
		this.dirty = dirty;
	}

	public String getParentKeyString() {
		return parentKeyString;
	}

	public void setParentKeyString(String parentKeyString) {
		this.parentKeyString = parentKeyString;
	}
}
