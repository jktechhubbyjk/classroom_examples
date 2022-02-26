package com.userdefineddata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudnetDriver {
	public static void main(String[] args) {
		
		List<Student> sList = new ArrayList<Student>();
		
		sList.add(new Student("abc", 101, "pune"));
		sList.add(new Student("ayx", 105, "Pusad"));
		sList.add(new Student("egd", 106, "Nanded"));
		sList.add(new Student("hdv", 108, "Hadgo"));
		sList.add(new Student("fhv", 102, "pune"));
		System.out.println(sList);// 101 ,102,105,106,108
		
	//	Iterator<Student> itr=  sList.iterator();
		System.out.println();
		Collections.sort(sList, new UserDefinedComparision());
		
		System.out.println(sList);
		
		/*
		 * while(itr.hasNext()) { Student std = itr.next(); if(std.id == 101) {
		 * System.out.println(std); } }
		 */
		
	}

}
