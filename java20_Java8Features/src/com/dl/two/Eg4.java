package com.dl.two;
//Runnable Interface passing as argument in Thread Class as Anonymous Implementation

public class Eg4 {
public static void main(String[] args) {
	Thread t=new Thread(new Runnable() {

		@Override
		public void run() {
			System.out.println("run() method");
			
		}
		
	});
	t.start();
}
}
