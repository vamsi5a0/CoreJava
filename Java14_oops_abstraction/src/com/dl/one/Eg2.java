package com.dl.one;

public class Eg2 extends Eg1 {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 instance method");
	}

	public static void main(String[] args) {
		Eg2 eg2 = new Eg2();
		eg2.m2();
		eg2.m1();
		m3();
	}

}
