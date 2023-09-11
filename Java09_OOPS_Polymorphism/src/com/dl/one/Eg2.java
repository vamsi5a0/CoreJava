package com.dl.one;

class A {
	public void m1(int a, int b) {
		System.out.println("A" + a);
		System.out.println("A" + b);
	}
}

class B extends A {
	public void m2(int a, int b) {
		System.out.println("B" + a);
		System.out.println("B" + b);
	}
}

public class Eg2 {

	public static void main(String[] args) {
		// method overrirding:method name must be same,but args must same
		B b = new B();
		b.m1(10, 20);

		// polymorpshism
		A a = new B();
		a.m1(30, 40);
	}

}
