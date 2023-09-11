package com.dl.one;

public class Eg3 {
	// default constructor
	public Eg3() {
		System.out.println("Default cons");
	}

	// parameterized cons
	public Eg3(int a) {
		System.out.println(a);
	}

	// parameterized cons
	public Eg3(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	// parameterized cons
	public Eg3(int a, int b, int c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Eg3();
		new Eg3(10);
		new Eg3(20, 30);
		new Eg3(40, 50, 60);
	}

}

//to call constructor
////Instance Mehtod --> Instance and also instance ref
//Static Mdethod ---> Using Class Name
//Constructor --> new Keyword() / Instance of Class