package com.dl.listMethods;

import java.util.TreeSet;

public class Eg6 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(65);
		treeSet.add(67);
		treeSet.add(68);
		treeSet.add(69);
		treeSet.add(70);
		treeSet.add(68);
		treeSet.add(85);
		System.out.println(treeSet); // [65, 67, 68, 69, 70, 85]
		System.out.println(treeSet.descendingSet());

		// greater than or equal to
		System.out.println(treeSet.ceiling(65));
		System.out.println(treeSet.ceiling(66));

		// greater than
		System.out.println(treeSet.higher(66));
		System.out.println(treeSet.higher(68));
		System.out.println(treeSet.higher(90));

		// greater than or equla to or less than
		System.out.println(treeSet.floor(85));
		System.out.println(treeSet.floor(65));
		System.out.println(treeSet.floor(67));
		System.out.println(treeSet.floor(80));
		
		//lessThan
		System.out.println(treeSet.lower(66));
		System.out.println(treeSet.lower(85));
		
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
	}
}
