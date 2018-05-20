package com.bagiswori.core.exception;

public class RunTimeException extends RuntimeException {

	private static final long serialVersionUID = -6238979836931583230L;

	private String exceptionMsg;

	public RunTimeException(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public String getExceptionMsg() {
		return this.exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

}
