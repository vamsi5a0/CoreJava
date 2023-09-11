package com.dl.one;
class  One{
	public void m1() {
		System.out.println("Method One");
	}
}
class Two extends One{
	public void m2() {
		super.m1();
		System.out.println("Method Two");
	}
	public void m3() {
		this.m2();
		System.out.println("Method Three");
	}
}

public class Eg2 {
public static void main(String[] args) {
	Two eg2=new Two();
	eg2.m3();
}
}
