package com.amnetgov.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The persistent class for the tcrc database table.
 * 
 */

@XmlAccessorType(XmlAccessType.NONE)
public class CrcData extends InitialCrcData{

	@XmlElement(name = "SessionCode")
	protected String sessionCode;
	@XmlElement(name = "SessionCode2")
	protected String sessionCode2;
	
	
	
	public String getSessionCode2() {
		return sessionCode2;
	}

	
	public void setSessionCode2(String sessionCode2) {
		this.sessionCode2 = sessionCode2;
	}

	// @XmlElement(name = "SessionId", required = true)
	protected String sessionId;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSessionCode() {
		return sessionCode;
	}

	public void setSessionCode(String sessionCode) {
		this.sessionCode = sessionCode;
	}

	public CrcData() {
		super();
	}

}