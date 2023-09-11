package com.dl.one;

//Functional Interface using instantiate

@FunctionalInterface
interface Properties {
	// all the abstract methods
	void add(int a, int b);
}

public class Eg2 implements Properties {
	public static void main(String[] args) {
		Eg2 eg = new Eg2();
		eg.add(10, 20);
	}

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);

	}
}
