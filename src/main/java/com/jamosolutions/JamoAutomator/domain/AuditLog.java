package com.jamosolutions.JamoAutomator.domain;

import java.util.Date;

public class AuditLog {
	private String keyString;
	private String accountName;
	private Date accountCreationDate;
	private String email;
	private String firstName;
	private String surname;
	private String company;
	private Boolean isActivated;
	private Date licenseExpiration;
	private Boolean licenseExpired;
	private Long nbOfDevices;
	private Long nbOfTestCases;
	private Long nbOfReports;
	private Long nbOfApps;

	public AuditLog() {
		super();
	}

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Boolean getIsActivated() {
		return isActivated;
	}

	public void setIsActivated(Boolean isActivated) {
		this.isActivated = isActivated;
	}

	public Date getLicenseExpiration() {
		return licenseExpiration;
	}

	public void setLicenseExpiration(Date licenseExpiration) {
		this.licenseExpiration = licenseExpiration;
	}

	public Long getNbOfDevices() {
		return nbOfDevices;
	}

	public void setNbOfDevices(Long nbOfDevices) {
		this.nbOfDevices = nbOfDevices;
	}

	public Long getNbOfTestCases() {
		return nbOfTestCases;
	}

	public void setNbOfTestCases(Long nbOfTestCases) {
		this.nbOfTestCases = nbOfTestCases;
	}

	public Long getNbOfReports() {
		return nbOfReports;
	}

	public void setNbOfReports(Long nbOfReports) {
		this.nbOfReports = nbOfReports;
	}

	public Long getNbOfApps() {
		return nbOfApps;
	}

	public void setNbOfApps(Long nbOfApps) {
		this.nbOfApps = nbOfApps;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Boolean getLicenseExpired() {
		return licenseExpired;
	}

	public void setLicenseExpired(Boolean licenseExpired) {
		this.licenseExpired = licenseExpired;
	}

	public Date getAccountCreationDate() {
		return accountCreationDate;
	}

	public void setAccountCreationDate(Date accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}
}
