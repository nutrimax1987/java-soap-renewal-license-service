
package com.amnetgov.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.SeleccionarResultadoCertificadorResultado;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "seleccionarResultadoCertificadorResult" })
@XmlRootElement(name = "SeleccionarResultadoCertificadorResponse")
public class SeleccionarResultadoCertificadorResponse {

	@XmlElement(name = "SeleccionarResultadoCertificadorResult")
	protected SeleccionarResultadoCertificadorResultado seleccionarResultadoCertificadorResult;

	/**
	 * Gets the value of the seleccionarResultadoCertificadorResult property.
	 * 
	 * @return possible object is
	 *         {@link SeleccionarResultadoCertificadorResultado }
	 * 
	 */
	public SeleccionarResultadoCertificadorResultado getSeleccionarResultadoCertificadorResult() {
		return seleccionarResultadoCertificadorResult;
	}

	/**
	 * Sets the value of the seleccionarResultadoCertificadorResult property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link SeleccionarResultadoCertificadorResultado }
	 * 
	 */
	public void setSeleccionarResultadoCertificadorResult(SeleccionarResultadoCertificadorResultado value) {
		this.seleccionarResultadoCertificadorResult = value;
	}

}
