
package com.amnetgov.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "seleccionarProcesoPorIdentificacionAspiranteResult" })
@XmlRootElement(name = "SeleccionarProcesoPorIdentificacionAspiranteResponse")
public class SeleccionarProcesoPorIdentificacionAspiranteResponse {

	@XmlElement(name = "SeleccionarProcesoPorIdentificacionAspiranteResult")
	protected long seleccionarProcesoPorIdentificacionAspiranteResult;

	/**
	 * Gets the value of the seleccionarProcesoPorIdentificacionAspiranteResult
	 * property.
	 * 
	 */
	public long getSeleccionarProcesoPorIdentificacionAspiranteResult() {
		return seleccionarProcesoPorIdentificacionAspiranteResult;
	}

	/**
	 * Sets the value of the seleccionarProcesoPorIdentificacionAspiranteResult
	 * property.
	 * 
	 */
	public void setSeleccionarProcesoPorIdentificacionAspiranteResult(long value) {
		this.seleccionarProcesoPorIdentificacionAspiranteResult = value;
	}

}
