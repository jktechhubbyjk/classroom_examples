package com.set;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(15);
		hs.add(25);
		hs.add(55);
		System.out.println(hs.add("jktechhub"));// true
		
		System.out.println(hs);
		
		System.out.println(hs.add(55));//false
		
		System.out.println(hs);
		hs.remove(25);
		System.out.println(hs);
		hs.size();
		
		
		
		
	}

}
