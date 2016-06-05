
package com.amnetgov.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.entities.PersonalOtherInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "seleccionarProcesoDatosComplementariosResult" })
@XmlRootElement(name = "SeleccionarProcesoDatosComplementariosResponse")
public class SeleccionarProcesoDatosComplementariosResponse {

	@XmlElement(name = "SeleccionarProcesoDatosComplementariosResult")
	protected PersonalOtherInfo seleccionarProcesoDatosComplementariosResult;

	/**
	 * Gets the value of the seleccionarProcesoDatosComplementariosResult
	 * property.
	 * 
	 * @return possible object is {@link PersonalOtherInfo
	 *         }
	 * 
	 */
	public PersonalOtherInfo getSeleccionarProcesoDatosComplementariosResult() {
		return seleccionarProcesoDatosComplementariosResult;
	}

	/**
	 * Sets the value of the seleccionarProcesoDatosComplementariosResult
	 * property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link PersonalOtherInfo }
	 * 
	 */
	public void setSeleccionarProcesoDatosComplementariosResult(PersonalOtherInfo value) {
		this.seleccionarProcesoDatosComplementariosResult = value;
	}

}
