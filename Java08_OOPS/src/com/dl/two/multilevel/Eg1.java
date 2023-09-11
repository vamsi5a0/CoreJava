package com.dl.two.multilevel;

//multilevel in
class GrandParent extends Object {
	void m1() {
		System.out.println("m1 method");
	}
}

class Parent extends GrandParent {
	void m2() {
		System.out.println("m2 method");
	}
}

class Child extends Parent {
	void m3() {
		System.out.println("m3 method");
	}
}

public class Eg1 {
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
		child.m2();
		child.m3();
	}
}
