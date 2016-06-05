package com.amnetgov.enums;

public enum SessionCode {
	SECRETARY_SESSION(0), CERTIFICATORY_SESSION(3), PROCESS_SESSION(1);
	private final int value;

	private SessionCode(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
