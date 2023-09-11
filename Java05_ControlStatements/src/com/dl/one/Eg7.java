package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Eg7 {
	// static Scanner scanner;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// while(true)
		// System.out.println("while loop");
		// }
		/*
		 * int i=0; while(i<5) { System.out.println(i); i++; } System.out.println(); int
		 * j=5; while(j>=0) { System.out.println(j); j--; }
		 */
		// implement in scanner and buffer reader
		/*
		 * scanner = new Scanner(System.in); System.out.println("enter a number"); int i
		 * = scanner.nextInt(); while (i < 5) { System.out.println(i); i++; }
		 */
		// Buffered Reader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		String Number = reader.readLine();
		int Num = Integer.parseInt(Number);
		while (Num < 5) {
			System.out.println(Num);
			Num++;
		}

	}
}
