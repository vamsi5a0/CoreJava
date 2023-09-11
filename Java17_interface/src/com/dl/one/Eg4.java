package com.dl.one;

interface A {
	// static variables :hat ever we have created variable those are static by
	// default
	int a = 10;
	static final int b = 20;

}

public class Eg4 implements A {
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
	}
}
