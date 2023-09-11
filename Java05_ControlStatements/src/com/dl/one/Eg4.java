package com.dl.one;

import java.util.Scanner;

public class Eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter employee salary:");
		double empsalary=scanner.nextDouble();
		if(empsalary==10000) {
			System.out.println("Employee salary is" + empsalary);
		}else if(empsalary==20000) {
			System.out.println("Employee salary is " + empsalary);
		}else if(empsalary==30000) {
			System.out.println("Employee salary is " + empsalary);
			
		}else if(empsalary==40000) {
			System.out.println("Employee salary is " + empsalary);
		}else if(empsalary==50000) {
			System.out.println("Employee salary is " + empsalary);
		}else {
			System.out.println("employee salary out of range");
		}
		scanner.close();
	}

}
