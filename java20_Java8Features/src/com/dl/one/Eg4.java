package com.dl.one;
//Functional Interface using nested method 

@FunctionalInterface
interface Methods {
	public abstract void add();
}

public class Eg4 {
	int a;
	int b;

	public Eg4(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void display() {
		Methods methods = () -> {
			System.out.println(a + b);
		};
		methods.add();
	}

	public static void main(String[] args) {
		new Eg4(10,20).display();
	}
}
