package com.array;

import java.util.Iterator;

public class ArrayDemo {
	public static void main(String[] args) {
		
		/*
		 * int[] arr = new int[10];//[0,2,5,8,6]
		 * 
		 * arr[0] = 44; arr[1] = 98; arr[2] = 52; //arr[3] = 12.0f; arr[4] = 45;
		 * 
		 * System.out.println(arr);
		 * 
		 * for(int i = 0 ; i<= arr.length-1 ; i++) { System.out.print(arr[i]
		 * +" ");//arr[1]
		 * 
		 * }
		 */	
		
		String str = "kalyani";
		
		StringBuilder db = new StringBuilder("kalyani");
		db.reverse();
		
		char[] ch = str.toCharArray();
		
		System.out.print(ch[6]);
		System.out.print(ch[5]);
		System.out.print(ch[4]);
		System.out.print(ch[3]);
		System.out.print(ch[2]);
		System.out.print(ch[1]);
		System.out.print(ch[0]);
		
		
		System.out.println("\n using for loop");
		for(int i = ch.length-1 ;i>=0 ;i--) {
			System.out.print(ch[i]);

		}
		
		
	}

}
