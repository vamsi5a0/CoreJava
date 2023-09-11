package com.dl.comparator.properties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CompareIds implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Integer i = o1.id;
		return i.compareTo(o2.id);
	}

}

class CompareNames implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}

}

public class Employee {
	int id;
	String name;

	Employee() {

	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(4, "A");
		Employee emp2 = new Employee(2, "C");
		Employee emp3 = new Employee(1, "B");
		Employee emp4 = new Employee(3, "D");

		ArrayList<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		System.out.println("Insertion Order: " + list);

		Collections.sort(list,new CompareIds());
		System.out.println("Sorting Order/ Asending Order: " + list);

		Collections.sort(list,new CompareNames());
		System.out.println("Desending Order: " + list);
	}
}
