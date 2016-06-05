package com.amnetgov.models;

import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the ttest database table.
 * 
 */
public class Ttest implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long testId;

	private Object endSeg;

	private Date endTime;

	private String estado;

	private Integer estadoVer;

	private Long processId;

	private String specialistId;

	private Object startSeg;

	private Timestamp startTime;

	public Ttest() {
	}

	public Long getTestId() {
		return this.testId;
	}

	public void setTestId(Long testId) {
		this.testId = testId;
	}

	public Object getEndSeg() {
		return this.endSeg;
	}

	public void setEndSeg(Object endSeg) {
		this.endSeg = endSeg;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getEstadoVer() {
		return this.estadoVer;
	}

	public void setEstadoVer(Integer estadoVer) {
		this.estadoVer = estadoVer;
	}

	public Long getProcessId() {
		return this.processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
	}

	public String getSpecialistId() {
		return this.specialistId;
	}

	public void setSpecialistId(String specialistId) {
		this.specialistId = specialistId;
	}

	public Object getStartSeg() {
		return this.startSeg;
	}

	public void setStartSeg(Object startSeg) {
		this.startSeg = startSeg;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

}