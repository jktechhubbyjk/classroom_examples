package com.map;

import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap<>();
		/*
		 * tm.put("abc", 120); tm.put(10, "abc"); tm.put("", ""); tm.put(15,
		 * "jktechhub"); System.out.println(tm);
		 */

		tm.put(2, "abc");
		// tm.put(10, "abc");
		tm.put(25, "xyz");
		tm.put(11, "xyz");
		tm.put(9, "xyz");
		tm.put(7, "jktechhub");
		System.out.println(tm.get(2));

		System.out.println(tm.ceilingEntry(10));
		// tm
		tm.ceilingKey(10);
		System.out.println(tm.floorEntry(10));

		NavigableSet ns = tm.descendingKeySet();

		Set<Integer> keys = tm.keySet();

		System.out.println(keys);
		System.out.println(ns);
		System.out.println(tm);
		
		Entry e = tm.firstEntry();
		System.out.println(e);
		tm.lastEntry();
		//tm.
	}

}
