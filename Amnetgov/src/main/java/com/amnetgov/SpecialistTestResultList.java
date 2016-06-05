
package com.amnetgov;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.amnetgov.entities.SpecialistTestResult;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntidadResultadoTemporalExamen")
public class SpecialistTestResultList {

	@XmlElement(name = "EntidadResultadoTemporalExamen", nillable = true)
	protected List<SpecialistTestResult> specialistTestResult;

	public List<SpecialistTestResult> getEntidadResultadoTemporalExamen() {
		if (specialistTestResult == null) {
			specialistTestResult = new ArrayList<SpecialistTestResult>();
		}
		return this.specialistTestResult;
	}

}
