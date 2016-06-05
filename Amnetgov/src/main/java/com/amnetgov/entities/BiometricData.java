
package com.amnetgov.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.ExtensionDataObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadProcesoBiometriaSalida", propOrder = { "extensionData", "fotografia", "huellaDer",
		"huellaIzq" })
public class BiometricData {

	@XmlElement(name = "ExtensionData")
	protected ExtensionDataObject extensionData;
	@XmlElement(name = "Fotografia")
	protected String fotografia;
	@XmlElement(name = "HuellaDer")
	protected String huellaDer;
	@XmlElement(name = "HuellaIzq")
	protected String huellaIzq;

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
	 * Gets the value of the fotografia property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFotografia() {
		return fotografia;
	}

	/**
	 * Sets the value of the fotografia property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFotografia(String value) {
		this.fotografia = value;
	}

	/**
	 * Gets the value of the huellaDer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHuellaDer() {
		return huellaDer;
	}

	/**
	 * Sets the value of the huellaDer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHuellaDer(String value) {
		this.huellaDer = value;
	}

	/**
	 * Gets the value of the huellaIzq property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHuellaIzq() {
		return huellaIzq;
	}

	/**
	 * Sets the value of the huellaIzq property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHuellaIzq(String value) {
		this.huellaIzq = value;
	}

}
