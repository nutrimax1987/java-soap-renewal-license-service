package com.amnetgov.model;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the tcrc database table.
 * 
 */
public class Tcrc implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer crcId;

	private String address;

	private String crcName;

	private String crcNit;

	private String crcPass;

	private String crcUser;

	private Integer dailyAllowedAuthQuota;

	private String email;

	private String legalRepresentative;

	private String municipalLocation;

	private Timestamp regDate;

	private String signature;

	private String tel;

	public Tcrc() {
	}

	public Integer getCrcId() {
		return this.crcId;
	}

	public void setCrcId(Integer crcId) {
		this.crcId = crcId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCrcName() {
		return this.crcName;
	}

	public void setCrcName(String crcName) {
		this.crcName = crcName;
	}

	public String getCrcNit() {
		return this.crcNit;
	}

	public void setCrcNit(String crcNit) {
		this.crcNit = crcNit;
	}

	public String getCrcPass() {
		return this.crcPass;
	}

	public void setCrcPass(String crcPass) {
		this.crcPass = crcPass;
	}

	public String getCrcUser() {
		return this.crcUser;
	}

	public void setCrcUser(String crcUser) {
		this.crcUser = crcUser;
	}

	public Integer getDailyAllowedAuthQuota() {
		return this.dailyAllowedAuthQuota;
	}

	public void setDailyAllowedAuthQuota(Integer dailyAllowedAuthQuota) {
		this.dailyAllowedAuthQuota = dailyAllowedAuthQuota;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getMunicipalLocation() {
		return this.municipalLocation;
	}

	public void setMunicipalLocation(String municipalLocation) {
		this.municipalLocation = municipalLocation;
	}

	public Timestamp getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}