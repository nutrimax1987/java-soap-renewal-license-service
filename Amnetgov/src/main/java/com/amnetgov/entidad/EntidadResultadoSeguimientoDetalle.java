
package com.amnetgov.entidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.ExtensionDataObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadResultadoSeguimientoDetalle", propOrder = { "extensionData", "codigo", "mensaje" })
public class EntidadResultadoSeguimientoDetalle {

	@XmlElement(name = "ExtensionData")
	protected ExtensionDataObject extensionData;
	@XmlElement(name = "Codigo")
	protected String codigo;
	@XmlElement(name = "Mensaje")
	protected String mensaje;

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
	 * Gets the value of the codigo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Sets the value of the codigo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodigo(String value) {
		this.codigo = value;
	}

	/**
	 * Gets the value of the mensaje property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * Sets the value of the mensaje property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMensaje(String value) {
		this.mensaje = value;
	}

}
