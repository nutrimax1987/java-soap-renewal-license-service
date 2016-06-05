
package com.amnetgov.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "seleccionarProcesoPorIdentificacionAspiranteComboResult" })
@XmlRootElement(name = "SeleccionarProcesoPorIdentificacionAspiranteComboResponse")
public class SeleccionarProcesoPorIdentificacionAspiranteComboResponse {

	@XmlElement(name = "SeleccionarProcesoPorIdentificacionAspiranteComboResult")
	protected long seleccionarProcesoPorIdentificacionAspiranteComboResult;

	/**
	 * Gets the value of the
	 * seleccionarProcesoPorIdentificacionAspiranteComboResult property.
	 * 
	 */
	public long getSeleccionarProcesoPorIdentificacionAspiranteComboResult() {
		return seleccionarProcesoPorIdentificacionAspiranteComboResult;
	}

	/**
	 * Sets the value of the
	 * seleccionarProcesoPorIdentificacionAspiranteComboResult property.
	 * 
	 */
	public void setSeleccionarProcesoPorIdentificacionAspiranteComboResult(long value) {
		this.seleccionarProcesoPorIdentificacionAspiranteComboResult = value;
	}

}
