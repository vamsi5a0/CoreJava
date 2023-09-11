package com.dl.two.multilevel;

public class ChildOne extends ParentOne {
public void m3() {
	System.out.println("m3 method");
}
public static void main(String[] args) {
	ChildOne child=new ChildOne();

	child.m2();
	child.m3();
}
}
