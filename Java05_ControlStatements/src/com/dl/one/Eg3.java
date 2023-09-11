package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// bufferreader is a class
		// what ever th data ur given(either char,int etc) will take the input and
		// convert into buffer
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your age");
		String userAge = reader.readLine();

		// in bufferreader Casting must be done(explicit casting)(converting String to
		// Integer)

		int age = Integer.parseInt(userAge);
		if (age > 18) {
			System.out.println("you can vote");
		} else {
			System.out.println("you are not eligible to vote");
		}
		reader.close();
	}

}
