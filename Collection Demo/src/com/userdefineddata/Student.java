package com.userdefineddata;

public class Student {
	String name;
	int id;
	String location;
	
	public Student(String name, int id, String location) {
		this.name = name;
		this.id = id;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", location=" + location + "]";
	}
	
}
