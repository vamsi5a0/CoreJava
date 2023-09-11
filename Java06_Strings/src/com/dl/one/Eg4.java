package com.dl.one;

public class Eg4 {
	public static void main(String[] args) {
		String s1 = "Java";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

		String s2 = "A";
		String s3 = "b";
		String s4 = "A";
		System.out.println(s2.compareTo(s4)); // 0
		System.out.println(s3.compareTo(s2)); // 1
		System.out.println(s4.compareTo(s3));// -1

		String s5 = "a";
		System.out.println(s5.compareToIgnoreCase(s2)); // 0
	}
}
