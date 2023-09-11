package com.dl.one.defaultt;

public class Eg2 extends Eg1 {
	public static void main(String[] args) {
		// calling default properties
		System.out.println(new Eg2().a);
		System.out.println(new Eg2().b);
		// calling default m1() method
		new Eg2().m1();
	}
}
