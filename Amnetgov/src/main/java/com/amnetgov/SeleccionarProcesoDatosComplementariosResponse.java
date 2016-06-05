
package com.amnetgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.entidad.EntidadPersonaInformacionComplementaria;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seleccionarProcesoDatosComplementariosResult"
})
@XmlRootElement(name = "SeleccionarProcesoDatosComplementariosResponse")
public class SeleccionarProcesoDatosComplementariosResponse {

    @XmlElement(name = "SeleccionarProcesoDatosComplementariosResult")
    protected EntidadPersonaInformacionComplementaria seleccionarProcesoDatosComplementariosResult;

    /**
     * Gets the value of the seleccionarProcesoDatosComplementariosResult property.
     * 
     * @return
     *     possible object is
     *     {@link EntidadPersonaInformacionComplementaria }
     *     
     */
    public EntidadPersonaInformacionComplementaria getSeleccionarProcesoDatosComplementariosResult() {
        return seleccionarProcesoDatosComplementariosResult;
    }

    /**
     * Sets the value of the seleccionarProcesoDatosComplementariosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadPersonaInformacionComplementaria }
     *     
     */
    public void setSeleccionarProcesoDatosComplementariosResult(EntidadPersonaInformacionComplementaria value) {
        this.seleccionarProcesoDatosComplementariosResult = value;
    }

}
