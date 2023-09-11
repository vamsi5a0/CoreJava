package com.dl.listMethods;

import java.util.LinkedList;

public class Eg5 {
public static void main(String[] args) {
	LinkedList<Integer> list=new LinkedList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	System.out.println(list);
	
	list.addFirst(100);
	System.out.println(list);
	
	list.removeFirst();
	System.out.println(list);
	
	list.addLast(600);
	System.out.println(list);
	
	list.removeLast();
	System.out.println(list);
	
}
}
