package com.immutable;

public class StudentRunner {
	
	StudentRunner(){
		
	}
	
	
	public static void main(String[] args) {
		
		
		Student std = new Student("ABCD1234XY");
		System.out.println(std.pancardNo);
		
		//std.pancardNo="abcmnbvjb";
		
//		std.setPancardNo("dfmvhdsvnhgdjvyg");
		
		System.out.println(std.getPancardNo());
	}

}
