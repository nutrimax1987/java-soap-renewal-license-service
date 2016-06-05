
package com.amnetgov;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.entities.BiometricAuthDetails;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntidadResultadoSeguimientoDetalle")
public class BiometricAuthDetailsList {

	@XmlElement(name = "EntidadResultadoSeguimientoDetalle", nillable = true)
	protected List<BiometricAuthDetails> biometricAuthDetails;

	public List<BiometricAuthDetails> getEntidadResultadoSeguimientoDetalle() {
		if (biometricAuthDetails == null) {
			biometricAuthDetails = new ArrayList<BiometricAuthDetails>();
		}
		return this.biometricAuthDetails;
	}

}
