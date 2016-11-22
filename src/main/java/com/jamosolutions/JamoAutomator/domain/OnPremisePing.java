package com.jamosolutions.JamoAutomator.domain;

import java.util.Date;

public class OnPremisePing extends BaseEntity {
	private String accountName;
	private Date lastPingDate;
	private Boolean lastPingResult;
	private String nodeAddress;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Date getLastPingDate() {
		return lastPingDate;
	}

	public void setLastPingDate(Date lastPingDate) {
		this.lastPingDate = lastPingDate;
	}

	public Boolean getLastPingResult() {
		return lastPingResult;
	}

	public void setLastPingResult(Boolean lastPingResult) {
		this.lastPingResult = lastPingResult;
	}

	public String getNodeAddress() {
		return nodeAddress;
	}

	public void setNodeAddress(String nodeAddress) {
		this.nodeAddress = nodeAddress;
	}
}
