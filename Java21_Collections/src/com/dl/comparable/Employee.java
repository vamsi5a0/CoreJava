package com.dl.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		return name.compareTo(emp.name); 
	}
	
//	@Override
//	public int compareTo(Employee emp) {
//		
//		return emp.name.compareTo(name);
//	}
	public static void main(String[] args) {
		Employee emp1=new Employee(4,"A");
		Employee emp2=new Employee(2,"C");
		Employee emp3=new Employee(1,"B");
		Employee emp4=new Employee(3,"D");
		
		ArrayList<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		System.out.println("InsertedOrder"+list);
		
		Collections.sort(list);
		System.out.println("Sorting order/Ascending order"+list);
		
		Collections.reverse(list);
		System.out.println("Descending order"+list);
	}
}
//InsertedOrder[Employee [id=4, name=A], Employee [id=2, name=C], Employee [id=1, name=B], Employee [id=3, name=D]]
//Sorting order/Ascending order[Employee [id=3, name=D], Employee [id=2, name=C], Employee [id=1, name=B], Employee [id=4, name=A]]
//Descending order[Employee [id=4, name=A], Employee [id=1, name=B], Employee [id=2, name=C], Employee [id=3, name=D]]

//InsertedOrder[Employee [id=4, name=A], Employee [id=2, name=C], Employee [id=1, name=B], Employee [id=3, name=D]]
//Sorting order/Ascending order[Employee [id=4, name=A], Employee [id=1, name=B], Employee [id=2, name=C], Employee [id=3, name=D]]
//Descending order[Employee [id=3, name=D], Employee [id=2, name=C], Employee [id=1, name=B], Employee [id=4, name=A]]
