package com.dl.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Eg1 {
public static void main(String[] args) {
	//Arrays
	int a[]= {10,20,30,40,50};
	System.out.println(Arrays.toString(a));
	
	//without Generic
	ArrayList list=new ArrayList();
	list.add(10);
	list.add("NumOne");
	list.add(20);
	list.add(30);
	list.add(40);
	list.add("NameTwo");
	list.add("NameThree");
	list.add(60);
	System.out.println(list);
	
	//with Generic
	//Insertion is allowed ,duplicates allowed
	//ArryaList is better for storing the data and accessing the data
	ArrayList<Integer> list2=new ArrayList<Integer>();
	list2.add(10);
	list2.add(20);
	list2.add(30);
	list2.add(40);
	list2.add(60);
	list2.add(10);
	System.out.println(list2);
	
	//withgeneric
	///insertion is allowed ,duplicates allowed
	//LinkedList is better for manipulating the data
	LinkedList<Integer> list3=new LinkedList<Integer>();
	list3.add(10);
	list3.add(20);
	list3.add(30);
	list3.add(40);
	list3.add(60);
	list3.add(10);
	System.out.println(list3);
}
}
