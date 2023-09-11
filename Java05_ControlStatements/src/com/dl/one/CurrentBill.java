package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CurrentBill {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter units");
		int units = sc.nextInt();
		if (units < 100) {
			System.out.println("bill to pay:" + units * 9);
		} else if (units > 101 && units < 200) {
			System.out.println("bill to pay:" + units * 14.5);
		} else {
			System.out.println("entered wrong units" + units);
		} */

		//BufferedReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter ur units");
		String bill = reader.readLine();
		int units = Integer.parseInt(bill);
		if(units<5) {
			System.out.println("bill to pay" + units*3);
			
		}
	}

}
