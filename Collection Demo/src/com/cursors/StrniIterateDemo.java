package com.cursors;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StrniIterateDemo {
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("Ganesh");
		list.add("Dnyaneshwar");
		list.add("Nilesh");
		list.add("Swapnil");
		list.add("Snehal");
		list.add("Dipali");
		list.add("Prathmesh");
		list.add("PAndurang");
		list.add("Sadashiv");
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.startsWith("S")) {
				System.out.println(str);
			}
		}
		
		
		
		
		
	}

}
