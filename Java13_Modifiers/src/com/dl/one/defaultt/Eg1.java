package com.dl.one.defaultt;

public class Eg1 {
	// default propeerties
	int a = 10;
	int b = 20;

	// default method
	void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		Eg1 eg1 = new Eg1();
		eg1.m1();
		System.out.println(eg1.a);
		System.out.println(eg1.b);
	}
}
