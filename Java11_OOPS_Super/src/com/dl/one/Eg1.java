package com.dl.one;

class A {
	// instance VAriables
	//super keyword refers the parent class
	int a = 10;
	int b = 20;
}

class B extends A {
	int a = 30;
	int b = 40;

	// instacnce mthod
	public void m1() {
		System.out.println("B:" + this.a);
		System.out.println("B:" + this.b);

		System.out.println("A:" + super.a);
		System.out.println("A:" + super.b);
	}
}

public class Eg1 {
	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}
}
