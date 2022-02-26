package com.synch;

public class IncrementThread1 extends Thread {
	Counter c ;
	
	IncrementThread1(Counter c){
		this.c = c;
	}
	
	public void run() {
		int i = 0;
		while(i<100000) {
			c.increment();
			i++;
			
		}
		
	}
	

}
