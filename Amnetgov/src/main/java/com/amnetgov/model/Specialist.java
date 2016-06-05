package com.amnetgov.model;

import java.sql.Timestamp;


/**
 * The persistent class for the tpeople database table.
 * 
 */
public class Specialist {

	private String specialistId;

	private Long crcId;

	private String firstName;

	private String lastName;

	private String leftFinger;

	private String password;

	private String picture;

	private Timestamp regDate;

	private String rightFingure;

	private String rol;

	private String role;

	private String signature;

	private String status;

	private String username;

	public Specialist() {
	}

	public String getSpecialistId() {
		return this.specialistId;
	}

	public void setSpecialistId(String specialistId) {
		this.specialistId = specialistId;
	}

	public Long getCrcId() {
		return this.crcId;
	}

	public void setCrcId(Long crcId) {
		this.crcId = crcId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLeftFinger() {
		return this.leftFinger;
	}

	public void setLeftFinger(String leftFinger) {
		this.leftFinger = leftFinger;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Timestamp getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public String getRightFingure() {
		return this.rightFingure;
	}

	public void setRightFingure(String rightFingure) {
		this.rightFingure = rightFingure;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}