package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		// polymorphism(many froms)
		// method overLoading:having one class,method name must same,datatypes(args) must be
		// different)
		Eg1 eg1 = new Eg1();
		eg1.m1(10, 20);
		eg1.m1(30L, 40L);
	}

	public void m1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public void m1(long a, long b) {
		System.out.println(a);
		System.out.println(b);
	}
}
