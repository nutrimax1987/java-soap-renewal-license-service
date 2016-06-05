
package com.amnetgov.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "crearSeguimientoCertificadorResult" })
@XmlRootElement(name = "CrearSeguimientoCertificadorResponse")
public class CrearSeguimientoCertificadorResponse {

	@XmlElement(name = "CrearSeguimientoCertificadorResult")
	protected String crearSeguimientoCertificadorResult;

	/**
	 * Gets the value of the crearSeguimientoCertificadorResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrearSeguimientoCertificadorResult() {
		return crearSeguimientoCertificadorResult;
	}

	/**
	 * Sets the value of the crearSeguimientoCertificadorResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCrearSeguimientoCertificadorResult(String value) {
		this.crearSeguimientoCertificadorResult = value;
	}

}
