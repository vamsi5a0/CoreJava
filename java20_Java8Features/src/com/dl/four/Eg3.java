package com.dl.four;

public class Eg3 {
public void add() {
	int a=10;
	int b=20;
	System.out.println(a+b);
}
public static void main(String[] args) {
	Eg3 eg3=new Eg3(); //calling instance method using obj reference
	eg3.add();
	
	new Eg3().add();
	
	Thread t1=new Thread(new Eg3()::add); //calling instance method using double colon operator
	t1.start();
	
	Eg3 eg=new Eg3();
	Thread t2=new Thread(()->eg.add()); //calling instance method using lambda expression
	t2.start();
	}
}
