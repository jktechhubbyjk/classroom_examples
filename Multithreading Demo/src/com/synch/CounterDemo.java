package com.synch;

public class CounterDemo {
	public static void main(String[] args) throws InterruptedException {
		 
		Counter c = new Counter();
		
		IncrementThread1 it1  =  new IncrementThread1(c);
		IncreamentThread2 it2 = new IncreamentThread2(c);
		it1.start();//100000
		it2.start();//200000
		
		Thread.sleep(1000);
		
		System.out.println("Conut : "+c.count);//200000
	
	}

}
