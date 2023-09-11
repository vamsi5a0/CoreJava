package com.dl.one;

import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String
		// strings are sequence of characters
		char s[] = { 'a', 'd', 'm', 'i', 'n' };
		System.out.println(s);
		// Strings are immutable
		// waay to create string
		// literal string
		// new keyword
		/*
		String s1 = "admin";
		String s2 = new String("Admin");
		System.out.println(s1);
		System.out.println(s2); */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string one");
		String string1 = sc.nextLine();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter a string two");
		
		String string2 = sc1.nextLine();
		if("admin".equals(string1) && "admin".equals(string2)) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}
	}

}
