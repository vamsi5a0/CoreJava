package com.dl.two;
//Runnable Interface Using Lambda Expression
public class Eg3 {
public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main() Method");
		}
		
		Runnable r = ()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("Run() Method");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
	}
}