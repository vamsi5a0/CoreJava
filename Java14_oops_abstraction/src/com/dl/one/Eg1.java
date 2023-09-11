package com.dl.one;

public abstract class Eg1 {
	public void m1() {
		System.out.println("m1 non abs Instance method");
	}

	public abstract void m2();

	public static void m3() {
		System.out.println("m3 static metthod");
	}

	public static void main(String[] args) {
		// Eg1 eg1=new Eg1(); //cannot inititiate the type EG1
		m3();
	}
}
