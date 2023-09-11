package com.dl.one;

public class Eg3 {
	public static void main(String[] args) {
		new Eg3();
	}

	public Eg3() {
		this(10);
		System.out.println("default cons");
	}

	public Eg3(int a) {
		this(100, 300);
		System.out.println(a);
	}

	public Eg3(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
}
