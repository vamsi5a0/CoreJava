package com.dl.one;

//Functionlinterfaceusing anonymous implementation

@FunctionalInterface
interface SiginTwo {
	public abstract void login();
}

public class Eg6 {
	public static void main(String[] args) {
		SiginTwo signin= new SiginTwo() {

			@Override
			public void login() {
				System.out.println("Login() method");
				
			}
			
			
		};
		signin.login();
	}

}
