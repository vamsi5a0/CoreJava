package com.dl.one;

public class Eg10 {
	public static void main(String[] args) {
		String s1 = new String("Hello Java and Hello Python");
		System.out.println(s1);
		s1.concat("Hello JavaScript");
		System.out.println(s1);
		System.out.println();

		// mutable(Non Synchronized)
		StringBuilder sb1 = new StringBuilder("Hello Java and Hello Python");
		System.out.println(sb1);
		sb1.append("Hello JavaScript");
		System.out.println(sb1);
		System.out.println();

		// mutable(synchronized)
		StringBuffer s2 = new StringBuffer("Hello Java and Hello Python");
		System.out.println(s2);
		s2.append("Hello JavaScript");
		System.out.println(s2);
	}
}
