package com.dl.one;

import java.util.Scanner;

public class Eg3 {

	public static void main(String[] args) {
		// concat() Method
		/*String s1 = "java";
		String s2 = "python";
		String s3 = s1.concat(s2);
		System.out.println(s3);

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.concat(s2).concat("javaScript"));

		String s4 = "javaPython";
		System.out.println(s4.equals(s3));
	*/
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		String string = sc.nextLine();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter a String 2");
		String string1=sc.nextLine();
		
		System.out.println(string.concat(string1));
		System.out.println(string.concat(string1).concat("javaScript"));
	}

}
