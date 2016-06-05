
package com.amnetgov.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.entities.PersonalBasicInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "seleccionarProcesoDatosBasicosResult" })
@XmlRootElement(name = "SeleccionarProcesoDatosBasicosResponse")
public class SeleccionarProcesoDatosBasicosResponse {

	@XmlElement(name = "SeleccionarProcesoDatosBasicosResult")
	protected PersonalBasicInfo seleccionarProcesoDatosBasicosResult;

	/**
	 * Gets the value of the seleccionarProcesoDatosBasicosResult property.
	 * 
	 * @return possible object is {@link PersonalBasicInfo }
	 * 
	 */
	public PersonalBasicInfo getSeleccionarProcesoDatosBasicosResult() {
		return seleccionarProcesoDatosBasicosResult;
	}

	/**
	 * Sets the value of the seleccionarProcesoDatosBasicosResult property.
	 * 
	 * @param value
	 *            allowed object is {@link PersonalBasicInfo }
	 * 
	 */
	public void setSeleccionarProcesoDatosBasicosResult(PersonalBasicInfo value) {
		this.seleccionarProcesoDatosBasicosResult = value;
	}

}
