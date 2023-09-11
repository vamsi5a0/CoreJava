package com.dl.listMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class Eg1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);

		// diff b/w length property(Arrays),length()(String(size()(Collections)
		list.add(10);
		list.add(20);
		System.out.println(list);

		// manually we are passing index
		list.add(0, null);
		System.out.println(100);
		System.out.println(list);

		// manually we are creating new index position
		list.add(3, 30);
		System.out.println(list);

		// array are mutable
		int a[] = { 10 };
		System.out.println(a[0]);
		a[0] = 100;
		System.out.println(a[0]);
		// System.out.println(Arrays.toString(a));

		boolean contains = list.contains(10);
		// boolean contains=list.contains(100);
		System.out.println(contains);

		// update using addd() method is not good better to for set()
		// the existing index will move to next position
		list.add(0, 1000);
		System.out.println(list); // [1000, null, 10, 20, 30]
		System.out.println(list.size());

		list.set(1, 500); // set changes the values in index 1
		System.out.println(list); // [1000, 500, 10, 20, 30]
		System.out.println(list.size());
		System.out.println(list.get(2));
		
//		list.clear();
//		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(10000);
		list2.add(20000);
		list2.add(30000);
		list2.add(40000);
		list2.add(50000);
		System.out.println(list2);
		
		list2.addAll(2,list);
		System.out.println(list2);
		
		System.out.println(list2.size()); //10
		System.out.println("deleted Element:"+list2.remove(2));
		System.out.println(list2.size()); //9
		System.out.println(list2); //[10000, 20000, 500, 10, 20, 30, 30000, 40000, 50000]
	}
}
