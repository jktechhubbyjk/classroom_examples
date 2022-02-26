package com.array;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(99);
		list.add(15);//{}
		list.add(45);
		Collections.sort(list, new MyComp());
		System.out.println(list);
	}
}
