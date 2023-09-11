package com.dl.one;

import java.util.Scanner;

public class Eg5 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Employee Salary");
	int empSalary=sc.nextInt();
	switch(empSalary) {
	case 10000:
		System.out.println("product Id is" + empSalary);
		break;
	case 20000:	
		System.out.println("product id is" + empSalary);
		break;
	case 30000:	
		System.out.println("product id is" + empSalary);
		break;
	case 40000:	
		System.out.println("product id is" + empSalary);
		break;
	case 50000:	
		System.out.println("product id is" + empSalary);
		break;
	default:
		System.out.println("productId not Found");
		break;
	}
	sc.close();
	}
}