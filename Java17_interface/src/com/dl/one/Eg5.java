package com.dl.one;
interface AA{
	void m1();
}
interface BB{
	void m2();
}
interface CC extends AA,BB{
void m3();
}
public class Eg5 {
	public void m1() {
		System.out.println("m1 method");
	}
		public void m2() {
			System.out.println("m2 method");
		}
	public void m3() {
		System.out.println("m3 method");
	}
public static void main(String[] args) {
	new Eg5().m1();
	new Eg5().m2();
}
}
