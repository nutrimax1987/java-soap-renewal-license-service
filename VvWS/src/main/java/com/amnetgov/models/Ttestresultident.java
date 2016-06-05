package com.amnetgov.models;

import java.io.Serializable;


/**
 * The persistent class for the ttestresultident database table.
 * 
 */
public class Ttestresultident implements Serializable {
	private static final long serialVersionUID = 1L;


	private String message;

	public Ttestresultident() {
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}