package com.dl.one;

public class RegisterImpl extends Register {

	public static void main(String[] args) {
		
		RegisterImpl registerImpl = new RegisterImpl();
		registerImpl.setUserName("Sai Kiran");
		registerImpl.setEmail("saikiran@gmail.com");
		registerImpl.setContact(98765432210L);
		registerImpl.setAddress("Hyd");
		
		System.out.println(registerImpl.getUserName());
		System.out.println(registerImpl.getEmail());
		System.out.println(registerImpl.getContact());
		System.out.println(registerImpl.getAddress());
	}
}