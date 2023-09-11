package com.dl.cursors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Eg3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		list.add("NameFIve");
		System.out.println(list);

		// cursor(read and delete)
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
		String next=iterator.next();
		if(next.equals("NameTwo")) {
			iterator.remove();
		}
		}
		System.out.println(list);

		HashSet<String> set = new HashSet<>();
		set.add("NameOne");
		set.add("NameTwo");
		set.add("NameThree");
		set.add("NameFour");
		set.add("NameFive");
		set.add("NameSix");
		System.out.println(set);
}
}