package com.amnetgov.pin;

import java.util.UUID;

public class PinGenerator {

	synchronized public static long getPIN() {
		return Math.abs(UUID.randomUUID().getLeastSignificantBits() / 111111);
	}
	

}
