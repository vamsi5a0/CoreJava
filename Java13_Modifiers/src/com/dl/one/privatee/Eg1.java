package com.dl.one.privatee;

public class Eg1 {
	
	//private properties
	private int a=10;
	private int b=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Eg1().m1();
	}
	public void m1() {
		//initializing private properties using variables
		System.out.println(a);
		System.out.println(b);
	}
	//private method
	private void m2() {
		System.out.println("me method");
	}
	public void m3() {
		this.m2();
	}
}
