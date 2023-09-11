package com.dl.one;

public class Eg7 {
public static void main(String[] args) {
	try {
		int a=10;
		int b=2;
		int c=0;
		System.out.println(a/b);
		//System.out.println(a/c);  //ArithmeticException
		int aa[]= {10,20,30,40,50};
		System.out.println(aa[0]);
		System.out.println(aa[6]);
	} catch (ArithmeticException e) {
		System.out.println("ArithmeticException:" +e);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException"+e);
	}
}
}
//try:business logic
//catch :exceptions