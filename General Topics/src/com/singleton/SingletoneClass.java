package com.singleton;

public class SingletoneClass {
	
	private static SingletoneClass sc = new SingletoneClass();// eager initialization
	
	private SingletoneClass(){
		
	}
	
	public static SingletoneClass getInstace() {
		
		return sc;
	}

}
