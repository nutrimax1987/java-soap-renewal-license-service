
package com.amnetgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarResultadoSeguimientoCertificadorResultado", propOrder = { "extensionData", "codigoResultado",
		"idSeguimientoCertificador", "observacionesResultado" })
public class ConsultarResultadoSeguimientoCertificadorResultado extends ComplexObject {

	@XmlElement(name = "ExtensionData")
	protected ExtensionDataObject extensionData;
	@XmlElement(name = "CodigoResultado", required = true, type = Integer.class, nillable = true)
	protected Integer codigoResultado;
	@XmlElement(name = "IdSeguimientoCertificador", required = true)
	protected String idSeguimientoCertificador;
	@XmlElement(name = "ObservacionesResultado")
	protected String observacionesResultado;

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
	 * Gets the value of the codigoResultado property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCodigoResultado() {
		return codigoResultado;
	}

	/**
	 * Sets the value of the codigoResultado property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCodigoResultado(Integer value) {
		this.codigoResultado = value;
	}

	/**
	 * Gets the value of the idSeguimientoCertificador property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdSeguimientoCertificador() {
		return idSeguimientoCertificador;
	}

	/**
	 * Sets the value of the idSeguimientoCertificador property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdSeguimientoCertificador(String value) {
		this.idSeguimientoCertificador = value;
	}

	/**
	 * Gets the value of the observacionesResultado property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObservacionesResultado() {
		return observacionesResultado;
	}

	/**
	 * Sets the value of the observacionesResultado property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObservacionesResultado(String value) {
		this.observacionesResultado = value;
	}

}
