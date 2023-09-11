package com.dl.one;

public class Eg4 {
	//Non Static Method/Instance Method
	public void m1() {
		System.out.println("M1 Method");
	}
	public void m2() {
		System.out.println("M2 Method");
		
	}
	public void m3() {
		System.out.println("M3 Method");
	}
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			Eg4 eg4=new Eg4();
			eg4.m1();
			eg4.m2();
			eg4.m3();
			
			new Eg4().m1();
			new Eg4().m2();
			new Eg4().m3();
			
	}

}
