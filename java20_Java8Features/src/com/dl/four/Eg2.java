package com.dl.four;

public class Eg2 {
	public static void add() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		add();// calling static method directly
		Thread t1 = new Thread(Eg2::add);// calling static method using double
		t1.start();
		Thread t2 = new Thread(() -> add()); // calling static method using lambada expression
		t2.start();
	}
}
