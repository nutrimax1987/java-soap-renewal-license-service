package com.amnetgov.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProcessData")
//@XmlRootElement(name = "")
public class ProcessData{

	@XmlElement(name = "ProcessEstado")
	protected String processEstado;
	@XmlElement(name = "FechaCertification")
	protected XMLGregorianCalendar fechaCertification;
	@XmlElement(name = "CertificadorVerificiationValue")
	protected int certificadorVerificiationValue;
	@XmlElement(name = "CertificadorId")
	protected String cerificadorId;
	public String getProcessEstado() {
		return processEstado;
	}
	public void setProcessEstado(String processEstado) {
		this.processEstado = processEstado;
	}
	public XMLGregorianCalendar getFechaCertification() {
		return fechaCertification;
	}
	public void setFechaCertification(XMLGregorianCalendar fechaCertification) {
		this.fechaCertification = fechaCertification;
	}
	public int getCertificadorVerificiationValue() {
		return certificadorVerificiationValue;
	}
	public void setCertificadorVerificiationValue(int certificadorVerificiationValue) {
		this.certificadorVerificiationValue = certificadorVerificiationValue;
	}
	public String getCerificadorId() {
		return cerificadorId;
	}
	public void setCerificadorId(String cerificadorId) {
		this.cerificadorId = cerificadorId;
	}
	
	

}
