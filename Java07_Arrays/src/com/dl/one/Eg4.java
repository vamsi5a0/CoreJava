package com.dl.one;

public class Eg4 {
	public static void main(String[] args) {
		int a[] = new int[-5];
		a[-5] = 50;
		System.out.println(a[-5]); // Negative ArraSizeException

		int b[] = new int[0];
		b[0] = 10;
		System.out.println(b[0]); // arrayindexOutOfBoundException

	}
}
