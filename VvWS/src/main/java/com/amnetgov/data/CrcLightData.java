package com.amnetgov.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The persistent class for the tcrc database table.
 * 
 */

@XmlAccessorType(XmlAccessType.NONE)
//@XmlRootElement(name = "")
public class CrcLightData extends InitialCrcData {

	protected Integer crcId;
	@XmlElement(name = "SessionCode", required = true)
	protected String sessioCode;

	public CrcLightData() {
		super();
	}


	public void setCrcId(Integer crcId) {
		this.crcId = crcId;
	}

	public String getSessioCode() {
		return sessioCode;
	}

	public void setSessioCode(String sessioCode) {
		this.sessioCode = sessioCode;
	}

}