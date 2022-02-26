package com.array;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.add(15);
		s.push(26);
		s.add(16);
		s.push(36);// 
		System.out.println(s);
		
		int size = s.size();
		System.out.println(size);
		
		System.out.println(s.pop());// to remove top element
		System.out.println(s);
		System.out.println(s.capacity());
		
	}

}
