package com.dl.two;

class A implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Run Method of class A"); // 4
		
		synchronized (this) {
			for (int i = 11; i <= 20; i++) {
				System.out.println("For Loop In Class A " + i); // 5
			}
			notify();
		}
	}
	
}

public class B {

	

	public static void main(String[] args) throws InterruptedException {
		
		A a = new A();
		System.out.println("Object Ref: " + a); // 1
		
		Thread t1 = new Thread(a);
		t1.start();
		System.out.println("Start Method"); // 2
		
		synchronized (a) {
			//a.wait();
			for (int i = 1; i <= 10; i++) {
				System.out.println("For Loop In Class B " + i); // 3
			}
		}
		
	}
	
	
}

//Object Ref: com.dl.two.A@3f8f9dd6
//Start Method
//Run Method of class A
//For Loop In Class B 0
//For Loop In Class B 1
//For Loop In Class B 2
//For Loop In Class B 3
//For Loop In Class B 4
//For Loop In Class A 0
//For Loop In Class A 1
//For Loop In Class A 2
//For Loop In Class A 3
//For Loop In Class A 4


//Object Ref: com.dl.two.A@3f8f9dd6
//Start Method
//Run Method of class A
//For Loop In Class A 0
//For Loop In Class A 1
//For Loop In Class A 2
//For Loop In Class A 3
//For Loop In Class A 4

//Object Ref: com.dl.two.A@3f8f9dd6
//Start Method
//Run Method of class A
//For Loop In Class A 0
//For Loop In Class A 1
//For Loop In Class A 2
//For Loop In Class A 3
//For Loop In Class A 4
//For Loop In Class B 0
//For Loop In Class B 1
//For Loop In Class B 2
//For Loop In Class B 3
//For Loop In Class B 4