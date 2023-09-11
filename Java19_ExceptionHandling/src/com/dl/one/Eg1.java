package com.dl.one;

public class Eg1 {
public static void main(String[] args) {
	try {
		System.out.println("before");
		int a=10;
		int b=2;
		int c=0;
		System.out.println(a/b);
		System.out.println(a/c);
	}catch(ArithmeticException e){
		System.out.println(e);
	}
	System.out.println("After");
	System.out.println();
	for(int i=0;i<5;i++) {
		System.out.println(i);
	}
}
}
