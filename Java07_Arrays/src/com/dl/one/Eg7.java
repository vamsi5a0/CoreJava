package com.dl.one;

import java.util.Arrays;

public class Eg7 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(a);
		System.out.println(a.toString());
		
		System.out.println(Arrays.toString(a));
		
		int b[]=new int[5];
		Arrays.fill(b,10);
		System.out.println(Arrays.toString(b));
	}
}
