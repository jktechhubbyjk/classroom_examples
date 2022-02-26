package com.cursors;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIterateDemo {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("Ganesh");
		set.add("Dnyaneshwar");
		set.add("Nilesh");
		set.add("Swapnil");
		set.add("Snehal");
		set.add("Dipali");
		set.add("Prathmesh");
		set.add("PAndurang");
		set.add("Sadashiv");
		System.out.println(set);

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String str = itr.next();
			if (str.equalsIgnoreCase("ganesh")) {
				System.out.println(str);
			}
		}

	}
}
