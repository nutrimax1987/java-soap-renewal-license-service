package com.amnetgov.exception;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.xml.sax.SAXParseException;

public class ValidationInterceptor extends AbstractPhaseInterceptor<Message> {
	public ValidationInterceptor() {
		super(Phase.MARSHAL);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		Fault fault = (Fault) message.getContent(Exception.class);
		Throwable cause = fault.getCause();
		while (cause != null) {
			if (cause instanceof SAXParseException) {
				fault.setMessage("Service error : "+ fault.getDetail() + " parameter");
				break;
			}
			cause = cause.getCause();
		}
	}
	
	
}