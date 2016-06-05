
package com.amnetgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.entidad.EntidadProcesoBiometriaSalida;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seleccionarImagenesProcesoResult"
})
@XmlRootElement(name = "SeleccionarImagenesProcesoResponse")
public class SeleccionarImagenesProcesoResponse {

    @XmlElement(name = "SeleccionarImagenesProcesoResult")
    protected EntidadProcesoBiometriaSalida seleccionarImagenesProcesoResult;

    /**
     * Gets the value of the seleccionarImagenesProcesoResult property.
     * 
     * @return
     *     possible object is
     *     {@link EntidadProcesoBiometriaSalida }
     *     
     */
    public EntidadProcesoBiometriaSalida getSeleccionarImagenesProcesoResult() {
        return seleccionarImagenesProcesoResult;
    }

    /**
     * Sets the value of the seleccionarImagenesProcesoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadProcesoBiometriaSalida }
     *     
     */
    public void setSeleccionarImagenesProcesoResult(EntidadProcesoBiometriaSalida value) {
        this.seleccionarImagenesProcesoResult = value;
    }

}
