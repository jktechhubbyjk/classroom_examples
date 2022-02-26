package com.array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDem {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("15");//{}
		list.add("45");
		/*
		 * list.add(56.56f); list.add("jktechhub, Pune"); list.add(15); list.add(true);
		 */
		/*
		 * list.add(15);//{} list.add(45); //list.add("h");//{} list.add(50);
		 * list.add(19);//{} list.add(99);
		 */
		
		System.out.println(list);//15 15 19 45 45 50 86 99 
		
		//Collections.sort(list);
		
		System.out.println(list);
		
		
		int i = Integer.parseInt(list.get(1));
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.out.println("before remove : "+list); list.remove(1);
		 * 
		 * System.out.println("after remove : "+list); list.add(0, 420);
		 * System.out.println(list); System.out.println(list.contains(150));
		 * System.out.println("size() : "+list.size() );
		 * 
		 * System.out.println(list); System.out.println(list.get(1)); list.isEmpty();
		 * 
		 */
		
	}

}
