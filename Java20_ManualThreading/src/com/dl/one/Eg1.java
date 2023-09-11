package com.dl.one;

public class Eg1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}

	public static void main(String[] args) {
		Eg1 eg1 = new Eg1();
		Thread t1 = new Thread(eg1);
		t1.start();
	}

}
