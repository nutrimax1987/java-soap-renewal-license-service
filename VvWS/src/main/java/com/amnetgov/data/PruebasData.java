package com.amnetgov.data;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PruebasData")
public class PruebasData {

	@XmlElement(name = "ResultadoPruebasExamenList", nillable = true)
	protected ArrayList<SpecialistsTest> specialistsTestList;

	public void setSpecialistsTestList(ArrayList<SpecialistsTest> specialistExamenResultList) {
		this.specialistsTestList = specialistExamenResultList;
	}

	public ArrayList<SpecialistsTest> getSpecialistsTestList() {
		if (specialistsTestList == null) {
			specialistsTestList = new ArrayList<SpecialistsTest>();
		}
		return this.specialistsTestList;
	}

}
