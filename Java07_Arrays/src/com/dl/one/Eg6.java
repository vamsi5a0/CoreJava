package com.dl.one;

public class Eg6 {
	public static void main(String[] args) {
		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		// 					 0    			 1				 2
		// 				 0   1      2 			 0   1     2			 0   1   2
		System.out.println(a[0][1]);
		System.out.println(a[1][1]);
		System.out.println(a[2][2]);
	}
}
