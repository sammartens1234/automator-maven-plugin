package com.jamosolutions.JamoAutomator.domain;

public class PreferedAppVersion extends BaseEntity {
	private String userKey;
	private String appKey;
	private String preferedIosVersionKey;
	private String preferedIosTabletVersionKey;
	private String preferedIosSmartphoneVersionKey;
	private String preferedAndroidVersionKey;
	private String preferedAndroidTabletVersionKey;
	private String preferedAndroidSmartphoneVersionKey;

	public String getUserKey() {
		return userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getPreferedIosVersionKey() {
		return preferedIosVersionKey;
	}

	public void setPreferedIosVersionKey(String preferedIosVersionKey) {
		this.preferedIosVersionKey = preferedIosVersionKey;
	}

	public String getPreferedIosTabletVersionKey() {
		return preferedIosTabletVersionKey;
	}

	public void setPreferedIosTabletVersionKey(String preferedIosTabletVersionKey) {
		this.preferedIosTabletVersionKey = preferedIosTabletVersionKey;
	}

	public String getPreferedIosSmartphoneVersionKey() {
		return preferedIosSmartphoneVersionKey;
	}

	public void setPreferedIosSmartphoneVersionKey(String preferedIosSmartphoneVersionKey) {
		this.preferedIosSmartphoneVersionKey = preferedIosSmartphoneVersionKey;
	}

	public String getPreferedAndroidVersionKey() {
		return preferedAndroidVersionKey;
	}

	public void setPreferedAndroidVersionKey(String preferedAndroidVersionKey) {
		this.preferedAndroidVersionKey = preferedAndroidVersionKey;
	}

	public String getPreferedAndroidTabletVersionKey() {
		return preferedAndroidTabletVersionKey;
	}

	public void setPreferedAndroidTabletVersionKey(String preferedAndroidTabletVersionKey) {
		this.preferedAndroidTabletVersionKey = preferedAndroidTabletVersionKey;
	}

	public String getPreferedAndroidSmartphoneVersionKey() {
		return preferedAndroidSmartphoneVersionKey;
	}

	public void setPreferedAndroidSmartphoneVersionKey(String preferedAndroidSmartphoneVersionKey) {
		this.preferedAndroidSmartphoneVersionKey = preferedAndroidSmartphoneVersionKey;
	}
}
