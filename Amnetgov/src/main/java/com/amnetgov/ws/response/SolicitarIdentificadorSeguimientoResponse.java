
package com.amnetgov.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "solicitarIdentificadorSeguimientoResult" })
@XmlRootElement(name = "SolicitarIdentificadorSeguimientoResponse")
public class SolicitarIdentificadorSeguimientoResponse {

	@XmlElement(name = "SolicitarIdentificadorSeguimientoResult")
	protected String solicitarIdentificadorSeguimientoResult;

	/**
	 * Gets the value of the solicitarIdentificadorSeguimientoResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSolicitarIdentificadorSeguimientoResult() {
		return solicitarIdentificadorSeguimientoResult;
	}

	/**
	 * Sets the value of the solicitarIdentificadorSeguimientoResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSolicitarIdentificadorSeguimientoResult(String value) {
		this.solicitarIdentificadorSeguimientoResult = value;
	}

}
