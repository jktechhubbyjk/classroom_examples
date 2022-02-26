package com.set;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet<Integer> s = new TreeSet<>();
	
	s.add(56);
	s.add(25);
	s.add(12);
	s.add(199);
	s.add(25);

	System.out.println(s);//12 25 56 199
	
	TreeSet<String> s1 = new TreeSet<>();
	
	s1.add("a");
	s1.add("z");
	s1.add("a");
	s1.add("c");
	s1.add("e");
	//s.add("jktechhub");
	System.out.println(s1);
	
	
	
}
}
