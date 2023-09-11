package com.dl.one;

public class Eg6 {
	//variables
	int a=10; //instance
	int b=20;
	
	static int x=100; //static
	static int y=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(x);
		//System.out.println(y);
		
		//System.out.println(new Eg6().a);
		//System.out.println(new Eg6().b);
		
		//ClassName objectRef=new ClassName();
		Eg6 eg6=new Eg6();
		eg6.m1();
		
		m2();
	}
	public void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(Eg6.x);
		System.out.println(Eg6.y);
			
	}
	public static void m2() {
		System.out.println(x);
		System.out.println(y);
		//	System.out.println(new Eg2().a); //the static field Eg2.a should be accesed in a static way
	}
}