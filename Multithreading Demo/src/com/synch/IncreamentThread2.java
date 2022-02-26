package com.synch;

public class IncreamentThread2 extends Thread{
	Counter c ;
	
	IncreamentThread2(Counter c){
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
