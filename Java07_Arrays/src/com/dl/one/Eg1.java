package com.dl.one;

import java.util.Arrays;
import java.util.Scanner;

public class Eg1 {
	public static void main(String[] args) {
		//Arrays are fixed in size,once we declare we can not increase the size
		//create and array and initialize it
		int a[]= {10,20,30,40,50};
		System.out.println(a.toString());
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		 Arrays.fill(a, 10);
		 System.out.println(Arrays.toString(a));
		
		
	}
}
