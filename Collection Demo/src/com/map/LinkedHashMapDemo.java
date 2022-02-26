package com.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
			LinkedHashMap lhm = new LinkedHashMap<>();
			lhm.put(15, "jktechhub");// entry
			lhm.put("abc", "text");
			lhm.put(15.02, "text");
			
			System.out.println(lhm);
			
			lhm.put(15, "jktechhub by jitesh");
			
			System.out.println(lhm);
			lhm.get(15);
			
			
	}
}
