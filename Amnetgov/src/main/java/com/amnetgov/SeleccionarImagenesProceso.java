
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
 *         &lt;element name="IdProceso" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "idProceso"
})
@XmlRootElement(name = "SeleccionarImagenesProceso")
public class SeleccionarImagenesProceso {

    @XmlElement(name = "UsuarioServicio")
    protected String usuarioServicio;
    @XmlElement(name = "ContrasenaServicio")
    protected String contrasenaServicio;
    @XmlElement(name = "IdProceso")
    protected long idProceso;

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
