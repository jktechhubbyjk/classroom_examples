package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2150);
		list.add(50);
		list.add(210);
		list.add(150);
		list.add(25);
		list.add(2);
		System.out.println(" before sorting : "+list);
		System.out.println();
		//Collections.reverse(list);
		//System.out.println(list);
		//Collection - interface
		
		Collections.sort(list);
		System.out.println("After sorting : ");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
