package com.gendratest.models;

public class CustomErrorJson {

	private int status;
	private String error;
	private String message;
	private String path;
	private String trace;

	public CustomErrorJson(int status, String error, String message, String path, String trace) {
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
		this.trace = trace;
	}

	public int getStatus() {
		return status;
	}

	public String getError() {
		return error;
	}

	public String getMessage() {
		return message;
	}

	public String getPath() {
		return path;
	}

	public String getTrace() {
		return trace;
	}

}
