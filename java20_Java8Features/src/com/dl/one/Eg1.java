package com.dl.one;
//builtin interface
public class Eg1 implements Runnable{

	@Override
	public void run() {
		System.out.println("run method");
		
	}
public static void main(String[] args) {
	Eg1 eg=new Eg1();
	Thread t=new Thread(eg);
	t.start();
}
}
//Muli Threading
//How many ways are there for creating Threads
//Extending Thread class
//Implementing Runnable Interface

//Note: To call run() > start() method