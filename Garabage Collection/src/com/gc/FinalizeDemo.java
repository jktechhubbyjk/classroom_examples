package com.gc;

public class FinalizeDemo{
	
	@Override
	public void finalize() throws Throwable {
		System.out.println("finalize method gets called before destroying an object");
	}
	
	public static void main(String[] args) {
		
		FinalizeDemo sd = new FinalizeDemo();
		
		FinalizeDemo sd2 = new FinalizeDemo();
		
		sd = null;
		sd2 = null;
		
		System.gc();// explicitly gc called
		
	}
	
	
	

}
