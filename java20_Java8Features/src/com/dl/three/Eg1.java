package com.dl.three;

//In Interface we can declare default method static method

interface A {
	default void m1() {
		System.out.println("m1 method");
	}

	public static void m2() {
		System.out.println("m2 method");
	}

	default void m3() {
		System.out.println("m3 method");
	}

	public static void m4() {
		System.out.println("m4 method");
	}

}

public class Eg1 implements A {
	public static void main(String[] args) {
		// create object initiate
		Eg1 eg = new Eg1();
		eg.m1();
		eg.m3();

		// calling static method directly
		A.m2();
		A.m4();

	}
}
