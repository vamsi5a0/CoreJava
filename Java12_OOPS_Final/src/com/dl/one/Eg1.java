package com.dl.one;

public class Eg1 {
	public void m1() {
		final int a = 10;
		System.out.println("Before:" + a);
		// a=20;
		System.out.println("After" + a);
	}

	public static void main(String[] args) {
		new Eg1().m1();
	}
}
