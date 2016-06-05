package com.amnetgov.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "VvException", faultBean = "com.vvamir.exception.ErrorDetailsBean")
public class VvException extends Exception{

	private static final long serialVersionUID = 1L;
	

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
