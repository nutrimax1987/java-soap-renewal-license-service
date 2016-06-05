
package com.amnetgov.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.amnetgov.ExtensionDataObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadProcesoDatosBasicos", propOrder = { "extensionData", "categoria", "estado", "fechaRegistro",
		"idPersona", "nombreAcompanante", "objetivo", "rangoInterno", "segundaCategoria", "segundoTramite", "servicio",
		"telefonoAcompanante", "tramite", "validacionManual" })
public class BasicDataProcess {

	@XmlElement(name = "ExtensionData")
	protected ExtensionDataObject extensionData;
	@XmlElement(name = "Categoria")
	protected String categoria;
	@XmlElement(name = "Estado")
	protected String estado;
	@XmlElement(name = "FechaRegistro", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar fechaRegistro;
	@XmlElement(name = "IdPersona")
	protected long idPersona;
	@XmlElement(name = "NombreAcompanante")
	protected String nombreAcompanante;
	@XmlElement(name = "Objetivo")
	protected int objetivo;
	@XmlElement(name = "RangoInterno")
	protected long rangoInterno;
	@XmlElement(name = "SegundaCategoria")
	protected String segundaCategoria;
	@XmlElement(name = "SegundoTramite")
	protected short segundoTramite;
	@XmlElement(name = "Servicio")
	protected short servicio;
	@XmlElement(name = "TelefonoAcompanante")
	protected String telefonoAcompanante;
	@XmlElement(name = "Tramite")
	protected short tramite;
	@XmlElement(name = "ValidacionManual")
	protected int validacionManual;

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
	 * Gets the value of the categoria property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * Sets the value of the categoria property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCategoria(String value) {
		this.categoria = value;
	}

	/**
	 * Gets the value of the estado property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Sets the value of the estado property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEstado(String value) {
		this.estado = value;
	}

	/**
	 * Gets the value of the fechaRegistro property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * Sets the value of the fechaRegistro property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setFechaRegistro(XMLGregorianCalendar value) {
		this.fechaRegistro = value;
	}

	/**
	 * Gets the value of the idPersona property.
	 * 
	 */
	public long getIdPersona() {
		return idPersona;
	}

	/**
	 * Sets the value of the idPersona property.
	 * 
	 */
	public void setIdPersona(long value) {
		this.idPersona = value;
	}

	/**
	 * Gets the value of the nombreAcompanante property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNombreAcompanante() {
		return nombreAcompanante;
	}

	/**
	 * Sets the value of the nombreAcompanante property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNombreAcompanante(String value) {
		this.nombreAcompanante = value;
	}

	/**
	 * Gets the value of the objetivo property.
	 * 
	 */
	public int getObjetivo() {
		return objetivo;
	}

	/**
	 * Sets the value of the objetivo property.
	 * 
	 */
	public void setObjetivo(int value) {
		this.objetivo = value;
	}

	/**
	 * Gets the value of the rangoInterno property.
	 * 
	 */
	public long getRangoInterno() {
		return rangoInterno;
	}

	/**
	 * Sets the value of the rangoInterno property.
	 * 
	 */
	public void setRangoInterno(long value) {
		this.rangoInterno = value;
	}

	/**
	 * Gets the value of the segundaCategoria property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSegundaCategoria() {
		return segundaCategoria;
	}

	/**
	 * Sets the value of the segundaCategoria property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSegundaCategoria(String value) {
		this.segundaCategoria = value;
	}

	/**
	 * Gets the value of the segundoTramite property.
	 * 
	 */
	public short getSegundoTramite() {
		return segundoTramite;
	}

	/**
	 * Sets the value of the segundoTramite property.
	 * 
	 */
	public void setSegundoTramite(short value) {
		this.segundoTramite = value;
	}

	/**
	 * Gets the value of the servicio property.
	 * 
	 */
	public short getServicio() {
		return servicio;
	}

	/**
	 * Sets the value of the servicio property.
	 * 
	 */
	public void setServicio(short value) {
		this.servicio = value;
	}

	/**
	 * Gets the value of the telefonoAcompanante property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTelefonoAcompanante() {
		return telefonoAcompanante;
	}

	/**
	 * Sets the value of the telefonoAcompanante property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTelefonoAcompanante(String value) {
		this.telefonoAcompanante = value;
	}

	/**
	 * Gets the value of the tramite property.
	 * 
	 */
	public short getTramite() {
		return tramite;
	}

	/**
	 * Sets the value of the tramite property.
	 * 
	 */
	public void setTramite(short value) {
		this.tramite = value;
	}

	/**
	 * Gets the value of the validacionManual property.
	 * 
	 */
	public int getValidacionManual() {
		return validacionManual;
	}

	/**
	 * Sets the value of the validacionManual property.
	 * 
	 */
	public void setValidacionManual(int value) {
		this.validacionManual = value;
	}

}
