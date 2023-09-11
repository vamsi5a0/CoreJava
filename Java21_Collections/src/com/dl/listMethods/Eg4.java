package com.dl.listMethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Eg4 {
public static void main(String[] args) {
	ArrayList<String> list =new ArrayList<>();
	list.add(0,null);
	list.add(null);
	list.add(null);
	System.out.println(list);
	LinkedList<String> list1 =new LinkedList<>();
	list1.add(0,null);
	list1.add(null);
	list1.add(null);
	System.out.println(list1);
	
	HashSet<String> list3=new HashSet<>();
	//list3.add(0,null);
	list3.add(null);
	list3.add(null);
	System.out.println(list3);
	
	LinkedHashSet<String> list4=new LinkedHashSet<>();
	//list4.add(0,null);
	list4.add(null);
	list4.add(null);
	System.out.println(list4);
	
	TreeSet<String> list5=new TreeSet<>();
	//list3.add(0,null);
	list5.add(null);
	list5.add(null);
	System.out.println(list5);
}
}
