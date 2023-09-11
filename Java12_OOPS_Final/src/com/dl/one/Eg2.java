package com.dl.one;
class A{
	public final void m1() {
		System.out.println("m1 method");
	}
}
class B extends A{
	//public void m1() {
	//	System.out.println("m2 method");
	//}
}
public class Eg2 {
public static void main(String[] args) {
	A a=new B();
	a.m1();
}
}
