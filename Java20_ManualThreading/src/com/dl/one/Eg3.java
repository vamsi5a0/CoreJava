package com.dl.one;

public class Eg3 extends Thread {
	public static void main(String[] args) {
		Eg3 eg1 = new Eg3();
		Eg3 eg2 = new Eg3();
		Eg3 eg3 = new Eg3();
		System.out.println(eg1.getName());
		System.out.println(eg1.getPriority());
		System.out.println(eg2.getName());
		System.out.println(eg2.getPriority());
		System.out.println(eg3.getPriority());

		eg1.setPriority(9);
		eg1.setPriority(5);
		eg1.setPriority(4);

		System.out.println(eg1.getPriority());
		System.out.println(eg2.getPriority());
		System.out.println(eg3.getPriority());

		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);

	}
}
