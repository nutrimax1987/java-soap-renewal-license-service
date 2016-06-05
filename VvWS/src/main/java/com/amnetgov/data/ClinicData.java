package com.amnetgov.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClinicData")
public class ClinicData {
	
	@XmlElement(name = "MunicipalLocation")
	protected String municipalLocation;
	
	@XmlElement(name = "ClinicName")
	protected String crcName;
	
	@XmlElement(name = "Address")
	protected String address;
	
	@XmlElement(name = "Telephone")
	protected String telephone;
	
	@XmlElement(name = "ClinicEmail")
	protected String email;

	public String getMunicipalLocation() {
		return municipalLocation;
	}

	public void setMunicipalLocation(String municipalLocation) {
		this.municipalLocation = municipalLocation;
	}

	public String getCrcName() {
		return crcName;
	}

	public void setCrcName(String crcName) {
		this.crcName = crcName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public ClinicData(){
	}
	
	
	
	

}
