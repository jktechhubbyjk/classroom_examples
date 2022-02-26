package com.prodConsumer;

public class Demo {
	int num;
	boolean valueSet = false;
	public synchronized void put(int num) {

		while(valueSet) {
			try {
				wait();
				} catch (Exception e) {}
		}
		this.num = num;
		System.out.println("Put : " + num);
		valueSet = true;
		notify();
	}

	public synchronized void get() {
		while (!valueSet) {
			try {wait();
			} catch (Exception e) {}
		}
		System.out.println("Get : " + num);
		valueSet = false;
		notify();
	}

}
