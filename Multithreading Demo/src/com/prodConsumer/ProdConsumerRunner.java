package com.prodConsumer;

public class ProdConsumerRunner {
	public static void main(String[] args) {
		Demo d = new Demo();
		Producer p = new Producer(d);
		Consumer c = new Consumer(d);
	}
}
