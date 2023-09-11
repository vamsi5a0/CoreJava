package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg5 {
	// index

	public static void main(String[] args) throws IOException {
		/* String s1 = "Java Backend,Python Backend,JavaScript Backend";
		System.out.println(s1.indexOf("Backend"));

		System.out.println(s1.lastIndexOf("Backend"));

		System.out.println(s1.indexOf("Backend", 10));
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a string");
		String string1=br.readLine();
		System.out.println(string1.indexOf("Backend"));
		
	}

}
