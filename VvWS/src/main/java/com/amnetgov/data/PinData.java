
package com.amnetgov.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PinData", propOrder = {"sessionId", "pinNumber", "basicData"})
// @XmlRootElement(name = "")
public class PinData{

	@XmlElement(name = "AspiranteBasicData", required = false)
	protected AspiranteBasicData basicData;
	@XmlElement(name = "PinNumber", required = true)
	protected long pinNumber;
	@XmlElement(name = "SessionId", required = true)
	protected String sessionId;

	public AspiranteBasicData getBasicData() {
		return basicData;
	}

	public void setBasicData(AspiranteBasicData basicData) {
		this.basicData = basicData;
	}

	public long getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(long pinNumber) {
		this.pinNumber = pinNumber;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
