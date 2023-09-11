package com.dl.one;

//Functional Interface using lambda expression

@FunctionalInterface
interface PropertiesTwo {
	// all the abstractMethods
	void add(int a, int b);
}

public class Eg3 {

	public static void main(String[] args) {
		//lambda expressions
		//()->statement
		
		PropertiesTwo propertiesTwo = (x, y) -> System.out.println("add:" + (x + y));
		
		propertiesTwo.add(10, 20);
	}
}

//@FunctionalInterface:means it contains only one one method i.e abstract method;