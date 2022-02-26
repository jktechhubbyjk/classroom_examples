package com.immutable;

public final class Student {
	
	final String pancardNo;

	public Student(String pancardNo) {
		this.pancardNo = pancardNo;
	}

	public String getPancardNo() {
		return pancardNo;
	}
}
