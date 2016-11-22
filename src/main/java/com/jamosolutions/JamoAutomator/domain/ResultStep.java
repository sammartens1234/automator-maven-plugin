package com.jamosolutions.JamoAutomator.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ResultStep {
	private Long status;
	private String errorType;
	private ViewStep viewStep;
	private String viewStepKey;
	private String message;
	private String keyString;
	private Long order;
	private Long iterationOrder;
	private Date executionDate;
	private String executionDateString;
	private String remark;
	private List<ResultVerification> resultVerifications = new ArrayList<>();
	private Boolean hasScrolled;

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

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public Long getIterationOrder() {
		return iterationOrder;
	}

	public void setIterationOrder(Long iterationOrder) {
		this.iterationOrder = iterationOrder;
	}

	public List<ResultVerification> getResultVerifications() {
		return resultVerifications;
	}

	public void setResultVerifications(List<ResultVerification> resultVerifications) {
		this.resultVerifications = resultVerifications;
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

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public Boolean getHasScrolled() {
		return hasScrolled;
	}

	public void setHasScrolled(Boolean hasScrolled) {
		this.hasScrolled = hasScrolled;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
