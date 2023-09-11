package com.dl.one;
interface AAA{
	void m1();
}
interface BBB{
	void m2();
}
abstract class CCC implements AAA,BBB{
	public void m3() {
		System.out.println("m3method");
	}
}
public class Eg6 extends CCC {
public static void main(String[] args) {
	new Eg6().m1();
	new Eg6().m2();
	new Eg6().m3();
}

@Override
public void m1() {
	// TODO Auto-generated method stub
	
}

@Override
public void m2() {
	// TODO Auto-generated method stub
	
}
}
