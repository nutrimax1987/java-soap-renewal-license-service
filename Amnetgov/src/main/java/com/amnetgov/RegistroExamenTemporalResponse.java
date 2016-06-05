
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
 *         &lt;element name="RegistroExamenTemporalResult" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "registroExamenTemporalResult"
})
@XmlRootElement(name = "RegistroExamenTemporalResponse")
public class RegistroExamenTemporalResponse {

    @XmlElement(name = "RegistroExamenTemporalResult")
    protected long registroExamenTemporalResult;

    /**
     * Gets the value of the registroExamenTemporalResult property.
     * 
     */
    public long getRegistroExamenTemporalResult() {
        return registroExamenTemporalResult;
    }

    /**
     * Sets the value of the registroExamenTemporalResult property.
     * 
     */
    public void setRegistroExamenTemporalResult(long value) {
        this.registroExamenTemporalResult = value;
    }

}
