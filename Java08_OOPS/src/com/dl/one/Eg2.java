package com.dl.one;
//every class Internally extends object class
public class Eg2 extends Object {
	public void m1() {
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//Objct Ref
		Eg2 eg2=new Eg2();
		eg2.m1();
		
		//direct Method
		new Eg2().m1();
	}
}
