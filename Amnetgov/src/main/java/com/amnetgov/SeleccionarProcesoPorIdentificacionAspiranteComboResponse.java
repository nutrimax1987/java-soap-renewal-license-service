
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
 *         &lt;element name="SeleccionarProcesoPorIdentificacionAspiranteComboResult" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "seleccionarProcesoPorIdentificacionAspiranteComboResult"
})
@XmlRootElement(name = "SeleccionarProcesoPorIdentificacionAspiranteComboResponse")
public class SeleccionarProcesoPorIdentificacionAspiranteComboResponse {

    @XmlElement(name = "SeleccionarProcesoPorIdentificacionAspiranteComboResult")
    protected long seleccionarProcesoPorIdentificacionAspiranteComboResult;

    /**
     * Gets the value of the seleccionarProcesoPorIdentificacionAspiranteComboResult property.
     * 
     */
    public long getSeleccionarProcesoPorIdentificacionAspiranteComboResult() {
        return seleccionarProcesoPorIdentificacionAspiranteComboResult;
    }

    /**
     * Sets the value of the seleccionarProcesoPorIdentificacionAspiranteComboResult property.
     * 
     */
    public void setSeleccionarProcesoPorIdentificacionAspiranteComboResult(long value) {
        this.seleccionarProcesoPorIdentificacionAspiranteComboResult = value;
    }

}
