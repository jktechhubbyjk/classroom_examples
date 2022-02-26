package com.synch;

public class Counter {
	
	int count = 0;
	
	public synchronized void increment() {
		count++; // count = count +1;
	}
	

}
