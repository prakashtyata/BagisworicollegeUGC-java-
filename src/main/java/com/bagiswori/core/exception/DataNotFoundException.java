package com.bagiswori.core.exception;

public class DataNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1348139473945603650L;

	private int code;

	private String message;

	public DataNotFoundException() {
	}

	public DataNotFoundException(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
