package com.dl.one;

public class Eg2 {
	public static void main(String[] args) {
		try {	
		System.out.println("before");
			int a[]= {10,20,30,40,50};
			System.out.println(a[0]);
			System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("after");
}
}
