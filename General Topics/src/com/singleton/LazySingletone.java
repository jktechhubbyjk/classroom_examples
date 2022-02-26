package com.singleton;

public class LazySingletone {
	
	private static LazySingletone lazy = null;// lazy initialization
	
	private LazySingletone() {
		
		throw new RuntimeException("use getInstance method to create object of LazySingletone class");
		
	}
	
	public static synchronized LazySingletone getInstance() {
		
		if(lazy == null) {
			lazy = new LazySingletone();
		}
		return lazy;
	}

}
