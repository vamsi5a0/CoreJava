package com.dl.two.block;

public abstract class Eg1 {
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		// new Eg1();
	}
}
