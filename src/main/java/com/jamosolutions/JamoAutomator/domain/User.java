package com.jamosolutions.JamoAutomator.domain;

public class User {
	private String keyString;
	private String name;
	private String password;
	private Boolean isAdmin;
	private Boolean isEditor;
	private String firstName;
	private String surname;
	private String function;
	private String department;
	private String company;
	private Address address;
	private Boolean isActivated;
	private Boolean isBillingContact;
	private Boolean isToolContact;
	private String addressKey;
	private Boolean useQuickTips = Boolean.TRUE;
	private Boolean isSuperAdmin;

	public User() {
		super();
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public String getAddressKey() {
		return addressKey;
	}

	public void setAddressKey(String addressKey) {
		this.addressKey = addressKey;
	}

	public Boolean getUseQuickTips() {
		return useQuickTips;
	}

	public void setUseQuickTips(Boolean useQuickTips) {
		this.useQuickTips = useQuickTips;
	}

	public Boolean getIsSuperAdmin() {
		return isSuperAdmin;
	}

	public void setIsSuperAdmin(Boolean isSuperAdmin) {
		this.isSuperAdmin = isSuperAdmin;
	}
}
