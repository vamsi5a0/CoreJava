package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {

		System.out.println(new Eg7().m1());
		System.out.println(new Eg7().m2());
		System.out.println(new Eg7().m3());
		new Eg7().m4();
		System.out.println(new Eg7().m5());
	}

	// return type is int
	public int m1() {
		return 0;
	}

	// return type is long
	public long m2() {
		return 0;
	}

	// return type is double
	public double m3() {
		return 0;
	}

	// return type is void
	public void m4() {
		System.out.println("M4 Method");
	}

	// return type is Integer
	public Integer m5() {
		return 0;
	}
}