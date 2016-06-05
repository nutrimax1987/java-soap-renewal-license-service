package com.amnetgov.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The persistent class for the tcrc database table.
 * 
 */

@XmlAccessorType(XmlAccessType.NONE)
// @XmlRootElement(name = "")
public class LoginData extends InitialCrcData{

	@XmlElement(name = "KeyCode", required = true)
	protected String keyCode;

	public String getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}

	public LoginData() {
		super();
	}

}