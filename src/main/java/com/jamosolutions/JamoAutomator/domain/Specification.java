package com.jamosolutions.JamoAutomator.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Specification {
	private String keyString;
	private String name;
	private String description;
	private Date latestUpdate;
	private String status;
	protected String parentKeyString;
	private Long order;
	private List<View> views = new ArrayList<>();
	private List<StepSpecification> stepSpecifications = new ArrayList<>();
	private AppRelease recordedAppRelease;
	private String recordedAppReleaseKey;
	private List<DataTable> dataTables = new ArrayList<>();
	private List<String> dataTableKeys = new ArrayList<>();
	private String type = "normal";

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

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ssZ")
	public Date getLatestUpdate() {
		return latestUpdate;
	}

	public void setLatestUpdate(Date latestUpdate) {
		this.latestUpdate = latestUpdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<View> getViews() {
		return views;
	}

	public void setViews(List<View> views) {
		this.views = views;
	}

	public List<StepSpecification> getStepSpecifications() {
		return stepSpecifications;
	}

	public void setStepSpecifications(List<StepSpecification> stepSpecifications) {
		this.stepSpecifications = stepSpecifications;
	}

	public List<DataTable> getDataTables() {
		return dataTables;
	}

	public void setDataTables(List<DataTable> dataTables) {
		this.dataTables = dataTables;
	}

	public List<String> getDataTableKeys() {
		return dataTableKeys;
	}

	public void setDataTableKeys(List<String> dataTableKeys) {
		this.dataTableKeys = dataTableKeys;
	}

	public String getParentKeyString() {
		return parentKeyString;
	}

	public void setParentKeyString(String parentKeyString) {
		this.parentKeyString = parentKeyString;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public AppRelease getRecordedAppRelease() {
		return recordedAppRelease;
	}

	public void setRecordedAppRelease(AppRelease recordedAppRelease) {
		this.recordedAppRelease = recordedAppRelease;
	}

	public String getRecordedAppReleaseKey() {
		return recordedAppReleaseKey;
	}

	public void setRecordedAppReleaseKey(String recordedAppReleaseKey) {
		this.recordedAppReleaseKey = recordedAppReleaseKey;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
