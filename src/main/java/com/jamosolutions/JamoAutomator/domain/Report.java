package com.jamosolutions.JamoAutomator.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

@XmlRootElement
public class Report {
	private String keyString;
	private Long status;
	private Date creationDate;
	private Date endDate;
	// TODO remove this once we got rid of the endpoint api
	private String creationDateString;
	private String endDateString;
	private List<ResultStep> resultSteps = new ArrayList<>();
	private String viewKey;
	private View view;
	private String appVersionKey;
	private AppVersion appVersion;
	private String appRelease;
	private String remark;
	private Long buildNumber;
	private Boolean jamoVersionUpToDate = Boolean.TRUE;
	// copy of view steps
	private List<ViewStep> viewSteps = new ArrayList<>();
	private String message;
	private String executionId;

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ssZ")
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ssZ")
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<ResultStep> getResultSteps() {
		return resultSteps;
	}

	public void setResultSteps(List<ResultStep> resultSteps) {
		this.resultSteps = resultSteps;
	}

	public String getViewKey() {
		return viewKey;
	}

	public void setViewKey(String viewKey) {
		this.viewKey = viewKey;
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public Long getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(Long buildNumber) {
		this.buildNumber = buildNumber;
	}

	public String getCreationDateString() {
		return creationDateString;
	}

	public void setCreationDateString(String creationDateString) {
		this.creationDateString = creationDateString;
	}

	public String getEndDateString() {
		return endDateString;
	}

	public void setEndDateString(String endDateString) {
		this.endDateString = endDateString;
	}

	public List<ViewStep> getViewSteps() {
		return viewSteps;
	}

	public void setViewSteps(List<ViewStep> viewSteps) {
		this.viewSteps = viewSteps;
	}

	public String getAppVersionKey() {
		return appVersionKey;
	}

	public void setAppVersionKey(String appVersionKey) {
		this.appVersionKey = appVersionKey;
	}

	public AppVersion getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(AppVersion appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppRelease() {
		return appRelease;
	}

	public void setAppRelease(String appRelease) {
		this.appRelease = appRelease;
	}

	public Boolean getJamoVersionUpToDate() {
		return jamoVersionUpToDate;
	}

	public void setJamoVersionUpToDate(Boolean jamoVersionUpToDate) {
		this.jamoVersionUpToDate = jamoVersionUpToDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}
}