package com.dl.one;
class ABC{
	void xyz() {
		System.out.println("XYZ");
	}
}
interface AAAA{
	void m1();
	void m2();
}
public class Eg7 extends ABC implements AAAA{
public static void main(String[] args) {
	new Eg7().xyz();
	new Eg7().m1();
	new Eg7().m2();
}

@Override
public void m1() {
	System.out.println("m1");
	
}

@Override
public void m2() {
	System.out.println("m2");
	
}
}
