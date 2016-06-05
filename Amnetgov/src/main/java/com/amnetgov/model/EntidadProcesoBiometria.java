package com.amnetgov.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadProcesoBiometria", propOrder = { "aspiranteHuellaDer", "aspiranteHuellaIzq",
		"specialisteHuellaDer", "specialistHuellaIzq" })
public class EntidadProcesoBiometria {
	@XmlElement(name = "AspiranteHuellaDer")
	protected String aspiranteHuellaDer;
	@XmlElement(name = "AspiranteHuellaIzq")
	protected String aspiranteHuellaIzq;
	@XmlElement(name = "SpecialistHuellaDer")
	protected String specialisteHuellaDer;
	@XmlElement(name = "SpecialistHuellaIzq")
	protected String specialistHuellaIzq;

	public String getAspiranteHuellaDer() {
		return aspiranteHuellaDer;
	}

	public void setAspiranteHuellaDer(String aspiranteHuellaDer) {
		this.aspiranteHuellaDer = aspiranteHuellaDer;
	}

	public String getAspiranteHuellaIzq() {
		return aspiranteHuellaIzq;
	}

	public void setAspiranteHuellaIzq(String aspiranteHuellaIzq) {
		this.aspiranteHuellaIzq = aspiranteHuellaIzq;
	}

	public String getSpecialisteHuellaDer() {
		return specialisteHuellaDer;
	}

	public void setSpecialisteHuellaDer(String specialisteHuellaDer) {
		this.specialisteHuellaDer = specialisteHuellaDer;
	}

	public String getSpecialistHuellaIzq() {
		return specialistHuellaIzq;
	}

	public void setSpecialistHuellaIzq(String specialistHuellaIzq) {
		this.specialistHuellaIzq = specialistHuellaIzq;
	}

}
