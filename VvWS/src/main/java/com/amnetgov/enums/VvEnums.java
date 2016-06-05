package com.amnetgov.enums;

public enum VvEnums {
	VERIFICATION_OK(1),VERIFICATION_FAILED(-1), DISABLED(0), ACTIVE(1), DELETED(2), START_SPECIALIST_TEST(1), END_SPECIALIST_TEST(
			0), NOT_UPDATED(0), UPDATED(1), SECRETARY_SESSION(0), CERTIFICATORY_SESSION(3), PROCESS_LOGIN_SESSION(
					2),PROCESS_SESSION(1), RESPONSE_OK(0), RESPONSE_BAD(1), COMBO(2), BIKE_ONLY(1), APTO(1), NO_APTO(
							2), APTO_RESTICTIONS(3),PENDING(0),DEFAULT(0);
	private final int value;

	private VvEnums(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
