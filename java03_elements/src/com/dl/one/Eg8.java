package com.dl.one;

public class Eg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Eg8();
	}
	//Static Block
		static{
			int a = 10;
			int b = 20;
			System.out.println(a + " and " + b);
			System.out.println("Static Block");
		}
		
		//Instance Block
		{
			int a = 10;
			int b = 20;
			System.out.println(a + " and " + b);
			System.out.println("Instance Block");
		}

}
