package com.run;

public class ChattingThread implements Runnable {

	@Override
	public void run() {
		int i = 1;
		while (i <= 10) {
			System.out.println("Chatting is in Progress");
			i++;
		}
	}
}
