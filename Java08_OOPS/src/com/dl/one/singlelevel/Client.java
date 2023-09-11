package com.dl.one.singlelevel;

public class Client {
	public static void main(String[] args) {
		UserImpl userimp = new UserImpl();
		userimp.userDetails("vamsi", "vamsi@gmail.com");
		UserProfile.userOrderedDetails(1, "tv");
		userimp.userBankDetails("icici",20000);
	}
}
