package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class AccountNamespace implements Serializable {
	private String namespaceKeyString;
	private String name;
	/**
	 * HUIHUI FIELD
	 * 
	 */
	private String namespace;

	public AccountNamespace() {
		super();
	}

	public AccountNamespace(String name) {
		super();
		this.name = name;
	}

	/**
	 * HUIHUI
	 * 
	 * @return
	 */
	public String getNamespaceKeyString() {
		return namespaceKeyString;
	}

	public void setNamespaceKeyString(String namespaceKeyString) {
		this.namespaceKeyString = namespaceKeyString;
	}

	public String getName() {
		return name;
	}

	/**
	 * HUIHUI SETTER
	 * 
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}
}
