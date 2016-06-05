package com.amnetgov.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
// @XmlRootElement(name = "")
public class AspiranteImagesData {
	@XmlElement(required = true)
	String photograph;
	// byte[] photograph;
	@XmlElement(required = true)
	String huellaIzg;
	// byte[] huellaIzg;
	@XmlElement(required = true)
	String huellaDer;
	// byte[] huellaDer;
	@XmlElement(required = true)
	String firma;
	// byte[] firma;

	public String getPhotograph() {
		return photograph;
	}

	public void setPhotograph(String photograph) {
		this.photograph = photograph;
	}

	public String getHuellaIzg() {
		return huellaIzg;
	}

	public void setHuellaIzg(String huellaIzg) {
		this.huellaIzg = huellaIzg;
	}

	public String getHuellaDer() {
		return huellaDer;
	}

	public void setHuellaDer(String huellaDer) {
		this.huellaDer = huellaDer;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

}
