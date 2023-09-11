package com.dl.five;

public class Eg3 extends Eg2 {

	@Override
	public void m3() {
		System.out.println("M3 Method");

	}

	@Override
	public void m4() {
		System.out.println("M4 Method");

	}
	
	public static void main(String[] args) {
		
		Eg3 eg3 = new Eg3();
		eg3.m1();
		eg3.m2();
		eg3.m3();
		eg3.m4();
	}

}