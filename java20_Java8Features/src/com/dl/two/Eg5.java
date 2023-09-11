package com.dl.two;
//Passing Lambda Expression in Thread Class as argument
public class Eg5 {
public static void main(String[] args) {
	Thread t=new Thread(()->{
		for(int i=0;i<10;i++) {
			System.out.println("main method");
		}
	});
	t.start();
}
}
