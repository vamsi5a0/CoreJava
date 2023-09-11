package com.dl.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Eg4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		list.add("NameFIve");
		System.out.println(list);

		// cursor(read and update delete)
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(" ");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
}