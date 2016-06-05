
package com.amnetgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "usuarioServicio", "contrasenaServicio", "idProceso" })
@XmlRootElement(name = "SeleccionarProcesoDatosBasicos")
public class SeleccionarProcesoDatosBasicos {

	@XmlElement(name = "UsuarioServicio")
	protected String usuarioServicio;
	@XmlElement(name = "ContrasenaServicio")
	protected String contrasenaServicio;
	@XmlElement(name = "IdProceso")
	protected long idProceso;

	/**
	 * Gets the value of the usuarioServicio property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUsuarioServicio() {
		return usuarioServicio;
	}

	/**
	 * Sets the value of the usuarioServicio property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUsuarioServicio(String value) {
		this.usuarioServicio = value;
	}

	/**
	 * Gets the value of the contrasenaServicio property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContrasenaServicio() {
		return contrasenaServicio;
	}

	/**
	 * Sets the value of the contrasenaServicio property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContrasenaServicio(String value) {
		this.contrasenaServicio = value;
	}

	/**
	 * Gets the value of the idProceso property.
	 * 
	 */
	public long getIdProceso() {
		return idProceso;
	}

	/**
	 * Sets the value of the idProceso property.
	 * 
	 */
	public void setIdProceso(long value) {
		this.idProceso = value;
	}

}
