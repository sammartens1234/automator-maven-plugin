package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class Argument implements Serializable {
	protected String keyString;
	protected String parentKeyString;
	// defined types: CONSTANT, DATA_TABLE, DATAPOINT, DATE_CONSTANT
	private String type;
	private String value;
	// will be ColumnName, RowIndex, Property or ExpectedValue
	private String field;
	private Argument dataTable;
	private Argument columnName;
	private Argument rowIndex;
	private Argument dataPoint;

	public String getType() {
		return type;
	}

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Argument getDataTable() {
		return dataTable;
	}

	public void setDataTable(Argument dataTable) {
		this.dataTable = dataTable;
	}

	public Argument getColumnName() {
		return columnName;
	}

	public void setColumnName(Argument columnName) {
		this.columnName = columnName;
	}

	public Argument getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(Argument rowIndex) {
		this.rowIndex = rowIndex;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getParentKeyString() {
		return parentKeyString;
	}

	public void setParentKeyString(String parentKeyString) {
		this.parentKeyString = parentKeyString;
	}

	public Argument getDataPoint() {
		return dataPoint;
	}

	public void setDataPoint(Argument dataPoint) {
		this.dataPoint = dataPoint;
	}
}
