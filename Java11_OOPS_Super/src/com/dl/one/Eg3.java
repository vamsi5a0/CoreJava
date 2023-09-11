package com.dl.one;


	class Ione{
		public Ione() {
			System.out.println("Default conss");
		}
		public Ione(int a ,int b) {
			this();
			System.out.println(a);
			System.out.println(b);
		}
	}
	class Itwo extends Ione{
		public Itwo() {
			super(10,20);
			System.out.println("Default cons Itwo");
		}
	}
	public class Eg3 {
	public static void main(String[] args) {
		new Itwo();
	
	}
}
