package com.dl.one;

@FunctionalInterface
interface SignIn{
	public abstract void login();
}
class SignImpl implements SignIn{

	@Override
	public void login() {
		System.out.println("Login() method");
		
	}
	
}
public class Eg5 {
	
public static void main(String[] args) {
	//inheritance
	SignImpl signImpl=new SignImpl();
	signImpl.login();
	 //polymorphism
	SignIn in=new SignImpl();
	in.login();
	
}
}
