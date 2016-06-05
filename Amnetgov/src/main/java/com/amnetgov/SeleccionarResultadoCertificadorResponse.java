
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
 *         &lt;element name="SeleccionarResultadoCertificadorResult" type="{http://olimpiait.com/}SeleccionarResultadoCertificadorResultado" minOccurs="0"/&gt;
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
    "seleccionarResultadoCertificadorResult"
})
@XmlRootElement(name = "SeleccionarResultadoCertificadorResponse")
public class SeleccionarResultadoCertificadorResponse {

    @XmlElement(name = "SeleccionarResultadoCertificadorResult")
    protected SeleccionarResultadoCertificadorResultado seleccionarResultadoCertificadorResult;

    /**
     * Gets the value of the seleccionarResultadoCertificadorResult property.
     * 
     * @return
     *     possible object is
     *     {@link SeleccionarResultadoCertificadorResultado }
     *     
     */
    public SeleccionarResultadoCertificadorResultado getSeleccionarResultadoCertificadorResult() {
        return seleccionarResultadoCertificadorResult;
    }

    /**
     * Sets the value of the seleccionarResultadoCertificadorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeleccionarResultadoCertificadorResultado }
     *     
     */
    public void setSeleccionarResultadoCertificadorResult(SeleccionarResultadoCertificadorResultado value) {
        this.seleccionarResultadoCertificadorResult = value;
    }

}
