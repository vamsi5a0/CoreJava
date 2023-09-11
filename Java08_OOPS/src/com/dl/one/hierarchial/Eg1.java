package com.dl.one.hierarchial;

class GrandParent {
	void m1() {
		System.out.println("m1 method");
	}
}

class Parent extends GrandParent {
	void m2() {
		System.out.println("m2 method");
	}
}

class Child extends GrandParent {
	void m3() {
		System.out.println("m3 method");
	}
}

public class Eg1 {
	public static void main(String[] args) {
		Child child = new Child();
		child.m3();
		child.m1();
		Parent parent = new Parent();
		parent.m1();
		parent.m2();
	}
}
