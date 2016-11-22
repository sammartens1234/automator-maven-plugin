package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class DataTableItem implements Serializable {
	private String[] values;

	public DataTableItem(String[] values) {
		this.values = values;
	}

	public String[] getValues() {
		return values;
	}

	public void setValues(String[] values) {
		this.values = values;
	}
}
