package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello Java and Hello Python";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(8));
		System.out.println(s1.charAt(12));

		String s2 = "Hello Java and hello Python";
		char[] charArray = s2.toCharArray();
		System.out.println(charArray);
		charArray[0] = 'h';
		System.out.println(charArray);
		System.out.println(s2);
	}

}
