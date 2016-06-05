package com.amnetgov.exception;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXParseException;

public class ValidationInterceptor extends AbstractPhaseInterceptor<Message> implements ValidationEventHandler{

	private static final Logger logger = LogManager.getLogger(ValidationInterceptor.class.getName());

	public ValidationInterceptor() {
		super(Phase.MARSHAL);
	}

	@Override
	public void handleMessage(Message message) {
		Fault fault = (Fault) message.getContent(Exception.class);
		Throwable cause = fault.getCause();
		while (cause != null) {
			if (cause instanceof SAXParseException) {
				fault.setStatusCode(12123);
				fault.setMessage("Parameter not allowed at line " + ((SAXParseException) cause).getLineNumber());
				logger.warn(fault.getMessage(),cause);
				break;
			}
			cause = cause.getCause();
		}
	}

	public boolean handleEvent(ValidationEvent event) {
		System.out.println("\nEVENT");
		System.out.println("SEVERITY:  " + event.getSeverity());
		System.out.println("MESSAGE:  " + event.getMessage());
		System.out.println("LINKED EXCEPTION:  " + event.getLinkedException());
		System.out.println("LOCATOR");
		System.out.println("    LINE NUMBER:  " + event.getLocator().getLineNumber());
		System.out.println("    COLUMN NUMBER:  " + event.getLocator().getColumnNumber());
		System.out.println("    OFFSET:  " + event.getLocator().getOffset());
		System.out.println("    OBJECT:  " + event.getLocator().getObject());
		System.out.println("    NODE:  " + event.getLocator().getNode());
		System.out.println("    URL:  " + event.getLocator().getURL());
		return true;
	}

}