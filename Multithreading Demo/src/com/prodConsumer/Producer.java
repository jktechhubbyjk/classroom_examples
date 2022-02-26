package com.prodConsumer;

public class Producer implements Runnable {
	Demo d;

	Producer(Demo d) {
		this.d = d;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	@Override
	public void run() {
		int i = 1;
		while (true) {
			d.put(i++);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
			
		}
	}

}
