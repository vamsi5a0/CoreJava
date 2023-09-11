package com.dl.collections;

import java.util.HashMap;

public class Eg3 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "NameOne");
		
		hashMap.put(2, "NameTwo");
		hashMap.put(3, "NameThree");
		hashMap.put(4, "NameFour");
		hashMap.put(5, "NameFive");
		System.out.println(hashMap);
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
	}
}
