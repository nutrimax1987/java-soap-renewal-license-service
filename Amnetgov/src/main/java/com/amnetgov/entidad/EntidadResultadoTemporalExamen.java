
package com.amnetgov.entidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.ExtensionDataObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadResultadoTemporalExamen", propOrder = { "extensionData", "homologacion", "valor" })
public class EntidadResultadoTemporalExamen {

	@XmlElement(name = "ExtensionData")
	protected ExtensionDataObject extensionData;
	@XmlElement(name = "Homologacion")
	protected String homologacion;
	@XmlElement(name = "Valor")
	protected String valor;

	/**
	 * Gets the value of the extensionData property.
	 * 
	 * @return possible object is {@link ExtensionDataObject }
	 * 
	 */
	public ExtensionDataObject getExtensionData() {
		return extensionData;
	}

	/**
	 * Sets the value of the extensionData property.
	 * 
	 * @param value
	 *            allowed object is {@link ExtensionDataObject }
	 * 
	 */
	public void setExtensionData(ExtensionDataObject value) {
		this.extensionData = value;
	}

	/**
	 * Gets the value of the homologacion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHomologacion() {
		return homologacion;
	}

	/**
	 * Sets the value of the homologacion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHomologacion(String value) {
		this.homologacion = value;
	}

	/**
	 * Gets the value of the valor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * Sets the value of the valor property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValor(String value) {
		this.valor = value;
	}

}
