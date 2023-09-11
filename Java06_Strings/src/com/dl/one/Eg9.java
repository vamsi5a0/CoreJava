package com.dl.one;

public class Eg9 {
	public static void main(String[] args) {
		String s1 = new String("Hello Java and Hello Python");
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer deleteCharAt = sb1.deleteCharAt(6);
		System.out.println(deleteCharAt);
		System.out.println(s1);
	}
}
