package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;
import java.util.Date;

public class PingCloud implements Serializable {
	private String status = "unsuccessful";
	private Date pingDate = new Date();

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPingDate() {
		return pingDate;
	}

	public void setLastPingDate(Date lastPingDate) {
		this.pingDate = lastPingDate;
	}
}
