package com.dl.one;

public class Eg5 extends Thread {
public static void main(String[] args) throws InterruptedException {
	Eg5 eg1=new Eg5();
	System.out.println(eg1.getName());
	eg1.start();
	eg1.join();
	
	Eg5 eg2=new Eg5();
	System.out.println(eg1.getName());
	eg2.start();
	eg2.join();
	
	Eg5 eg3=new Eg5();
	System.out.println(eg1.getName());
	eg3.start();
	eg3.join();
}
public void run() {
	
		try {
			for(int i=0;i<5;i++) {
				System.out.println(i);
			Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
