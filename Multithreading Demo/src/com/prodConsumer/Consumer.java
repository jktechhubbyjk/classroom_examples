package com.prodConsumer;

public class Consumer implements Runnable{
	Demo d ;
	
	Consumer(Demo d){
		this.d = d;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	
	@Override
	public void run() {
		while(true) {
			d.get();
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}

}
