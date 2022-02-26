package com.map;

import java.util.HashMap;

public class HAshmapDemo {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap<>();
		//hm.put(key , value)
		hm.put(154, "abc");
		hm.put("jktechhub", 145);
		hm.put(53.0, 53);
		hm.put(true, "TRue");
		
		System.out.println(hm);
		
		Object obj = hm.put(154, "radheshyam");
		
		Object obj1 = hm.put(1545, "radheshyam");
		System.out.println("obj1 : "+obj1);
		System.out.println(obj);
		System.out.println(hm);
		System.out.println(hm.get(154));
		
	}

}
