
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
 *         &lt;element name="Idproceso" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="IdCertificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResultadoExamen" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CategoriaFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "idproceso",
    "idCertificador",
    "observaciones",
    "resultadoExamen",
    "categoriaFinal"
})
@XmlRootElement(name = "CrearSeguimientoCertificador")
public class CrearSeguimientoCertificador {

    @XmlElement(name = "UsuarioServicio")
    protected String usuarioServicio;
    @XmlElement(name = "ContrasenaServicio")
    protected String contrasenaServicio;
    @XmlElement(name = "Idproceso")
    protected long idproceso;
    @XmlElement(name = "IdCertificador")
    protected String idCertificador;
    @XmlElement(name = "Observaciones")
    protected String observaciones;
    @XmlElement(name = "ResultadoExamen")
    protected int resultadoExamen;
    @XmlElement(name = "CategoriaFinal")
    protected String categoriaFinal;

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
     * Gets the value of the idproceso property.
     * 
     */
    public long getIdproceso() {
        return idproceso;
    }

    /**
     * Sets the value of the idproceso property.
     * 
     */
    public void setIdproceso(long value) {
        this.idproceso = value;
    }

    /**
     * Gets the value of the idCertificador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCertificador() {
        return idCertificador;
    }

    /**
     * Sets the value of the idCertificador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCertificador(String value) {
        this.idCertificador = value;
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
     */
    public int getResultadoExamen() {
        return resultadoExamen;
    }

    /**
     * Sets the value of the resultadoExamen property.
     * 
     */
    public void setResultadoExamen(int value) {
        this.resultadoExamen = value;
    }

    /**
     * Gets the value of the categoriaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaFinal() {
        return categoriaFinal;
    }

    /**
     * Sets the value of the categoriaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaFinal(String value) {
        this.categoriaFinal = value;
    }

}
