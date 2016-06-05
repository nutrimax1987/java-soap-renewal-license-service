package com.amnetgov.enums;

public enum Answer {
	OK(0), BAD(1);
	private final int value;
	
	private Answer(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
