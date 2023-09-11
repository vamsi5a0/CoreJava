package com.dl.one;

public class Eg10 {
	public void getUserName(String username) throws Exception {
		if(username=="Admin") {
			System.out.println("user name is"+username);
			
		}else {
			throw new Exception("username not valid");
		}
	}
public static void main(String[] args) throws Exception {
	Eg10 eg10=new Eg10();
	eg10.getUserName("Admins");
//	eg10.getUserName("Admin");

}
}
