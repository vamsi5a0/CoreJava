package com.dl.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Eg2 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("NameOne");
	list.add("NameTwo");
	list.add("NameThree");
	list.add("NameFour");
	list.add("NameFIve");
	System.out.println(list);
	
	//cursor(read and delete)
	Iterator<String> iterator=list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
