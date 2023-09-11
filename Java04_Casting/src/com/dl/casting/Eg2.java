package com.dl.casting;

public class Eg2 {

	public static void main(String[] args) {

		// Explicit Casting
		// double-float-long-int-short-byte
		// char
		double d1 = 10;
		float f1 = (float) d1;
		System.out.println(f1);

		long l1 = (long) d1;
		System.out.println(l1);

		int i1 = (int) l1;
		System.out.println(i1);

		short s1 = (short) i1;
		System.out.println(s1);

		byte b1 = (byte) s1;
		System.out.println(b1);

		double dd = 65;
		char ch = (char) dd;
		System.out.println(ch); //A
		
		byte b11 = (byte)(short)(int)(long)(float)(double)d1;
		System.out.println(b11);

	}
}

//Case: 1
//String customerName 
//XML : SaiKiran