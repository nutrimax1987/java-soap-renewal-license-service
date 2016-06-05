package com.amnetgov.enums;

public enum StateStatus {
	VERIFICATION_FAILED(-1), DISABLED(0), ACTIVE(1), DELETED(2);
	private final int value;

	private StateStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
