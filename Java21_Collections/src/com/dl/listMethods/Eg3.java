package com.dl.listMethods;

import java.util.ArrayList;
import java.util.LinkedList;

public class Eg3 {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add(0,"NumberOne");
	list.add(1,"NumberTwo");
	list.add(2,"Numberthree");
	list.add(3,"NumberFour");
	list.add(4,"NumberFive");
	list.add(5,"NumberSix");
	System.out.println(list);
	list.remove(5);
	System.out.println(list);
	
	ArrayList<String> list2=new ArrayList<>();
	list2.add("B");
	list2.add("A");
	list2.add("C");
	System.out.println(list2);
	
	list2.sort(null);
	System.out.println(list2);
	
	LinkedList<String> list3=new LinkedList<>();
	list3.add("B");
	list3.add("A");
	list3.add("C");
	System.out.println(list3);
	
	list3.sort(null);
	System.out.println();
	
}
}
