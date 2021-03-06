package com.jamosolutions.automator.domain;

import javax.xml.bind.annotation.XmlAttribute;

public class TestCase {
	private Integer timeout = 15;
	private String name;
	private String specification;

	@XmlAttribute
	public Integer getTimeout() {
		return timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute
	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}
}