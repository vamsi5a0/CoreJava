package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg2 {

	public static void main(String[] args) throws IOException {
		// Memory Allocation
		// string literals
		// scp area (string constant pool)
		// equals() method can be used for content comparison
		// (hello)<-- s1,s2
		// (hello)<-- s5
		String s1 = "hello"; // 1
		String s2 = "hello"; // 1
		System.out.println(s1.equals(s2)); // true
		String s5 = "Hello";
		System.out.println(s5);

		// 1 in heap area and 1 in pool area
		String s3 = new String("hello"); // 2
		String s4 = new String("hello"); // 2
		String s6 = new String("Hello"); // 2
		System.out.println(s6);
		System.out.println(s3.equals(s4)); // true
		System.out.println();
		// reference comparison
		System.out.println(s1 == s2);
		System.out.println(s1 == s5);
		System.out.println(s3 == s4);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a String one");
		String string1 = reader.readLine();
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a String one");
		String string2 = reader1.readLine();
		if("admin".equals(string1) && "admin".equals(string2)) {
			System.out.println("equals");
		}else {
			System.out.println("not equls");
		}
			
		}
}