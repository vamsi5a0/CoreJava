package com.dl.four;

import java.util.ArrayList;
import java.util.Iterator;

//calling all elements using  array-list object ref variable directly

public class Eg1 {
	
public static void main(String[] args) {
	//ArrayList
	//Insertion is allowed/dulicates are also allowed
	ArrayList<String> list=new ArrayList<>();
	list.add("NameOne");
	list.add("NameTwo");
	list.add("NameThree");
	list.add("NameFour");
	list.add("NameFive");
	System.out.println("list");
	
	//calling all elements using double colon operator
	//classname>::<method Name>
	list.forEach(System.out::println);
	System.out.println(" ");
	
	//calling all elements using cursors
	//cursors
	Iterator<String> iterator=list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println(" ");
	
	//calling all elements using lambda expression
	list.forEach(s->System.out.println(s));
}
}
