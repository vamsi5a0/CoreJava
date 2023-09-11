package com.dl.two;

public class Customer {
	//Instance method with Arguments
 public void bankCustomers(String firstName,String lastName,String email,long ContactNo) {
	 System.out.println(firstName);
	 System.out.println(lastName);
	 System.out.println(email);
	 System.out.println(ContactNo);
 }
 //Static method with arguments
 public static void bankName(String bankName,String bankIFSC,String bankAddress) {
	 System.out.println(bankName);
	 System.out.println(bankIFSC);
	 System.out.println(bankAddress);
	 System.out.println();

 }
 public static void main(String[] args) {
	Customer customer1=new Customer();
	customer1.bankCustomers("sai","ram","sai@gmail.com",9876543210L);
	bankName("ICICI","ICIC00111","HYD");
	
	Customer customer2=new Customer();
	customer2.bankCustomers("sai","kiran","sai@gmail.com",9876543210L);
	bankName("ICICI","ICIC00111","HYD");
	
	Customer customer3=new Customer();
	customer3.bankCustomers("sai","kumar","sai@gmail.com",9876543210L);
	bankName("ICICI","ICIC00111","HYD");
	
}
}
