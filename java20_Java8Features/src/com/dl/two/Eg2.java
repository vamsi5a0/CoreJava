package com.dl.two;
//extending Thread class
public class Eg2 extends Thread {
	public void run() {
		System.out.println("run method");
	}
	
public static void main(String[] args) {
	Eg2 eg=new Eg2();
	eg.start();
	}
}
