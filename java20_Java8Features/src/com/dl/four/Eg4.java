package com.dl.four;

//Method Ref to a constructor

class Student{
	public Student(int id,String name) {
		System.out.println(id);
		System.out.println(name);
	}
}
@FunctionalInterface
interface StudentIn{
	Student student(int id,String name);
}
public class Eg4 {
public static void main(String[] args) {
	StudentIn in=Student::new;
	in.student(101, "one");
	in.student(101, "twos");
	
}
}
