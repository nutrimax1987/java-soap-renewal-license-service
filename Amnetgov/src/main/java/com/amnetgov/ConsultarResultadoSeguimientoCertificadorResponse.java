
package com.amnetgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "consultarResultadoSeguimientoCertificadorResult" })
@XmlRootElement(name = "ConsultarResultadoSeguimientoCertificadorResponse")
public class ConsultarResultadoSeguimientoCertificadorResponse {

	@XmlElement(name = "ConsultarResultadoSeguimientoCertificadorResult")
	protected ConsultarResultadoSeguimientoCertificadorResultado consultarResultadoSeguimientoCertificadorResult;

	/**
	 * Gets the value of the consultarResultadoSeguimientoCertificadorResult
	 * property.
	 * 
	 * @return possible object is
	 *         {@link ConsultarResultadoSeguimientoCertificadorResultado }
	 * 
	 */
	public ConsultarResultadoSeguimientoCertificadorResultado getConsultarResultadoSeguimientoCertificadorResult() {
		return consultarResultadoSeguimientoCertificadorResult;
	}

	/**
	 * Sets the value of the consultarResultadoSeguimientoCertificadorResult
	 * property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link ConsultarResultadoSeguimientoCertificadorResultado }
	 * 
	 */
	public void setConsultarResultadoSeguimientoCertificadorResult(
			ConsultarResultadoSeguimientoCertificadorResultado value) {
		this.consultarResultadoSeguimientoCertificadorResult = value;
	}

}
