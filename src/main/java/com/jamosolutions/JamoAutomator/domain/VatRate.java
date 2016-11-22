package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VatRate implements Serializable {
	private Boolean success;
	private Long vat_rate;

	public VatRate() {
	}

	public VatRate(Boolean success, Long rate) {
		this.success = success;
		this.vat_rate = rate;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getVat_rate() {
		return vat_rate;
	}

	public void setVat_rate(Long vat_rate) {
		this.vat_rate = vat_rate;
	}
}
