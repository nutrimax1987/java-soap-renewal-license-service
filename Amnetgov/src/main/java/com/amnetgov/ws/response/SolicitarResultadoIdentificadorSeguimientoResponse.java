
package com.amnetgov.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.entities.BiometricAuthResult;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "solicitarResultadoIdentificadorSeguimientoResult" })
@XmlRootElement(name = "SolicitarResultadoIdentificadorSeguimientoResponse")
public class SolicitarResultadoIdentificadorSeguimientoResponse {

	@XmlElement(name = "SolicitarResultadoIdentificadorSeguimientoResult")
	protected BiometricAuthResult solicitarResultadoIdentificadorSeguimientoResult;

	/**
	 * Gets the value of the solicitarResultadoIdentificadorSeguimientoResult
	 * property.
	 * 
	 * @return possible object is {@link BiometricAuthResult }
	 * 
	 */
	public BiometricAuthResult getSolicitarResultadoIdentificadorSeguimientoResult() {
		return solicitarResultadoIdentificadorSeguimientoResult;
	}

	/**
	 * Sets the value of the solicitarResultadoIdentificadorSeguimientoResult
	 * property.
	 * 
	 * @param value
	 *            allowed object is {@link BiometricAuthResult }
	 * 
	 */
	public void setSolicitarResultadoIdentificadorSeguimientoResult(BiometricAuthResult value) {
		this.solicitarResultadoIdentificadorSeguimientoResult = value;
	}

}
