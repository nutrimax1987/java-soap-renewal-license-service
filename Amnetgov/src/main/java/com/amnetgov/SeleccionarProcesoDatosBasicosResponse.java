
package com.amnetgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.entidad.EntidadPersonaInformacionBasica;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seleccionarProcesoDatosBasicosResult"
})
@XmlRootElement(name = "SeleccionarProcesoDatosBasicosResponse")
public class SeleccionarProcesoDatosBasicosResponse {

    @XmlElement(name = "SeleccionarProcesoDatosBasicosResult")
    protected EntidadPersonaInformacionBasica seleccionarProcesoDatosBasicosResult;

    /**
     * Gets the value of the seleccionarProcesoDatosBasicosResult property.
     * 
     * @return
     *     possible object is
     *     {@link EntidadPersonaInformacionBasica }
     *     
     */
    public EntidadPersonaInformacionBasica getSeleccionarProcesoDatosBasicosResult() {
        return seleccionarProcesoDatosBasicosResult;
    }

    /**
     * Sets the value of the seleccionarProcesoDatosBasicosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadPersonaInformacionBasica }
     *     
     */
    public void setSeleccionarProcesoDatosBasicosResult(EntidadPersonaInformacionBasica value) {
        this.seleccionarProcesoDatosBasicosResult = value;
    }

}
