
package com.amnetgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.entidad.EntidadResultadoSeguimiento;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "solicitarResultadoIdentificadorSeguimientoResult" })
@XmlRootElement(name = "SolicitarResultadoIdentificadorSeguimientoResponse")
public class SolicitarResultadoIdentificadorSeguimientoResponse {

	@XmlElement(name = "SolicitarResultadoIdentificadorSeguimientoResult")
	protected EntidadResultadoSeguimiento solicitarResultadoIdentificadorSeguimientoResult;

	/**
	 * Gets the value of the solicitarResultadoIdentificadorSeguimientoResult
	 * property.
	 * 
	 * @return possible object is {@link EntidadResultadoSeguimiento }
	 * 
	 */
	public EntidadResultadoSeguimiento getSolicitarResultadoIdentificadorSeguimientoResult() {
		return solicitarResultadoIdentificadorSeguimientoResult;
	}

	/**
	 * Sets the value of the solicitarResultadoIdentificadorSeguimientoResult
	 * property.
	 * 
	 * @param value
	 *            allowed object is {@link EntidadResultadoSeguimiento }
	 * 
	 */
	public void setSolicitarResultadoIdentificadorSeguimientoResult(EntidadResultadoSeguimiento value) {
		this.solicitarResultadoIdentificadorSeguimientoResult = value;
	}

}
