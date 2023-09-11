package com.dl.one;

public class Eg2 {
	public int add(int a, int b) {
		System.out.println(this.addition(100, 200));
		return a + b;
	}

	public long addition(long a, long b) {
		System.out.println(this.userDetails("admin", "admin"));
		return a + b;
	}

	public String userDetails(String uname, String upassword) {
		return uname + upassword;
	}

	public static void main(String[] args) {
		//Eg2 eg2=new Eg2();
		//System.out.println(eg2.add(10,20));
		//System.out.println(eg2.addition(100,200));
		//System.out.println(eg2.userDetails("admin","admin"));
		
		Eg2 eg2 = new Eg2();
		System.out.println(eg2.add(10, 20));
	}

}
