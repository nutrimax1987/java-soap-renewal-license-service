
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
 *         &lt;element name="NumeroProceso" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="RolEspecialista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Especialista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Inicio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "numeroProceso",
    "rolEspecialista",
    "especialista",
    "inicio"
})
@XmlRootElement(name = "SolicitarIdentificadorSeguimiento")
public class SolicitarIdentificadorSeguimiento {

    @XmlElement(name = "UsuarioServicio")
    protected String usuarioServicio;
    @XmlElement(name = "ContrasenaServicio")
    protected String contrasenaServicio;
    @XmlElement(name = "NumeroProceso")
    protected long numeroProceso;
    @XmlElement(name = "RolEspecialista")
    protected String rolEspecialista;
    @XmlElement(name = "Especialista")
    protected String especialista;
    @XmlElement(name = "Inicio")
    protected boolean inicio;

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
     * Gets the value of the numeroProceso property.
     * 
     */
    public long getNumeroProceso() {
        return numeroProceso;
    }

    /**
     * Sets the value of the numeroProceso property.
     * 
     */
    public void setNumeroProceso(long value) {
        this.numeroProceso = value;
    }

    /**
     * Gets the value of the rolEspecialista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolEspecialista() {
        return rolEspecialista;
    }

    /**
     * Sets the value of the rolEspecialista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolEspecialista(String value) {
        this.rolEspecialista = value;
    }

    /**
     * Gets the value of the especialista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecialista() {
        return especialista;
    }

    /**
     * Sets the value of the especialista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecialista(String value) {
        this.especialista = value;
    }

    /**
     * Gets the value of the inicio property.
     * 
     */
    public boolean isInicio() {
        return inicio;
    }

    /**
     * Sets the value of the inicio property.
     * 
     */
    public void setInicio(boolean value) {
        this.inicio = value;
    }

}
