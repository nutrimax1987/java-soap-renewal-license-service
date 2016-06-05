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
public class CrcHw extends InitialCrcData {

	@XmlElement(name = "Signature", required = true)
	protected String signature;
	@XmlElement(name = "DeviceType", required = true)
	protected String deviceType;
	@XmlElement(name = "SerialNumber", required = false)
	protected String serialNumber;
	@XmlElement(name = "Room", required = true)
	protected String room;
	@XmlElement(name = "Key", required = true)
	protected String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public CrcHw() {
		super();
	}

}