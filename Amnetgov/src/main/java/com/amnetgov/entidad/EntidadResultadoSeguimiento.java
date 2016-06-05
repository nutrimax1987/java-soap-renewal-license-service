
package com.amnetgov.entidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.ExtensionDataObject;
import com.amnetgov.entities.BiometricAuthDetails;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadResultadoSeguimiento", propOrder = { "extensionData", "detalle", "estado", "idSeguimiento",
		"idUsuario" })
public class EntidadResultadoSeguimiento {

	@XmlElement(name = "ExtensionData")
	protected ExtensionDataObject extensionData;
	@XmlElement(name = "Detalle")
	protected BiometricAuthDetails detalle;
	@XmlElement(name = "Estado")
	protected int estado;
	@XmlElement(name = "IdSeguimiento")
	protected String idSeguimiento;
	@XmlElement(name = "IdUsuario")
	protected String idUsuario;

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
	 * Gets the value of the detalle property.
	 * 
	 * @return possible object is
	 *         {@link ArrayOfEntidadResultadoSeguimientoDetalle }
	 * 
	 */
	public BiometricAuthDetails getDetalle() {
		return detalle;
	}

	/**
	 * Sets the value of the detalle property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link ArrayOfEntidadResultadoSeguimientoDetalle }
	 * 
	 */
	public void setDetalle(BiometricAuthDetails value) {
		this.detalle = value;
	}

	/**
	 * Gets the value of the estado property.
	 * 
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Sets the value of the estado property.
	 * 
	 */
	public void setEstado(int value) {
		this.estado = value;
	}

	/**
	 * Gets the value of the idSeguimiento property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdSeguimiento() {
		return idSeguimiento;
	}

	/**
	 * Sets the value of the idSeguimiento property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdSeguimiento(String value) {
		this.idSeguimiento = value;
	}

	/**
	 * Gets the value of the idUsuario property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Sets the value of the idUsuario property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdUsuario(String value) {
		this.idUsuario = value;
	}

}
