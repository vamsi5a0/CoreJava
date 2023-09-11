package com.dl.one;

//single  level inheritance
class Parent {
	void m1() {
		System.out.println("m1 method");
	}
}

class Child extends Parent {
	void m2() {
		System.out.println("m2 method");
	}
}

public class Eg3 {
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
		child.m2();

	}
}