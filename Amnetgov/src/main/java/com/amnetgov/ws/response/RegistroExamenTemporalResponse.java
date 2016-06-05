
package com.amnetgov.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "registroExamenTemporalResult" })
@XmlRootElement(name = "RegistroExamenTemporalResponse")
public class RegistroExamenTemporalResponse {

	@XmlElement(name = "RegistroExamenTemporalResult")
	protected long registroExamenTemporalResult;

	/**
	 * Gets the value of the registroExamenTemporalResult property.
	 * 
	 */
	public long getRegistroExamenTemporalResult() {
		return registroExamenTemporalResult;
	}

	/**
	 * Sets the value of the registroExamenTemporalResult property.
	 * 
	 */
	public void setRegistroExamenTemporalResult(long value) {
		this.registroExamenTemporalResult = value;
	}

}
