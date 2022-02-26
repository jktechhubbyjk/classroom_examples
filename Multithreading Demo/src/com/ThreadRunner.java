package com;

public class ThreadRunner {
	public static void main(String[] args) {
		
		MyThread m1 = new MyThread("Thread 1");
		MyThread2 m2 = new MyThread2("Thread 2");
		
		System.out.println(m1.getName());
		System.out.println(m2.getName());
		
		
		/*
		 * m1.start(); m2.start();
		 */
		
	}

}
