
package com.amnetgov.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.amnetgov.ExtensionDataObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadPersonaInformacionComplementaria", propOrder = { "extensionData", "deptoResidencia",
		"direccion", "email", "epsArs", "estadoCivil", "fecExpDocumeno", "idPersona", "lugExpDocumento", "movil",
		"muniResidencia", "ocupacion", "regimenAfiliacion", "telefono" })
public class PersonalOtherInfo {

	@XmlElement(name = "ExtensionData")
	protected ExtensionDataObject extensionData;
	@XmlElement(name = "DeptoResidencia")
	protected String deptoResidencia;
	@XmlElement(name = "Direccion")
	protected String direccion;
	@XmlElement(name = "Email")
	protected String email;
	@XmlElement(name = "EpsArs")
	protected int epsArs;
	@XmlElement(name = "EstadoCivil")
	protected short estadoCivil;
	@XmlElement(name = "FecExpDocumeno", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar fecExpDocumeno;
	@XmlElement(name = "IdPersona")
	protected long idPersona;
	@XmlElement(name = "LugExpDocumento")
	protected String lugExpDocumento;
	@XmlElement(name = "Movil")
	protected String movil;
	@XmlElement(name = "MuniResidencia")
	protected String muniResidencia;
	@XmlElement(name = "Ocupacion")
	protected int ocupacion;
	@XmlElement(name = "RegimenAfiliacion")
	protected short regimenAfiliacion;
	@XmlElement(name = "Telefono")
	protected int telefono;

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
	 * Gets the value of the deptoResidencia property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeptoResidencia() {
		return deptoResidencia;
	}

	/**
	 * Sets the value of the deptoResidencia property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeptoResidencia(String value) {
		this.deptoResidencia = value;
	}

	/**
	 * Gets the value of the direccion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Sets the value of the direccion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDireccion(String value) {
		this.direccion = value;
	}

	/**
	 * Gets the value of the email property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the value of the email property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmail(String value) {
		this.email = value;
	}

	/**
	 * Gets the value of the epsArs property.
	 * 
	 */
	public int getEpsArs() {
		return epsArs;
	}

	/**
	 * Sets the value of the epsArs property.
	 * 
	 */
	public void setEpsArs(int value) {
		this.epsArs = value;
	}

	/**
	 * Gets the value of the estadoCivil property.
	 * 
	 */
	public short getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * Sets the value of the estadoCivil property.
	 * 
	 */
	public void setEstadoCivil(short value) {
		this.estadoCivil = value;
	}

	/**
	 * Gets the value of the fecExpDocumeno property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getFecExpDocumeno() {
		return fecExpDocumeno;
	}

	/**
	 * Sets the value of the fecExpDocumeno property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setFecExpDocumeno(XMLGregorianCalendar value) {
		this.fecExpDocumeno = value;
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
	 * Gets the value of the lugExpDocumento property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLugExpDocumento() {
		return lugExpDocumento;
	}

	/**
	 * Sets the value of the lugExpDocumento property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLugExpDocumento(String value) {
		this.lugExpDocumento = value;
	}

	/**
	 * Gets the value of the movil property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMovil() {
		return movil;
	}

	/**
	 * Sets the value of the movil property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMovil(String value) {
		this.movil = value;
	}

	/**
	 * Gets the value of the muniResidencia property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMuniResidencia() {
		return muniResidencia;
	}

	/**
	 * Sets the value of the muniResidencia property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMuniResidencia(String value) {
		this.muniResidencia = value;
	}

	/**
	 * Gets the value of the ocupacion property.
	 * 
	 */
	public int getOcupacion() {
		return ocupacion;
	}

	/**
	 * Sets the value of the ocupacion property.
	 * 
	 */
	public void setOcupacion(int value) {
		this.ocupacion = value;
	}

	/**
	 * Gets the value of the regimenAfiliacion property.
	 * 
	 */
	public short getRegimenAfiliacion() {
		return regimenAfiliacion;
	}

	/**
	 * Sets the value of the regimenAfiliacion property.
	 * 
	 */
	public void setRegimenAfiliacion(short value) {
		this.regimenAfiliacion = value;
	}

	/**
	 * Gets the value of the telefono property.
	 * 
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Sets the value of the telefono property.
	 * 
	 */
	public void setTelefono(int value) {
		this.telefono = value;
	}

}
