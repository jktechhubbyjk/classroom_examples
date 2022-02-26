package com.run;

public class ThreadDriver {
	public static void main(String[] args) {
		
		CookingThread cooking = new CookingThread();
		ChattingThread chatting= new ChattingThread();
		
		Thread t1 = new Thread(cooking, "Cooking");
		
		Thread t2 = new Thread(chatting,"Chatting");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.setPriority(Thread.MAX_PRIORITY);//10
		t2.setPriority(Thread.MIN_PRIORITY);//1
	//10//	t1.getPriority();
		
		t2.start();
		t1.start();
		
	}

}
