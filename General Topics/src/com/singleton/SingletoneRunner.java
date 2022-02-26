package com.singleton;

public class SingletoneRunner {
	
	public static void main(String[] args) {
		
		SingletoneClass s = SingletoneClass.getInstace();
		
		SingletoneClass s1 = SingletoneClass.getInstace();
		
		//System.out.println(s);
		//System.out.println(s1);
		
		LazySingletone lazy = LazySingletone.getInstance();
		
		LazySingletone lazy1 = LazySingletone.getInstance();
		
		System.out.println(lazy);
		System.out.println(lazy1);

		
		
		
	}

}
