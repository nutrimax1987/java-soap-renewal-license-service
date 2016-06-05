
package com.amnetgov.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.amnetgov.ExtensionDataObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadPersonaInformacionBasica", propOrder = { "extensionData", "codigoTipoIdentificacion",
		"fechaNacimiento", "idGradoEscolaridad", "idGrupoSanguinio", "idPersona", "lugarNacimiento", "numeroDocumento",
		"primerApellido", "primerNombre", "procesoDatosBasicos", "segundoApellido", "segundoNombre", "sexo" })
public class PersonalBasicInfo {

	@XmlElement(name = "ExtensionData")
	protected ExtensionDataObject extensionData;
	@XmlElement(name = "CodigoTipoIdentificacion")
	protected String codigoTipoIdentificacion;
	@XmlElement(name = "FechaNacimiento", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar fechaNacimiento;
	@XmlElement(name = "IdGradoEscolaridad")
	protected short idGradoEscolaridad;
	@XmlElement(name = "IdGrupoSanguinio")
	protected short idGrupoSanguinio;
	@XmlElement(name = "IdPersona")
	protected long idPersona;
	@XmlElement(name = "LugarNacimiento")
	protected String lugarNacimiento;
	@XmlElement(name = "NumeroDocumento")
	protected String numeroDocumento;
	@XmlElement(name = "PrimerApellido")
	protected String primerApellido;
	@XmlElement(name = "PrimerNombre")
	protected String primerNombre;
	@XmlElement(name = "ProcesoDatosBasicos")
	protected BasicDataProcess procesoDatosBasicos;
	@XmlElement(name = "SegundoApellido")
	protected String segundoApellido;
	@XmlElement(name = "SegundoNombre")
	protected String segundoNombre;
	@XmlElement(name = "Sexo")
	protected String sexo;

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
	 * Gets the value of the codigoTipoIdentificacion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodigoTipoIdentificacion() {
		return codigoTipoIdentificacion;
	}

	/**
	 * Sets the value of the codigoTipoIdentificacion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodigoTipoIdentificacion(String value) {
		this.codigoTipoIdentificacion = value;
	}

	/**
	 * Gets the value of the fechaNacimiento property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Sets the value of the fechaNacimiento property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setFechaNacimiento(XMLGregorianCalendar value) {
		this.fechaNacimiento = value;
	}

	/**
	 * Gets the value of the idGradoEscolaridad property.
	 * 
	 */
	public short getIdGradoEscolaridad() {
		return idGradoEscolaridad;
	}

	/**
	 * Sets the value of the idGradoEscolaridad property.
	 * 
	 */
	public void setIdGradoEscolaridad(short value) {
		this.idGradoEscolaridad = value;
	}

	/**
	 * Gets the value of the idGrupoSanguinio property.
	 * 
	 */
	public short getIdGrupoSanguinio() {
		return idGrupoSanguinio;
	}

	/**
	 * Sets the value of the idGrupoSanguinio property.
	 * 
	 */
	public void setIdGrupoSanguinio(short value) {
		this.idGrupoSanguinio = value;
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
	 * Gets the value of the lugarNacimiento property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	/**
	 * Sets the value of the lugarNacimiento property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLugarNacimiento(String value) {
		this.lugarNacimiento = value;
	}

	/**
	 * Gets the value of the numeroDocumento property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * Sets the value of the numeroDocumento property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNumeroDocumento(String value) {
		this.numeroDocumento = value;
	}

	/**
	 * Gets the value of the primerApellido property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * Sets the value of the primerApellido property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrimerApellido(String value) {
		this.primerApellido = value;
	}

	/**
	 * Gets the value of the primerNombre property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrimerNombre() {
		return primerNombre;
	}

	/**
	 * Sets the value of the primerNombre property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrimerNombre(String value) {
		this.primerNombre = value;
	}

	/**
	 * Gets the value of the procesoDatosBasicos property.
	 * 
	 * @return possible object is {@link BasicDataProcess }
	 * 
	 */
	public BasicDataProcess getProcesoDatosBasicos() {
		return procesoDatosBasicos;
	}

	/**
	 * Sets the value of the procesoDatosBasicos property.
	 * 
	 * @param value
	 *            allowed object is {@link BasicDataProcess }
	 * 
	 */
	public void setProcesoDatosBasicos(BasicDataProcess value) {
		this.procesoDatosBasicos = value;
	}

	/**
	 * Gets the value of the segundoApellido property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * Sets the value of the segundoApellido property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSegundoApellido(String value) {
		this.segundoApellido = value;
	}

	/**
	 * Gets the value of the segundoNombre property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSegundoNombre() {
		return segundoNombre;
	}

	/**
	 * Sets the value of the segundoNombre property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSegundoNombre(String value) {
		this.segundoNombre = value;
	}

	/**
	 * Gets the value of the sexo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Sets the value of the sexo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSexo(String value) {
		this.sexo = value;
	}

}
