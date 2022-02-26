package com;

public class MyThread extends Thread{
	
	MyThread(String name){
		super(name);
	}

	public void run() {
		int i = 1;
		while (i <= 10) {
			System.out.println("hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}

}
