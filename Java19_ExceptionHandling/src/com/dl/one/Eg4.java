package com.dl.one;

public class Eg4 {
public static void main(String[] args) {
	try {
		System.out.println("before");
		String s1="ten";
		System.out.println(s1.length());
		int parseInt = Integer.parseInt(s1);
		System.out.println(parseInt); //NumberFormatException
	} catch (NumberFormatException e) {
		
		System.out.println(e);
	}
	System.out.println("after");
}
}
