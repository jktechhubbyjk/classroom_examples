package com.run;

public class CookingThread implements Runnable  {

	@Override
	public void run() {
		int i = 1;
		while (i <= 10) {
			System.out.println("Cooking is in Progress");
			i++;
		}
	}

}
