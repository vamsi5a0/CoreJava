package com.dl.one;

import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//without scanner class
		int customerAge=21;
		if(customerAge >=21) {
			System.out.println("you can vote");
		}else {
			System.out.println("you are not eligible");
		}
		//Scanner is a class
		//this class contains properties,methods,blocks,constructors
		//this classs contains xxx methods
		//nextInt(0,nextByte(),nextShort()nextLong(),nextfloat(),
		//with sacnner classs
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("you can vote");
		}else {
			System.out.println("you are not eligible");
		}
		
	}

}
//user defined type
//built in type