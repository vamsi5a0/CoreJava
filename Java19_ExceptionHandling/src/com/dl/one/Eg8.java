package com.dl.one;

public class Eg8 {
	public static void main(String[] args) {
		// closing connections
		int a = 10;
		int b = 20;
		try {
			System.out.println(a);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(a);
			System.out.println(b);
		} finally {
			System.out.println("closing connections");
		}
	}
}
