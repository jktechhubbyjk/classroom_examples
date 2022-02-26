package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet<>();
		
		lhs.add(25);
		lhs.add(255);
		lhs.add(25);
		lhs.add("jktechhub");
		System.out.println(lhs);
		lhs.remove(25);
		
		System.out.println(lhs);
		
	}

}
