package com.array;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList<>();
		list.add(15);//{}
		list.add(45);
		list.add(56.56f);
		list.add("jktechhub, Pune");
		list.add(15);
		
		System.out.println("before remove : "+list);
		list.remove(1);
		
		System.out.println("after remove : "+list);
		list.add(0, 420);
		System.out.println(list);
		System.out.println(list.contains(150));
		System.out.println("size() : "+list.size() );
		
		System.out.println(list);
		System.out.println(list.get(1));
		list.isEmpty();
		
	}
}
