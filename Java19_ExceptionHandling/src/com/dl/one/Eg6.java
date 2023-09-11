package com.dl.one;

class A {
	static {
		System.out.println("static block");
	}
}

public class Eg6 {

	public static void main(String[] args) {
		try {
			Class.forName("com.dl.one.A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
