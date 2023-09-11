package com.dl.one;

class Big {
	public void m1() {
		System.out.println("m1 method big");
	}
}

class Small extends Big {
	public void m1() {
		System.out.println("m1 method small");
	}
}

public class Client {
	public static void main(String[] args) {
		// inheritance
		Small small = new Small();
		small.m1();

		// polymorphism
		Big big = new Small();
		big.m1();

		// object casting
		// Small s2=(Small)new Big();
		// s2.m1(); //java.lang.ClassCastException
		Small s3 = new Small();
		Big b4 = s3;
		b4.m1();

	}
}
