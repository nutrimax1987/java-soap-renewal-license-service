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
@XmlType(name = "AbrormalRequest")
public class AbnormalRequest {

	@XmlElement(name = "RequestID")
	protected long requestId;
	@XmlElement(name = "NumIdent")
	protected String numIdent;
	@XmlElement(name = "OpenedBy")
	protected String openedBy;
	@XmlElement(name = "TipoIdent")
	protected String tipoIdent;
	@XmlElement(name = "StatusTime")
	protected XMLGregorianCalendar statusTime;
	@XmlElement(name = "ApprovedDate")
	protected XMLGregorianCalendar regDate;
	@XmlElement(name = "Status")
	protected int status;
	@XmlElement(name = "LeftFinger")
	protected String leftFinger;
	@XmlElement(name = "RightFinger")
	protected String rightFinger;

	public AbnormalRequest() {

	}
	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public String getNumIdent() {
		return numIdent;
	}

	public void setNumIdent(String numIdent) {
		this.numIdent = numIdent;
	}

	public String getOpenedBy() {
		return openedBy;
	}

	public void setOpenedBy(String openedBy) {
		this.openedBy = openedBy;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getLeftFinger() {
		return leftFinger;
	}

	public void setLeftFinger(String leftFinger) {
		this.leftFinger = leftFinger;
	}

	public String getRightFinger() {
		return rightFinger;
	}

	public void setRightFinger(String rightFinger) {
		this.rightFinger = rightFinger;
	}

}