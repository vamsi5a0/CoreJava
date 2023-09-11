package com.dl.one;

public class Eg2 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}
public static void main(String[] args) {
	Eg2 eg2=new Eg2();
	eg2.start();
}
}
