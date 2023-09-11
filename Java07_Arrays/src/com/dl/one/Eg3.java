package com.dl.one;

import java.util.Arrays;

public class Eg3 {
	public static void main(String[] args) {

//Length Property and Length Method
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(a.length); //5 //it is used in arrays
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		String s1 = "java python";
		System.out.println(s1.length()); //10 //this method is used in strings

		System.out.println(a.length - 1); //4
		System.out.println(a.length + 2); //7
	
		System.out.println(a.length); //5
	}
}