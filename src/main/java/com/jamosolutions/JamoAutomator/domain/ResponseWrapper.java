package com.jamosolutions.JamoAutomator.domain;

public class ResponseWrapper<T> {
	private T data;
	private boolean success;
	private String message;

	public ResponseWrapper() {
	}

	private ResponseWrapper(T data, boolean success, String message) {
		this.data = data;
		this.success = success;
		this.message = message;
	}

	public static <T> ResponseWrapper<T> wrapIt(T data, boolean success) {
		return new ResponseWrapper<T>(data, success, null);
	}

	public static <T> ResponseWrapper<T> wrapIt(T data, boolean success, String message) {
		return new ResponseWrapper<T>(data, success, message);
	}

	public static <T> ResponseWrapper<T> wrapIt(boolean success, String message) {
		return new ResponseWrapper<T>(null, success, message);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}