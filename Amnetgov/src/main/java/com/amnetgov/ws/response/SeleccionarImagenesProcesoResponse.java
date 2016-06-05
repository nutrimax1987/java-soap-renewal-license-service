
package com.amnetgov.ws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.entities.BiometricData;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "seleccionarImagenesProcesoResult" })
@XmlRootElement(name = "SeleccionarImagenesProcesoResponse")
public class SeleccionarImagenesProcesoResponse {

	@XmlElement(name = "SeleccionarImagenesProcesoResult")
	protected BiometricData seleccionarImagenesProcesoResult;

	/**
	 * Gets the value of the seleccionarImagenesProcesoResult property.
	 * 
	 * @return possible object is {@link BiometricData }
	 * 
	 */
	public BiometricData getSeleccionarImagenesProcesoResult() {
		return seleccionarImagenesProcesoResult;
	}

	/**
	 * Sets the value of the seleccionarImagenesProcesoResult property.
	 * 
	 * @param value
	 *            allowed object is {@link BiometricData }
	 * 
	 */
	public void setSeleccionarImagenesProcesoResult(BiometricData value) {
		this.seleccionarImagenesProcesoResult = value;
	}

}
