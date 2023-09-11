package com.dl.one;

public class Eg1 {
	int userId;
	String userName;
	String userEmail;
	String userAddress;

//constructor using fields
//using this keyword refers to the current class variables(userID,userName are parameters)
	 public Eg1(int userId, String userName, String userEmail, String userAddress) {
	 
	 this.userId = userId;
	 this.userName = userName;
	 this.userEmail = userEmail;
	 this.userAddress = userAddress;
}
	// this assignment to variable userid has no effect
	// public Eg1(int userId.String userName,String userEmail,String userAddress) {
	// userId=userId;
	// userName=userName;
	// userEmail=userEmail;
	// userAddress=userAddress;
	// }
	// diff variables
	//public Eg1(int uId, String uName, String uEmail, String uAddress) {
	//	userId = uId;
		//userName = uName;
	//	userEmail = uEmail;
		//userAddress = uAddress;
	//}

	public void display() {
		System.out.println(userId);
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(userAddress);
	}

	public static void main(String[] args) {
		Eg1 eg1 = new Eg1(1, "vamsi", "vamsi@gmail.com", "hyd");
		eg1.display();
	}
}