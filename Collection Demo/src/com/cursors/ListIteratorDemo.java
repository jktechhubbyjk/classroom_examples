package com.cursors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListIteratorDemo {
	public static void main(String[] args) {
	//	Parent  p = new Child();
		List<Integer> s = new Stack();
		
		s.add(25);
		s.add(5);
		s.add(50);
		s.add(12);
		s.add(251);
		s.add(60);
		s.add(70);
		s.add(11);
		System.out.println(s);
		System.out.println();
		
		ListIterator<Integer> itr = s.listIterator();// 
		while(itr.hasNext()) {
			int i = itr.next();
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}
		
		
	}

}
