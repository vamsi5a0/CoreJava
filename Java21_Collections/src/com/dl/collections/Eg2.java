package com.dl.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Eg2 {
	public static void main(String[] args) {
		// hashset is unordered,no duplicates allowed
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(33);
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(40);
		hashSet.add(69);
		hashSet.add(50);
		hashSet.add(30);
		hashSet.add(10);
		System.out.println(hashSet); // [50, 20, 69, 40, 10, 30]

		// LinkedHashSet is Ordered, no duplicats allowed
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(30);
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(40);
		linkedHashSet.add(69);
		linkedHashSet.add(50);
		linkedHashSet.add(30);
		linkedHashSet.add(10);
		System.out.println(linkedHashSet); // [30, 10, 20, 40, 69, 50]

		// TreeSet is Sorted, no dupliocates allowed
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(4);
		treeSet.add(6);
		treeSet.add(5);
		treeSet.add(3);
		treeSet.add(1);
		System.out.println(treeSet); // [1, 2, 3, 4, 5, 6]
	}
}
