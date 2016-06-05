package com.amnetgov.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "VvFault", faultBean = "com.amnetgov.exception.ErrorDetailsBean", targetNamespace = "http://amnetgov.com/")
public class VvException extends Exception {

	private static final long serialVersionUID = -2773995718764695320L;
	private ErrorDetailsBean errorBean;

	public VvException() {
	}

	protected VvException(ErrorDetailsBean fault) {
		super(fault.getErrorMessage());
		this.errorBean = fault;
	}

	public VvException(String message, ErrorDetailsBean errorBean) {
		super(message);
		this.errorBean = errorBean;
	}

	public VvException(String message, ErrorDetailsBean errorBean, Throwable cause) {
		super(message, cause);
		this.errorBean = errorBean;
	}

	public ErrorDetailsBean getFaultInfo() {
		return errorBean;
	}

	public VvException(String errorMessage) {
		super(errorMessage);
	}

	public VvException(int errorCode, String errorMessage) {
		super(errorMessage);
		this.errorBean = new ErrorDetailsBean();
		this.errorBean.setErrorCode(errorCode);
		this.errorBean.setErrorMessage(errorMessage);
	}

	public VvException(Throwable cause) {
		super(cause);
	}

	public VvException(String message, Throwable cause) {
		super(message, cause);
	}

}
