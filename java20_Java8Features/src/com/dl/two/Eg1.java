package com.dl.two;

//Implementing Runnable Interface

public class Eg1 implements Runnable{
public static void main(String[] args) {
	Eg1 eg=new Eg1();
	Thread  t=new Thread(eg);
	t.start();
	for(int i=0;i<5;i++) {
		System.out.println("main() method");
	}
}

@Override
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("Run() method");
	}
}
}
