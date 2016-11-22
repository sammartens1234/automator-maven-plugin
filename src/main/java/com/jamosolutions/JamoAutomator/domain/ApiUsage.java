package com.jamosolutions.JamoAutomator.domain;

import java.util.Map;

public class ApiUsage extends BaseEntity {
	Map<String, Object> values;

	public Map<String, Object> getValues() {
		return values;
	}

	public void setValues(Map<String, Object> values) {
		this.values = values;
	}
}
