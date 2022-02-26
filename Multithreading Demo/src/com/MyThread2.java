package com;

public class MyThread2 extends Thread {
	
	public MyThread2(String name) {
		super(name);
	}

	public void run() {
		int i = 1;
		while (i <= 10) {
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}
