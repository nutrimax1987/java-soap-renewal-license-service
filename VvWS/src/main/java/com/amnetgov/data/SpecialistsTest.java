
package com.amnetgov.data;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;




@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PruebasExamen")
public class SpecialistsTest {

	@XmlElement(name = "Estado")
	protected int status;
	@XmlElement(name = "Resultado")
	protected int result;
	@XmlElement(name = "Observations")
	protected String observations;
	@XmlElement(name = "CrcId")
	protected Long crcId;
	@XmlElement(name = "HoraDeInicio")
	protected XMLGregorianCalendar startTime;
	@XmlElement(name = "HoraDeFinalizacion")
	protected XMLGregorianCalendar endTime;
	
	@XmlElement(name = "ResultadoPruebasExamen")
	protected String jsonExamenResults;
	
	@XmlElement(name = "SpecialistData")
	protected SpecialistData specialist;

	
	@XmlElement(name = "ClinicData")
	protected ClinicData clinicData;
	
	@XmlElement(name = "ProcessData")
	protected ProcessData processData;	
	
	public ProcessData getProcessData() {
		return processData;
	}
	public void setProcessData(ProcessData processData) {
		this.processData = processData;
	}

	
	
	public ClinicData getClinicData() {
		return clinicData;
	}
	public void setClinicData(ClinicData clinicData) {
		this.clinicData = clinicData;
	}
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	public Long getCrcId() {
		return crcId;
	}
	public void setCrcId(Long crcId) {
		this.crcId = crcId;
	}
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}
	public void setStartTime(XMLGregorianCalendar startTime) {
		this.startTime = startTime;
	}
	public XMLGregorianCalendar getEndTime() {
		return endTime;
	}
	public void setEndTime(XMLGregorianCalendar endTime) {
		this.endTime = endTime;
	}
	public String getJsonExamenResults() {
		return jsonExamenResults;
	}
	public void setJsonExamenResults(String jsonExamenResults) {
		this.jsonExamenResults = jsonExamenResults;
	}
	public SpecialistData getSpecialist() {
		return specialist;
	}
	public void setSpecialist(SpecialistData specialist) {
		this.specialist = specialist;
	}
	
}
