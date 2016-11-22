package com.jamosolutions.JamoAutomator.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ResultVerification extends BaseEntity {
	private Long status;
	private ViewStep viewStep;
	private String viewStepKey;
	private String message;
	private Date executionDate;
	private String executionDateString;

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public ViewStep getViewStep() {
		return viewStep;
	}

	public void setViewStep(ViewStep viewStep) {
		this.viewStep = viewStep;
	}

	public String getViewStepKey() {
		return viewStepKey;
	}

	public void setViewStepKey(String viewStepKey) {
		this.viewStepKey = viewStepKey;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ssZ")
	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	public String getExecutionDateString() {
		return executionDateString;
	}

	public void setExecutionDateString(String executionDateString) {
		this.executionDateString = executionDateString;
	}
}