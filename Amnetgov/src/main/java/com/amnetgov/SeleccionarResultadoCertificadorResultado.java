
package com.amnetgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeleccionarResultadoCertificadorResultado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeleccionarResultadoCertificadorResultado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://olimpiait.com/}ComplexObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtensionData" type="{http://olimpiait.com/}ExtensionDataObject" minOccurs="0"/&gt;
 *         &lt;element name="Certificador" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResultadoExamen" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeleccionarResultadoCertificadorResultado", propOrder = {
    "extensionData",
    "certificador",
    "observaciones",
    "resultadoExamen"
})
public class SeleccionarResultadoCertificadorResultado
    extends ComplexObject
{

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "Certificador", required = true, nillable = true)
    protected String certificador;
    @XmlElement(name = "Observaciones")
    protected String observaciones;
    @XmlElement(name = "ResultadoExamen", required = true, type = Integer.class, nillable = true)
    protected Integer resultadoExamen;

    /**
     * Gets the value of the extensionData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDataObject }
     *     
     */
    public ExtensionDataObject getExtensionData() {
        return extensionData;
    }

    /**
     * Sets the value of the extensionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDataObject }
     *     
     */
    public void setExtensionData(ExtensionDataObject value) {
        this.extensionData = value;
    }

    /**
     * Gets the value of the certificador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificador() {
        return certificador;
    }

    /**
     * Sets the value of the certificador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificador(String value) {
        this.certificador = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Gets the value of the resultadoExamen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultadoExamen() {
        return resultadoExamen;
    }

    /**
     * Sets the value of the resultadoExamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultadoExamen(Integer value) {
        this.resultadoExamen = value;
    }

}
