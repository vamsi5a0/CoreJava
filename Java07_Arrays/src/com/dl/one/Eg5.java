package com.dl.one;

public class Eg5 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println();

		int j = 0;
		while (j < a.length) {
			System.out.println(a[j]);
			j++;
		}
		System.out.println();
		
		int k = 0;
		do {
			System.out.println(a[k]);
			k++;
		} while (k < a.length);
		System.out.println();

		for (int i : a) {
			System.out.println(i);
		}
	}
}
