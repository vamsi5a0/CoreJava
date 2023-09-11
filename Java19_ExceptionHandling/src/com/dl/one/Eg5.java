package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		try {
			System.out.println("before");
			String s1="hellogoodmorning";
			System.out.println(s1);
			System.out.println(s1.charAt(6));
			System.out.println(s1.charAt(34));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("after");
	}

}
