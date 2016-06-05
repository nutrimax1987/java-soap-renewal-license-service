
package com.amnetgov.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "registroReporteFavorableResult" })
@XmlRootElement(name = "RegistroReporteFavorableResponse")
public class RegistroReporteFavorableResponse {

	@XmlElement(name = "RegistroReporteFavorableResult")
	protected boolean registroReporteFavorableResult;

	/**
	 * Gets the value of the registroReporteFavorableResult property.
	 * 
	 */
	public boolean isRegistroReporteFavorableResult() {
		return registroReporteFavorableResult;
	}

	/**
	 * Sets the value of the registroReporteFavorableResult property.
	 * 
	 */
	public void setRegistroReporteFavorableResult(boolean value) {
		this.registroReporteFavorableResult = value;
	}

}
