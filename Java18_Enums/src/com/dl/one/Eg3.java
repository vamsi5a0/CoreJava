package com.dl.one;
enum Books{
	JAVA,PYTHON,SCRIPT;
}
public class Eg3 {
public static void main(String[] args) {
	Books valueOf=Books.valueOf("SCRIPT");
	System.out.println(valueOf);
	/*
	 * Books valueOff=Books.valueOf("SCRIPTs"); 
	 * System.out.println(valueOff);
	 */
	Books[] values=Books.values();
	for(Books books:values) {
		System.out.println(books.ordinal());
		System.out.println(books);
	}
}
}
