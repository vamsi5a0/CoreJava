package com.dl.listMethods;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Eg2 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add(0,"A");
	list.add(1,"B");
	list.add(2,"C");
	list.add(3,"D");
	list.add(4,"E");
	list.add(5,"C");
	System.out.println(list);
	
	System.out.println(list.indexOf("A"));
	System.out.println(list.lastIndexOf("A"));
	System.out.println(list.indexOf("K"));
	
	ArrayList<String> list2=new ArrayList<>(list);
	list2.add("a");
	list2.add("b");
	System.out.println(list2);
	
	LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>(list);
	System.out.println(linkedHashSet);
	
	
}
}
