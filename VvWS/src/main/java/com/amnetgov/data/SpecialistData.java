package com.amnetgov.data;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * The persistent class for the tpeople database table.
 * 
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Specialist")
// @XmlRootElement(name = "")
public class SpecialistData{

	@XmlElement(name = "SpecialistID")
	protected String specialistId;
	
	@XmlElement(name = "NumIdent")
	protected String numIdent;
	@XmlElement(name = "TipoIdent")
	protected String tipoIdent;
	
	@XmlElement(name = "StatusTime")
	protected XMLGregorianCalendar statusTime;
	
	@XmlElement(name = "RegistrationDate")
	protected XMLGregorianCalendar regDate;
	
	@XmlElement(name = "BirthDate")
	protected XMLGregorianCalendar birthDate;
	
	
	@XmlElement(name = "Status")
	protected int status;
	@XmlElement(name = "CrcID")
	protected Long crcId;
	@XmlElement(name = "FirstName")
	protected String firstName;
	@XmlElement(name = "LastName")
	protected String lastName;
	@XmlElement(name = "SecondName")
	protected String secondName;
	@XmlElement(name = "MiddleName")
	protected String middleName;
	@XmlElement(name = "HuellaIzq")
	protected String leftFinger;
	@XmlElement(name = "HuellaDer")
	protected String rightFingure;
	@XmlElement(name = "Photograph")
	protected String photograph;
	@XmlElement(name = "Role")
	protected String role;
	@XmlElement(name = "Username")
	protected String username;
	@XmlElement(name = "Password")
	protected String password;
	@XmlElement(name = "UsernameOld")
	protected String usernameOld;
	@XmlElement(name = "PasswordOld")
	protected String passwordOld;
	@XmlElement(name = "SessionId")
	protected String sessionId;
	@XmlElement(name = "Email")
	protected String email;
	@XmlElement(name = "Telephone")
	protected String tel;
	@XmlElement(name = "Mobile")
	protected String mobile;
	
	@XmlElement(name = "Address")
	protected String address;
	
	@XmlElement(name = "Sex")
	protected String sex;
	
	@XmlElement(name = "EpsArs")
	protected int epsArs;


	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getEpsArs() {
		return epsArs;
	}

	public void setEpsArs(int epsArs) {
		this.epsArs = epsArs;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public SpecialistData() {
	}

	public String getSpecialistId() {
		return specialistId;
	}

	public void setSpecialistId(String specialistId) {
		this.specialistId = specialistId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getCrcId() {
		return crcId;
	}

	public void setCrcId(Long crcId) {
		this.crcId = crcId;
	}


	public String getNumIdent() {
		return numIdent;
	}

	public void setNumIdent(String numIdent) {
		this.numIdent = numIdent;
	}

	public String getTipoIdent() {
		return tipoIdent;
	}

	public void setTipoIdent(String tipoIdent) {
		this.tipoIdent = tipoIdent;
	}

	public XMLGregorianCalendar getStatusTime() {
		return statusTime;
	}

	public void setStatusTime(XMLGregorianCalendar statusTime) {
		this.statusTime = statusTime;
	}

	public XMLGregorianCalendar getRegDate() {
		return regDate;
	}

	public void setRegDate(XMLGregorianCalendar regDate) {
		this.regDate = regDate;
	}

	public XMLGregorianCalendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(XMLGregorianCalendar birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLeftFinger() {
		return leftFinger;
	}

	public void setLeftFinger(String leftFinger) {
		this.leftFinger = leftFinger;
	}

	public String getRightFingure() {
		return rightFingure;
	}

	public void setRightFingure(String rightFingure) {
		this.rightFingure = rightFingure;
	}

	public String getPhotograph() {
		return photograph;
	}

	public void setPhotograph(String photograph) {
		this.photograph = photograph;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsernameOld() {
		return usernameOld;
	}

	public void setUsernameOld(String usernameOld) {
		this.usernameOld = usernameOld;
	}

	public String getPasswordOld() {
		return passwordOld;
	}

	public void setPasswordOld(String passwordOld) {
		this.passwordOld = passwordOld;
	}

}