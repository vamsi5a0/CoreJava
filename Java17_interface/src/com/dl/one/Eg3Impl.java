package com.dl.one;

public class Eg3Impl implements Eg1 {

	@Override
	public void m1() {
		System.out.println("m1 method");

	}

	@Override
	public void m2() {
		System.out.println("m2 method");

	}

	@Override
	public void m3() {
		System.out.println("m3 method");

	}

	@Override
	public void m4() {
		System.out.println("m4 method");

	}
public static void main(String[] args) {
	Eg1 eg=new Eg3Impl();
	eg.m1();
	eg.m2();
	eg.m3();
	eg.m4();
}
}

