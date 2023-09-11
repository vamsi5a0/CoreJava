package com.dl.one;

import java.util.Scanner;

public class Eg6 {

	static Scanner scanner;

	public static void main(String[] args) {

		// Iteration Statements
		// for, while, do-while, for-each
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// Positive Numbers
		//scanner = new Scanner(System.in);
		//System.out.println("Enter a number: ");
		//int enterNumber = scanner.nextInt();
		//for (System.out.println(enterNumber); enterNumber < 5; enterNumber++) {
		//System.out.println(enterNumber);
		//}
		//scanner.close();

		// Negative Numbers
		scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = scanner.nextInt();
		for (System.out.println(i); i >= 0; i--) {
		System.out.println(i);
		}
		scanner.close();

	}
}