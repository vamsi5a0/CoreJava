package com.dl.one;

import java.util.Scanner;

public class Eg10 {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a userName");
		String username = scanner.nextLine();
		//System.out.println("username");
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("enter a password");
		String password = scanner1.nextLine();
		//System.out.println("passowrd");
		
		if(username=="admin" & password=="admin") {
			System.out.println("login successfull");
		}else {
			System.out.println("login failure");
		}
		
	}*/
		//Scp Area
		//Scanner is usimg head area
		//String we can create in two ways literal
		//String userName="Admin";
		//String password="Admin";
		//if(userName=="Admin" && password=="Admin") {
			//System.out.println("login success");
		//}else {
			//System.out.println("login failure");
		//}
		//heap  coparison //new
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter username");
		String uName=scanner.nextLine();
		System.out.println(uName);
		System.out.println("enter password");
		String uPass=scanner.nextLine();
		System.out.println(uPass);
		
		//content comparison
		if("Admin".equals(uName) && "Admin".equals(uPass)) {
			System.out.println("Login Success");
			
		}else {
			System.out.println("Login Failure");
		}
		scanner.close();
}
	
}
