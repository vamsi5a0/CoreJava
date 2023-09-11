package com.dl.ProblemStatements;

public class Emp {
	int EmpID;
	String EmpName;
	Address empAddress; // (//has a relation)

	public Emp(int empID, String empName, Address empAddress) {

		this.EmpID = empID;
		this.EmpName = empName;
		this.empAddress = empAddress;
	}

	public void Display() {
		System.out.println(
				EmpID + " " + EmpName + " " + empAddress.City + " " + empAddress.State + " " + empAddress.Country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("hyd", "tg", "ind");
		Emp emp = new Emp(1, "vamsi", address1);
		emp.Display();
	}
}
