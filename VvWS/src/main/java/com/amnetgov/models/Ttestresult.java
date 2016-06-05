package com.amnetgov.models;

import java.io.Serializable;


/**
 * The persistent class for the ttestresult database table.
 * 
 */
public class Ttestresult implements Serializable {
	private static final long serialVersionUID = 1L;


	private String result;

	public Ttestresult() {
	}


	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}