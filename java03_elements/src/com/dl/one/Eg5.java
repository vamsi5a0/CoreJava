package com.dl.one;

public class Eg5 {
	//Static Method
	public static void m1() {
		System.out.println("M1 Method");
	}
	public static void m2() {
		System.out.println("M2 Method");
	}
	public static void m3() {
		System.out.println("M3 Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		m2();
		m3();
		
		Eg5.m1();
		Eg5.m2();
		Eg5.m3();
	}

}
