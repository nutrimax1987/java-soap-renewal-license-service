package com.amnetgov.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CrcData")
public class InitialCrcData {

	@XmlElement(name = "CrcUser", required = true)
	protected String crcUser;
	@XmlElement(name = "CrcPass", required = true)
	protected String crcPass;
	@XmlElement(name = "CrcLong", required = true)
	protected double crcLongtitude;
	@XmlElement(name = "CrcLat", required = true)
	protected double crcLatitude;

	// for internal use
	protected String address;
	protected String crcName;
	protected String municipalLocation;
	protected String crcOrganization;
	protected long crcId;
	protected int crcStatus;

	public int getCrcStatus() {
		return crcStatus;
	}

	public void setCrcStatus(int crcStatus) {
		this.crcStatus = crcStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCrcName() {
		return crcName;
	}

	public void setCrcName(String crcName) {
		this.crcName = crcName;
	}

	public String getMunicipalLocation() {
		return municipalLocation;
	}

	public void setMunicipalLocation(String municipalLocation) {
		this.municipalLocation = municipalLocation;
	}

	public String getCrcOrganization() {
		return crcOrganization;
	}

	public void setCrcOrganization(String crcOrganization) {
		this.crcOrganization = crcOrganization;
	}

	public long getCrcId() {
		return crcId;
	}

	public void setCrcId(long crcId) {
		this.crcId = crcId;
	}

	public InitialCrcData() {
	}

	public String getCrcUser() {
		return crcUser;
	}

	public void setCrcUser(String crcUser) {
		this.crcUser = crcUser;
	}

	public String getCrcPass() {
		return crcPass;
	}

	public void setCrcPass(String crcPass) {
		this.crcPass = crcPass;
	}

	public double getCrcLongtitude() {
		return crcLongtitude;
	}

	public void setCrcLongtitude(double crcLongtitude) {
		this.crcLongtitude = crcLongtitude;
	}

	public double getCrcLatitude() {
		return crcLatitude;
	}

	public void setCrcLatitude(double crcLatitude) {
		this.crcLatitude = crcLatitude;
	}

}
