package com.jamosolutions.JamoAutomator.domain;

import java.util.Date;

public class UsersAuditLog extends BaseEntity {
	private String accountName;
	private String changeStr;
	private String changeOwner;
	private Date logDate;
	//
	private String username;
	private Boolean isAdmin;
	private Boolean isEditor;
	private String firstName;
	private String surname;
	private String function;
	private String department;
	private String company;
	private Boolean isActivated;
	private Boolean isBillingContact;
	private Boolean isToolContact;
	private Boolean isSuperAdmin;
	private String address;
	private String address2;
	private String zipCode;
	private String city;
	private String state;
	private String country;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String targetUsername) {
		this.username = targetUsername;
	}

	public String getChangeStr() {
		return changeStr;
	}

	public void setChangeStr(String changeStr) {
		this.changeStr = changeStr;
	}

	public String getChangeOwner() {
		return changeOwner;
	}

	public void setChangeOwner(String changeOwner) {
		this.changeOwner = changeOwner;
	}

	public Date getLogDate() {
		return logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Boolean getIsEditor() {
		return isEditor;
	}

	public void setIsEditor(Boolean isEditor) {
		this.isEditor = isEditor;
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

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public Boolean getIsBillingContact() {
		return isBillingContact;
	}

	public void setIsBillingContact(Boolean isBillingContact) {
		this.isBillingContact = isBillingContact;
	}

	public Boolean getIsToolContact() {
		return isToolContact;
	}

	public void setIsToolContact(Boolean isToolContact) {
		this.isToolContact = isToolContact;
	}

	public Boolean getIsSuperAdmin() {
		return isSuperAdmin;
	}

	public void setIsSuperAdmin(Boolean isSuperAdmin) {
		this.isSuperAdmin = isSuperAdmin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}