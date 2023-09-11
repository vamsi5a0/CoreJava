package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Transfer Statements
		/* for(int i=0;i<10;i++) {
			if(i==5) {
				continue; //Skips the itearation
			}
			System.out.println(i);
		}
		System.out.println(" ");
		for(int i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i); //stops the iteration
		}
       */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		String number = reader.readLine();
		int num=Integer.parseInt(number);
		for(num=0;num<10;num++) {
			if(num==5) {
				continue;
			}
			System.out.println(num);
		}
	}
}
