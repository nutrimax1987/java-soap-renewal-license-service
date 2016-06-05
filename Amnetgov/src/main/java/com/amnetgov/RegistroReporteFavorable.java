
package com.amnetgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsuarioServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContrasenaServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdSeguimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreReporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reporte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usuarioServicio",
    "contrasenaServicio",
    "idSeguimiento",
    "nombreReporte",
    "reporte"
})
@XmlRootElement(name = "RegistroReporteFavorable")
public class RegistroReporteFavorable {

    @XmlElement(name = "UsuarioServicio")
    protected String usuarioServicio;
    @XmlElement(name = "ContrasenaServicio")
    protected String contrasenaServicio;
    @XmlElement(name = "IdSeguimiento")
    protected String idSeguimiento;
    @XmlElement(name = "NombreReporte")
    protected String nombreReporte;
    @XmlElement(name = "Reporte")
    protected byte[] reporte;

    /**
     * Gets the value of the usuarioServicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioServicio() {
        return usuarioServicio;
    }

    /**
     * Sets the value of the usuarioServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioServicio(String value) {
        this.usuarioServicio = value;
    }

    /**
     * Gets the value of the contrasenaServicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasenaServicio() {
        return contrasenaServicio;
    }

    /**
     * Sets the value of the contrasenaServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasenaServicio(String value) {
        this.contrasenaServicio = value;
    }

    /**
     * Gets the value of the idSeguimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSeguimiento() {
        return idSeguimiento;
    }

    /**
     * Sets the value of the idSeguimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSeguimiento(String value) {
        this.idSeguimiento = value;
    }

    /**
     * Gets the value of the nombreReporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreReporte() {
        return nombreReporte;
    }

    /**
     * Sets the value of the nombreReporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreReporte(String value) {
        this.nombreReporte = value;
    }

    /**
     * Gets the value of the reporte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReporte() {
        return reporte;
    }

    /**
     * Sets the value of the reporte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReporte(byte[] value) {
        this.reporte = value;
    }

}
