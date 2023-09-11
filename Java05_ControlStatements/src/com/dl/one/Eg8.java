package com.dl.one;

import java.util.Scanner;

public class Eg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if we iteration for one time we use do while
		// dowhile
		/*do {
			System.out.println("do While");

		} while (false);

		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 5);
		System.out.println();

		int j = 5;
		do {
			System.out.println(j);
			j--;
		} while (j > 0);
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int i = sc.nextInt();
		do {
			System.out.println(i);
			i++;
		}
		while(i<=5);	
		}
	}
	

