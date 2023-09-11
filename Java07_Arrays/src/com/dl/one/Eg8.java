package com.dl.one;

import java.util.Arrays;

public class Eg8 {
	public static void main(String[] args) {
		// equals
		int a[] = { 10, 20, 30 };
		int b[] = { 10, 20, 30 };
		int c[] = { 10, 20 };
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		
		int d[]= {10,20,30,40,50};
		System.out.println(d);
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
	}
}
