package com.array;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(15);
		v.add("jktechhub");
		v.add(52.3);
		v.add(89.6f);
		v.addElement(56);
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		v.size();
		v.contains(52.3);
		v.clear();
		System.out.println(v);
	}

}
