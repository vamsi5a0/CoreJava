package com.dl.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Eg1 {
public static void main(String[] args) {
	Vector<Integer> vector=new Vector<Integer>();
	vector.add(10);
	vector.add(20);
	vector.add(30);
	vector.add(40);
	vector.add(50);
	System.out.println(vector);
	
	//for each
	for(Integer integer:vector){
		System.out.println(integer);
	}
	System.out.println(" ");
	//cursor
	Enumeration<Integer> elements=vector.elements();
	while(elements.hasMoreElements()) {
		System.out.println(elements.nextElement());
}
}
}
