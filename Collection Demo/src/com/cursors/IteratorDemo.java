package com.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(15);
		list.add(105);
		list.add(5);
		list.add(150);
		list.add(1);
		System.out.println(list);
		// using iterator 
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			 int i = itr.next();// type casting in int
			 if(i>15) {
				 System.out.println(i); 
			 }
		}
	}

}
