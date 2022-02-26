package com.cursors;

import java.util.Enumeration;
import java.util.Stack;

public class EnumerationDemo {
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		s.add(25);
		s.add(5);
		s.add(50);
		s.add(12);
		s.add(251);
		s.add(60);
		s.add(70);
		s.add(11);
		
		System.out.println(s);
		//Enumeration (I)
		System.out.println();
		Enumeration<Integer> enr = s.elements();
		while(enr.hasMoreElements()) {
			int i = enr.nextElement();
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("************************************");
		System.out.println("Using enhanced for loop");
		
		for(Integer i : s) {// internal iteration
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
	}
}
