package com.amnetgov.exception;

import javax.xml.bind.annotation.XmlElement;

public class ErrorDetailsBean {

	private int errorCode;
	private String errorMessage;

	@XmlElement(name = "errorCode")
	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	@XmlElement(name = "errorMessage")
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}