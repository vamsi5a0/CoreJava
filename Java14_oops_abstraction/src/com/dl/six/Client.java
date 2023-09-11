package com.dl.six;

class A{
	public void m1() {
		System.out.println("m1 method");
	}
}
 abstract class B extends A{
	public void m2() {
		System.out.println("m2 method");
	}
}
 class  C extends B{
	 public void m3() {
		 System.out.println("m3 method");
	 }
 }
 public class Client{
	 public static void main(String[] args) {
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
	}
 }